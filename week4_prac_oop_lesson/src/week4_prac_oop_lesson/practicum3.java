package week4_prac_oop_lesson;

public class practicum3 {
    private String username;
    private String password;
    
    public void setUsername(String username){
     this.username = username;
    }
    public void setPassword(String password){
     this.password = password;
    }
    
    public String getUsername(){
        return this.username;
    }
    public String getPassword(){
        return this.password;
    }
    

    public static void main(String args[]) {
        practicum3 ob = new practicum3();
        
        ob.setUsername("baskara");
        ob.setPassword("august");
        
        System.out.println("Username : "+ob.getUsername());
        System.out.println("Password : "+ob.getPassword());
    }
}
