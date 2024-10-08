package ma.enset.bankaccountserviceapplication;

import ma.enset.bankaccountserviceapplication.entities.BankAccount;
import ma.enset.bankaccountserviceapplication.enums.AccountType;
import ma.enset.bankaccountserviceapplication.repositories.BankAccountRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.UUID;

@SpringBootApplication
public class BankAccountServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(BankAccountServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner start(BankAccountRepository bankAccountRepository){
        return args -> {
            BankAccount currentAccount = BankAccount.builder()
                    .type(AccountType.CURRENT_ACCOUNT)
                    .balance(1391.09)
                    .createdAt(new Date())
                    .build();
            bankAccountRepository .save(currentAccount);

            BankAccount savingAccount = BankAccount.builder()
                    .type(AccountType.SAVING_ACCOUNT)
                    .balance(1493.00)
                    .createdAt(new Date())
                    .build();
                bankAccountRepository.save(savingAccount);

        };
    }

}
