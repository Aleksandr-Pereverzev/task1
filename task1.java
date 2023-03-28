
/*Написать метод, принимающий на вход два целых числа и проверяющий,
 * что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.

public class task1 {
    public static void main(String[] args) {
        int x = 6;
        int y = 5;
        
        if ((x + y)>10 && (x + y)<20 ) {
        System.out.println(x + y);
        } else {
        System.err.println("Условие не входит в рамки 10><20");
        }



    }    
}

*/



/*напечатать строку source repeat раз

public class task1 {
    public static void main(String[] args) {
    String in = "foo";

    int num = 3;

    System.out.println(in.repeat(num));

    }

}    

*/



/*проверить, что х положительное

public class task1 {
 
    public static void main(String[] args) {
   
      int number =45;
             
      if (number > 0) {
   
        System.out.println(number + " is positive.");
   
      } else if (number < 0) {
   
        System.out.println(number + " is negative.");
   
      } else {
   
        System.out.println(number + " is zero.");
   
      }
   
    }
   
  }
  */




/*
  проверить, является ли год високосным.

  import java.util.Scanner;

  public class task1 {
  public static void main ( String args [] ) { 
    int year; 
    System.out.println ("Введите год: "); 
    Scanner sc = new Scanner(System.in); 
    year = sc.nextInt (); 
        if (((year%4==0)&&(year%100!=0))||(year%400==0)); 
        System.out.println("Указанный год високосный"); 
        } else { 
        System.out.println("Указанный год не високосный"); 
    } 
}

*/
    


/*
Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;

public class task1 {
    public static void main(int[] arr) {
    int [] arr = new int [] { 1,2,3,4,5,6,7,8,9,10 };   
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] < 6) {
            arr[i] *= 2;
        }
    }
}
}

*/

