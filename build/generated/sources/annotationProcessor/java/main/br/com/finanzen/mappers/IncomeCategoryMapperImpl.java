package br.com.finanzen.mappers;

import br.com.finanzen.controller.dto.CreateIncomeCategoryResponse;
import br.com.finanzen.domain.models.IncomeCategory;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-09-25T00:32:09-0300",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.10.jar, environment: Java 21.0.7 (Eclipse Adoptium)"
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

        CreateIncomeCategoryResponse createIncomeCategoryResponse = new CreateIncomeCategoryResponse( id, name, description );

        return createIncomeCategoryResponse;
    }
}
