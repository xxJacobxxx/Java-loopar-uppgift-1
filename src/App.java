import java.util.Scanner;
public class App {
    
    public static void main(String[] args) throws Exception {
        int fält[]=new int[5];
        Scanner in = new Scanner(System.in);
        for(int i=0;i<5;i++){
            System.out.println("Skriv in tal nr "+i);
            fält[i]=in.nextInt();

        }
        System.out.println("Här kommer talen");
        for(int i=4; i>=0;i--){
            System.out.println(fält[i]);
        }
    }
}
