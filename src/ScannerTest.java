import java.util.Scanner;

public class ScannerTest {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

//        if(scanner.hasNext()){
//            System.out.println(scanner.next());
//        }
//        if(scanner.hasNextLine()){
//            System.out.println(scanner.nextLine());
//        }
        if(scanner.hasNextInt()){
            System.out.println(scanner.nextInt());
        }else{
            System.out.println("error!");
        }
        scanner.close();
    }
}
