package br.com.finanzen.repository;

import br.com.finanzen.domain.models.IncomeCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface IncomeCategoryJpaRepository extends JpaRepository<IncomeCategory, UUID> {
}
