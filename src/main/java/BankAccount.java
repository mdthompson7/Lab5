//import java.util.Random;

/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 8.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/8/">Lab 8 Description</a>
 */
public class BankAccount {

    /*
     * You may want to use this to distinguish between different kinds of accounts.
     */

    /**
     */
    public enum BankAccountType {
        /** checking account. */
        CHECKINGS,
        /** savings account. */
        SAVINGS,
        /** student account. */
        STUDENT,
        /** workplace account. */
        WORKPLACE
    }
    /** the number of the account. */
    private int accountNumber;
    /** the type of the account. */
    private BankAccountType accountType;
    /** the current balance of the account. */
    private double accountBalance;
    /** the name of the owner of the account. */
    private String ownerName;
    /** the interest rate on the account. */
    private double interestRate;
    /** the interest earned on the account. */
    private double interestEarned;

    /**
     * Contructor, takes two arguments.
     * @param name the name of the person who owns the account
     * @param accountCategory the type of the account
     */
    public BankAccount(final String name, final BankAccountType accountCategory) {
        ownerName = name;
        accountType = accountCategory;
        Bank.getNumberOfAccount();
    }

    /**
     * sets the account number.
     * @param num the number to be set
     */
    public void setAccountNumber(final int num) {
        accountNumber = num;
    }
    /**
     * gets the account number.
     * @return the account number
     */
    public int getAccountNumber() {
        return accountNumber;
    }
    /**
     * sets the account type.
     * @param type the type of the account
     */
    public void setAccountType(final BankAccountType type) {
        accountType = type;
    }
    /**
     * gets the account type.
     * @return the accoutn type
     */
    public BankAccountType getAccountType() {
        return accountType;
    }
    /**
     * sets the account balance.
     * @param bal the balance
     */
    public void setAccountBalance(final double bal) {
        accountBalance = bal;
    }
    /**
     * gets the account balance.
     * @return the balance
     */
    public double getAccountBalance() {
        return accountBalance;
    }
    /**
     * sets the owner name.
     * @param owner the name of the owner of the account
     */
    public void setOwnerName(final String owner) {
        ownerName = owner;
    }
    /**
     * gets the owner name.
     * @return the name of the owner
     */
    public String getOwnerName() {
        return ownerName;
    }

    /**
     * sets the interest rate.
     * @param interest the interest rate
     */
    public void setInterestRate(final double interest) {
        interestRate = interest;
    }

    /**
     * gets the interest rate.
     * @return the interest rate
     */
    public double getInterestRate() {
        return interestRate;
    }

    /**
     * sets the interest earned.
     * @param earn the interest earned
     */
    public void setInterestEarned(final double earn) {
        interestEarned = earn;
    }

    /**
     * gets the interest earned.
     * @return the interest earned
     */
    public double getInterestEarned() {
        return interestEarned;
    }
}
