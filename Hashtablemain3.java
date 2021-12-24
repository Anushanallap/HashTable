package Hashtable;

public class Hashtablemain3 {
			
		    public static void main(String[] args) {

		        Hashtable<String , Integer> hash = new Hashtable();

		        String message = "Paranoids are not paranoid because they are paranoid be"+" because they keep putting themselves deliberately into paranoid avoidable situations";


		        String[] messageArray = message.toLowerCase().split(" ");

		        for(String word: messageArray) {

		            Integer value =  hash.get(word);

		            if( value == null)
		                value = 1;
		            else
		                value = value + 1;
		            hash.add(word , value);
		            

		        }
		        System.out.println(hash);
	            hash.remove("avoidable");
}
		

	}

	


