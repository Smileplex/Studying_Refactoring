package Refactoring;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Account {
    private String accountNumber;


    public Account(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public List<Transaction> GetTransactions() throws Exception {
        try{
            List<Transaction> dbTransactionList = Db.getTransactions(accountNumber.trim());
            List<Transaction> transactionList = new ArrayList<>();
            int i;

            for(i=0; i<dbTransactionList.size(); i++){
                Transaction trans = addCommission(transactionList.get(i));
                transactionList.add(trans);
            }
            return transactionList;
        }catch(SQLException ex){
            throw new Exception("Can't retrieve transactions from the database");
        }
    }

    private Transaction addCommission(Transaction trans){
        double currencyAmountInPounds = trans.amount * 0.5;
        return new Transaction(currencyAmountInPounds);
    }
    
    class Transaction{
        public double amount;

        public Transaction(double currencyAmountInPounds) {
            this.amount = currencyAmountInPounds;
        }
    }
}

class Db{
    public static List<Account.Transaction> getTransactions(String accountNumber) throws SQLException{
        return new ArrayList<>();
    }
}