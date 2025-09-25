package br.com.finanzen.controller.openapi;

import br.com.finanzen.controller.dto.CreateIncomeCategoryRequest;
import br.com.finanzen.controller.dto.CreateIncomeCategoryResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;

import java.util.UUID;

@Tag(name = "IncomeCategoryController", description = "API for managing Income Categories")
public interface IncomeCategoryApi {

    @Operation(summary = "Creates a new income category", description = "Creates a new income category with the provided data")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Category created successfully"),
            @ApiResponse(responseCode = "400", description = "Invalid request")
    })
    ResponseEntity<CreateIncomeCategoryResponse> createIncomeCategory(CreateIncomeCategoryRequest request);
    @Operation(summary = "Updates an existing income category", description = "Updates the income category identified by the provided ID")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "204", description = "Category updated successfully"),
            @ApiResponse(responseCode = "400", description = "Invalid request"),
            @ApiResponse(responseCode = "404", description = "Category not found")
    })
    ResponseEntity<Void> updateIncomeCategory(UUID id);
    @Operation(summary = "Deletes an income category", description = "Deletes the income category identified by the provided ID")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "204", description = "Category deleted successfully"),
            @ApiResponse(responseCode = "404", description = "Category not found")
    })
    ResponseEntity<Void> deleteIncomeCategory(UUID id);
    @Operation(summary = "Retrieves an income category by ID", description = "Fetches the income category identified by the provided ID")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Category retrieved successfully"),
            @ApiResponse(responseCode = "404", description = "Category not found")
    })
    ResponseEntity<Void> getIncomeCategoryById(UUID id);
    @Operation(summary = "Retrieves all income categories", description = "Fetches all existing income categories")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Categories retrieved successfully")
    })
    ResponseEntity<Void> getAllIncomeCategories();
}
