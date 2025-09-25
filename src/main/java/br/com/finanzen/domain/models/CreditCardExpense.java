package br.com.finanzen.domain.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "credit_card_expense")
public class CreditCardExpense extends Expense {
    @ManyToOne(optional = false)
    @JoinColumn(name = "credit_card_id", nullable = false)
    private CreditCard creditCard;
    @Column(nullable = false)
    private Integer billingYear;
    @Column(nullable = false)
    private Integer billingMonth;
}
