package com.desafio5.dscommer_v3.dto;

import java.lang.reflect.Field;

public class FieldMessage {
    private String fielName;
    private String message;

    public FieldMessage(String fieldName, String message) {
        this.fielName = fieldName;
        this.message = message;
    }

    public String getFielName() {
        return fielName;
    }

    public String getMessage() {
        return message;
    }
}
