import java.util.ArrayList;

/**
 * Holds shared data 
 */
public class SharedData 
{
	private ArrayList<Integer> array;
	private boolean [] winArray;
	private boolean flag;
	private final int b;
	
	/**
	 * Constructor for SharedData
	 * @param array - the ArrayList
	 * @param b
	 */
	public SharedData(ArrayList<Integer> array, int b) {
		
		this.array = array;
		this.b = b;
	}

	/**
	 * gets winArray
	 * @return
	 */
	public boolean[] getWinArray() 
	{
		return winArray;
	}

	/**
	 * Sets winArry
	 * @param winArray
	 */
	public void setWinArray(boolean [] winArray) 
	{
		this.winArray = winArray;
	}

	/**
	 * returns the ArrayList
	 * @return
	 */
	public ArrayList<Integer> getArray() 
	{
		return array;
	}

	/**
	 * Returns array size 
	 * @return
	 */
	public int getB() 
	{
		return b;
	}

	/**
	 * returns the flag
	 * @return
	 */
	public boolean getFlag() 
	{
		return flag;
	}

	/**
	 * sets the flag boolean
	 * @param flag
	 */
	public void setFlag(boolean flag) {
		this.flag = flag;
	}

}
