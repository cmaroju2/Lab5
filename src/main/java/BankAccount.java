import java.util.Random;

/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 5.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/5/">Lab 5 Description</a>
 */
public class BankAccount {

    /**
     * You may want to use this to distinguish between different kinds of accounts.
     */
    public enum BankAccountType {
        /**
         * n.
         */
        CHECKINGS,
        /**
         * n.
         */
        SAVINGS,
        /**
         * n.
         */
        STUDENT,
        /**
         * n.
         */
        WORKPLACE
    }

    /**
     * n.
     */
    private int accountNumber;
    /**
     * n.
     */
    private BankAccountType accountType;
    /**
     * n.
     */
    private double accountBalance;
    /**
     *n.
     */
    private String ownerName;
    /**
     *n.
     */
    private double interestRate;
    /**
     *n.
     */
    private double interestEarned;
    /**
     *n.
     * @param name is name
     * @param accountCategory is the category of the account
     */
    public BankAccount(final String name, final BankAccountType accountCategory) {
        ownerName = name;
        accountType = accountCategory;
        accountBalance = 0;
        Bank.incrementNumAccounts();

    }
    /**
     *n.
     * @param newValue is the new val
     */
    public void setAccountBalance(final double newValue) {
        accountBalance = newValue;
    }

    /**
     *
     * @return the balance
     */
    public double getBalance(){
        return accountBalance;
    }
    /**
     * n.
     * @return the balance
     */
    public double getAccountBalance() {
        return accountBalance;
    }
    /**
     * @param newValue is new name
     */
    public void setOwnerName(final String newValue) {
        ownerName = newValue;
    }

}
