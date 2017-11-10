package com.bbn.ms.boktour.web;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import junitx.util.PrivateAccessor;

import org.junit.Before;
import org.junit.Test;
import org.springframework.ui.Model;

import com.bbn.ms.boktour.service.BoktourApiService;

public class BoktourApiControllerTest {

	private BoktourApiController boktourController;
	private Model model;
	private BoktourApiService boktourApiService;
	
	@Before
	public void setUp() throws NoSuchFieldException{
		boktourController = new BoktourApiController();
		boktourApiService = mock(BoktourApiService.class);
	    PrivateAccessor.setField(boktourController, "boktourApiService", boktourApiService);
		model = mock(Model.class);
	}

	@Test
	public void lineTypeForm() {
		String actual = boktourController.lineTypeForm();
		assertEquals("boktour/linetype-form", actual);
	}

	@Test
	public void lineType() {
		String expected = "any json string";
		final String typeFlag = "1";
		when(boktourApiService.lineType(typeFlag)).thenReturn(expected);
		String actual = boktourController.lineType(typeFlag, model);
		assertEquals("redirect:boktour/linetype-form", actual);
		verify(model).addAttribute(eq("jsonResult"), eq(expected));
		verify(boktourApiService).lineType(typeFlag);
	}
	
	
//	获取产品分类	2
//	二、获取产品二级分类	2
//	三、获取产品出发城市	3
//	四、获取产品搜索项[旅游天数,接待标准,产品主题]	4
//	五、获取产品列表	5
//	六、获取产品详情	6
//	七、获取产品计划关联的所有发班计划	
}
