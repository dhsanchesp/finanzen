package br.com.finanzen.controller;

import br.com.finanzen.controller.openapi.IncomeCategoryApi;
import br.com.finanzen.controller.dto.CreateIncomeCategoryRequest;
import br.com.finanzen.controller.dto.CreateIncomeCategoryResponse;
import br.com.finanzen.service.IncomeCategoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;
import java.util.UUID;

@Slf4j
@RestController("/v1/incomes/categories")
public class IncomeCategoryController implements IncomeCategoryApi {

    private final IncomeCategoryService service;

    public IncomeCategoryController(IncomeCategoryService service) {
        this.service = service;
    }

    @Override
    @PostMapping
    public ResponseEntity<CreateIncomeCategoryResponse> createIncomeCategory(@RequestBody final CreateIncomeCategoryRequest request) {
        log.info("Creating income category");

        var response = service.createIncomeCategory(request);
        return ResponseEntity.created(URI.create(response.id())).build();
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Void> updateIncomeCategory(@PathVariable(name = "id") final UUID id) {
        log.info("Updating income category by id: {}", id);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteIncomeCategory(@PathVariable(name = "id") final UUID id) {
        log.info("Deleting income category");
        service.deleteIncomeCategory(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Void> getIncomeCategoryById(@PathVariable(name = "id") final UUID id) {
        log.info("Getting income category by id");
        return ResponseEntity.noContent().build();
    }

    @GetMapping
    public ResponseEntity<Void> getAllIncomeCategories() {
        log.info("Getting all income categories");
        return ResponseEntity.noContent().build();
    }
}
