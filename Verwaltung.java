package Personalverwaltung;
import java.util.*;


public class Verwaltung {

	//private ArrayList<Angestellter> angestellter = new ArrayList<Angestellter>();
	private HashMap<Integer,Angestellter> angestellter = new HashMap<Integer,Angestellter>();
	private HashSet<Integer> angestellter_id = new HashSet<Integer>(); 
	
	public void ang_add(Angestellter a){
		angestellter.put(a.getId(),a);
		//Collections.sort(angestellter);
		angestellter_id.add(a.getId());
	}
	
	public boolean istgleich(Angestellter b){
		//for(Angestellter a : angestellter){
		for(Integer i : angestellter_id){
			Angestellter a  = angestellter.get(i);
			if(a.getName().equals(b.getName())){
				System.out.println("Leider schon vorhanden");
				return false;
			}
		}
		return true;
	}
	
	public void alle_ausgeben(){
		//for(Angestellter a : angestellter){
		for(Integer i : angestellter_id){	
			Angestellter a = angestellter.get(i);
			System.out.println(a+"\n");
		}
	}

	public Pair<Angestellter> angestellter_Paare(){
		Angestellter min = new Angestellter("nicht vorhanden",0,0);
		Angestellter max = new Angestellter("nicht vorhanden",0,0);
		for(Integer i : angestellter_id){
			Angestellter a = angestellter.get(i);
			if(a.getClass() == min.getClass()){
				Angestellter a1 = (Angestellter) a;
				if(a1.getGehalt()<min.getGehalt())
					min = a1;
				if(a1.getGehalt()>max.getGehalt())
					max = a1;
			}
		}
		
		return new Pair<Angestellter>(min,max);
		
	}
}

