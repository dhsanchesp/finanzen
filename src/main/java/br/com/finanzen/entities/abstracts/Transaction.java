package br.com.finanzen.entities.abstracts;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@MappedSuperclass
public abstract class Transaction extends Audit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @Column(nullable = false)
    private String description;
    @Column(nullable = false, precision = 15, scale = 2)
    private BigDecimal amount;
    @Column(nullable = false)
    private LocalDate date;
}
