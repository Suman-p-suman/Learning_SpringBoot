package com.example.sumanpro.student;

import jakarta.validation.constraints.NotNull;

public record StudentDto(@NotNull
                          String firsname,
                         @NotNull
                         String lastname,
                         String email,
                         Integer schoolId) {
}
