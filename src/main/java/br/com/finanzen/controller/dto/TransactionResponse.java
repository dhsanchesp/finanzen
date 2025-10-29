package br.com.finanzen.controller.dto;

import br.com.finanzen.enums.TransactionType;
import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "Transaction Response")
public record TransactionResponse(
        @Schema(description = "Unique identifier of this Transaction", example = "149876")
        String id,
        @Schema(description = "Description of this transaction", example = "Salary Advance")
        String description,
        @Schema(description = "Amount of this transaction", example = "3125.78")
        String amount,
        @Schema(description = "Type of this transaction", example = "INCOME")
        TransactionType transactionType,
        @Schema(description = "When this transaction occurred", example = "2025-12-25")
        String date
) {
}
