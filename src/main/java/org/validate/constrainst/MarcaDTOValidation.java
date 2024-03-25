package org.validate.constrainst;


import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
//@Constraint(validatedBy = MarcaDTOValidation.class)
@Target( {ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface MarcaDTOValidation {

    String message() default "Este campo é obrigatório";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
