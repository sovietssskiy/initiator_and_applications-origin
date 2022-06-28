package com.company.initiator_and_applications.entity;

import io.jmix.core.metamodel.datatype.impl.EnumClass;

import javax.annotation.Nullable;


public enum Status implements EnumClass<String> {

    OPEN("Open"),
    UNDER_REVIEW("Under review"),
    FOR_CONSIDERATION("For Consideration"),
    FOR_APPROVAL("For approval1"),
    CLOSED("Closed");

    private String id;

    Status(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static Status fromId(String id) {
        for (Status at : Status.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}