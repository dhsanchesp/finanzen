package br.com.finanzen.repository;

import br.com.finanzen.entities.ExpenseCategory;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpenseCategoryRepository extends BaseCategoryJpaRepository<ExpenseCategory> {
}
