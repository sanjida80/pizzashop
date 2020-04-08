import java.util.ArrayList;
public class Transaction {

    enum PaymentType {cash, credit}

    //Class Level Variables - Protect the data
    private int transactionId;
    private float orderTotal;
    private PaymentType pType;

    //Constructor Method
    public Transaction(int _transactionId, float _orderTotal, PaymentType _pType){
        this.transactionId = _transactionId;
        this.orderTotal = _orderTotal;
        this.pType = _pType;
    }

    //Setters and Getters
    public int getTransactionId() { return transactionId; }
    public void setTransactionId(int _transactionId) {this.transactionId = _transactionId;}

    public float getOrderTotal() { return orderTotal; }
    public void setOrderTotal(float orderTotal) { this.orderTotal = orderTotal; }

    public PaymentType getPaymentType() { return pType; }
    public void setPaymentType(PaymentType _pType) {this.pType = _pType;}

    public static void listTransactions(ArrayList<Transaction> tList) {
        for (Transaction trans : tList) {
            System.out.println("Transaction  ID: " + trans.getTransactionId());
            System.out.println("Order Total: " + trans.getOrderTotal());
            System.out.println("Payment Type: " + trans.getPaymentType());
        }
    }
}
