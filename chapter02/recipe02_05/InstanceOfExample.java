

public class InstanceOfExample {
	public static void main (String[] args) {
		Object selectedObject="I love Taranto";
				
		if (selectedObject instanceof String) {
		    String selectedString = (String) selectedObject;
		    System.out.println(selectedString.length());
		}
		
		if (selectedObject instanceof String selectedString) {
		    System.out.println(selectedString.length());
		}
	}
}
