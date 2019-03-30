package com.example.HelloWorld;
import org.springframework.stereotype.Controller;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class MyController {
@RequestMapping("/nextpage")
public String pass()
{
	return "nextpage";
}
}
