package sen3004.healthyapp.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import sen3004.healthyapp.model.Person;
import sen3004.healthyapp.validator.NameValidator;

@Controller
public class HealtyAppController {
	
	@Autowired
	NameValidator nv;

	@RequestMapping(value = { "/health-form" ,"/form.html"}, method = RequestMethod.GET)
	public ModelAndView displayHealthForm() {
		ModelAndView mv = new ModelAndView("form");
		mv.addObject("person", new Person());
		return mv;
	}
	
	@RequestMapping(value="/send-health-info", method=RequestMethod.POST)
	public ModelAndView processForm(@Valid @ModelAttribute("person") Person person,BindingResult result) {
		ModelAndView mv =new ModelAndView("health-result");
		
		
	mv.addObject("person",person);
	nv.validate(person, result);

	
	if(result.hasErrors()) {
		mv.setViewName("form");
	}else {
		mv.setViewName("health-result");
	}
	return mv;
		
	}

}
