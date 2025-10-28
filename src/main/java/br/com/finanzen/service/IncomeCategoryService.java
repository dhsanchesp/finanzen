package br.com.finanzen.service;

import br.com.finanzen.entities.IncomeCategory;
import br.com.finanzen.mappers.IncomeCategoryMapper;
import br.com.finanzen.repository.IncomeCategoryRepository;
import org.springframework.stereotype.Service;

@Service
public class IncomeCategoryService extends BaseCategoryService<IncomeCategory>{
    public IncomeCategoryService(IncomeCategoryRepository repository, IncomeCategoryMapper mapper) {
        super(repository, mapper);
    }
}
