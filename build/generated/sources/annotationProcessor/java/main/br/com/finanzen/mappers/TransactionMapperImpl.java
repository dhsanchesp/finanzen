package br.com.finanzen.mappers;

import br.com.finanzen.controller.dto.TransactionResponse;
import br.com.finanzen.entity.Transaction;
import br.com.finanzen.enums.TransactionType;
import java.time.format.DateTimeFormatter;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-10-28T23:37:47-0300",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.10.jar, environment: Java 21.0.7 (Eclipse Adoptium)"
)
@Component
public class TransactionMapperImpl implements TransactionMapper {

    @Override
    public TransactionResponse toDto(Transaction entity) {
        if ( entity == null ) {
            return null;
        }

        String id = null;
        String description = null;
        String amount = null;
        TransactionType transactionType = null;
        String date = null;

        if ( entity.getId() != null ) {
            id = String.valueOf( entity.getId() );
        }
        description = entity.getDescription();
        if ( entity.getAmount() != null ) {
            amount = entity.getAmount().toString();
        }
        transactionType = entity.getTransactionType();
        if ( entity.getDate() != null ) {
            date = DateTimeFormatter.ISO_LOCAL_DATE.format( entity.getDate() );
        }

        TransactionResponse transactionResponse = new TransactionResponse( id, description, amount, transactionType, date );

        return transactionResponse;
    }
}
