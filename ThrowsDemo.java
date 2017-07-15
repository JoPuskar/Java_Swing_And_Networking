class ThrowsDemo{
	static void testThrow() throws IllegalAccessException{
		System.out.println("Inside testThrow");
		throw new IllegalAccessException("demo throws");
	}
	public static void main(String args[]){
		try{
			testThrow();
		}
		catch(IllegalAccessException e){
			System.out.println("Inside catch2");
		}
	}
}