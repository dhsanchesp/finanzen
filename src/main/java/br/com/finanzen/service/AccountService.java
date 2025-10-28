package br.com.finanzen.service;

import br.com.finanzen.dtos.accounts.CreateAccountRequest;
import br.com.finanzen.dtos.accounts.CreateAccountResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class AccountService {

    public CreateAccountResponse createAccount(final CreateAccountRequest request) {
        log.info("Creating account");
        // FIXME implementar lógica de criação de conta
        return null;
    }
}
