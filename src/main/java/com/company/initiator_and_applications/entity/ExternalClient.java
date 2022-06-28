package com.company.initiator_and_applications.entity;

import io.jmix.core.metamodel.annotation.JmixEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

@JmixEntity
@Entity
public class ExternalClient extends Initiator {
    @Column(name = "MAIL", nullable = false)
    @NotNull
    private String mail;

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}