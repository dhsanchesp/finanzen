package br.com.finanzen.controller.dto;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "Default Error Response")
public record DefaultErrorResponse(
        @Schema(description = "Error code", example = "MSG0098")
        String code,
        @Schema(description = "Error message", example = "This resource was not found")
        String message
) {
}
