import model.Account;
import model.CurrentAccount;
import model.SavingAccount;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyBankApp {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Account account = context.getBean("myAccount",Account.class);
        System.out.println(account.createAccount());
        System.out.println(account.cardDetails());
//        System.out.println("fdsfsd");
    }
}
// Spring inversion of control