package br.com.finanzen.dtos.categories;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "Create Category Request")
public record CreateCategoryRequest(
        @Schema(description = "Name of the category", example = "Salary")
        String name,
        @Schema(description = "Description of the category", example = "Monthly salary from employer")
        String description
) {
}
