package com.libraryValidation;

public class ValidationUtil {
	
	public static boolean isValidString(String input) {
        return input != null && !input.trim().isEmpty();
    }

    public static boolean isValidPositiveInteger(int number) {
        return number > 0;
    }

    public static boolean isValidMembershipType(String type) {
        return type != null && (type.equalsIgnoreCase("regular") || type.equalsIgnoreCase("premium"));
    }

    public static void validateString(String input, String fieldName) throws IllegalArgumentException {
        if (!isValidString(input)) {
            throw new IllegalArgumentException(fieldName + " cannot be empty.");
        }
    }

    public static void validatePositiveInteger(int number, String fieldName) throws IllegalArgumentException {
        if (!isValidPositiveInteger(number)) {
            throw new IllegalArgumentException(fieldName + " must be greater than 0.");
        }
    }
    
}
