package org.fgnhbn;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class ReferenceProgram {
public static void main(String[] args) throws AWTException {
	
	
Robot r=new Robot();
r.keyPress(KeyEvent.VK_SHIFT);
r.keyPress(KeyEvent.VK_S);
r.keyRelease(KeyEvent.VK_SHIFT);
r.keyRelease(KeyEvent.VK_S);
	
}
	
	
}
