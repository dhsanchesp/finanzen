package br.com.finanzen.repository;

import br.com.finanzen.entities.IncomeCategory;
import org.springframework.stereotype.Repository;

@Repository
public interface IncomeCategoryRepository extends BaseCategoryJpaRepository<IncomeCategory> {
}
