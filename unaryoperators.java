

public class unaryoperators {
    public static void main(String[] args) { 
     
      int c= 10; //8
       
      
      int a = --c + c--; //18
      System.out.println(c);
      System.out.println(a);
    }
    
}
// unary operators ++,--
/* these are of two types pre and post
 * ++a is preincrement, --a is predecrement
 * a++ is post increment and a++ is post decrement
 */
// in pre decrement first changes values and then assigns
//in post decrement first assigns and then changes
