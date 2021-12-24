package Hashtable;

public class Hashtable<k, v> {
	
	INode head;
	INode tail;

	    public void add(k key, v value) {
	    	INode<k, v> myNode = (INode<k, v>) searchNode(key);
	        if(myNode == null) {
	            myNode = new INode<>(key , value);
	            this.append(myNode);
	        }
	        else {
	            myNode.setValue(value);
	        }
	    }

	    //Append the value in the linked list
	    public void append(INode myNode) {
	        if(this.head == null)
	            this.head = myNode;
	        if(this.tail == null)
	            this.tail = myNode;
	        else {
	            this.tail.setNext(myNode);
	            this.tail = myNode;
	        }
	    }

	    //Searching for the word in the linked list
	    public INode<k, v> searchNode(k data) {
	    	INode currentNode = head;
	        int position = 0;
	        while (currentNode != null) {
	            position++;
	            if (currentNode.getKey().equals(data)) {
	                return currentNode;
	            }
	            currentNode = currentNode.getNext();
	        }
	        return currentNode;
	    }

	    //Searching for the word and get the value from the linked list
	    public v get(k word) {
	    	INode<k, v> myMapNode = searchNode(word);
	        return (myMapNode == null) ? null : myMapNode.getValue();
	    }

	    //Print the linked list
	    @Override
	    public String toString() {
	        return "MyLinkedListNodes{" + head + "}";
	    }

	    public void printNodes() {
	        System.out.println("My nodes: " + head);
	    }

		public void remove(String string) {
			    {
			        INode currentNode = head;
			        INode previousNode = null;
			        while (currentNode != null && currentNode.getKey().equals("word")) {
			            head = currentNode.getNext();
			            return;
			        }
			        while (currentNode != null && !(currentNode.getKey().equals("word"))) {
			            previousNode = currentNode;
			            currentNode = currentNode.getNext();
			        }
			        if (currentNode != null) {
			            previousNode.next = currentNode.next;
			        }
			        if(currentNode == null)
			            System.out.println(" Word not found! ");
			    }
			
		}
	}
	



