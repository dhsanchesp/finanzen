package br.com.finanzen.domain.models;

import br.com.finanzen.domain.models.abstracts.Category;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "expense_category")
public class ExpenseCategory extends Category {
}
