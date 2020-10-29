package com.cg.customer.util;

import com.cg.customer.exceptions.*;

public class ValidationUtil {

	public static void checkArgumentNotNull(Object obj) {
		if (obj == null) {
			throw new InvalidArgumentException("Object can't null");
		}
	}

	public static void checkName(String name) {
		if (name == null || name.isEmpty()) {
			throw new InvalidCustomerNameException("Please provide valid name");
		}

	}

}
