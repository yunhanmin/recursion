// RecursionOne.java

public class RecusionOne {
  
  public static void main ( String[] args ) {
    
    inception(5);
    kick(5);
  } // End main method
  
  public static void inception( int n ) {
    
    if( n > 0) {
    System.out.println( "Welcome to the dream world" );
    inception ( n - 1 );
    } else {
      System.out.println( "Wake Up" );
    }
  }
        public static void kick( int n ) {
    
    if( n > 0) {
      for( int i=0; i<n; i++ ){
        System.out.print( "*" );
      }
    System.out.println( "\nWake up!\n" );
    kick ( n - 1 );
    } else {
      System.out.println( "Welcome back to reality" );
    }
  
  } // End inception
  

} // End RecursionOne