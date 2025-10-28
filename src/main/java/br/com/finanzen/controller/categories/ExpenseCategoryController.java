package br.com.finanzen.controller.categories;

import br.com.finanzen.controller.abstracts.BaseCategoryController;
import br.com.finanzen.controller.categories.openapi.CategoryApi;
import br.com.finanzen.entities.IncomeCategory;
import br.com.finanzen.service.BaseCategoryService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/categories/expenses")
@Tag(name = "Expense Categories", description = "Expense Category Management APIs")
public class ExpenseCategoryController extends BaseCategoryController<IncomeCategory> implements CategoryApi {
    public ExpenseCategoryController(BaseCategoryService<IncomeCategory> service) {
        super(service);
    }
}
