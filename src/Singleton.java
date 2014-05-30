/**
 * @author tombisnis@yahoo.com
 */
public class Singleton {
    private static Singleton singleton = new Singleton();
    
    public Singleton(){
        
    }
    
    public static Singleton getInstance(){
        return singleton;
    }
    
    protected static void demoMethod(){
        System.out.println("demoMethod for Singleton");
    }
    
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.demoMethod();
    }
}