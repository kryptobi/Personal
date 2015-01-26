package Personalverwaltung;

public class Angestellter extends Angestellter_abs implements Comparable<Angestellter> {

	public Angestellter(String konst_name, int konst_gehalt, int konst_id) {
		
		super(konst_name, konst_gehalt, konst_id);
	}
	
	public String toString(){
		return (name + gehalt);
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getGehalt() {
		return gehalt;
	}

	@Override
	public int compareTo(Angestellter a) {
		if(equals(a))
			return 0;
		if(gehalt > a.getGehalt())
			return -1;
		if(gehalt < a.getGehalt())
			return 1;
		return 0;
	}

	
	public int getId() {
		// TODO Auto-generated method stub
		return id;
	}
	
}
