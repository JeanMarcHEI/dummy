package org.example.study.controller;

import lombok.AllArgsConstructor;
import org.example.study.model.Dummy;
import org.example.study.service.DummyService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class DummyController {
    private final DummyService dummyService;

    @GetMapping("/dummies")
    public List<Dummy> getAll(){
        return dummyService.getListOfDummy();
    }
}
