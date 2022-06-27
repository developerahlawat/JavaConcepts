package com.javaconcept.java7.typeofreference;

import java.lang.ref.SoftReference;

//Code to illustrate Soft reference

class Gffg {
	// code..
	public void x() {
		System.out.println("GeeksforGeeks");
	}
}

public class SoftReferenceExample {
		public static void main(String[] args)
		{
			// Strong Reference
			Gffg g = new Gffg();	
			g.x();
			
			// Creating Soft Reference to Gfg-type object to which 'g'
			// is also pointing.
			SoftReference<Gffg> softref = new SoftReference<Gffg>(g);
			
			// Now, Gffg-type object to which 'g' was pointing
			// earlier is available for garbage collection.
			g = null;
			
			// You can retrieve back the object which
			// has been weakly referenced.
			// It successfully calls the method.
			g = softref.get();
			
			g.x();
		}
	}

