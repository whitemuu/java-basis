package me.nichijou.access.subacc;

import me.nichijou.access.Protected;

/**
 * Created by nichijou on 8/22/17.
 */
public class Protected1 extends Protected{
	// sub package is different package
	// sub class have no access to super's method with default access control
//	@Override
	void method() {
//		super.method();
	}
}
