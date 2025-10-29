package br.com.finanzen.controller;

import br.com.finanzen.controller.dto.TransactionResponse;
import br.com.finanzen.controller.openapi.TransactionApi;
import br.com.finanzen.controller.dto.CreateTransactionRequest;
import br.com.finanzen.service.TransactionService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.UUID;

@Slf4j
@RequestMapping("/v1/transactions")
@RestController
public class TransactionController implements TransactionApi {

    private final TransactionService service;

    public TransactionController(TransactionService service) {
        this.service = service;
    }

    @Override
    @PostMapping
    public ResponseEntity<TransactionResponse> createTransaction(@RequestBody CreateTransactionRequest request) {
        var response = service.createTransaction(request);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(response.id())
                .toUri();
        return ResponseEntity.created(location).body(response);
    }

    @Override
    public ResponseEntity<String> updateTransaction(Long id) {
        return ResponseEntity.badRequest().body("Endpoint NOT implemented");
    }

    @Override
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTransaction(@PathVariable(name = "id") Long id) {
        service.deleteTransaction(id);
        return ResponseEntity.noContent().build();
    }

    @Override
    @GetMapping("/{id}")
    public ResponseEntity<TransactionResponse> getTransactionById(@PathVariable(name = "id") Long id) {
        var response = service.getTransactionById(id);

        return ResponseEntity.ok(response);
    }
}
