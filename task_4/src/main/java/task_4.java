import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class task_4 {
    static Scanner iScanner = new Scanner(System.in);

    public static String GetData(String message) {
        System.out.println(message);
        return iScanner.nextLine();
    }
        public static void main (String[] args){
            ArrayList<String[]> humans = new ArrayList<>();
            Scanner iScanner = new Scanner(System.in);
            System.out.println("Введите данные в формате ФИО, возраст и пол ");
            while (true) {
                String a = iScanner.nextLine();
                if (a.equals("q")) break;
                humans.add(a.split(" "));
                

            }
            for (String[] i : humans) {
                System.out.printf("%s %s.%s. %s %s\n" , i[0],i[1].toUpperCase().charAt(0),
                        i[2].toUpperCase().charAt(0),i[3],i[4]);
            }
            String a = iScanner.nextLine();
            if (a.equals("q")){
                System.exit(0);
            }
            else{
                humans.sort(new Comparator<String[]>() {
                    @Override
                    public int compare(String[] o1, String[] o2) {
                        return Integer.parseInt(o1[3])-Integer.parseInt(o2[3]);
                    }
                });
                for (String[] i : humans) {
                    System.out.printf("%s %s.%s. %s %s\n" , i[0],i[1].toUpperCase().charAt(0),
                            i[2].toUpperCase().charAt(0),i[3],i[4]); }
                ArrayList<String> surname = new ArrayList<>();
                ArrayList<String> name = new ArrayList<>();
                ArrayList<String> lastname = new ArrayList<>();
                ArrayList<String> age = new ArrayList<>();
                ArrayList<String> gender = new ArrayList<>();

                for (String[] i : humans) {
                    System.out.printf("%s %s.%s. %s %s\n" , i[0],i[1].toUpperCase().charAt(0),
                            i[2].toUpperCase().charAt(0),i[3],i[4]); }
            }
            }
        }

