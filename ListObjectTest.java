package Testing;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ObjectListTest {
	private Object[] list =new Object[3];
	private int total ;
	
	@Test
	void testObjectList() {
		ObjectListTest ol=new ObjectListTest();
		
		assertEquals(0,ol.total,0);
		
	}

    @Test
	boolean testAdd(int n) {
		 n=1;
		ObjectListTest ol=new ObjectListTest();
		if(!testIsFull())
		{
			list [total] = n;
			total++;
			return true;
		}
		else
		{
			return false;
		}
	}

    @Test
    void testAdd1()
    {
   
    	ObjectListTest ol=new ObjectListTest();
       
       
       assertTrue(ol.testAdd(0));
    }
    

    void testIsEmpty1()
    {
    	ObjectListTest ol=new ObjectListTest();
    	assertTrue(ol.testIsEmpty());
    }

	@Test
	boolean testIsEmpty() {
		if(total==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	@Test
	boolean testIsFull() {
		ObjectListTest ol=new ObjectListTest();
		if(ol.total==ol.list.length)
		{
			return true;
		}
		else return false;
	}
		
	@Test
	void testGetItem1()
	{
		ObjectListTest ol=new ObjectListTest();
		equals(ol.testGetItem(ol.total));
	}
	
	@Test
	Object testGetItem(int positionIn) {
		ObjectListTest ol=new ObjectListTest();
		positionIn=1;
		if (positionIn <1 || positionIn > ol.total)
		{
			return null;
		}
		else
		{
			return list [positionIn -1];
		}
	}

	@Test
	int testGetTotal() {
		ObjectListTest ol=new ObjectListTest();
		return ol.total;
	}

	@Test
	void testGetTotal1()
	{
		ObjectListTest ol=new ObjectListTest();
		assertEquals(0,ol.testGetTotal());
	}
	
	@Test
	void testRemove1()
	{
			ObjectListTest ol=new ObjectListTest();
			assertFalse(ol.testRemove(total));
	}
	
	@Test
	boolean testRemove(int numberIn) {
		
	
		
		if(numberIn >= 1 && numberIn <= total)
		{
			for(int i = numberIn-1; i <= total-2; i++)
			{
				list[i] = list[i+1];
			}
			total--;
			return true;
		}
		else
		{
			return false;
		}
	}


}