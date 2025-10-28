package br.com.finanzen.mappers;

import br.com.finanzen.dtos.categories.CategoryResponse;
import br.com.finanzen.dtos.categories.CreateCategoryRequest;
import br.com.finanzen.dtos.categories.CreateCategoryResponse;
import br.com.finanzen.entities.ExpenseCategory;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-10-21T23:22:22-0300",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.10.jar, environment: Java 21.0.7 (Eclipse Adoptium)"
)
@Component
public class ExpenseCategoryMapperImpl implements ExpenseCategoryMapper {

    @Override
    public ExpenseCategory toEntity(CreateCategoryRequest request) {
        if ( request == null ) {
            return null;
        }

        ExpenseCategory expenseCategory = new ExpenseCategory();

        return expenseCategory;
    }

    @Override
    public CreateCategoryResponse toCreateResponse(ExpenseCategory entity) {
        if ( entity == null ) {
            return null;
        }

        String id = null;
        String name = null;
        String description = null;

        CreateCategoryResponse createCategoryResponse = new CreateCategoryResponse( id, name, description );

        return createCategoryResponse;
    }

    @Override
    public CategoryResponse toResponse(ExpenseCategory entity) {
        if ( entity == null ) {
            return null;
        }

        String createdByUser = null;

        createdByUser = entity.getCreatedByUser();

        String id = null;
        String name = null;
        String description = null;

        CategoryResponse categoryResponse = new CategoryResponse( id, name, description, createdByUser );

        return categoryResponse;
    }

    @Override
    public List<CategoryResponse> toResponseList(List<ExpenseCategory> entities) {
        if ( entities == null ) {
            return null;
        }

        List<CategoryResponse> list = new ArrayList<CategoryResponse>( entities.size() );
        for ( ExpenseCategory expenseCategory : entities ) {
            list.add( toResponse( expenseCategory ) );
        }

        return list;
    }

    @Override
    public void updateEntity(CreateCategoryRequest request, ExpenseCategory entity) {
        if ( request == null ) {
            return;
        }
    }
}
