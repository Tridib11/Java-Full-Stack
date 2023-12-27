package AccessModifiers;
public class Main {
    public static void main(String[] args) {
        BankAccount acc=new BankAccount();
        acc.userName="Tridib Ghosh";
        System.out.println(acc.userName);
        acc.setPassWord("abc124");
    }
}
class BankAccount{
    public String userName;
    private String passWord;
    void setPassWord(String PassWord){
        passWord=PassWord;
        System.out.println(passWord);
    }
}
