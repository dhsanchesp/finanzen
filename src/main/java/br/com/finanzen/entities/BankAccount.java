package br.com.finanzen.entities;

import br.com.finanzen.entities.abstracts.Audit;
import br.com.finanzen.entities.enums.BankAccountType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter @Setter
@Entity
@Table(name = "bank_account")
public class BankAccount extends Audit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "bank_id")
    private Bank bank;

    @Column(nullable = false)
    private String accountNumber;

    @Column(nullable = false)
    private String branchNumber;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private BankAccountType type;

    @Column(precision = 15, scale = 2, nullable = false)
    private BigDecimal balance;
}
