package ma.enset.bankaccountserviceapplication.mappers;

import com.fasterxml.jackson.databind.util.BeanUtil;
import ma.enset.bankaccountserviceapplication.dtos.AccountDto;
import ma.enset.bankaccountserviceapplication.entities.BankAccount;
import org.springframework.beans.BeanUtils;

public class AccountMapperImpl implements AccountMapper{
    @Override
    public AccountDto toDto(BankAccount bankAccount) {
        AccountDto accountDto = new AccountDto();
        BeanUtils.copyProperties(bankAccount,accountDto);
        return accountDto;
    }

    @Override
    public BankAccount toEntity(AccountDto accountDto) {
        BankAccount bankAccount =new BankAccount();
        BeanUtils.copyProperties(accountDto,bankAccount);
        return bankAccount;
    }
}
