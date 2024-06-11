package com.example.learn.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

public record ProductRecord(@NotBlank String name, @NotNull BigDecimal value) { // DataTransferObjects: Record utilizado para a transferência de dados entre JSON e Models

}
