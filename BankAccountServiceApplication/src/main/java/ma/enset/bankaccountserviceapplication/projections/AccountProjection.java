package ma.enset.bankaccountserviceapplication.projections;

import ma.enset.bankaccountserviceapplication.entities.BankAccount;
import ma.enset.bankaccountserviceapplication.enums.AccountType;
import org.springframework.data.rest.core.config.Projection;

import java.util.Date;

@Projection(types = BankAccount.class)
public interface AccountProjection {

    String getId();
    AccountType getTypes();
    Double getBalance();
    Date getCreatedAt();

}
