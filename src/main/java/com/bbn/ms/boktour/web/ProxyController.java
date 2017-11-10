package com.bbn.ms.boktour.web;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bbn.ms.boktour.service.BoktourApiService;

@Controller
@RequestMapping("/proxy")
public class ProxyController {
	@Autowired
	private BoktourApiService boktourApiService;

	@GetMapping
	public String home() {
		return "proxy/index";
	}

	@PostMapping("{name}")
	@ResponseBody
	public String proxyPost(@PathVariable("name") String ifName,
			@RequestParam Map<String, String> map) {
		return boktourApiService.doPostNoProxy(ifName, map);
	}
	
	@GetMapping("{name}")
	@ResponseBody
	public String proxyGet(@PathVariable("name") String ifName,
			@RequestParam Map<String, String> map) {
		return proxyPost(ifName, map);
	}
}
