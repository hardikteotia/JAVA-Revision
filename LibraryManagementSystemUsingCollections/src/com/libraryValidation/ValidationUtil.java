package com.libraryValidation;

public class ValidationUtil {
	

    public static boolean isValidMembershipType(String type) {
        return type != null && (type.equalsIgnoreCase("regular") || type.equalsIgnoreCase("premium"));
    }

    
    
}
