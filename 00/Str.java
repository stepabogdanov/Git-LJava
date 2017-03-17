class Str{
    
    public static void main (String args[]) {
        String s1 = "hello 123";
        String s2 = "bye";
        String s3 = "hello 1234";
        
        if (s1.equals(s2)) System.out.println ("s1 = s2");
        if (s2.equals(s3)) System.out.println ("s2 = s3");
        if (s3 == s1) System.out.println ("s3 = s1");
        
        
    }
    
}