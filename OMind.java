/**
Open Mind game

*/

import java.util.*;

class OMind {
    
    public static void main (String args[] ) {
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();
        long t1, t2, total_score=0; 
        int a=0;
        int arr[][];
        System.out.println ("1. Adition game");
        System.out.println("2. Substruction game");
        System.out.println("3. Multiplication game");
        System.out.println("4. Division Game");
        System.out.print(" Choose your game :");
        
        a = sc.nextInt();
        
        if (a == 1) {
            int x=0, y=0, z=0, r=0;
            long score=0;
            
            
            System.out.println ("Let's begin adition game!");
            for (int i=0; i<6; i++) {
                x = ran.nextInt(10);
                y = ran.nextInt(10);
                System.out.println (x + "+" + y + "=" );
                t1 = System.currentTimeMillis();
                z = sc.nextInt();
                t2 = System.currentTimeMillis();
                r = x+y;
                score = 10000 - (t2-t1);
                System.out.println("correct: " + r + " score: " + score);
                if (z == r) 
                    total_score = (total_score + score);
                
            }
        }
        if (a == 2)
            System.out.println ("Let's begin substruction game!");
        if (a == 3)
            System.out.println ("Let's begin multiplication game!");
        if (a == 4)
            System.out.println ("Let's begin division game!");
        total_score /=100;
        System.out.println("Total score: " + total_score);
        String g = "1";
        System.out.println(arr[][] = new {1,2,3,4},{4,3,2,1}[0][0]);
    }
    
    
    
    
}
        
        
        