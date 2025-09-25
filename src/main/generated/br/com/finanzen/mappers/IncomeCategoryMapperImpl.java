package br.com.finanzen.mappers;

import br.com.finanzen.controller.dto.CreateIncomeCategoryResponse;
import br.com.finanzen.domain.models.IncomeCategory;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-09-24T23:55:14-0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.7 (Eclipse Adoptium)"
)
@Component
public class IncomeCategoryMapperImpl implements IncomeCategoryMapper {

    @Override
    public CreateIncomeCategoryResponse toDto(IncomeCategory entity) {
        if ( entity == null ) {
            return null;
        }

        String id = null;
        String name = null;
        String description = null;

        if ( entity.getId() != null ) {
            id = entity.getId().toString();
        }
        name = entity.getName();
        description = entity.getDescription();

        CreateIncomeCategoryResponse createIncomeCategoryResponse = new CreateIncomeCategoryResponse( id, name, description );

        return createIncomeCategoryResponse;
    }
}
