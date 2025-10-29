package br.com.finanzen.stubs;

import br.com.finanzen.entity.Transaction;
import br.com.finanzen.enums.TransactionType;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class TransactionServiceTestStubs {

    public static Transaction createTransaction() {
        var transaction = new Transaction();
        transaction.setId(1L);
        transaction.setDescription("This is a sample transaction for testing.");
        transaction.setAmount(new BigDecimal("185.98"));
        transaction.setTransactionType(TransactionType.EXPENSE);
        transaction.setDate(LocalDate.of(2025,7,21));
        transaction.setCreatedAt(LocalDateTime.of(2025,7,20,10,30));
        transaction.setCreatedByUser("test_user");
        transaction.setUpdatedAt(LocalDateTime.of(2025,7,20,10,30));
        transaction.setUpdatedByUser("test_user");
        return transaction;
    }
}
