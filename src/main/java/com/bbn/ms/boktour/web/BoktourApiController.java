package com.bbn.ms.boktour.web;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.bbn.ms.boktour.service.BoktourApiService;

@Controller
public class BoktourApiController {
	@Autowired
	private BoktourApiService boktourApiService;
	
	public String lineTypeForm() {
		return "boktour/linetype-form";
	}
	
	public String lineType(String typeFlag, Model model) {
		String json = boktourApiService.lineType(typeFlag);
		model.addAttribute("jsonResult", json);
		return "redirect:boktour/linetype-form";
	}
	
	public String subLineType(int linetypeId, Model model) {
		String json = boktourApiService.subLineType(linetypeId);
		model.addAttribute("jsonResult", json);
		return "redirect:boktour/sublinetype-form";
	}

	public String setOutCity(String typeFlag, int linetypeId, int subtypeId, Model model) {
		String json = boktourApiService.setOutCity(typeFlag, linetypeId, subtypeId);
		model.addAttribute("jsonResult", json);
		return "redirect:boktour/setoutcity-form";
	}
	
	public String search(String typeFlag, int linetypeId, int subtypeId, int setoutcityId, Model model) {
		String json = boktourApiService.search(typeFlag, linetypeId, subtypeId, setoutcityId);
		model.addAttribute("jsonResult", json);
		return "redirect:boktour/search-form";
	}
	
	public String line(String typeFlag, int linetypeId, int subtypeId, int setoutcityId, int[] tag01, int[] tag02, 
			String priceLimit, String lineName, String lineNo, Date date1, Date date2, int[] tourdays, int page,
			Model model) {
		String json = boktourApiService.line(typeFlag, linetypeId, subtypeId, setoutcityId, tag01, tag02, priceLimit, lineName, lineNo, date1, date2, tourdays, page);
		model.addAttribute("jsonResult", json);
		return "redirect:boktour/line-form";
	}

	public String lineDetail(int listId, Model model) {
		String json = boktourApiService.lineDetail(listId);
		model.addAttribute("jsonResult", json);
		return "redirect:boktour/linedetail-form";
	}
	
	public String linePlanList(int listId, Model model) {
		String json = boktourApiService.linePlanList(listId);
		model.addAttribute("jsonResult", json);
		return "redirect:boktour/lineplanlist-form";
	}

	public String tripDetail(int lineNo, Model model) {
		String json = boktourApiService.tripDetail(lineNo);
		model.addAttribute("jsonResult", json);
		return "redirect:boktour/tripdetail-form";
	}
	
	public String linePic(int lineNo, Model model) {
		String json = boktourApiService.linePic(lineNo);
		model.addAttribute("jsonResult", json);
		return "redirect:boktour/linepic-form";
	}
}
