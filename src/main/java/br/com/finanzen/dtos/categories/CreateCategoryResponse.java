package br.com.finanzen.dtos.categories;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "Create Category Response")
public record CreateCategoryResponse(
        @Schema(description = "Unique identifier of the category", example = "3fa85f64-5717-4562-b3fc-2c963f66afa6")
        String id,
        @Schema(description = "Name of the category", example = "Salary")
        String name,
        @Schema(description = "Description of the category", example = "Monthly salary from employer")
        String description
) {
}
