package Main;
import Service.Ai;

public class Main {
    public static void main(String[] args) {
        Ai a= new Ai();
        Web w = new Web();
        w.setcourse(a);
        boolean status=w.display();
        if(status){
            System.out.println("course is registered");
        }
        else{
            System.out.println("course is not registered");
        }
    }
    
}
