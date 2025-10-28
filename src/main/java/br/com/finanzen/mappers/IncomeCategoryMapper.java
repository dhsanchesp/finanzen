package br.com.finanzen.mappers;

import br.com.finanzen.entities.IncomeCategory;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface IncomeCategoryMapper extends BaseCategoryMapper<IncomeCategory> {
}
