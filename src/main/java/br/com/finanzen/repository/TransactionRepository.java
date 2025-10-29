package br.com.finanzen.repository;

import br.com.finanzen.entity.Transaction;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.util.UUID;

//@Slf4j
//@Repository
public class TransactionRepository {

    private final TransactionJpaRepository jpaRepository;

    public TransactionRepository(TransactionJpaRepository jpaRepository) {
        this.jpaRepository = jpaRepository;
    }

    public Transaction save(Transaction transaction) {
        return jpaRepository.save(transaction);
    }

    public void deleteById(Long id) {
        jpaRepository.deleteById(id);
    }
}
