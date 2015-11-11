// RecursiveMath.java

public class RecursiveMath {
  
  public static void main( String[] args ) {
    
    System.out.println( factorial(20) );
    //fibonacci(10);
    
  } // End main method
  
  public static int factorial( int n ) {
    if( n > 1 ) {
     n *= factorial( n-1); // 10! = 10*9! = 10*9*8! ... 1!
    }
    return n;
    public static void fibonacci( int n ) {
     // Start with 0+1 -> 1, 1+1=2, 1+2=3, 2+3=5
     // previous answer + 2nd level previous answer +2
      int result = 0;
      
      if ( n == 0 ) {
       System.out.print( "0, " ); 
      }
          System.out.print( prev + ", " + next + ", " );
          if ( n > 0 ) {
           result = prev + next;
           System.out.print( result + ", " );
           fibonacci( result );
          }
    }
  }
  
} // End RecursiveMath