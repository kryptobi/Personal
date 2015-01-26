package Personalverwaltung;

public class Pair<s>{
	
	private s first;
	private s second;
	
	public Pair(){
		first = null;
		second = null;
	}
	
	public Pair(s first, s second){
		this.first = first;
		this.second = second;
	}
	
	public s getfirst(){ return first; }
	public s getsecond(){ return second; }
	
	public void setfirst(s newValue){ first = newValue; }
	public void setsecond(s newValue){ first = newValue;}
}
