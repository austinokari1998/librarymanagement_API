package com.librarymanagement.librarymanagement.Users;


import java.util.Arrays;

public enum Gender {
	
    male("male"), female("female");	
	private String value;

	private Gender(String value) {
		this.value = value;
	}

	public static Gender fromValue(String value) {
		for (Gender category : values()) {
			if (category.value.equalsIgnoreCase(value)) {
				return category;
			}
		}
		throw new IllegalArgumentException(
				"Unknown enum type " + value + ", Allowed values are " + Arrays.toString(values()));
	}
}
