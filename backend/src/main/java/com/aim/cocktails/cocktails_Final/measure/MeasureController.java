package com.aim.cocktails.cocktails_Final.measure;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/measure")

public class MeasureController {
    @Autowired
    private MeasureRespository measureRespository;

    @GetMapping(path = "")
    public Iterable<Measure> getAllMeasure() {
        return measureRespository.findAll();
    }

    @GetMapping(path = "/{id}")
    public Measure getMeasure(@PathVariable(value = "id") Integer id) {
        Optional<Measure> measure = measureRespository.findById(id);
        return measure.get();
    }
}
