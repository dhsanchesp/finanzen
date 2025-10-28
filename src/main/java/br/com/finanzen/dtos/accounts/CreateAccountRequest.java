package br.com.finanzen.dtos.accounts;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "Create Account Request")
public record CreateAccountRequest(
        @Schema(description = "Name of the bank account", example = "Checking Account")
        String name,
        @Schema(description = "Initial balance of the bank account", example = "1000.00")
        String initialBalance,
        @Schema(description = "Type of the bank account", example = "CHECKING")
        String accountType
) {
}
