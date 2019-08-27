package fr.formation.inti.beans;

public class ScopeBean {
	 
    private int id;
    private String message;
 
    public ScopeBean() {
        System.out.println("Prototype Bean Instantiated ...!!");
    }
 
    public int getId() {
        return id;
    }
 
    public void setId(int id) {
        this.id = id;
    }
 
    public String getMessage() {
        return message;
    }
 
    public void setMessage(String message) {
        this.message = message;
    }
 
    @Override
    public String toString() {
        return "Message [Id= " + id + ", Message= " + message + "]";
    }
}