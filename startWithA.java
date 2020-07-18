package features;

import java.util.stream.Stream;

public class startWithA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream<String> stream = Stream.of("asd","asdf", "aaa","acf","cdesa","asdfg");
		
		stream.filter(s -> s.startsWith("a") && s.length() == 3) 
        .peek(s -> System.out.println(s)) 
        .count(); 

	}

}
