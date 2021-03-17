package Testing;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


//A test class to test the ObjectList class

class ObjectListTest {
	private Object[] list =new Object[3];
	private int total ;

	//Constructor of the test class
	@Test
	void testObjectList1(int sizeIn)
	{
		list = new Object[sizeIn];
		total = 0;
	}
	
	//A test case to test the constructor
	@Test
	void testObjectList() {
		ObjectListTest ol=new ObjectListTest();
		
		assertEquals(0,ol.total,0);
		
	}

	// A test method named testAdd which is a reflection of the method add which is tested by the testcase testAdd1  
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

	//A test case to test the above method named testAdd
    @Test
    void testAdd1()
    {
   
    	ObjectListTest ol=new ObjectListTest();
       
       
       assertTrue(ol.testAdd(0));
    }
    
	// A test case to test the testIsEmpty method of this test class
   @Test
    void testIsEmpty1()
    {
    	ObjectListTest ol=new ObjectListTest();
    	assertTrue(ol.testIsEmpty());
    }

	// A test method named testIsEmpty which is a reflection of the isEmpty method of the ObjectList class 
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

	// a test method that is named testIsFull which is a reflection of the isFull method in the original class
	@Test
	boolean testIsFull() {
		ObjectListTest ol=new ObjectListTest();
		if(ol.total==ol.list.length)
		{
			return true;
		}
		else return false;
	}
		
	// A test case that tests the below test method testGetItem1
	@Test
	void testGetItem1()
	{
		ObjectListTest ol=new ObjectListTest();
		equals(ol.testGetItem(ol.total));
	}
	
	// A test method named testGetItem that is tested by the above test case 
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

	// A test method that represents the method getTotal in the ObjectList clacc
	@Test
	int testGetTotal() {
		ObjectListTest ol=new ObjectListTest();
		return ol.total;
	}

	// A test case that tests the above method testGetTotal
	@Test
	void testGetTotal1()
	{
		ObjectListTest ol=new ObjectListTest();
		assertEquals(0,ol.testGetTotal());
	}
	
	// A test case that tests the below method testRemove
	@Test
	void testRemove1()
	{
			ObjectListTest ol=new ObjectListTest();
			assertFalse(ol.testRemove(total));
	}
	
	// A test method that represents the method Remove in the ObjectList class 
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
