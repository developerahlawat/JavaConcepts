package com.javaconcept.java7.typeofreference;

import java.lang.ref.WeakReference;

//Java Code to illustrate Weak reference

class Gfgg {
	// code
	public void x() {
		System.out.println("GeeksforGeeks");
	}
}

public class WeakReferencesExample {
		public static void main(String[] args)
		{
			// Strong Reference
			Gfgg g = new Gfgg();
			g.x();
			
			// Creating Weak Reference to Gfg-type object to which 'g'
			// is also pointing.
			WeakReference<Gfgg> weakref = new WeakReference<Gfgg>(g);
			
			//Now, Gfg-type object to which 'g' was pointing earlier
			//is available for garbage collection.
			//But, it will be garbage collected only when JVM needs memory.
			g = null;
			
			// You can retrieve back the object which
			// has been weakly referenced.
			// It successfully calls the method.
			g = weakref.get();
			
			g.x();
		}
	}


