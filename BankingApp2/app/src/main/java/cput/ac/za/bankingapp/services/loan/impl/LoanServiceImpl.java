package cput.ac.za.bankingapp.services.loan.impl;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.support.annotation.Nullable;

import cput.ac.za.bankingapp.conf.database.DomainState;
import cput.ac.za.bankingapp.domain.Loan;
import cput.ac.za.bankingapp.repository.loan.LoanRepository;
import cput.ac.za.bankingapp.repository.loan.impl.LoanRepositoryImpl;
import cput.ac.za.bankingapp.services.loan.LoanService;

/**
 * Created by Scorpian on 2016-05-06.
 */
public class LoanServiceImpl {

    /*
        //extends Service implements LoanService {


    /* Edit my Domain to have a chain of responsibility and update my repository to take max and minumum values
    private final IBinder localBinder = new ActivateLoaServiceBinder();
    private LoanRepository loanRepository;


    @Nullable
    @Override
    public IBinder onBind(Intent intent)
    {
        return localBinder;
    }


    public class ActivateLoanServiceLocalBinder extends Binder
    {

        public LoanServiceImpl getService()
        {
            return ActivateLoanServiceImpl.this;
        }
    }


    @Override
    public boolean isAccountActivated() {
        return loanRepository.findAll().size()>0;
    }

    @Override
    public boolean deactivateAccount() {

        int row = loanRepository.deleteAll();
        return row>0;
    }

    private Loan createLoan(Loan loan)
    {
        loanRepository = new LoanRepositoryImpl(this.getApplicationContext());

        return loanRepository.save(loan);
    }

    @Override
    public String activateLoanAccount(long maxAmount, long minAmount) {
        if(true)
        {
            Loan standardLoan = new Loan.Builder()
                   /*
                    .maxLoanAmount(maxAmount)
                    .minLoanAmount(minAmount)

                    .build();

            createLoan(standardLoan);
            return DomainState.ACTIVATED.name();
        }
        else
        {
            return DomainState.NOTACTIVATED.name();
        }


 //   }

*/
}
