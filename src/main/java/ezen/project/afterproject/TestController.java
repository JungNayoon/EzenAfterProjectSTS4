package ezen.project.afterproject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class TestController {

	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String testMethod(Model model) throws Exception {

		log.info("테스트페이지");
		
		model.addAttribute("test", "jsp테스트");

		return "test";
	}
}
