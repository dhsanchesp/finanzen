package br.com.finanzen.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface BaseCategoryJpaRepository<E> extends JpaRepository<E, Long> {
}
