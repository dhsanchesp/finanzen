package br.com.finanzen.controller.categories;

import br.com.finanzen.controller.abstracts.BaseCategoryController;
import br.com.finanzen.controller.categories.openapi.CategoryApi;
import br.com.finanzen.entities.IncomeCategory;
import br.com.finanzen.service.BaseCategoryService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/categories/incomes")
@Tag(name = "Income Categories", description = "Income Category Management APIs")
public class IncomeCategoryController extends BaseCategoryController<IncomeCategory> implements CategoryApi {
    public IncomeCategoryController(BaseCategoryService<IncomeCategory> service) {
        super(service);
    }
}
