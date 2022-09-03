import java.util.*;

public class Main {
	 public static void main(String args[]){
	        
	        Scanner sc = new Scanner(System.in);
	        System.out.println("No. of comedy scenes:");
	        int comedy = sc.nextInt();
	        System.out.println("No. of action scenes:");
	        int action = sc.nextInt();
	        

	    double a = Math.sqrt((comedy-100)*(comedy-100) + (action-0)*(action-0));
	    double b = Math.sqrt((comedy-0)*(comedy-0) + (action-100)*(action-100));
	    double c = Math.sqrt((comedy-90)*(comedy-90) + (action-17)*(action-17));
	    double d = Math.sqrt((comedy-21)*(comedy-21) + (action-80)*(action-80));


	    double genre = Math.min(a, Math.min(b , Math.min(c , d)));
	    if(genre == a || genre == c){
	        System.out.print("Comedy");
	    } 
	    else if (genre == b || genre == d) {
	        System.out.println("Action");
	    }
	    else{
	        System.out.println("Comedy and Action");
	    }

	    }

}