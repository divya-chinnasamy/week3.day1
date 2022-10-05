package week3.org.system;

public class Desktop extends Computer {
	
	public void desktopSize() {
		System.out.println("The desktop size() is called from Desktop class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Desktop d = new Desktop();
		d.computerModel(); //calling super class method
		d.desktopSize(); //calling child class method
	}

}
