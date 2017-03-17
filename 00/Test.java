import java.io.*;


class Test {
    
    public static void main (String args[]) {
        String name1 = "data1.txt";
        String s[] = new String [100000];
         for (int i=0; i<100000; i++) s[i] = "";
        int ch[] = new int [1];
        char chr[] = new char [1];
        int j=0;
        try {
            FileReader fr = new FileReader (name1);
            while ( (ch[0] = fr.read()) != -1) {
                //if (s[j] == null) s = (char)
                if (ch[0] == 32 || ch[0] == 9 || ch[0] == 13) {
                    //System.out.println("\"" + s[j] + "\"");
                    //
                    for (int i=j-1; i>0; i--) {
                        //System.out.println ("j=" + j + " i=" + i);
                        //System.out.println ("+");
                        if (s[j].equals(s[i])) {
                           s[j] = "";
                           j--;
                          // System.out.println("+");
                           
                        }
                    }
                    //
                    
                    j++;
                    
                    continue;
                    
                }
            s[j] = s [j] + (char)ch[0];
            
            }
        } 
        catch (IOException ex) {
        System.out.println(ex);
        
        }
       
        for (int i=0; i <94; i++)
            //if (!str.equals(""))
                System.out.println(s[i]);
            //else break;
            
        System.out.println("j = " + j);
      /*    
    
        for (int i=0; i<19; i++ ) {
            String temp;
            int a=0;
            temp = result [i];
            for (int j1=0; j1<19; j1++) {
                if (temp.equals(result[j1])) {
                ++a;
                System.out.println("Eqals elements = " + a);
                //break;
                }
            }
        }
        */
        
        
       // System.out.println("s[0] = " + s[0]);
       // System.out.println("s[1] = " + s[1]);

    }

    
    
}
    
    