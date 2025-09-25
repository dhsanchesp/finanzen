package br.com.finanzen.controller.dto;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "Create Income Category Request")
public record CreateIncomeCategoryRequest(
        @Schema(description = "Name of the income category", example = "Salary")
        String name,
        @Schema(description = "Description of the income category", example = "Monthly salary from employer")
        String description
) {
}
