package com.example.compsdata.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Comp {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private List<String> units;
    private List<List<String>> items;

    public Comp() {
    }

    public Comp(String name, List<String> units, List<List<String>> items) {
        this.name = name;
        this.units = units;
        this.items = items;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getUnits() {
        return units;
    }

    public void setUnits(List<String> units) {
        this.units = units;
    }

    public List<List<String>> getItems() {
        return items;
    }

    public void setItems(List<List<String>> items) {
        this.items = items;
    }
}
