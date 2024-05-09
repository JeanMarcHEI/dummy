package org.example.study.service;

import lombok.AllArgsConstructor;
import org.example.study.model.Dummy;
import org.example.study.repository.conf.DummyRepository;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@Service
@AllArgsConstructor
public class DummyService {
    private final DummyRepository dummyRepository;

    public List<Dummy> getListOfDummy(){
        try{
            return dummyRepository.getAll();
        }catch (SQLException error){
            System.out.println("Error");
            return List.of();
        }
    }
}
