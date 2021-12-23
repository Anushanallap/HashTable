package Hashtable;

public class Hashtablemain {
	
	    public static void main(String[] args) {

	        Hashtable<String , Integer> hash = new Hashtable();

	        String sentance = "To be or not to be";


	        String[] words = sentance.toLowerCase().split(" ");

	        for(String word: words) {

	            Integer value =  hash.get(word);

	            if( value == null)
	                value = 1;
	            else
	                value = value + 1;
	            hash.add(word , value);
	        }
	        System.out.println(hash);
	    }
	}


