package ma.enset.bankaccountserviceapplication.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.enset.bankaccountserviceapplication.enums.AccountType;
import org.hibernate.annotations.UuidGenerator;

import java.util.Date;

@Entity
@Data @AllArgsConstructor
@NoArgsConstructor @Builder
public class BankAccount {

    @Id @UuidGenerator
    private String id;
    private AccountType type ;
    private Double balance ;
    private Date createdAt ;






}

