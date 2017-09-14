
 

public class HarryPotter {

	private boolean cloakOn;
	
	HarryPotter() {
		System.out.println("making Harry Potter...");
	}

	void castSpell(String spell){
System.out.println("casting spell: " + spell);
	}

	void makeInvisible(boolean invisible) {
		this.cloakOn = invisible;
		
		if (cloakOn)
			System.out.println("Harry is invisible");
		else
			System.out.println("Harry is visible");
	}

	public boolean isCloakOn() {
		return cloakOn;
	}

	public void setCloakOn(boolean cloakOn) {
		this.cloakOn = cloakOn;
	}

	void spyOnSnape() {
		System.out.println("Harry sees Professor Snape doing nefarious things.");
	}

	public static void main(String[] args) {
		// 1. make harry potter
		HarryPotter j=new HarryPotter();
		// 2. become invisible
		j.makeInvisible(true);
		// 3. spy on professor snape
		j.spyOnSnape();
		// 4. become visible again
		j.makeInvisible(false);
		// 5. cast a “stupefy” spell
	j.castSpell("stupefy");
	}

}






