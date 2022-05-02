package sen3004.healthyapp.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import sen3004.healthyapp.model.Person;

@Component
public class NameValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return Person.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		Person p=(Person)target;
		
		if(p.getName().length()==1) {
			errors.rejectValue("name", "custom.error.nameLength");
		}else if (p.getSurName().length()==1) {
			errors.rejectValue("surName", "custom.error.nameLength");
		}
		
	}

}
