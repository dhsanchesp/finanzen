package br.com.finanzen.domain.models;

import br.com.finanzen.domain.models.enums.CreditCardType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "credit_card")
public class CreditCard {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID")
    @Column(name = "id", updatable = false, nullable = false, columnDefinition = "uuid")
    private UUID id;
    @ManyToOne(optional = false)
    @JoinColumn(name = "credit_card_account_id")
    private CreditCardAcount creditCardAcount;
    @Column(nullable = false)
    private String lastFourDigits;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private CreditCardType type;
}
