package br.com.finanzen.service;

import br.com.finanzen.entities.ExpenseCategory;
import br.com.finanzen.mappers.ExpenseCategoryMapper;
import br.com.finanzen.repository.ExpenseCategoryRepository;
import org.springframework.stereotype.Service;

@Service
public class ExpenseCategoryService extends BaseCategoryService<ExpenseCategory>{
    public ExpenseCategoryService(ExpenseCategoryRepository repository, ExpenseCategoryMapper mapper) {
        super(repository, mapper);
    }
}
