package ru.financemonitor.core.model.entity;

import javax.persistence.Entity;

@Entity
public class Account extends AbstractUuidEntity {


    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
