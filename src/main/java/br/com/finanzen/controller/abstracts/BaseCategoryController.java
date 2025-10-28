package br.com.finanzen.controller.abstracts;

import br.com.finanzen.dtos.categories.CategoryResponse;
import br.com.finanzen.dtos.categories.CreateCategoryRequest;
import br.com.finanzen.dtos.categories.CreateCategoryResponse;
import br.com.finanzen.service.BaseCategoryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public abstract class BaseCategoryController<T> {

    protected final BaseCategoryService<T> service;

    public BaseCategoryController(BaseCategoryService<T> service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<CreateCategoryResponse> create(@RequestBody CreateCategoryRequest request) {
        var response = service.create(request);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CategoryResponse> getById(@PathVariable Long id) {
        var response = service.getById(id);
        return ResponseEntity.ok(response);
    }

    @GetMapping
    public ResponseEntity<List<CategoryResponse>> listAll() {
        var response = service.listAll();
        return ResponseEntity.ok(response);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id) {
        service.deleteById(id);

        return ResponseEntity.ok().build();
    }
}
