/**
 * @author tombisnis@yahoo.com
 */
public class FreshJuice{
    public static void main(String[] args) {
        FreshJuiceInner freshJuiceInner = new FreshJuiceInner();
            freshJuiceInner.freshJuiceSize = FreshJuiceInner.FreshJuiceSize.LARGE;
            
            System.out.println("Pilihannya >>> "+freshJuiceInner.freshJuiceSize);
    }
}

class FreshJuiceInner {
    enum FreshJuiceSize{SMALL, MEDIUM, LARGE}
    
    FreshJuiceSize freshJuiceSize;
}