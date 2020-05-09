
public class Robot {
	
	int id;
	
	Robot(int i){
		id=i;
		Brain b=new Brain();
		b.think();
	}



	private class Brain {
		public void think() {	
			System.out.println(id + " is thinking");
	}	
}
	}