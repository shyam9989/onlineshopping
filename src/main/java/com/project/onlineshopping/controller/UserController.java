package com.project.onlineshopping.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.project.onlineshopping.dao.UserRepository;
import com.project.onlineshopping.model.User;
import com.project.onlineshopping.service.CategoryService;
import com.project.onlineshopping.service.UserService;

@Controller
@SessionAttributes("user")
public class UserController {

	@Autowired
	UserService userService;
	@Autowired
	CategoryService categoryService;
	@Autowired
	UserRepository userRepository;

	@GetMapping(value = { "/", "/home" })
	public ModelAndView home() {
		ModelAndView modelAndView = new ModelAndView("page");
		modelAndView.addObject("userClickHome", true);
		modelAndView.addObject("title", "Home");

		 modelAndView.addObject("categories", categoryService.findAllCategories());

		return modelAndView;
	}

	@GetMapping("/contact")
	public ModelAndView contact() {
		ModelAndView modelAndView = new ModelAndView("page");
		modelAndView.addObject("userClickContact", true);
		modelAndView.addObject("title", "Contact Us");

		return modelAndView;
	}

	@GetMapping("/about")
	public ModelAndView about() {
		ModelAndView modelAndView = new ModelAndView("page");
		modelAndView.addObject("userClickAbout", true);
		modelAndView.addObject("title", "About Us");

		return modelAndView;
	}

	@GetMapping("/register")
	public ModelAndView register() {
		ModelAndView modelAndView = new ModelAndView("signup-personal");
		User user = new User();
		modelAndView.addObject("user", user);
		return modelAndView;
	}

	@PostMapping("/register1")
	public ModelAndView register1(@Valid @ModelAttribute("employee") User user, BindingResult result) {
		ModelAndView modelAndView = null;
		if (result.hasErrors()) {
			modelAndView = new ModelAndView("error");
		} else {
			boolean userStatus = userService.saveUser(user);
			if (userStatus) {
				modelAndView = new ModelAndView("singup-success");
			} else {
				modelAndView = new ModelAndView("signup-personal");
				modelAndView.addObject("msg", "username or password wrong");
			}
		}
		return modelAndView;
	}
	
	@GetMapping("login")
	public ModelAndView loginForm()
			 {
		ModelAndView modelAndView=new ModelAndView("login");
		
		return modelAndView;
		
	}
	
	@PostMapping("userLogin")
	public ModelAndView login(@RequestParam("username") String username,
			@RequestParam("password") String password
			) {
		ModelAndView modelAndView=null;
		User user= userRepository.findUserByEmailAndPassword(username,password);
		if(user.getRole().equalsIgnoreCase("admin")) {
			 modelAndView= new ModelAndView("adminHome");
			 modelAndView.addObject("user",user);
		}else {
			 modelAndView= new ModelAndView("userHome");
			 modelAndView.addObject("user",user);
		}
	
		
		return modelAndView;
		
	}

}
