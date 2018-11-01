import java.util.Vector;	
public class QueueGeneric<T> {
	
		  private Vector <T> queue = new Vector<T>();
		  public int top = -1;
		    public void classqueuegeneric()

		    {    
		    }

		    public void insert (T value)

		    {
		    		top++;
		          queue.add(top,value);

		    }

		    public int remove()

		    {
		    	int value = top;
		        if (top>-1){
		        value = (Integer) queue.get(0);
					queue.remove(0);
					top--;
				}
				return value;
		     
		       }


		    }
