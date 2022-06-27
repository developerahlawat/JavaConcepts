package com.javaconcept.java7.typeofreference;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

class Gfggg {
	// code
	public void x() {
		System.out.println("GeeksforGeeks");
	}
}

public class PhantomReferenceExample {

	public static void main(String[] args) {
		// Strong Reference
		Gfggg g = new Gfggg();
		g.x();

		// Creating reference queue
		ReferenceQueue<Gfggg> refQueue = new ReferenceQueue<Gfggg>();

		// Creating Phantom Reference to Gfg-type object to which 'g'
		// is also pointing.
		PhantomReference<Gfggg> phantomRef = null;

		phantomRef = new PhantomReference<Gfggg>(g, refQueue);

		// Now, Gfg-type object to which 'g' was pointing
		// earlier is available for garbage collection.
		// But, this object is kept in 'refQueue' before
		// removing it from the memory.
		g = null;

		// It always returns null.
		g = phantomRef.get();

		// It shows NullPointerException.
		g.x();
	}
}
