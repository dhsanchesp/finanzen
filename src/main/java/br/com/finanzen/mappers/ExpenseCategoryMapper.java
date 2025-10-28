package br.com.finanzen.mappers;

import br.com.finanzen.entities.ExpenseCategory;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ExpenseCategoryMapper extends BaseCategoryMapper<ExpenseCategory> {
}
