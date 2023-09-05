package com.desafio5.dscommer_v3.dto;

import java.lang.reflect.Field;

public class FieldMessage {
    private String fieldName;
    private String message;

    public FieldMessage(String fieldName, String message) {
        this.fieldName = fieldName;
        this.message = message;
    }

    public String getFielName() {
        return fieldName;
    }

    public String getMessage() {
        return message;
    }
}
