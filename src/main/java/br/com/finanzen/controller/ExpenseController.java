package br.com.finanzen.controller;

import br.com.finanzen.dtos.expenses.CreateExpenseRequest;
import br.com.finanzen.dtos.expenses.CreateExpenseResponse;
import br.com.finanzen.service.ExpenseService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/v1/expenses")
@Tag(name = "Expense Management APIs", description = "APIs for managing expenses")
public class ExpenseController {

    private final ExpenseService expenseService;

    public ExpenseController(final ExpenseService expenseService) {
        this.expenseService = expenseService;
    }

    @PostMapping
    public ResponseEntity<CreateExpenseResponse> createExpense(@RequestBody CreateExpenseRequest request) {
        // Implementation goes here

        var response = expenseService.createExpense(request);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(response.id())
                .toUri();
        return ResponseEntity.created(location).body(response);
    }
}
