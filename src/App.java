import java.util.Scanner;
public class App {
    
    public static void main(String[] args) throws Exception {
        System.out.println("Säg ett nummer mellan -2147483647 och 2147483647");
        Scanner in= new Scanner(System.in);
        int tal = in.nextInt();
        System.out.println("Hur många columner beviljas?");
        int column = in.nextInt();
        for(int i=0; i<column;i++){
            System.out.println();
            for (int j=0; j<tal;j++){
                System.out.print("*");
            }
        }
    }
}
