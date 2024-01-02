package ch04;

public class test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=10; i>=0; i--) {
		
			try {
				
				System.out.println(i);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				
			}
		}System.out.println("발사!");
	}

}
