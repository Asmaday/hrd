package by.company.hrd.rest;
import by.company.hrd.service.ProtectionWorkService;
import by.company.hrd.view.ProtectionWorkRequest;
import by.company.hrd.view.ProtectionWorkResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProtectionWorkController {
    @Autowired
    private ProtectionWorkService protectionWorkService;
    @PostMapping(value = "/protection")
    public List<ProtectionWorkResponse> getProtectionWorkInfo(@RequestBody ProtectionWorkRequest request) {
        return protectionWorkService.getProtectionWorkInfo(request);
    }
}
