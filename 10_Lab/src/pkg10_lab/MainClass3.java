
package pkg10_lab;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class MainClass3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            File recordFile = new File("D:\\git-repos\\JavaProgramming\\10_Lab\\src\\pkg10_lab\\record.txt");
            FileReader fr = new FileReader(recordFile);
            BufferedReader br = new BufferedReader(fr);
            
            String[][] result = new String[100][];
            String line;
            
            int index = 0;
            
            while((line = br.readLine()) != null) {
                String values[] = line.split(",");
                result[index] = values;
                index++;
            }
            
            br.close();
            
            for(int i = 0; i<index; i++){
                for (int j=0; j<result[i].length; j++){
                    System.out.println(result[i][j] + " ");
                }
                System.out.println("\n");
            }
            
            System.out.print("Select fruit to update quantity: ");
            String fruitname = sc.next();
            
            System.out.print("quantity: ");
            int quantity = sc.nextInt();
            
            for (int i=0; i<index; i++){
                if (result[i][0].equals(fruitname)){
                    result[i][1] = String.valueOf(quantity);
                }
            }
            
            for(int i = 0; i<index; i++){
                for (int j=0; j<result[i].length; j++){
                    System.out.println(result[i][j] + " ");
                }
                System.out.println("\n");
            }
            
               FileWriter fw = new FileWriter(recordFile);
               BufferedWriter bw = new BufferedWriter(fw);
               
               for(int i=0; i<index; i++){
                   line = "";
                for (int j=0; j<result[i].length; j++){
                    line += result[i][j];
                    
                    if (j != result[i].length-1)
                        line += ",";
                    }
                    line += "\n";
                    bw.write(line);
                }
               
                bw.flush();
                bw.close();
            
         } catch (Exception e) {System.out.println("Error");} 
    }
}

