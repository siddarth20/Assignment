package pack;

public class StatusDoor {

public static void main(String[] args) {
	
Door d= new Door();
boolean status = d.getLock().isUnlocked("qwerty");
if(status==true) {
	System.out.println("The door is open!");
}
else {
	System.out.println("The door is closed!");
}

	}

}
