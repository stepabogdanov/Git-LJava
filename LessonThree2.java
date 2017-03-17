/**
Урок №3.2 Богданов Степан
ver 1.1
 */
import java.util.*;

public class LessonThree2 {
    public static void main (String arg[]) {
        guessWord();
    }   
    
/**
Создать массив из слов String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", 
"garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя,
сравнивает его с загаданным словом и сообщает правильно ли ответил пользователь. Если слово не угадано, компьютер показывает буквы которые стоят на своих местах.
apple – загаданное
apricot - ответ игрока 
ap############# (15 символов, чтобы пользователь не мог узнать длину слова)
Для сравнения двух слов посимвольно, можно пользоваться:
String str = "apple";
str.charAt(0); - метод, вернет char, который стоит в слове str на первой позиции
*/
    static void guessWord() {
        Random random = new Random();
        Scanner scan_word = new Scanner(System.in);
        String words[] = {"apple", "orange", "lemon", "banana","apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", 
        "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        String word_comp;
        String word_user;
        do { 
            int x;
            x=random.nextInt(23);
            word_comp = words[x];
            System.out.println ("Try to guess my word.. My words are:" );
            System.out.println(Arrays.toString(words));
            do {
                word_user = scan_word.nextLine();
                if (word_user.length()>word_comp.length()) {                               //проверка букв на соответствие если введенное слово длиннее загаданного
                    for (int i =0 ; (i < word_comp.length()) ; i++) {                             
                        if (word_user.charAt(i) == word_comp.charAt(i)) System.out.print(word_comp.charAt(i));
                        if (word_user.charAt(i) != word_comp.charAt(i)) System.out.print("#");
                    }
                for (int i = 0; (i < (15-word_comp.length())); i++) System.out.print("#"); 
                }
                else {                                                                     //проверка букв на соответствие если введенное слово короче загаданного 
                for (int i =0 ; (i < word_user.length()) ; i++) {                             
                        if (word_user.charAt(i) == word_comp.charAt(i)) System.out.print(word_comp.charAt(i));
                        if (word_user.charAt(i) != word_comp.charAt(i)) System.out.print("#");
                        
                    }
                for (int i = 0; (i < (15-word_user.length())); i++) System.out.print("#");    
                }
                System.out.println();
            } while (!word_comp.equals(word_user));
            System.out.print("You have won ! Will you continue? (y/n)");
            word_user = scan_word.nextLine();
        } while (word_user.charAt(0) =='y'); 
    }
}