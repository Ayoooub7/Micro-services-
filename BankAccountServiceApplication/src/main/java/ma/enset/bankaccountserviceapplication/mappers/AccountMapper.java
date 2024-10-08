package ma.enset.bankaccountserviceapplication.mappers;

import ma.enset.bankaccountserviceapplication.dtos.AccountDto;
import ma.enset.bankaccountserviceapplication.entities.BankAccount;

public interface AccountMapper {
    AccountDto toDto(BankAccount bankAccount);

    BankAccount toEntity(AccountDto accountDto);
}
