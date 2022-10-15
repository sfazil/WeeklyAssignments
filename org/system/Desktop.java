package org.system;

public class Desktop extends Computer{
	public void line() {
		System.out.println("************");
	}
	
	public void desktopSize(){
		System.out.println("From DesltopSize");
		this.line();
		
	}
	
	public static void main(String[] args) {
		Desktop desk = new Desktop();
		desk.computerModel();
		desk.desktopSize();


	}
	
}
