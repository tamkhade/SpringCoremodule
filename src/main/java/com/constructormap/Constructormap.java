package com.constructormap;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Constructormap {
	
	
	private int cid;
	
	private String cname;

	private Map<String, String> mapvalue;
	public Constructormap(int cid,String cname,Map<String, String> mapvalue) {
		// TODO Auto-generated constructor stub
		
		this.cid=cid;
		this.cname=cname;
		this.mapvalue=mapvalue;
	}
	
	void displaymapinfo()
	{
		Set<Entry<String, String>> s=mapvalue.entrySet();
		System.out.println(cname);
		Iterator<Entry<String,String>> g=s.iterator();
		
		while(g.hasNext())
		{
		System.out.println(g.next());	
		}
		
		
	}
	
	
	
	

}
