public class App {
    public static void main(String[] args) throws Exception {

        int[] days = getDaysArray(getNumberOfDays("FEB", 2001));
        
        for (int day : days) {
            System.out.println(day);
        }

    }
    
    public static int getNumberOfDays(String m, int y){
        String month = m;
        int days = 0;
        
        switch(month){
            case "JAN", "MAR", "MAY", "JUL", "AUG", "OCT", "DEC" -> days = 31;
            case "APR", "JUN", "SEP", "NOV" -> days = 30;
            case "FEB" -> {
                int year = y;
                if ((year%400 == 0) || 
                    ((year%4 == 0) && (year%100 != 0)))
                    days = 29;
                else
                    days = 28;
            }   
        }

        return days;
    }

    public static int[] getDaysArray(int numberOfDays) {
        int[] arrayDays = new int[numberOfDays];
        for (int i = 0; i < numberOfDays; i++) 
            arrayDays[i] = i+1;

        return arrayDays;
    }
}
