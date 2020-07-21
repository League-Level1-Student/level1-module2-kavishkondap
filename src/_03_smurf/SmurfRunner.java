package _03_smurf;

public class SmurfRunner {
public static void main(String[] args) {
	Smurf handy = new Smurf ("Handy");
	handy.eat();
	System.out.println(handy.getName());
	Smurf papa = new Smurf ("Papa");
	System.out.println(papa.getName());
	System.out.println(papa.getHatColor("papa"));
	System.out.println(papa.isGirlOrBoy("papa"));
	Smurf smurfette = new Smurf ("Smurfette");
	System.out.println(smurfette.getName());
	System.out.println(smurfette.getHatColor("smurfette"));
	System.out.println(smurfette.isGirlOrBoy("smurfette"));
}
}
