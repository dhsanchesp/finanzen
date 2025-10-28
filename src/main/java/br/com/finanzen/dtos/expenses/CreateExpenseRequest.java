package br.com.finanzen.dtos.expenses;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "Create Expense Request")
public record CreateExpenseRequest(
        @Schema(description = "Name of the expense", example = "Dinner at restaurant")
        String name,
        @Schema(description = "Amount expent", example = "129.99")
        String amount,
        @Schema(description = "Bank Account ID associated with the expense", example = "3fa85f64-5717-4562-b3fc-2c963f66afa6")
        String bankAccountId
) {
}
