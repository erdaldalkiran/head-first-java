public class StringComperasion{
	public static void main(String[] args){
		String first = new String("Erdal");
		String second = new String("Erdal");
		int firstIntValue = 0;
		String nullValue = null;
		String secondNullValue = null;	
		
		boolean firstResult = first == second;
		boolean secondResult = first.equals(second);
		boolean thirdResult = nullValue == secondNullValue;

		System.out.println(firstResult);
		System.out.println(secondResult);
		System.out.println(thirdResult);
	}
}
