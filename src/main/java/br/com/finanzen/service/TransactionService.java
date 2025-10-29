package br.com.finanzen.service;

import br.com.finanzen.controller.dto.CreateTransactionRequest;
import br.com.finanzen.controller.dto.TransactionResponse;
import br.com.finanzen.entity.Transaction;
import br.com.finanzen.mappers.TransactionMapper;
import br.com.finanzen.repository.TransactionJpaRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Optional;

@Slf4j
@Service
public class TransactionService {

    private static final String SYSTEM_USER = "system";

    private final TransactionJpaRepository repository;
    private final TransactionMapper mapper;

    public TransactionService(TransactionJpaRepository repository, TransactionMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public TransactionResponse createTransaction(final CreateTransactionRequest request) {
        log.info("Creating Transaction with name: {}", request.name());

        var newTransaction = createTransactionFromRequest(request);

        var savedTransaction = repository.save(newTransaction);
        return mapper.toDto(savedTransaction);
    }

    private static LocalDate parseDate(String dateStr) {
        return LocalDate.parse(dateStr);
    }

    private static Transaction createTransactionFromRequest(CreateTransactionRequest request) {
        var transaction = new Transaction();
        transaction.setDescription(request.name());
        transaction.setTransactionType(request.transactionType());
        transaction.setDate(parseDate(request.date()));
        transaction.setAmount(new BigDecimal(request.amount()));
        transaction.setCreatedAt(LocalDateTime.now());
        transaction.setCreatedByUser(SYSTEM_USER);
        transaction.setUpdatedAt(LocalDateTime.now());
        transaction.setUpdatedByUser(SYSTEM_USER);
        return transaction;
    }

    public void deleteTransaction(final Long id) {
        log.info("Deleting Transaction with id: {}", id);
        repository.deleteById(id);
        log.info("Transaction with id: {} deleted successfully", id);
    }

    public TransactionResponse getTransactionById(final Long id) {
        log.info("Retrieving Transaction with id: {}", id);
        var response = repository.findById(id);
        if (response.isEmpty()) {
            log.info("Transaction with id: {} not found", id);
            return null;
        }
        log.info("Transaction with id: {} retrieved successfully", id);
        return mapper.toDto(response.get());
    }
}
