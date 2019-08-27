package fr.formation.inti.beans;

public class MessageBean {

	public MessageBean() {
	}
	
	public static MessageBean createInstance() {
		System.out.println("Une instance a été créée");
		return new MessageBean();
	}
	
}
