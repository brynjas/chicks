package com.tictactoe.java;

import static org.junit.Assert.*;
import org.junit.Test;

public class PlayerTest {
	final player pX = new Player('X'); 
	final player pO = new Player('O');

	@Test
	public void testPlayerSymbol_X()
	{
		assertEquals('X', pX.getSymbol());
	}
	
        @Test
        public void testPlayerSymbol_O()
        {
                assertEquals('O', pO.getSymbol());
        }
}

