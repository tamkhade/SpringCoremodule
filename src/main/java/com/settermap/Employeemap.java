package com.settermap;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Employeemap {
	
private int id;

private String Empquestion;

private Map<String, String> Empanswers;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getEmpquestion() {
	return Empquestion;
}

public void setEmpquestion(String empquestion) {
	Empquestion = empquestion;
}

public Map<String, String> getEmpanswers() {
	return Empanswers;
}

public void setEmpanswers(Map<String, String> empanswers) {
	Empanswers = empanswers;
}



void displaypempinfo()
{
	Set<Entry<String, String>> e=Empanswers.entrySet();
	
	Iterator<Entry<String, String>> e2=e.iterator();
	
	while(e2.hasNext())
	{
		
		System.out.println(e2.next());
	}
	
	
}



}
