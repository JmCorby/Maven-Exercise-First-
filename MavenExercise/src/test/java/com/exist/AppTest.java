package com.exist;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.*;
import java.util.Scanner;
import org.junit.jupiter.api.*;

class AppTest {
	
	private PracticeTwoMethod app;
	private Scanner sc;
	
	@BeforeEach
	void setup() {
		app = new PracticeTwoMethod(sc);
	}

    @Test
    void demoTestMethod() {
    	
    	ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        
    	ArrayList<LinkedHashMap<String, String>> dataRows = new ArrayList<>();
    	LinkedHashMap<String, String> map = new LinkedHashMap<>();
    	
    	map.put("1", "1");
    	map.put("2", "2");
    	
    	dataRows.add(map);
    	
    	app.print(dataRows);
    	
    	String expected = "\n( 1 , 1 )( 2 , 2 )";
    	
        assertEquals(expected, outContent.toString());
    }
}
