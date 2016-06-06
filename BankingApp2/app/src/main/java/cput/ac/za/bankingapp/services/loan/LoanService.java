package cput.ac.za.bankingapp.services.loan;

/**
 * Created by Scorpian on 2016-05-06.
 */
public interface LoanService {

    String activateLoanAccount(long maxAmount, long minAmount);

    boolean isAccountActivated();

    boolean deactivateAccount();


}
