package com.bbn.ms.boktour.service;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bbn.ms.boktour.BoktourSource;

@Service
public class BoktourApiService {
	@Autowired
	private BoktourSource boktourSource;
	@Autowired
	private HttpClientService httpClientService;

	public String lineType(String typeFlag) {
		String url = boktourSource.getFinalBaseUri() + "/LineType";
		Map<String, String> map = new HashMap<String, String>();
		map.put("UserName", boktourSource.getUsername());
		map.put("PassWord", boktourSource.getPassword());
		map.put("TYPE_FLAG", typeFlag);
		return httpClientService.doPost(url, map);
	}

	public String subLineType(int linetypeId) {
		String url = boktourSource.getFinalBaseUri() + "/SubLineType";
		Map<String, String> map = new HashMap<String, String>();
		map.put("UserName", boktourSource.getUsername());
		map.put("PassWord", boktourSource.getPassword());
		map.put("LINETYPE", String.valueOf(linetypeId));
		return httpClientService.doPost(url, map);
	}

	public String setOutCity(String typeFlag, int linetypeId, int subtypeId) {
		String url = boktourSource.getFinalBaseUri() + "/SetOutCity";
		Map<String, String> map = new HashMap<String, String>();
		map.put("UserName", boktourSource.getUsername());
		map.put("PassWord", boktourSource.getPassword());
		map.put("TYPE_FLAG", typeFlag);
		map.put("LINETYPE", String.valueOf(linetypeId));
		map.put("SUBTYPE_ID", String.valueOf(subtypeId));
		return httpClientService.doPost(url, map);
	}

	public String search(String typeFlag, int linetypeId, int subtypeId,
			int setoutcityId) {
		String url = boktourSource.getFinalBaseUri() + "/Search";
		Map<String, String> map = new HashMap<String, String>();
		map.put("UserName", boktourSource.getUsername());
		map.put("PassWord", boktourSource.getPassword());
		map.put("TYPE_FLAG", typeFlag);
		map.put("LINETYPE", String.valueOf(linetypeId));
		map.put("SUBTYPE_ID", String.valueOf(subtypeId));
		map.put("SETOUTCITY", String.valueOf(setoutcityId));
		return httpClientService.doPost(url, map);
	}

	public String line(String typeFlag, int linetypeId, int subtypeId,
			int setoutcityId, int[] tag01, int[] tag02, String priceLimit,
			String lineName, String lineNo, Date date1, Date date2,
			int[] tourdays, int page) {
		String url = boktourSource.getFinalBaseUri() + "/Line";
		Map<String, String> map = new HashMap<String, String>();
		map.put("UserName", boktourSource.getUsername());
		map.put("PassWord", boktourSource.getPassword());
		map.put("TYPE_FLAG", typeFlag);
		map.put("LINETYPE", String.valueOf(linetypeId));
		map.put("SUBTYPE_ID", String.valueOf(subtypeId));
		map.put("SETOUTCITY", String.valueOf(setoutcityId));
		map.put("TAG01", Arrays.toString(tag01));
		map.put("TAG02", Arrays.toString(tag02));
		map.put("PRICE_LIMIT", priceLimit);
		map.put("LINENAME", lineName);
		map.put("LineNo", lineNo);
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY-mm-dd");
		map.put("DATE1", sdf.format(date1));
		map.put("DATE2", sdf.format(date2));
		map.put("TOURDAYS", Arrays.toString(tourdays));
		map.put("Page", String.valueOf(page));
		return httpClientService.doPost(url, map);
	}

	public String lineDetail(int listId) {
		String url = boktourSource.getFinalBaseUri() + "/LineDetail";
		Map<String, String> map = new HashMap<String, String>();
		map.put("UserName", boktourSource.getUsername());
		map.put("PassWord", boktourSource.getPassword());
		map.put("ListId", String.valueOf(listId));
		return httpClientService.doPost(url, map);
	}

	public String linePlanList(int listId) {
		String url = boktourSource.getFinalBaseUri() + "/LinePlanList";
		Map<String, String> map = new HashMap<String, String>();
		map.put("UserName", boktourSource.getUsername());
		map.put("PassWord", boktourSource.getPassword());
		map.put("ListId", String.valueOf(listId));
		return httpClientService.doPost(url, map);
	}

	public String tripDetail(int lineNo) {
		String url = boktourSource.getFinalBaseUri() + "/TripDetail";
		Map<String, String> map = new HashMap<String, String>();
		map.put("UserName", boktourSource.getUsername());
		map.put("PassWord", boktourSource.getPassword());
		map.put("LineNo", String.valueOf(lineNo));
		return httpClientService.doPost(url, map);
	}

	public String linePic(int lineNo) {
		String url = boktourSource.getFinalBaseUri() + "/LinePic";
		Map<String, String> map = new HashMap<String, String>();
		map.put("UserName", boktourSource.getUsername());
		map.put("PassWord", boktourSource.getPassword());
		map.put("LineNo", String.valueOf(lineNo));
		return httpClientService.doPost(url, map);
	}

}
