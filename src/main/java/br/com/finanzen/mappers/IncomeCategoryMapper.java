package br.com.finanzen.mappers;

import br.com.finanzen.controller.dto.CreateIncomeCategoryResponse;
import br.com.finanzen.domain.models.IncomeCategory;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface IncomeCategoryMapper {
//    @Mapping(source = "entity.id", target = "id")
//    @Mapping(source = "entity.name", target = "name")
//    @Mapping(source = "entity.description", target = "description")
    CreateIncomeCategoryResponse toDto(IncomeCategory entity);
}
