package ma.enset.bankaccountserviceapplication.repositories;

import ma.enset.bankaccountserviceapplication.entities.BankAccount;
import ma.enset.bankaccountserviceapplication.projections.AccountProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(excerptProjection = AccountProjection.class)
public interface BankAccountRepository extends JpaRepository<BankAccount, String>{

}
