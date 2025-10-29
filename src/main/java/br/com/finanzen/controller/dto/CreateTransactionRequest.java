package br.com.finanzen.controller.dto;

import br.com.finanzen.enums.TransactionType;
import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "Create Transaction Request")
public record CreateTransactionRequest(
        @Schema(description = "Name of this transaction", example = "Salary Advance")
        String name,
        @Schema(description = "Amount of this transaction", example = "3125.78")
        String amount,
        @Schema(description = "Type of this transaction", example = "INCOME")
        TransactionType transactionType,
        @Schema(description = "When this transaction occurred", example = "2025-12-25")
        String date
) {
}
