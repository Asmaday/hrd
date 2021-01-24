package by.company.hrd.service;

import by.company.hrd.dao.FamilyRepository;
import by.company.hrd.domain.Family;
import by.company.hrd.view.FamilyRequest;
import by.company.hrd.view.FamilyResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class FamilyService {
    @Autowired
    private FamilyRepository familyRepository;

    public List<FamilyResponse> getFamilyInfo(FamilyRequest request) {
        List<Family> family = familyRepository.findFamily(
                request.getPersonNumber(),
                request.getFirstName(),
                request.getSurName(),
                request.getPatronymic());
        if (family.isEmpty()) {
            return Collections.emptyList();
        }
        return family.stream().map(e -> getResponse(e)).collect(Collectors.toList());
    }
    private FamilyResponse getResponse(Family family) {
        FamilyResponse wr = new FamilyResponse();
        wr.setPersonNumber(family.getEmployee().getPersonNumber());
        wr.setFirstName(family.getEmployee().getFirstName());
        wr.setSurName(family.getEmployee().getSurName());
        wr.setPatronymic(family.getEmployee().getPatronymic());
        wr.setFirstNameChild(family.getFirstNameChild());
        wr.setSurNameChild(family.getSurNameChild());
        wr.setPatronymicChild(family.getPatronymicChild());
        return wr;
    }
}