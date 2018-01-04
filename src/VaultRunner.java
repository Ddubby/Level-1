
public class VaultRunner {
public static void main(String[] args) {
	Vault one=new Vault(12309);
			if (one.tryCode(123043299)) {
				System.out.println("Code cracked! The code was: "+Vault.secretcode);
				
			}
			else {
			System.out.println("Wrong code!");	
			}
}
}
