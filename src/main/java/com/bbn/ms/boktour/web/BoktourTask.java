package com.bbn.ms.boktour.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.bbn.ms.boktour.service.BoktourService;

@Component
public class BoktourTask {
	@Autowired
	private BoktourService boktourService;

	@Scheduled(cron = "0/5 * * * * ?")
	public void TaskJob() {
		System.out.println("test second annotation style ...");
	}

	public void dailyListJob() {
		// $vendor->svc_interface1();
		// $vendor->svc_update_lines_all();
		// $vendor->svc_interface3();
		// $vendor->svc_update_shorts_all();
	}

	public void lineListJob() {
		// $vendor->svc_interface1();
		// $vendor->svc_update_lines_all();
	}

	public void shortListJob() {
		// $vendor->svc_interface3();
		// $vendor->svc_update_shorts_all();
	}

	public void interface1Job() {
		// $resp = $vendor->svc_interface1();
	}

	public void interface2Action() {
		// $LINEID = $this->params()->fromRoute('LINEID', 37175);
		// $resp = $vendor->svc_interface2($LINEID);

	}

	public void updateLinesAllAction() {
		// $resp = $vendor->svc_update_lines_all();

	}

	public void interface3Action() {
		// $resp = $vendor->svc_interface3();

	}

	public void interface4Action() {
		// $LINEID = $this->params()->fromRoute('LINEID', 7725);
		// $resp = $vendor->svc_interface4($LINEID);

	}

	public void interface5Action() {
		// $ORDERID = $this->params()->fromRoute('ORDERID');
		// if ($ORDERID){
		// $other_id = $ORDERID;
		// $result = $vendor->svc_interface5($other_id);
		// $success = isset($result['ERRORS'])? !empty($result['ERRORS']) :
		// false;
		// print_r("Execute debug interface5 action %s\r\n",
		// $success?'successfully':'failed');
		// }
	}

	public void interface6Action() {
		// $ORDERID = $this->params()->fromRoute('ORDERID');
		// $result = $vendor->svc_interface6($ORDERID);
		// print_r("Execute debug interface6 action %s\r\n",
		// $result?'successfully':'failed');

	}

	public void interface7Action() {
		// $ORDERID = $this->params()->fromRoute('ORDERID');
		// if ($ORDERID){
		// $other_id = $ORDERID;
		// $result = $vendor->svc_interface7($other_id);
		// $success = isset($result['ERRORS'])? !empty($result['ERRORS']) :
		// false;
		// print_r("Execute debug interface7 action %s\r\n",
		// $success?'successfully':'failed');
		// }
	}

	public void interface8Action() {
		// $ORDERID = $this->params()->fromRoute('ORDERID');
		// $result = $vendor->svc_interface8($ORDERID);
		// print_r("Execute debug interface8 action %s\r\n",
		// $result?'successfully':'failed');

	}

	public void updateShortsAllAction() {
		// $resp = $vendor->svc_update_shorts_all();

	}

	public void getLinePriceAction() {
		// $LINEID = $this->params()->fromRoute('LINEID', 37175);
		// $TRAFFIC_ID = $this->params()->fromRoute('TRAFFIC_ID', 10952);
		// $TOURDATE = $this->params()->fromRoute('TOURDATE', '2014-06-21');
		// $resp = $vendor->svc_getlineprice($LINEID, $TRAFFIC_ID, $TOURDATE);

	}

	public void updateLinePricesAction() {
		// $resp = $vendor->svc_update_line_prices();

	}

	public void getShortPriceAction() {
		// $LINEID = $this->params()->fromRoute('LINEID', 37175);
		// $TOURDATE = $this->params()->fromRoute('TOURDATE', '2014-06-21');
		// $resp = $vendor->svc_getshortprice($LINEID, $TOURDATE);
		//
	}

	public void updateShortPricesAction() {
		// $resp = $vendor->svc_update_short_prices();

	}
}
