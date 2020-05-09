
public class TestFoodItem {

	public static void main(String[] args) {
		FoodItem myCandy=new FoodItem("Çikolatalı gofret",2.0,3.5);
		FoodItem mySoup=new FoodItem("Duru", 3.0, 4.5);
		
		myCandy.display();
		mySoup.display();
		
		myCandy.setDesc("Snickers,large");
		myCandy.setSize(10);
		myCandy.setPrice(11.95);
		
		myCandy.display();
		
		mySoup.setDesc("Progresso Minestone.");
		mySoup.display();	
		
		System.out.println("Price of "+myCandy.getDesc()+"is :"+myCandy.getPrice());
		System.out.println("Unit Price of "+myCandy.getDesc()+"is :"+myCandy.calcUnitPrice());
}
	
}
