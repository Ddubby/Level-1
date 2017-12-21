public class TeaParty {
	
public static void welcome(String lastName, boolean isWoman, boolean isKnighted)
    {
       if (isWoman) {
		System.out.println("Hello Ms. "+lastName);
       }
       else if (isKnighted) {
        
		System.out.println("Hello Sir "+lastName);
       }
       else {
    	   System.out.println("Hello Mr. "+lastName);
       }
    }
public static void main(String[] args) {
TeaParty.welcome("Austen", true, false);
TeaParty.welcome("Orwell", false, false);
TeaParty.welcome("Newton", false, true);
}
}
