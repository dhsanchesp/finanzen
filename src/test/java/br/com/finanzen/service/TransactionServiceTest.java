package br.com.finanzen.service;

import br.com.finanzen.controller.dto.CreateTransactionRequest;
import br.com.finanzen.controller.dto.TransactionResponse;
import br.com.finanzen.entity.Transaction;
import br.com.finanzen.enums.TransactionType;
import br.com.finanzen.mappers.TransactionMapper;
import br.com.finanzen.repository.TransactionJpaRepository;
import br.com.finanzen.stubs.TransactionServiceTestStubs;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class TransactionServiceTest {

    @InjectMocks
    TransactionService service;
    @Mock
    TransactionJpaRepository repository;
    @Mock
    TransactionMapper mapper;

    @Test
    @DisplayName("Should create transaction with success")
    void shouldCreateTransactionWithSuccess() {
        var expectedTransaction = TransactionServiceTestStubs.createTransaction();
        when(repository.save(any()))
                .thenReturn(expectedTransaction);
        var expectedRequest = new CreateTransactionRequest("Transaction 1", "185.98", TransactionType.EXPENSE, "2025-07-21");
        var expectedResponse = new TransactionResponse("1", "Transaction 1", "185.98", TransactionType.EXPENSE, "2025-07-21");
        when(mapper.toDto(any(Transaction.class)))
                .thenReturn(expectedResponse);

        var response = service.createTransaction(expectedRequest);

        assertNotNull(response);
    }

}