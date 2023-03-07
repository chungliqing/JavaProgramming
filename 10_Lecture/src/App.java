import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class App {
    public static void main(String[] args) {
        try {
            //create/open the file; path name needs double \\
            File f = new File("D:/git-repos/JavaProgramming/10_Lecture/text.txt");
            FileWriter fw = new FileWriter(f);

            BufferedWriter bw = new BufferedWriter(fw);

            String[][] table = {{"June", "abc123", "1234567"}, {"Alex", "xyz345", "7654321"}};

            for(int i=0; i<table.length; i++){
                String line = "";
                for (int j=0; j<table[i].length; j++){
                    line += table[i][j];
                    
                    if (j != table[i].length-1)
                        line += ",";
                }
                line += "\n";
                bw.write(line);
            }
            bw.flush();
            bw.close();
        } catch (Exception e){}
    }
}