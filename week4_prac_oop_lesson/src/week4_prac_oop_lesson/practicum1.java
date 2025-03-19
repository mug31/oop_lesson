package week4_prac_oop_lesson;

class data{
    public String username;
    public String password;
}

public class practicum1 {

    public static void main(String args[]) {
        data ob = new data();
        
        ob.username = "Baskara";
        ob.password = "Agustus";
        
        System.out.println("Username : "+ob.username);
        System.out.println("Password : "+ob.password);
    }
}
