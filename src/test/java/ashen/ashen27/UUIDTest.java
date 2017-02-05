package ashen.ashen27;


import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Generate short UUID (MAX 13 characters)
 * 
 * @return short UUID
 */

public class UUIDTest {
//	public static String shortUUID() {
//		  UUID uuid = UUID.randomUUID();
//		  long l = ByteBuffer.wrap(uuid.toString().getBytes()).getLong();
//		  return Long.toString(l, Character.MAX_RADIX);
//		}
	
//	
//	public static void main(String[]args)
//	{
//		String a = shortUUID();
//		System.out.println(a);
//		int result=a.length();
//		System.out.println(result);
//		
//	}
	
	@Test
	public void test27(){
		String a = GUUID.shortUUID();
	  	int result=a.length();
		assertTrue(result>=12);
	   }
	
	
}
