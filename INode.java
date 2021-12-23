package Hashtable;

	public class INode<K, V> {
	    K key;
	    V value;
	    INode<K, V> next;

	    public INode(K key, V value) {
	        this.key = key;
	        this.value = value;
	        next = null;
	    }

	    			public K getKey() {
	    				return key;
	    }

	    				public void setKey(K key) {
	    					this.key = key;
	    }

	    			public V getValue() {
	    				return this.value;
	    }

	    				public void setValue(V value) {
	    					this.value = value;
	    }

	    			public INode<K, V> getNext() {
	    				return next;
	    }

	    				public void setNext(INode<K, V> next) {
	    					this.next = (INode<K, V>) next;
	    }

	    @Override
	    public String toString()
	    {	
	        StringBuilder nodeString = new StringBuilder();
	        nodeString.append("Node{" + "K=").append(key).append(" V=").append(value).append("}");
	        if(next != null)
	         
			   nodeString.append("->").append(next);

	       else {
	        	nodeString.append("->").append(next);
	    }
		  return nodeString.toString();
	    }
	}


