
package pkg10_lab;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class MainClass2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try {
            String choice = "C";

            File recordFile = new File("D:\\git-repos\\JavaProgramming\\10_Lab\\src\\pkg10_lab\\record.txt");
            FileWriter fileWriter = new FileWriter(recordFile, true);

            BufferedWriter bufferWriter = new BufferedWriter(fileWriter);
        
            while (choice.equals("C")){
                System.out.print("Fruit name: ");
                String fruitname = sc.next();
                
                System.out.print("Quantity: ");
                int quantity = sc.nextInt();

                System.out.print("Price: ");
                double price = sc.nextDouble();

                System.out.print("Supplier: ");
                sc.nextLine();
                String supplier = sc.nextLine();

                String line = fruitname + "," + quantity + "," + price + "," + supplier + "\n";
                
                bufferWriter.append(line);
                System.out.println("C for continue, X for exit: ");
                choice = sc.next();
            }
            bufferWriter.close();
       
         } catch (Exception e) 
            {System.out.println("Error");} 
    }
}
