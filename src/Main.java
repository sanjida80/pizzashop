



import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    int cCount = 1;
    public static void main(String[] args) {

        Main main = new Main();

        final char EXIT_CODE = 'E';
        final char CUST_CODE = 'C';
        final char MENU_CODE = 'M';
        final char ORDE_CODE = 'O';
        final char TRAN_CODE = 'T';
        final char CUST_PRNT = 'P';
        final char HELP_CODE = '?';
        char userAction;
        final String PROMPT_ACTION = "Add 'C'ustomer, 'P'rint Customer, List 'M'enu, Add 'O'rder, List 'T'ransaction or 'E'xit: ";

        ArrayList<Customer> cList = new ArrayList<>();
        ArrayList<Menu> mList = new ArrayList<>();
        ArrayList<Order> oList = new ArrayList<>();
        ArrayList<Transaction> tList = new ArrayList<>();

        // Customer cust = new Customer();
        // Order order = new Order(1);
        // Transaction trans = new Transaction(1);

        Menu menu1 = new Menu(1, "Cheese Pizza", 7.00f);
        Menu menu2 = new Menu(2, "Supreme Meat Pizza", 10.00f);
        Menu menu3 = new Menu(3, "Veggie Pizza", 10.00f);
        Menu menu4 = new Menu(4, "Drinks", 2.00f);

        mList.add(menu1);
        mList.add(menu2);
        mList.add(menu3);
        mList.add(menu4);

        Order order1 = new Order(1, "Plain Cheese Pizza with a drink", 9.00f);
        Order order2 = new Order(2, "Veggie Pizza", 10.00f);
        Order order3 = new Order(3, "Supreme Meat Pizza and Cheese Pizza", 17.00f);
        Order order4 = new Order(4, "Supreme Meat Pizza, Cheese Pizza and drink", 19.00f);

        oList.add(order1);
        oList.add(order2);
        oList.add(order3);
        oList.add(order4);

        Transaction trans1 = new Transaction(1, 9.00f, Transaction.PaymentType.cash);
        Transaction trans2 = new Transaction(2, 10.00f, Transaction.PaymentType.credit);
        Transaction trans3 = new Transaction(3, 17.00f, Transaction.PaymentType.credit);
        Transaction trans4 = new Transaction(4, 19.00f, Transaction.PaymentType.cash);

        tList.add(trans1);
        tList.add(trans2);
        tList.add(trans3);
        tList.add(trans4);

        userAction = getAction(PROMPT_ACTION);

        while (userAction != EXIT_CODE) {
            switch(userAction) {
                case CUST_CODE : cList.add(main.addCustomer());
                    break;
                case CUST_PRNT : Customer.printCustomer(cList);
                    break;
                case MENU_CODE : Menu.listMenu(mList);
                    break;
                case ORDE_CODE : Order.listOrders(oList);
                    break;
                case TRAN_CODE : Transaction.listTransactions(tList);
                    break;
            }

            userAction = getAction(PROMPT_ACTION);
        }
    }

    public static char getAction(String prompt) {
        Scanner scnr = new Scanner(System.in);
        String answer = "";
        System.out.println(prompt);
        answer = scnr.nextLine().toUpperCase() + " ";
        char firstChar = answer.charAt(0);
        return firstChar;
    }

    public Customer addCustomer(){
        Customer cust = new Customer(cCount++);
        Scanner scnr = new Scanner(System.in);
        System.out.println("Please Enter your Name: ");
        cust.setCustomerName(scnr.nextLine());
        System.out.println("Please Enter your Phone: ");
        cust.setCustomerPhoneNumber(scnr.nextLine());
        return cust;
    }
}
