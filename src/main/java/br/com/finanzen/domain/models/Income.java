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
@Table(name = "income")
public class Income extends Transaction {

    @ManyToMany
    @JoinTable(
            name = "transaction_income_category",
            joinColumns = @JoinColumn(name = "transaction_id"),
            inverseJoinColumns = @JoinColumn(name = "income_category_id")
    )
    private Set<IncomeCategory> categories = new HashSet<>();
}
