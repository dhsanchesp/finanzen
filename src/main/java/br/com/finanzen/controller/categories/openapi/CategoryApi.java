package br.com.finanzen.controller.categories.openapi;

import br.com.finanzen.dtos.categories.CategoryResponse;
import br.com.finanzen.dtos.categories.CreateCategoryRequest;
import br.com.finanzen.dtos.categories.CreateCategoryResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.ResponseEntity;

import java.util.List;

//@Tag(name = "IncomeCategoryController", description = "API for managing Income Categories")
public interface CategoryApi {

    @Operation(summary = "Creates a new category", description = "Creates a new category with the provided data")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Category created successfully"),
            @ApiResponse(responseCode = "400", description = "Invalid request")
    })
    ResponseEntity<CreateCategoryResponse> create(CreateCategoryRequest request);

    @Operation(summary = "Retrieves a category by ID", description = "Fetches the category identified by the provided ID")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Category retrieved successfully"),
            @ApiResponse(responseCode = "404", description = "Category not found")
    })
    ResponseEntity<CategoryResponse> getById(Long id);

    @Operation(summary = "Deletes a category", description = "Deletes the category identified by the provided ID")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "204", description = "Category deleted successfully"),
            @ApiResponse(responseCode = "404", description = "Category not found")
    })
    ResponseEntity<Void> deleteById(Long id);
    @Operation(summary = "Retrieves all categories", description = "Fetches all existing categories")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Categories retrieved successfully")
    })
    ResponseEntity<List<CategoryResponse>> listAll();
}
