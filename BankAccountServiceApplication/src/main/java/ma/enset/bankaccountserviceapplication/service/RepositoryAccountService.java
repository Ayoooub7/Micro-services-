package ma.enset.bankaccountserviceapplication.service;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import ma.enset.bankaccountserviceapplication.dtos.AccountDto;
import ma.enset.bankaccountserviceapplication.entities.BankAccount;
import ma.enset.bankaccountserviceapplication.enums.AccountType;
import ma.enset.bankaccountserviceapplication.mappers.AccountMapper;
import ma.enset.bankaccountserviceapplication.repositories.BankAccountRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
@AllArgsConstructor
@Transactional
public class RepositoryAccountService implements AccountService{


    private BankAccountRepository accountRepository;
    private AccountMapper accountMapper;



    @Override
    public AccountDto addAccount(AccountType type, Double balance) {
        BankAccount bankAccount =BankAccount.builder()
                .type(type)
                .balance(balance)
                .createdAt(new Date())
                .build();

        return accountMapper.toDto(
                accountRepository.save(bankAccount))
                ;
    }

    @Override
    public AccountDto updateAccount(@org.jetbrains.annotations.NotNull @org.jetbrains.annotations.NotNull AccountDto accountDto) {

        BankAccount bankAccount = accountMapper.toEntity(
                getAccount(accountDto.getId())
        );
        return accountMapper.toDto(
                accountRepository.save(bankAccount) );

    }
    @Override
    public AccountDto getAccount(String id) {
        return accountMapper.toDto(
                accountRepository.findById(id).orElseThrow()
        );
    }

    @Override
    public void deleteAccount(String id) {
        accountRepository.deleteById(id);
    }

    @Override
    public Page<AccountDto> getAllAccounts(Pageable pageable) {
        return accountRepository.findAll(pageable).map(accountMapper::toDto);
    }

}
