package br.com.finanzen.service;

import br.com.finanzen.controller.dto.CreateIncomeCategoryRequest;
import br.com.finanzen.controller.dto.CreateIncomeCategoryResponse;
import br.com.finanzen.factories.IncomeCategoryFactory;
import br.com.finanzen.mappers.IncomeCategoryMapper;
import br.com.finanzen.repository.IncomeCategoryRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class IncomeCategoryService {

    private static final String SYSTEM_USER = "system";

    private final IncomeCategoryRepository repository;
    private final IncomeCategoryMapper mapper;

    public IncomeCategoryService(IncomeCategoryRepository repository, IncomeCategoryMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public CreateIncomeCategoryResponse createIncomeCategory(final CreateIncomeCategoryRequest request) {
        log.info("Creating income category with name: {}", request.name());

        var newCategory = IncomeCategoryFactory.createIncomeCategory(request, SYSTEM_USER);
        var savedCategory = repository.save(newCategory);
        return mapper.toDto(savedCategory);
    }

    public void deleteIncomeCategory(final UUID id) {
        log.info("Deleting income category with id: {}", id);
        repository.deleteById(id);
        log.info("Income category with id: {} deleted successfully", id);
    }
}
