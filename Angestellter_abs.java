package Personalverwaltung;

public abstract class Angestellter_abs {

	String name;
	int gehalt;
	int id;
	
	public Angestellter_abs(String konst_name, int konst_gehalt, int konst_id){
		name = konst_name;
		gehalt = konst_gehalt;
		id = konst_id;
	}
	
	public abstract String getName();
	public abstract int getGehalt();
	public abstract int getId();
}
