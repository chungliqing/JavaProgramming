
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;


public class App2 {
    public static void main(String[] args) {
        try {
            File f = new File("D:/git-repos/JavaProgramming/10_Lecture/text.txt");
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);

            String[][] result = new String[100][];
            int count = 0;

            String line;
            while ((line = br.readLine()) != null){
                String[] value = line.split(",");
                result[count] = value;
                count++;
                }

                br.close();

                for (int i=0; i<count; i++){
                    for(int j=0; j<result[i].length; j++){
                        if(!result[i][0].equals("Alex"))
                        System.out.print(result[i][j] + " ");
                    }
                    System.out.println();
                }
                
        } catch (Exception e) { 
            System.out.println("something wrong");
        } 
            
    }

}
