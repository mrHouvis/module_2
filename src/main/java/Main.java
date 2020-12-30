import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
        public static void main (String [] args) {
                int[] array = new int[6];
                try( BufferedReader reader = new BufferedReader(new FileReader("file.txt"));) {
                        for(int i=0; i<6; i++){
                              array[i] = Integer.parseInt(reader.readLine());
                        }
                } catch (IOException e) {
                        e.printStackTrace();
                }
                System.out.println("1) Вивести на екран лише унікальні значення (обов’язкове використання Set)");
                System.out.println("2) Вивести тільки парні значення (обов’язкове використання колекції List)");
                System.out.println("3) Вивести всі елементи у вигляді пар «First element – array[0]», «Second element – array[1]» ….(обов’язкове використання колекції Map та ітератору)");
                System.out.println("4) Закінчити виконання програми, якщо буде в консолі введено слово «quit»");
                Scanner in = new Scanner(System.in);
                System.out.print("Введите строку: ");
                String str = in.nextLine();
                if(str.equals("1")) {
                        HashSet set = new HashSet();
                        for(int i=0; i<6; i++){
                                set.add(array[i]);
                        }
                        for (Object a: set) {
                                System.out.println(a);
                        }
                }if(str.equals("2")){
                        ArrayList list = new ArrayList();
                        for(int i=0; i<6; i++){
                                if(array[i]%2 == 0)
                                        list.add(array[i]);
                        }
                        for (Object a: list) {
                                System.out.println(a);
                        }
                }if(str.equals("3")){
                        TreeMap map = new TreeMap();
                }if(str.equals("4")){
                        System.out.println("quit");
                }
        }
}
