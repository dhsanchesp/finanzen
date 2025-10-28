package br.com.finanzen.factories;

import br.com.finanzen.dtos.categories.CreateCategoryRequest;
import br.com.finanzen.entities.IncomeCategory;

import java.time.LocalDateTime;

public class IncomeCategoryFactory {

    public static IncomeCategory createIncomeCategory(final CreateCategoryRequest request, final String createdByUser) {
        IncomeCategory category = new IncomeCategory();
//        category.setId(UUID.randomUUID());
        category.setName(request.name());
        category.setDescription(request.description());

        category.setCreatedAt(LocalDateTime.now());
        category.setCreatedByUser(createdByUser);
        category.setUpdatedAt(LocalDateTime.now());
        category.setUpdatedByUser(createdByUser);

        return category;
    }
}
