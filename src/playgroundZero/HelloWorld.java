package playgroundZero;

import java.awt.Rectangle;
import java.util.*;

public class HelloWorld {
	
	public static void main(String[] args) {
		
		// lol I'm not gonna write the Hello World here
		// remember to add newly created file to index so that it is Git-trackable
		testHashMap();

	}
	
	public static void testHashMap() {
		HashMap hm = new HashMap(5);
		hm.put("ddt im raw", "stores the raw ddt image");
		hm.put("ddt rect raw", new Rectangle(1,2,3,4));
		hm.put("ddt im GoPro", 1);
		
		System.out.println("number of secondary fields: "+hm.size());
		
		System.out.println("ddt im raw: "+hm.get("ddt im raw"));
		if (hm.get("ddt im GoPro")==null) {
			System.out.println("ddt im GoPro: doesn't exist");
		} else {
			System.out.println("ddt im GoPro: valid");
		}
		
	}
	
	public void testStaticField2() {
		MyClass.staticMethod();
		MyClass mc1 = new MyClass();
		mc1.staticMethod();
		mc1.nonStaticMethod();
	}
	
	public static void testStaticField() {
		MyClass.whether = false;
		System.out.println(MyClass.whether ? "MyClass true":"MyClass false");
		
		MyClass mc1 = new MyClass();
		MyClass mc2 = new MyClass();
		System.out.println(mc1.whether ? "mc1 true":"mc1 false");
		System.out.println(mc2.whether ? "mc2 true":"mc2 false");
		System.out.println(MyClass.whether ? "MyClass true":"MyClass false");
		
		mc2.whether = true;
		System.out.println(mc1.whether ? "mc1 true":"mc1 false");
		System.out.println(mc2.whether ? "mc2 true":"mc2 false");
		System.out.println(MyClass.whether ? "MyClass true":"MyClass false");
		
		MyClass.whether = true;
		System.out.println(mc1.whether ? "mc1 true":"mc1 false");
		System.out.println(mc2.whether ? "mc2 true":"mc2 false");
		System.out.println(MyClass.whether ? "MyClass true":"MyClass false");
		
		MyClass.staticMethod();
		mc1.nonStaticMethod();
		mc1.staticMethod();
	}
	
	/**
	 * Changed GitHub username and updated remote tracking in local Git, wanna make sure it's done right
	 */
	public static void testChangeURL() {
		// commit and push
	}
	
	public static void testEmptyConstructor() {
		MyClass test = new MyClass();
		System.out.println("empty constructor");
		System.out.println("init: "+test.init);
		System.out.println(test.whether ? "true":"false");
		test.init = 10;
		System.out.println("changed value");
		System.out.println("init: "+test.init);
		System.out.println(test.whether ? "true":"false");
	}
	
	/**
	 * Testing merge and push branches
	 */
	public static void testMerge() {
		// first merge locally
		// then push to GitHub
	}
	
	/**
	 * Nothing, just testing if can use this part as doc;
	 * yep, can (but how to start a new paragraph?)
	 * <p>
	 * Like this
	 */
	public static void testDoc() {
		// nothing
	}
	
	/**
	 * Testing EGit push: changes in an existing file
	 */
	public static void testPushExist() {
		// 2 steps commit then push - success
		// 1 step commit and push - success
	}

}
