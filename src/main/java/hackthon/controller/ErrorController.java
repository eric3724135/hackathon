package hackthon.controller;

import org.springframework.beans.TypeMismatchException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.mvc.multiaction.NoSuchRequestHandlingMethodException;

@Controller
@RequestMapping("/err")
public class ErrorController {
	
	@ExceptionHandler(NoSuchRequestHandlingMethodException.class)
	@ResponseStatus(value = HttpStatus.NOT_FOUND)
	@RequestMapping("/error404")
	public String handleResourceNotFoundException(Exception e,Model model) {
		model.addAttribute("title", "Page Not Found");
		model.addAttribute("message", e.getMessage());
		return "error";
	}
	
	@ExceptionHandler(TypeMismatchException.class)
	@RequestMapping("/error400")
	public String err400(Exception e,Model model) {
		model.addAttribute("title", "Bad Request");
		model.addAttribute("message", e.getMessage());
		return "error";
	}

}
