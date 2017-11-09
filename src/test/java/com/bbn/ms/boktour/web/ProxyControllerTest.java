package com.bbn.ms.boktour.web;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.bbn.ms.boktour.Application;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = { Application.class })
public class ProxyControllerTest {

	private final String username = "test";
	private final String password = "test";
	@Autowired
	private ProxyController proxyController;

	@Test
	public void boktour() {
		Map<String, String> params = new HashMap<>();
		params.put("UserName", username);
		params.put("PassWord", password);
		params.put("TYPE_FLAG", "1");
		String actual = proxyController.boktour("LineType", params);
		String expected = "{\"Code\":\"-1\",\"Msg\":\"非授权接口用户,可能用户名密码错误或访问IP未授权!\",\"RecordCount\":0,\"PageCount\":0,\"Data\":null}";
		assertEquals(expected, actual);
	}
}
