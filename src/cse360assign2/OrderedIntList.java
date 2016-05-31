package cse360assign2;

/*Name: Pengfei Quan
 *CSE360 MWF 11:50 AM - 12:50 PM
 *Pin: 41
 *description: The assignment is to give us practice in debugging code.
 */
import java.util.*;

public class OrderedIntList 
{
	protected int[] array;  
	protected int count;
	private boolean debug = true;
	
	/*create an empty List
	 */
	OrderedIntList ()
	{
		array = new int[10];
	}
	
	/*add value
	 */
	public void insert (int value) 
	{
		if(count == array.length) 
			grow();
		if(count == 0)
		{
			array[0] = value;
			count++;
		}
		else 
		{
			int j = 0;
			for (int i= 0; i < count; i++, j++)
				if(value < array[i]) 
					break;
				for (int i = count; i > j; i--) 
					array[i] = array[i-1];
					array[j] = value; 
					count++;
		}
	}
	
	private void grow(){
		int []temp = new int[count * 2];
		for (int i = 0; i < count; i++ )
			temp[i] = array[i];
			array = temp;
	}
	
	public void print () {
		for (int index = 0; index < count; index++) {
			if (index % 5==0) 
				System.out.println();
				System.out.print(array[index+1] + "\t");	
		}
		System.out.println();
		System.out.print( " " );
	}
}
