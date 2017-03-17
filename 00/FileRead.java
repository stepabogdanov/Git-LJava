import java.io.*;


class FileRead {
    
    public static void main (String args[]) {
        String name = "symbols.txt";
        String result = null;
        try {
            FileReader fr = new FileReader (name);
            //fr.read();
            //fr.read(); 
            int ch=0;
            char test;
            int  count=0;
            int arr[] = new int[26];
            test='a';
            //System.out.print((int)test);
            while ((ch = fr.read())  != -1)  {
           
            
                count++;
                
                
               if ((char)ch=='a') {
                    arr[0]++;
                }
                if ((char)ch=='b') {
                    arr[1]++;
                }
                if ((char)ch=='c') {
                    arr[2]++;
                }
                if ((char)ch=='d') {
                    arr[3]++;
                }
                if ((char)ch=='e') {
                    arr[4]++;
                }
                if ((char)ch=='f') {
                    arr[5]++;
                }
                if ((char)ch=='g') {
                    arr[6]++;
                }
                if ((char)ch=='h') {
                    arr[7]++;
                }
                if ((char)ch=='i') {
                    arr[8]++;
                }
                if ((char)ch=='j') {
                    arr[9]++;
                }
                if ((char)ch=='k') {
                    arr[10]++;
                }
                if ((char)ch=='l') {
                    arr[11]++;
                }
                if ((char)ch=='m') {
                    arr[12]++;
                }
                if ((char)ch=='n') {
                    arr[13]++;
                }
                if ((char)ch=='o') {
                    arr[14]++;
                }
                if ((char)ch=='p') {
                    arr[15]++;
                }
                if ((char)ch=='q') {
                    arr[16]++;
                }
                if ((char)ch=='r') {
                    arr[17]++;
                }
                if ((char)ch=='s') {
                    arr[18]++;
                }
                if ((char)ch=='t') {
                    arr[19]++;
                }
                if ((char)ch=='u') {
                    arr[20]++;
                }
                if ((char)ch=='v') {
                    arr[21]++;
                }
                if ((char)ch=='w') {
                    arr[22]++;
                }
                if ((char)ch=='x') {
                    arr[23]++;
                }
                if ((char)ch=='y') {
                    arr[24]++;
                }
                if ((char)ch=='z') {
                    arr[25]++;
                }
          //      */
            }
            System.out.println("\nA: " + arr[0] + "\nB: " + arr[1] + "\nC: " + arr[2] + "\nD: " 
                    + arr[3] + "\nE: " + arr[4] + "\nF: " + arr[5] + "\nG: " + arr[6] + "\nH: " + arr[7] + "\nI: " + arr[8] + "\nJ: " + arr[9] + "\nK: " 
                    + arr[10] + "\nL: " + arr[11] + "\nM: " + arr[12] + "\nN: " + arr[13] + "\nO: " + arr[14] + "\nP: " + arr[15] + "\nQ: " + arr[16] + "\nR: " 
                    + arr[17] + "\nS: " + arr[18] + "\nT: " + arr[19] + "\nU: " + arr[20] + "\nV: " + arr[21] + "\nW: " + arr[22] + "\nX: " + arr[23] + "\nY: " 
                    + arr[24] + "\nZ: " + arr[25] + "\ncount: " + count );
        } 
        catch (IOException ex) {
        System.out.println(ex);
        
        }
            
        
    }

    
    
}
    
    