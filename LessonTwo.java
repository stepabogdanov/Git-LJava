/**
Богданов Степан

Урок №2


*/
public  class LessonTwo {

    public static void main(String arg[]) {
        exchengeNum();
        addToArray();
        multiNum();
        fillArray();
        maxMin();
        System.out.println("ex.6:");
        int arr1[] = {54,1,2,3,4,50};
        int arr2[] = {54,1,2,3,4,50,6};
        int arr3[] = {54,1,2,3,4,50,6,4};
        int arr4[] = {1,2,3,4,5,6,7,8,9,10};
        int arr5[] = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("condition of array is " + checkBalance(arr1));
        System.out.println("condition of array is " + checkBalance(arr2));
        System.out.println("condition of array is " + checkBalance(arr3));
        System.out.println("ex.7:");
        moveArray(arr4,-5);
        moveArray(arr5,6);
        
        
    }
/**
1. Задать целочисленный массив, состоящий из элементов 0 и 1. 
Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. 
С помощью цикла и условия заменить 0 на 1, 1 на 0; 
*/
    static void exchengeNum() {
        System.out.println("ex.1:");
        int arr []={1,0,0,1,0,1,0,0,1,1};
        for (int x: arr) System.out.print(x);
        System.out.println("");
        for (int i=0; i<10; i++){
            if (arr [i]==0)
                arr[i]=1;
            else
                arr [i]=0;
        System.out.print(arr [i]);
        }
    }
    
    
/** 
2. Задать пустой целочисленный массив размером 8. 
С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21
*/
    static void addToArray() {
        System.out.println("");
        System.out.println("ex.2:");
        int arr2[] = new int [8];
        int f;
        for(f=0; f<8; f++){
            arr2 [f]=f*3;
            System.out.print(arr2 [f]);
            System.out.print(" ");
        }
    }
    
/**
3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] 
пройти по нему циклом, и числа меньшие 6 умножить на 2
*/
    static void multiNum(){
        System.out.println("");
        System.out.println("ex3.:");
        int arr [] = {1,3,5,2,11,4,5,2,4,8,9,1};
        for (int x : arr) System.out.print(x + " ");
        System.out.println("");
        for (int i = 0; i < 12; i++){
            if (arr [i]<6) 
                arr [i]=arr [i]*2;
        System.out.print(arr[i]+ " ");
        }
        
    }
/**
4. Создать квадратный двумерный целочисленный массив 
(количество строк и столбцов одинаковое),
и с помощью цикла(-ов) заполнить его диагональные элементы единицами
*/    
    static void fillArray() {
        System.out.println("");
        System.out.println("ex.4:");
        int arr[][] = new int [5][5];
        for (int i=0,h=4; i<5; i++,h--) {
            for (int g=0; g<5; g++) {
                if (g==i || g==h)
                    arr[g][i]=1;
             System.out.print(arr[g][i]+" ");   
            }
        System.out.println();
        }
    }
/**
5. ** Задать одномерный массив и найти 
в нем минимальный и максимальный элементы (без помощи интернета)
*/    
    static void maxMin() {
        System.out.println("ex.5: Array:");
        int max=0;
        int min;
        int arr[] = {126,5,9,10,11,4,12,-3,-66};
        min=arr[0];
        for (int x : arr ) System.out.print(x + " ");
        for (int i=0; i < arr.length-1 ; i++) {
            if (arr[i]>arr[i+1] && arr[i]>max) max=arr[i];          // find maximum
            if (arr[i+1]>arr[i] && arr[i+1]>max) max=arr[i+1];          
            
            if (arr[i]<arr[i+1] && arr[i]<min) min=arr[i];          // find minimum
            if (arr[i+1]<arr[i] && arr[i+1]<min) min=arr[i+1];
        }
        System.out.println (" max:" + max + " min:" + min);
    }
/**
6. ** Написать метод, в который передается не пустой одномерный целочисленный массив, 
метод должен вернуть true если в массиве есть место, в котором сумма левой и правой части массива равны. 
Примеры: checkBalance([1, 1, 1, || 2, 1]) → true, checkBalance ([2, 1, 1, 2, 1]) → false,
 checkBalance ([10, || 10]) → true, граница показана символами ||, эти символы в массив не входят.
*/
    static boolean checkBalance(int arr[]) {
        int part1=0;
        int part2=0;
        int part1a=0;
        int part2a=0;
        for ( int x : arr){
            System.out.print(x + " ");
            }
        if (arr.length%2==0) {                      // array consist from even elements (массив состоит из четного кол-ва элементов)
            for (int i=0 ; i<arr.length/2; i++) {
                part1+=arr[i];
            }
            for (int i1=arr.length-1; i1>=arr.length/2 ; i1--) {
                part2+=arr[i1];
            }
        }
        if (arr.length%2!=0) {                  // array consisn from odd elements (массив состоит из нечетного кол-ва элементов)
            for (int i=0 ; i<arr.length/2; i++) part1+=arr[i];
            for (int i1=arr.length-1; i1>arr.length/2-1 ; i1--) part2+=arr[i1];
            
            for (int i=0 ; i<=arr.length/2; i++) part1a+=arr[i];
            for (int i1=arr.length-1; i1>arr.length/2 ; i1--) part2a+=arr[i1];
        }
        //System.out.println("part1= " + part1 + " part2= " + part2 + " part1a=" + part1a + " part2a=" + part2a);
        if (part1==part2) {
            System.out.println(" part1= " + part1 + " part2= " + part2);
            return true;
        }
        if (part1a==part2a && part1a!=0) {
            System.out.println(" part1= " + part1a + " part2= " + part2a);
            return true;
        }
            else {
            System.out.println(" part1= " + part1 + " part2= " + part2);
            return false;
            }
        
        
        
    }
/**
7.  Написать метод, которому на вход подается одномерный массив и число n 
(может быть положительным, или отрицательным), при этом метод должен сместить 
все элементы массива на n позиций. Для усложнения задачи нельзя пользоваться вспомогательными массивами. 


*/    
    static void moveArray(int arr[], int n) {
        System.out.print("Array:[");
        for (int x : arr) System.out.print(" "+ x);
        System.out.print(" ]");
        System.out.println("Number: " + n);
        if (n>=0) {                                                         // shift of array is positive
            for (int i=arr.length-1 ; i>=n ; i--) arr[i]=arr[i-n];          // move array
            for (int i1=0; i1<n ; i1 ++) arr[i1]=0;                         // clears new elements of array  
        }
        if (n<0) {                                                          // shift of arraay is negative
            for (int i=0 ; i<arr.length+n ; i++) arr[i]=arr[i-n];           // move array
            for (int i1=arr.length-1; i1>=arr.length+n ; i1 --) arr[i1]=0;  // clears new elements of array
        }
        System.out.println ("New Array");
        for (int x2 : arr) System.out.print(" "+ x2);
        System.out.println();
    }    
}