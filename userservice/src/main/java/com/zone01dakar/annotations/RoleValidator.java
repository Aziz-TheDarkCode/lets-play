package com.zone01dakar.annotations;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class RoleValidator implements ConstraintValidator<ValidRole, String> {

    @Override
    public void initialize(ValidRole constraintAnnotation) {
        // Initialization code, if needed
    }

    @Override
    public boolean isValid(String role, ConstraintValidatorContext context) {
        // Check if the role is either "USER" or "ADMIN"
        return role != null && (role.equals("USER") || role.equals("ADMIN"));
    }
}
