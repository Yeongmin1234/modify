package org.zerock.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j;

@Log4j
@Controller
@RequestMapping("/sample/*")
public class SampleController {

	@GetMapping("/all")
	public void doAll() {
		log.info("all");
	}
	
	@GetMapping("/member")
	public void doMember() {
		log.info("member");
	}
	
	@GetMapping("/admin")
	public void doAdmin() {
		log.info("admin");
	}
	@GetMapping(value="/login")
    public String page() throws Exception {
        return "/sample/login";
    }
}
