package sen3004.healthyapp.controller;

import org.springframework.stereotype.Controller;
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

}
