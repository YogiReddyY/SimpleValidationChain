package net.bircs.validation.validator;

import net.bircs.validation.generic.Validator;
import org.apache.commons.validator.GenericValidator;

import net.bircs.validation.generic.Validatable;
import net.bircs.validation.generic.ValidationContext;

public class LengthValidator extends Validator {
	
	@Override
	public boolean isValid(ValidationContext context, Validatable validatable) {
		return (GenericValidator.minLength(validatable.getValue(), context.getMinLength()) && 
				GenericValidator.maxLength(validatable.getValue(), context.getMaxLength()));
	}
	
	
	// Value errors need to override the error type
	@Override
	public int getErrorType() {
		return Validator.DATA_ERROR;
	}
	
}

	
