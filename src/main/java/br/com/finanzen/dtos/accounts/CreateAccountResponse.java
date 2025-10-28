package br.com.finanzen.dtos.accounts;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "Create Account Response")
public record CreateAccountResponse(
        @Schema(description = "Unique identifier of the bank account", example = "3fa85f64-5717-4562-b3fc-2c963f66afa6")
        String id,
        @Schema(description = "Name of the bank account", example = "Checking Account")
        String name,
        @Schema(description = "Balance of the bank account", example = "1000.00")
        String balance,
        @Schema(description = "Type of the bank account", example = "CHECKING")
        String accountType
) {
}
