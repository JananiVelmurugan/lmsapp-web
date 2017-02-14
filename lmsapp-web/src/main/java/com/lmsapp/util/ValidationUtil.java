package com.lmsapp.util;

import java.time.LocalDateTime;
import java.time.LocalTime;

import com.lmsapp.exception.ValidationException;

public class ValidationUtil {
	private ValidationUtil() {

	}

	public static boolean isValidInteger(Integer number) {
		return number == null || number <= 0;
	}

	public static void isInvalidInteger(Integer number, String message) throws ValidationException {

		if (number == null || number <= 0) {
			throw new ValidationException(message);
		}
	}

	public static boolean isValidString(String name) {
		return name == null || "".equals(name.trim());
	}

	public static void isInvalidInteger(String name, String message) throws ValidationException {

		if (name == null || "".equals(name.trim())) {
			throw new ValidationException(message);
		}
	}

	public static boolean isValidTime(LocalTime time) {
		return time == null;
	}

	public static void isInvalidTime(LocalTime time, String message) throws ValidationException {

		if (time == null) {
			throw new ValidationException(message);
		}
	}

	public static boolean isValidDateTime(LocalDateTime dateTime) {
		return dateTime == null;
	}

	public static void isInvalidDateTime(LocalDateTime dateTime, String message) throws ValidationException {

		if (dateTime == null) {
			throw new ValidationException(message);
		}
	}
}
