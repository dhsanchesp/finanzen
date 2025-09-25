package br.com.finanzen.controller.dto;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "Create Income Category Response")
public record CreateIncomeCategoryResponse(
        @Schema(description = "Unique identifier of the income category", example = "3fa85f64-5717-4562-b3fc-2c963f66afa6")
        String id,
        @Schema(description = "Name of the income category", example = "Salary")
        String name,
        @Schema(description = "Description of the income category", example = "Monthly salary from employer")
        String description
) {
}
