package mySimpleSpringProject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class FoodDemo {
	public static void main(String[] args){
		/*Fruit myFruit = new Fruit();
		Vegetable myVegetable = new Vegetable();*/
		
		ApplicationContext appContext = new FileSystemXmlApplicationContext("myContext.xml");
		Fruit myFruit = appContext.getBean("fruit",Fruit.class);
		Vegetable myVegetable = (Vegetable)appContext.getBean("vegetable");
		System.out.println(myFruit.callFruit());
		System.out.println(myVegetable.callVegetable());
		
	}
}
