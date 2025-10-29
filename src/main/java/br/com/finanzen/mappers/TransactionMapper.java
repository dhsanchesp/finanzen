package br.com.finanzen.mappers;

import br.com.finanzen.controller.dto.TransactionResponse;
import br.com.finanzen.entity.Transaction;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TransactionMapper {
//    @Mapping(source = "entity.id", target = "id")
//    @Mapping(source = "entity.name", target = "name")
//    @Mapping(source = "entity.description", target = "description")
    TransactionResponse toDto(Transaction entity);
}
