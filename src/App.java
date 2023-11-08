import java.util.Scanner;
public class App {
    
    public static void main(String[] args) throws Exception {
        System.out.println("Säg ett nummer mellan -2147483647 och 2147483647");
        Scanner in= new Scanner(System.in);
        int tal = in.nextInt();
        for (int i=0; i<tal;i++){
            System.out.print("*");
        }
    }
}
