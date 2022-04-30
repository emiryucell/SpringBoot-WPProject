package sen3004.healthyapp.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import sen3004.healthyapp.model.Person;

@Controller
public class HealtyAppController {

	@RequestMapping(value = { "/health-form" }, method = RequestMethod.GET)
	public ModelAndView displayHealthForm() {
		ModelAndView mv = new ModelAndView("form");
		mv.addObject("person", new Person());
		return mv;
	}
	
	@RequestMapping(value="/send-health-info", method=RequestMethod.POST)
	public ModelAndView processForm(@Valid @ModelAttribute("person") Person person,BindingResult result) {
		ModelAndView mv =new ModelAndView("health-result");
		
	mv.addObject("person",person);
	if(result.hasErrors()) {
		mv.setViewName("form");
	}else {
		mv.setViewName("health-result");
	}
	return mv;
		
	}

}
