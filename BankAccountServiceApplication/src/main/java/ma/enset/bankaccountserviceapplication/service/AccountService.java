package ma.enset.bankaccountserviceapplication.service;

import ma.enset.bankaccountserviceapplication.dtos.AccountDto;
import ma.enset.bankaccountserviceapplication.enums.AccountType;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface AccountService {
    AccountDto addAccount(AccountType type , Double balance);
    AccountDto getAccount(String id);

    void deleteAccount(String id);

    Page<AccountDto> getAllAccounts(Pageable pageable);
}
