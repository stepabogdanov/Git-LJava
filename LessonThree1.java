/**
Урок №3.1 Богданов Степан


1. Написать программу, которая загадывает случайное число от 0 до 9, 
и пользователю дается 3 попытки угадать это число. При каждой попытке
 компьютер должен сообщить больше ли указанное пользователем число чем загаданное, 
 или меньше. После победы или проигрыша выводится запрос – 
 «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет). 

 */
import java.util.*;

public class LessonThree1 {
    public static void main (String arg[]) {
        guessNumber(9);
    }   
        
    static void guessNumber(int x) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int a,b=0,c;
        do {
            a = random.nextInt(x);
            System.out.print("\nHello! My number (between 0-"+ x + ") is ... Try to guess!! ");
                for (int i=0; i<3; i++) {
                    System.out.print("\n>");
                    b=sc.nextInt();
                    if (b<a) System.out.print ("\nMore!");
                    if (b>a) System.out.print("\nLess");
                    if (b==a) { System.out.print("\nCongratulation you have WON!!!"); break ; }
            }        
        if (a!=b) System.out.print("\nYou have lost!!!");
        System.out.println("\nWill you continue? 1-yes/0-no ");
        c=sc.nextInt();   
        } while (c==1);
    }
    
}