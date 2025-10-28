package br.com.finanzen.service;

import br.com.finanzen.dtos.expenses.CreateExpenseRequest;
import br.com.finanzen.dtos.expenses.CreateExpenseResponse;
import br.com.finanzen.entities.Expense;
import br.com.finanzen.repository.ExpenseRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Slf4j
@Service
public class ExpenseService {

    private final ExpenseRepository expenseRepository;

    public ExpenseService(ExpenseRepository expenseRepository) {
        this.expenseRepository = expenseRepository;
    }

    public CreateExpenseResponse createExpense(final CreateExpenseRequest request) {
        log.info("Creating account");

        var newExpense = new Expense();
        newExpense.setDescription(request.name());
//        newExpense.set
        newExpense.setAmount(new BigDecimal(request.amount()));
        // FIXME implementar lógica de criação de conta
        return null;
    }
}
