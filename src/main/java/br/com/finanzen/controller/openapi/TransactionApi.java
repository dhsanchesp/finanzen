package br.com.finanzen.controller.openapi;

import br.com.finanzen.controller.dto.CreateTransactionRequest;
import br.com.finanzen.controller.dto.TransactionResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;

import java.util.UUID;

@Tag(name = "TransactionController", description = "API for managing Transactions")
public interface TransactionApi {

    @Operation(summary = "Creates a new Transaction", description = "Creates a new Transaction with the provided data")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Transaction created successfully"),
            @ApiResponse(responseCode = "400", description = "Invalid request")
    })
    ResponseEntity<TransactionResponse> createTransaction(CreateTransactionRequest request);

    @Operation(summary = "Updates an existing Transaction", description = "Updates the Transaction identified by the provided ID")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "204", description = "Transaction updated successfully"),
            @ApiResponse(responseCode = "400", description = "Invalid request"),
            @ApiResponse(responseCode = "404", description = "Transaction not found")
    })
    ResponseEntity<String> updateTransaction(Long id);

    @Operation(summary = "Deletes a Transaction", description = "Deletes the Transaction identified by the provided ID")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "204", description = "Transaction deleted successfully"),
            @ApiResponse(responseCode = "404", description = "Transaction not found")
    })
    ResponseEntity<Void> deleteTransaction(Long id);

    @Operation(summary = "Retrieves a Transaction by ID", description = "Fetches the Transaction identified by the provided ID")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Transaction retrieved successfully"),
            @ApiResponse(responseCode = "404", description = "Transaction not found")
    })
    ResponseEntity<TransactionResponse> getTransactionById(Long id);
}
