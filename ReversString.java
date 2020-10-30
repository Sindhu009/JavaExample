package xworkz.com.StringConcept;

public class ReversString {
	 public static void main(String[] args)
	    {
	        String input = "hello this sindhu";
	 
	        // getBytes() method to convert string
	        // into bytes[].
	        byte[] b = input.getBytes();
	 
	        byte[] result = new byte[b.length];
	 
	        // Store result in reverse order into the
	        // result byte[]
	        for (int i = 0; i < b.length; i++)
	            result[i] = b[b.length - i - 1];
	 
	        System.out.println(new String(result));
	    }

}
