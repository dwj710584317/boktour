package com.bbn.ms.boktour.web;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bbn.ms.boktour.service.HttpClientService;

@Controller
@RequestMapping("/proxy/boktour")
public class ProxyController {
	@Autowired
	private HttpClientService httpClientService;
	
	@PostMapping("{name}")
	@ResponseBody
	public String boktour(@PathVariable("name") String ifName,
			@RequestParam Map<String, String> map) {
		String url = "http://api.boktour.com/tour/" + ifName;
		return httpClientService.doPost(url, map);
	}
	
}
