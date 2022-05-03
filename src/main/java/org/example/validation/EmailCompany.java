package org.example.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = EmailCompanyValidator.class)
public @interface EmailCompany {
    String value() default "yandex.ru";

    String message() default "Email must be ends with 'yandex.ru'";

    // not important

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
