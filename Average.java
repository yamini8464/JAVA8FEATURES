package features;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntStream stream = IntStream.of(1,2,3,4,5); 
        OptionalDouble obj = stream.average(); 
        if (obj.isPresent()) { 
            System.out.println(obj.getAsDouble()); 
        } 
        else { 
            System.out.println("-1"); 
        } 
	}

}
