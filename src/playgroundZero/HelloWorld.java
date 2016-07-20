package playgroundZero;

public class HelloWorld {
	
	public static void main(String[] args) {
		
		// lol I'm not gonna write the Hello World here
		// remember to add newly created file to index so that it is Git-trackable
		testEmptyConstructor();

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
