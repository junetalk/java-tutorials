package com.javachen.boot.jpa.api;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ApiError {
    private String[] codes;
    private String message;

    public ApiError(String code, String message) {
        this(new String[] {code}, message);
    }
}
