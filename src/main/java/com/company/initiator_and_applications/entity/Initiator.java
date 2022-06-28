package com.company.initiator_and_applications.entity;

import io.jmix.core.metamodel.annotation.JmixEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

@JmixEntity
@Entity
public class Initiator extends User {
    @Column(name = "FULL_NAME", nullable = false)
    @NotNull
    private String full_name;

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }
}