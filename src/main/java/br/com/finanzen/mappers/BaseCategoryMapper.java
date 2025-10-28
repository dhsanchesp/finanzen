package br.com.finanzen.mappers;

import br.com.finanzen.dtos.categories.CategoryResponse;
import br.com.finanzen.dtos.categories.CreateCategoryRequest;
import br.com.finanzen.dtos.categories.CreateCategoryResponse;
import org.mapstruct.MappingTarget;

import java.util.List;

//@Mapper(componentModel = "spring")
public interface BaseCategoryMapper<E> {

    E toEntity(CreateCategoryRequest request);

    CreateCategoryResponse toCreateResponse(E entity);

    CategoryResponse toResponse(E entity);

    List<CategoryResponse> toResponseList(List<E> entities);

    void updateEntity(CreateCategoryRequest request, @MappingTarget E entity);
}
