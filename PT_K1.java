package Personalverwaltung;
import java.util.*;


public class PT_K1 {

	private static Verwaltung v;
	
	private static void angestellter_hinzu(){
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		int gehalt = sc.nextInt();
		int id = sc.nextInt();
		
		Angestellter a = new Angestellter(name,gehalt,id);
		if(v.istgleich(a) == true)
			v.ang_add(a);
		sc.close();
		
	}
	private static void angestellter_paare(){
		Pair<Angestellter>p = v.angestellter_Paare();
		System.out.println(""+p.getfirst()+p.getsecond());
	}
	private static void ausgabe_aller_mitarbeiter(){
		v.alle_ausgeben();
	}
	public static void main(String args[]){
		v = new Verwaltung();
		int menue;
		Scanner in = new Scanner(System.in);
		
		do{
			System.out.println("'1' Angestellten Hinzu: ");
			System.out.println("'2' Alle anzeigen: ");
			System.out.println("'3' Pairfunktion");
			System.out.println("'4' Abbruch!");
			
			menue = in.nextInt();
			switch(menue){
				case 1:
					angestellter_hinzu();
					break;
				case 2:
					ausgabe_aller_mitarbeiter();
					break;
				case 3:
					angestellter_paare();
					break;
				case 4:
					System.out.println("Aufwiedersehen");
					break;
				default:
					break;
			}
			
		}while(menue != 4);
		in.close();
	}
}
