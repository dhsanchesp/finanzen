package br.com.finanzen.domain.models;

import br.com.finanzen.domain.models.abstracts.Transaction;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "expense")
public class Expense extends Transaction {
    @ManyToMany
    @JoinTable(
            name = "transaction_expense_category",
            joinColumns = @JoinColumn(name = "transaction_id"),
            inverseJoinColumns = @JoinColumn(name = "expense_category_id")
    )
    private Set<ExpenseCategory> categories = new HashSet<>();
}
