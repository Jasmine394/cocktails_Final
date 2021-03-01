package com.aim.cocktails.cocktails_Final.measure;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "measure")
public class Measure {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "measure_id")
    private Integer id;

    private String measure;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMeasure() {
        return measure;
    }

    public void setMeasure(String measure) {
        this.measure = measure;
    }

}
