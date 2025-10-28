package br.com.finanzen.entities;

import br.com.finanzen.entities.abstracts.Category;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "income_category")
@DiscriminatorValue("IncomeCategory")
public class IncomeCategory extends Category {

}
