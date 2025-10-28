package br.com.finanzen.dtos.expenses;

public record CreateExpenseResponse(
    String id,
    String description,
    String amount,
    String date,
    String categoryId,
    String currentBalance
) {
}
