/**

Богданов Стеапан №4 

1. Полностью разобраться с кодом, попробовать переписать с нуля, стараясь не подглядывать в методичку, избавиться от static методов;
2. Переделать проверку победы, чтобы она не была реализована просто набором условий, например, с использованием циклов.
3. * Попробовать переписать логику проверки победы, чтобы она работала для поля 5х5 и количества фишек 
4. Очень желательно не делать это просто набором условий для каждой из возможных ситуаций;
5. *** Доработать искусственный интеллект, чтобы он мог блокировать ходы игрока.
*/

import java.util.*;

class LessonFour {

    int SIZE = 3;     
    int DOTS_TO_WIN = 3;     
    final char DOT_EMPTY = '*';     
    final char DOT_X = 'X';     
    final char DOT_O = 'O';     
    char[][] map;     
    Scanner sc = new Scanner(System.in);     
    Random rand = new Random(); 
	
	public static void main (String args[]) {
    
    LessonFour start = new LessonFour();    
    start.initMap();
    start.printMap();
        while (true) {
            start.humanTurn();
            start.printMap();
            if (start.checkWin(start.DOT_X)) {
                System.out.println("Human Won"); 
                break;             
            }             
            if (start.isMapFull()) {
                System.out.println("Nobody wins ");
                break;             
            }             
            start.aiTurn();
            start.printMap();             
            if (start.checkWin(start.DOT_O)) {
                System.out.println("AI Won");
                break;             
            }             
            if (start.isMapFull()) {
                System.out.println("Nobody wins");                 
                break;             
            }         
        }         
    System.out.println("Game over");
	}
	
    
    void initMap() {     
        map = new char[SIZE][SIZE];     
        for (int i = 0; i < SIZE; i++) { 
            for (int j = 0; j < SIZE; j++) {  
                map[i][j] = DOT_EMPTY;         
            } 
        }
    } 
    
    void printMap() {  
        for (int i = 0; i <= SIZE; i++) {         
            System.out.print(i + " ");     
        }     
        System.out.println(); 
        for (int i = 0; i < SIZE; i++) { 
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) { 
                System.out.print(map[i][j] + " ");
            }         System.out.println();     
        }     
        System.out.println(); 
    } 
       
    boolean checkWin(char symb) {
		
		
		for (int i = 0; i < SIZE; i++) {
            if(map[i][0] == symb && map[i][1] == symb && map[i][2] == symb) return true;
            if(map[0][i] == symb && map[1][i] == symb && map[2][i] == symb) return true;
        }
        if(map[0][0] == symb && map[1][1] == symb && map[2][2] == symb) return true;
        if(map[2][0] == symb && map[1][1] == symb && map[0][2] == symb) return true;
		
        return false;     
		} 
        
    boolean isMapFull() { 
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) return false;
            }
        }         
        return true;     
    } 
 
    void aiTurn() { 
        int x, y;
        do {
            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);
        } while (!isCellValid(x, y));
        System.out.println("Computer's turn " + (x + 1) + " " + (y + 1));
        map[y][x] = DOT_O;  
    } 
 
    void humanTurn() {  
        int x, y; 
        do {
            System.out.println("Enter coordinat X Y");  
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
            } while (!isCellValid(x, y)); // while(isCellValid(x, y) == false)         
            map[y][x] = DOT_X;     
        } 
 
    boolean isCellValid(int x, int y) {  
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return false;   
        if (map[y][x] == DOT_EMPTY) return true; 
        return false;     
    } 
}
 
   


    