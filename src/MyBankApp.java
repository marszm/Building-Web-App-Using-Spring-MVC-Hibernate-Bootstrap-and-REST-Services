import model.Account;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyBankApp {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Account account1 = context.getBean("myAccount",Account.class);
        Account account2 = context.getBean("myAccount",Account.class);
        boolean isSame = (account1==account2);
        System.out.println("acc1 = acc2: "+isSame);
        System.out.println("acc1 hash code: "+account1.hashCode());
        System.out.println("acc2 hash code: "+account2.hashCode());
//        System.out.println(account.createAccount());
//        System.out.println(account.cardDetails());
//        System.out.println("fdsfsd");
    }
}
// Spring inversion of control