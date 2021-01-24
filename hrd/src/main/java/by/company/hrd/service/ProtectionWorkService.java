package by.company.hrd.service;

import by.company.hrd.dao.ProtectionWorkRepository;
import by.company.hrd.domain.ProtectionWork;
import by.company.hrd.view.ProtectionWorkRequest;
import by.company.hrd.view.ProtectionWorkResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProtectionWorkService {
    @Autowired
    private ProtectionWorkRepository protectionWorkRepository;

    public List<ProtectionWorkResponse> getProtectionWorkInfo(ProtectionWorkRequest request) {
        List<ProtectionWork> protectionWorks = protectionWorkRepository.findProtectionWork(
                request.getPersonNumber(),
                request.getFirstName(),
                request.getSurName(),
                request.getPatronymic(),
                request.getIdPosition(),
                request.getIdDepartment());
        if (protectionWorks.isEmpty()) {
            return Collections.emptyList();
        }
        return protectionWorks.stream().map(e -> getResponse(e)).collect(Collectors.toList());
    }

    private ProtectionWorkResponse getResponse(ProtectionWork protectionWork) {
        ProtectionWorkResponse wr = new ProtectionWorkResponse();
        wr.setPersonNumber(protectionWork.getEmployee().getPersonNumber());
        wr.setFirstName(protectionWork.getEmployee().getFirstName());
        wr.setSurName(protectionWork.getEmployee().getSurName());
        wr.setPatronymic(protectionWork.getEmployee().getPatronymic());
        wr.setDepartmentName(protectionWork.getEmployee().getDepartment().getDepartmentName());
        wr.setPositionName(protectionWork.getEmployee().getPosition().getPositionName());
        wr.setResult(protectionWork.getResult().ordinal());
        wr.setReason(protectionWork.getReason());
        return wr;
    }
}