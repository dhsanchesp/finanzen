package br.com.finanzen.service;

import br.com.finanzen.dtos.categories.CategoryResponse;
import br.com.finanzen.dtos.categories.CreateCategoryRequest;
import br.com.finanzen.dtos.categories.CreateCategoryResponse;
import br.com.finanzen.mappers.BaseCategoryMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

@Slf4j
public abstract class BaseCategoryService<T> {

    protected final JpaRepository<T, Long> repository;
    protected final BaseCategoryMapper<T> mapper;

    protected BaseCategoryService(
            JpaRepository<T, Long> repository,
            BaseCategoryMapper<T> mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public CreateCategoryResponse create(CreateCategoryRequest request) {
        log.info("Creating category with name: {}", request.name());
        T entity = mapper.toEntity(request);

        T savedEntity = repository.save(entity);
        var response = mapper.toCreateResponse(savedEntity);
        log.info("Category created with id: {}", response.id());
        return response;
    }

    public CategoryResponse getById(Long id) {
        log.info("Fetching category with id: {}", id);
        T entity = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Category not found"));
        return mapper.toResponse(entity);
    }

    public void deleteById(Long id) {
        log.info("Deleting category with id: {}", id);
        repository.deleteById(id);
    }

    public List<CategoryResponse> listAll() {
        log.info("Listing all categories");
        return mapper.toResponseList(repository.findAll());
    }
}
