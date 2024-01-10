package ch08.sec11.exam03;

public class AnimalSound {
	public static void main(String[] args) {

		Sounds sounds = new Sounds();

		Darg darg = new Darg();
		Ori ori = new Ori();
		So so = new So();

		sounds.sound(darg);
		sounds.sound(ori);
		sounds.sound(so);
	}
}
