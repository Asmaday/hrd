package by.company.hrd.rest;

import by.company.hrd.service.FamilyService;
import by.company.hrd.view.FamilyRequest;
import by.company.hrd.view.FamilyResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class FamilyController {
    @Autowired
    private FamilyService familyService;
    @PostMapping(value = "/family")
    public List<FamilyResponse> getFamilyInfo(@RequestBody FamilyRequest request) {
        return familyService.getFamilyInfo(request);
    }
}
