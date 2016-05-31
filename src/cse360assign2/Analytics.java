package cse360assign2;
import java.util.*;

public class Analytics extends OrderedIntList
{
	private int sum = 0;
	
	public double mean ( int[] array )
	{
		array = super.array;
		
		for(int integer = 0; integer < array.length; integer++){
			sum = sum + array[integer];
		}
		return sum / super.array.length;
	}
	
	
	public int median ( int[] array )
	{
		array = super.array;
		
		if( array.length % 2 == 1){
			return array[(array.length + 1) / 2];
		}
		else{
			return ( array[array.length / 2] + array[array.length / 2 +1] ) / 2;
		}
		
	}
	
	public int high( int[] array)
	{
		array = super.array;
		int Max = array[0];
		
		for(int integer = 0; integer < array.length; integer++){
			if( array[integer] > Max){
				Max = array[integer];
			}
		}
		return Max;
	}
	
	public int low( int[] array)
	{
		array = super.array;
		int Min = array[0];
		
		for(int integer = 0; integer < array.length; integer++){
			if( array[integer] < Min){
				Min = array[integer];
			}
		}
		return Min;
	}
	
	public int numInts( int[] array)
	{
		array = super.array;
		int numInts = array.length;
		
		if ( numInts == 0){
			return -1;
		}
		else{
			return numInts;
		}
	}

}
