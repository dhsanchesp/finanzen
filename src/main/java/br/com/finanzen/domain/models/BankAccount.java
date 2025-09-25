package br.com.finanzen.domain.models;

import br.com.finanzen.domain.models.abstracts.Audit;
import br.com.finanzen.domain.models.enums.BankAccountType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import java.util.UUID;

@Getter @Setter
@Entity
@Table(name = "bank_account")
public class BankAccount extends Audit {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID")
    @Column(name = "id", updatable = false, nullable = false, columnDefinition = "uuid")
    private UUID id;

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
}
