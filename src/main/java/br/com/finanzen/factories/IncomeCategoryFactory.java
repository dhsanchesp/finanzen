package br.com.finanzen.factories;

import br.com.finanzen.controller.dto.CreateIncomeCategoryRequest;
import br.com.finanzen.domain.models.IncomeCategory;

import java.time.LocalDateTime;
import java.util.UUID;

public class IncomeCategoryFactory {

    public static IncomeCategory createIncomeCategory(final CreateIncomeCategoryRequest request, final String createdByUser) {
        IncomeCategory category = new IncomeCategory();
        category.setId(UUID.randomUUID());
        category.setName(request.name());
        category.setDescription(request.description());

        category.setCreatedAt(LocalDateTime.now());
        category.setCreatedByUser(createdByUser);
        category.setUpdatedAt(LocalDateTime.now());
        category.setUpdatedByUser(createdByUser);

        return category;
    }
}
