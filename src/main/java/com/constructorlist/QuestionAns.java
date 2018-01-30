package com.constructorlist;
import java.util.Iterator;
import java.util.List;
/**
 * @author Tamkhade
 * using constructor and list display question answer
 * here we use iteraror to dispaly the info in console
 */
public class QuestionAns {
	
	
	int id;
	String question;
	List<String> Answer;
	public QuestionAns(int id,String question,List<String> ans) {
		// TODO Auto-generated constructor stub
		
		this.id=id;
		this.question=question;
		this.Answer=ans;	
	}
	void display()
	{
		System.out.println(question);
	    System.out.println("answers are:"); 
		Iterator<String> l=Answer.iterator();
		while(l.hasNext())
		{
			System.out.println(l.next());
		}
		
	}
	
	

}
