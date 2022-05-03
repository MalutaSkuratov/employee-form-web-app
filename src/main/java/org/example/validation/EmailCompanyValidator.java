package org.example.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class EmailCompanyValidator implements ConstraintValidator<EmailCompany, String> {
   private String endEmail;

   public void initialize(EmailCompany constraint) {
      endEmail = constraint.value();
   }

   public boolean isValid(String obj, ConstraintValidatorContext context) {
      return obj.endsWith(endEmail);
   }
}
