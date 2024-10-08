package ma.enset.bankaccountserviceapplication.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.enset.bankaccountserviceapplication.enums.AccountType;

import java.util.Date;

@AllArgsConstructor @NoArgsConstructor @Builder @Data
public class AccountInputDto {
    private String id ;
    private AccountType type ;
    private Double balance ;
    private Date createdAt;

}
