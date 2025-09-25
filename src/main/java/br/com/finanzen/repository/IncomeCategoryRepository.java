package br.com.finanzen.repository;

import br.com.finanzen.domain.models.IncomeCategory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Slf4j
@Repository
public class IncomeCategoryRepository {

    private final IncomeCategoryJpaRepository jpaRepository;

    public IncomeCategoryRepository(IncomeCategoryJpaRepository jpaRepository) {
        this.jpaRepository = jpaRepository;
    }

    public IncomeCategory save(IncomeCategory incomeCategory) {
        log.info("Saving IncomeCategory: {}", incomeCategory.getName());
        return jpaRepository.save(incomeCategory);
    }

    public void deleteById(UUID id) {
        log.info("Deleting IncomeCategory with id: {}", id);
        jpaRepository.deleteById(id);
        log.info("IncomeCategory with id: {} Deleted Successfully", id);
    }
}
