import javax.swing.*;

/*
Emil Edberg
Uppgifter Kapitel 8
25/9-17
*/
public class Kapitel8{
	public static void main (String [] args){
		char a1 = '\u00E5'; //å
		char a2 = '\u00E4'; //ä
		char o1 = '\u00F6'; //ö

		double r, Area, Omkrets, area, omkrets;
		String r1;

		r1 = JOptionPane.showInputDialog(null, "Vad " + a2 + "r Cirkelns radie");
		r = Double.parseDouble(r1);
		Area = Cirkel.area(r);
		Omkrets = Cirkel.omkrets(r);
		JOptionPane.showMessageDialog(null, "Area:" + Area + "\nOmkrets:" + Omkrets);
	}}
	class Cirkel{
		public static double area(double r){
			return r * r * Math.PI;
		}
		public static double omkrets(double r){
			return (r + r) * Math.PI;
		}
	
}