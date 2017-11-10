package com.bbn.ms.boktour.web;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import com.google.gson.Gson;

public class SampleDataUtil {

	public static String lineTypeJson() {
		BaseDTO dto = new LineTypeDTO("0", null, Arrays.asList(new LineType(
				"海南专线", 0, 1, 1,
				"http://upload.boktour.com/bk_linetype/1/0.JPG"), new LineType(
				"海南自由行", 0, 1, 100,
				"http://upload.boktour.com/bk_linetype/100/0.JPG")));
		return dto2Json(dto);
	}

	private static String dto2Json(BaseDTO dto) {
		Gson gson = new Gson();
		return gson.toJson(dto);
	}

	static class BaseDTO {
		public String Code;
		public String Msg;

		public BaseDTO(String Code, String Msg) {
			this.Code = Code;
			this.Msg = Msg;
		}
	}

	static class LineTypeDTO extends BaseDTO {
		public List<LineType> Data;

		public LineTypeDTO(String Code, String Msg, List<LineType> Data) {
			super(Code, Msg);
			this.Data = Data;
		}
	}

	static class LineType {
		public String LINETYPE_NAME;
		public int RECOMMEND;
		public int TYPE_FLAG;
		public int LINETYPE_ID;
		public String PIC;

		public LineType(String LINETYPE_NAME, int RECOMMEND, int TYPE_FLAG,
				int LINETYPE_ID, String PIC) {
			this.LINETYPE_NAME = LINETYPE_NAME;
			this.RECOMMEND = RECOMMEND;
			this.TYPE_FLAG = TYPE_FLAG;
			this.LINETYPE_ID = LINETYPE_ID;
			this.PIC = PIC;
		}
	}

	public static String subLineTypeJson() {
		BaseDTO dto = new SubLineTypeDTO("0", null, Arrays.asList(
				new SubLineType(125, "海口/三亚特惠游"), new SubLineType(126, "蜜月之旅")));
		return dto2Json(dto);
	}

	static class SubLineTypeDTO extends BaseDTO {
		public List<SubLineType> Data;

		public SubLineTypeDTO(String Code, String Msg, List<SubLineType> Data) {
			super(Code, Msg);
			this.Data = Data;
		}

	}

	static class SubLineType {
		public String SUBTYPE_NAME;
		public int SUBTYPE_ID;

		public SubLineType(int SUBTYPE_ID, String SUBTYPE_NAME) {
			this.SUBTYPE_ID = SUBTYPE_ID;
			this.SUBTYPE_NAME = SUBTYPE_NAME;
		}
	}

	public static String setOutCityJson() {
		BaseDTO dto = new SetOutCityDTO("0", null, Arrays.asList(
				new SetOutCity(484, "义乌市"), new SetOutCity(101, "宁波")));
		return dto2Json(dto);
	}

	static class SetOutCityDTO extends BaseDTO {
		public List<SetOutCity> Data;

		public SetOutCityDTO(String Code, String Msg, List<SetOutCity> Data) {
			super(Code, Msg);
			this.Data = Data;
		}
	}

	static class SetOutCity {
		public int CITY_ID;
		public String CITY_NAME;

		public SetOutCity(int CITY_ID, String CITY_NAME) {
			this.CITY_ID = CITY_ID;
			this.CITY_NAME = CITY_NAME;
		}
	}

	public static String searchJson() {
		BaseDTO dto = new SearchDTO("0", null, new SearchData(new TourDays(5),
				Arrays.asList(new MapData(2, "经济"), new MapData(4, "高端")),
				Arrays.asList(new MapData(6, "新品"), new MapData(15, "美食"))));
		return dto2Json(dto);
	}

	static class SearchDTO extends BaseDTO {
		public SearchData Data;

		public SearchDTO(String Code, String Msg, SearchData Data) {
			super(Code, Msg);
			this.Data = Data;
		}
	}

	static class SearchData {
		public TourDays TourDays;
		public List<MapData> Tag01;
		public List<MapData> Tag02;

		public SearchData(TourDays TourDays, List<MapData> Tag01,
				List<MapData> Tag02) {
			this.TourDays = TourDays;
			this.Tag01 = Tag01;
			this.Tag02 = Tag02;
		}
	}

	static class TourDays {
		public int Days;

		public TourDays(int Days) {
			this.Days = Days;
		}
	}

	static class MapData {
		public int Key;
		public String Value;

		public MapData(int Key, String Value) {
			this.Key = Key;
			this.Value = Value;
		}
	}

	public static String lineJson() {
		BaseDTO dto = new LineDTO(
				"0",
				null,
				0,
				0,
				Arrays.asList(
						new LineData(
								3380554,
								128978,
								"http://upload.boktour.com/bk_resources/2277/s/20170331115001115_s.jpg",
								"三亚",
								"【三亚机场~三亚湾、接机/送机】丰田花冠/现代/别克凯越车（普通5座）车",
								"待定,请电询",
								"待定,请电询",
								1,
								"05-16、05-17、05-18、05-19、05-20、05-21、05-22、05-23、05-24、05-25",
								110, 0, 80, 0),
						new LineData(
								3380462,
								128980,
								"http://upload.boktour.com/bk_resources/2277/s/20170331115001115_s.jpg",
								"三亚",
								"【三亚机场~三亚市区、接机/送机】丰田花冠/现代/别克凯越车（普通5座）车",
								"待定,请电询",
								"待定,请电询",
								1,
								"05-16、05-16、05-17、05-18、05-19、05-20、05-20、05-21、05-22、05-23",
								120, 0, 80, 0)));
		return dto2Json(dto);
	}

	static class LineDTO extends BaseDTO {
		public int RecordCount;
		public int PageCount;
		public List<LineData> Data;

		public LineDTO(String Code, String Msg, int RecordCount, int PageCount,
				List<LineData> Data) {
			super(Code, Msg);
			this.RecordCount = RecordCount;
			this.PageCount = PageCount;
			this.Data = Data;
		}
	}

	static class LineData {
		public int ListId;
		public int LineNo;
		public String Pic;
		public String SetOutCity;
		public String LineName;
		public String Traffic01;
		public String Traffic02;
		public int TourDays;
		public String DateList;
		public int Price01;
		public int Price02;
		public int JSPrice01;
		public int JSPrice02;

		public LineData(int ListId, int LineNo, String Pic, String SetOutCity,
				String LineName, String Traffic01, String Traffic02,
				int TourDays, String DateList, int Price01, int Price02,
				int JSPrice01, int JSPrice02) {
			this.ListId = ListId;
			this.LineNo = LineNo;
			this.Pic = Pic;
			this.SetOutCity = SetOutCity;
			this.LineName = LineName;
			this.Traffic01 = Traffic01;
			this.Traffic02 = Traffic02;
			this.TourDays = TourDays;
			this.DateList = DateList;
			this.Price01 = Price01;
			this.Price02 = Price02;
			this.JSPrice01 = JSPrice01;
			this.JSPrice02 = JSPrice02;
		}
	}

	public static String lineDetailJson() {
		LineDetailData lineDetailData = new LineDetailData(
				"129538",
				new Date("2017-04-27"),
				new Date("2017-05-31"),
				1,
				"海南专线",
				"海口/三亚特惠游",
				"经济",
				"美食",
				"杭州",
				"海口市",
				1,
				5,
				"◆海南一价全包◆海口●【魅力海景】（■一价全包■升级1晚五星规模龙沐湾福安温泉酒店海景房+三亚近海海景房+2晚海口品质酒店■赠送：骏达车技+沙滩篝火派对■分界洲岛+大小洞天+天涯海角+三亚千古情等） ",
				"杭州/海口市 HU7062 10：50/13：40 直飞",
				"海口市/杭州 HU7061 07：15/09：45 直飞",
				"李斌18768107878",
				"由出发机场的送机人统一告知",
				"",
				"举客人名字接机",
				"提前2小时到达杭州萧山机场国内出发厅9号门",
				"http://upload.boktour.com/bk_resources/5399/s/20150117050958572_s.jpg",
				"05-17、05-20、05-21、05-22、05-23、05-26、05-27、05-28、05-30、05-31",
				"[r]  收客注意事项：\r\n● 行程特色：绝不增加行程外购物店以及不推荐自费项目（三亚千古情表演除外！）\r\n● 玩在海边：5A分界洲岛+5A大小洞天+4A天涯海角等\r\n● 特色餐安排：大小洞天道家养生餐、海南传统黎家宴。\r\n1.单拨人数在15人以下（不含15人）免收同车费；单拨人数在15—20人（含20人）加收100元；单拨21人起建议独立成团，费用另议；65岁（含65岁）以上老人加100元/人老人费；\r\n2.1.2米以上18周岁以下小孩若按成人操作需在成人价格上另加200元/人； \r\n3.若8人以下成人散客不成团，我社将安排司机兼导游或升级行程标准来接待。 \r\n◆此行程均不退一切费用，成人不占床不退房差，切勿擅自减掉全额房差！！！如擅自退款的，我社将不承担责任。◆ [/r]",
				"[r]  收客注意事项：\r\n● 行程特色：绝不增加行程外购物店以及不推荐自费项目（三亚千古情表演除外！）\r\n● 玩在海边：5A分界洲岛+5A大小洞天+4A天涯海角等\r\n● 特色餐安排：大小洞天道家养生餐、海南传统黎家宴。\r\n1.单拨人数在15人以下（不含15人）免收同车费；单拨人数在15—20人（含20人）加收100元；单拨21人起建议独立成团，费用另议；65岁（含65岁）以上老人加100元/人老人费；\r\n2.1.2米以上18周岁以下小孩若按成人操作需在成人价格上另加200元/人； \r\n3.若8人以下成人散客不成团，我社将安排司机兼导游或升级行程标准来接待。 \r\n◆此行程均不退一切费用，成人不占床不退房差，切勿擅自减掉全额房差！！！如擅自退款的，我社将不承担责任。◆ [/r]",
				"★未成年旅游者预订提示：18岁以下（含18岁）如无家长陪同出游的客人，签合同时需监护人在场签订。 \r\n★病患者、孕妇及行动不便者预订提示： \r\n为了确保旅游顺利出行，防止旅途中发生人身意外伤害事故，请旅游者在出行前做一次必要的身体检查，如存在下列情况，请遵医嘱：（1）传染性疾病患者，如传染性肝炎、活动期肺结核、伤寒等传染病人；（2）心血管疾病患者，如严重高血压、心功能不全、心肌缺氧、心肌梗塞等病人；（3）脑血管疾病患者，如脑栓塞、脑出血、脑肿瘤等病人；（4）呼吸系统疾病患者，如肺气肿、肺心病等病人；（5）精神病患者，如癫痫及各种精神病人；（6）严重贫血病患者，如血红蛋白量水平在50克/升以下的病人；（7）大中型手术的恢复期病患者；（8）孕妇及行动不便者。 \r\n★老年旅游者预订提示：60岁以上（含60岁）老人上岛需签署免责协议，故如您受年龄限制而不能上岛费用不退（因整团报价景点门票费用不去不退。）70周岁以上老年人预订出游，须与组团社签订《健康证明》并有家属或朋友陪同方可出游，因服务能力所限，无法接待80周岁以上的旅游者报名出游，敬请谅解。",
				"自费项目参考表：千古情演出280元/人(以上为海南其它精彩自费项目参考价格，执行价格请以运营商公布为准) 旅游者如需新增购物或参加另行付费的旅游项目，需和地接社协商一致并在海南当地补签相关自愿合同或证明，敬请广大游客理性消费。",
				"[b] 请仔细阅读本条注意事项：[/b] \r\n[r]1.团队机票出票时限为出团前7天属团队特价优惠票，出票后不得取消、更改或签转，退票只退税。若机票为包机公司的则不接受航班延误及病退申请，请务必仔细核对客人名单再按时出票并将此信息告知客人[/r]。若因游客提供的资料有误，登机时没带报名时的相关证件或没按规定时间到达机场集合，导致的误机或海南地接无法接待等责任的，均由游客自行承担相应的费用与责任；\r\n[r]2.请携带有效证件登机，2周岁以下携带出生证明或户口本原件，2-16周岁携带户口本原件，16周岁以上携带身份证；[/r]\r\n3.因订单时间不同特别是旺季时间，机票与地接会有价格涨幅实属正常现象，请告知客人不能于其他客人相比较。 \r\n4.请交代游客因海南经济情况无法与沿海大城市相比，因此散客拼团中吃、住、行标准也相对较低； \r\n5.海南部分景区及酒店为方便游客，有自设旅游购物商场及特产购物等情况，实不属进店，敬请告知游客并提醒谨慎购买；\r\n[g]6.游客因自身原因需中途离团，需补离团费200元/人/天。未产生的一切费用不退，并与地接接团导游签署书面《离团申请书》，经地接社确认后方可离团。若客人在未提出离团申请情况下私自离团，地接社有权向客人报名的组团社说明情况，双方同意解除旅游合同，以上所有情况费用不退，自行承担人生安全； [/g]\r\n7.如遇天气、景区政策性调整及政府会议接待等原因不能正常游览的景点和餐宿，导游可与客人协商调整行程或旅行社按成本退还给游客；因人力不可抗拒造成的行程延误或变更增加的费用由客人自理； \r\n[r]8.凡持有军官证、老年证、导游证、学生证、记者证等证件客人不享受此团任何优惠(网络购票均不能使用，若客人自愿放弃任何景点或餐食住宿一切费用不退；[/r]\r\n9.游客在海南自行填写的《游客意见书》为衡量游客参与该团旅游满意度、投诉诉求的主要依据，请认真填写。配合导游如实填写当地意见单，不填或虚填者归来后投诉将无法受理。如在行程中对旅行社的服务及接待标准有异议，请在旅游目的地当地拨打免费质量监督。 \r\n提醒：旅游投诉时效为返回出发地起30天内有效。",
				"1. 海南气候炎热，紫外线照射强烈，雨水充沛，请带好必备的防晒用品、太阳镜、太阳帽及雨伞。同时配备清热、解毒的药或冲剂。请自备拖鞋、泳衣、泳裤等。海南饮食口味清淡，口味较重的旅客可自备酱菜。 \r\n2.夜间或自由活动期间宜结伴同行并告之导游，记好导游电话备用。注意安全，保管好个人财物，贵重物品请放置酒店保险箱保管或到酒店前台免费寄存。",
				"1.【交通】含往返机票、机场建设税、燃油费。出发航班时间以机票显示时间为准；团队机票不得改签、更改或退票。海南旅游用车为2010年投入使用的高一级空调旅游车（接、送机为普通车型），车型根据此团游客人数而定，保证每人正座车座。\r\n2.【景点】含景点第一门票，以下景区电瓶车及缆车不含，游客可自由选择乘坐或徒步，不影响正常的游览：（大小洞天电瓶车20元、天涯海角电瓶车15元）。\r\n3.【用餐】全程含6正4早。正餐标准不低于20元/人/餐，安排十菜一汤，十人一桌。（如因客人原因放弃用餐，费用不退。）特色餐安排：大小洞天道家养生餐、海南传统黎家宴。\r\n4.【酒店】全程不提供自然单间，如产生单男单女需补房差[r]300元/4晚[/r]由客人自理；\r\n★海口备选酒店：自游岛、华侨大厦、腾鹏酒店、南海商务酒店（骏怡连锁）、富鹏酒店、绿之南长源酒店；\r\n★龙沐湾备选酒店：龙沐湾福安温泉海景酒店；\r\n★三亚备选酒店：二月海酒店、银苑临海主题酒店、春天假日酒店、果喜大酒店、鑫兴花园酒店、粟海温泉酒店；\r\n【海南酒店多为旅游度假酒店，标准较内地偏低；酒店房型为标准双人间，无三人间；如遇旺季酒店房满或政府征收等情形，旅行社会升级至不低于以上所列酒店标准的同类型酒店】\r\n5.【儿童】2岁以上1.2米以下儿童只含半价餐+车位（不含早餐），超高及其它费用自理。\r\n6.【导游】持证导游讲解服务；如8位以下成人散客不成团，由司机兼导游服务；\r\n7.【保险】已购买《旅行社责任险》，确保游客安全保障。建议游客提前自行购买旅游人身意外险。\r\n [r]【注意】：如有含各地至杭州萧山机场往返接送车的游客，请提前两天确认好，提前一天安排不了接送。送机上车时间以接送师傅通知为准(请准时上车,过时不候)！接机时，客人出了安检口后，可能会出现等候情况(最长等候时间不超过90分钟),敬请谅解！如需取消接送车服务，需出发前2天通知，否则车费全损，不予退款。 [/r] \r\n\r\n",
				"1.自由活动期间交通费和餐费；\r\n2.全程入住酒店产生的单房差及加床费用；\r\n3.旅游意外保险及航空保险（建议旅游者购买）；\r\n4.因交通延误、取消等意外事件或不可抗力原因导致的额外费用；\r\n5.儿童报价以外产生的其他费用需游客自理；\r\n6.因旅游者违约、自身过错、自身疾病等自身原因导致的人身财产损失而额外支付的费用；\r\n7.不占床位游客不含早餐。\r\n8.“旅游费用包含”内容以外的所有费用；\r\n",
				"购物随客意（部分景区或酒店内设有购物场所，属于其自行商业行为）。\r\n [r]提示：\r\n1.部分景区、酒店内设有购物场所，属于自行商业行为，实不属进店，敬请告知游客并提醒谨慎购买；\r\n2.若客人要求购物、参加夜间项目，我们将依照旅游法相关规定，提供相应的便利服务。[/r]",
				"赠送：骏达车技+沙滩篝火派对以及每人每天1瓶矿泉水（赠送费用不享用，费用不退）",
				"2岁以上-12岁以下儿童含往返机票、旅游车位费及半价儿童餐，不含超高门票和床位费以及早餐。其他按照儿童正常操作，超出费用自理。",
				new Date("2017-05-16"),
				1850,
				1670,
				1550,
				1370,
				300,
				"杭州萧山国际机场",
				"杭州萧山国际机场",
				0,
				8,
				Arrays.asList(
						new TripDateData(
								1,
								"乘机抵达“国际旅游岛”，接机员已提前在此恭候您到来，随后前往下榻酒店，沿途您可欣赏到椰城-海口美丽的景色。\r\n\r\n[g]今日温馨提醒：1、接机人员一般都会提前在机场等候客人（海口机场接机人员电话：\r\n17789797323，18889770911\r\n），请您下飞机后务必及时开机，保持手机畅通。接机为滚动接机，会接临近时间段的游客，您抵达机场后需要稍作等待（一般40分钟左右），请您谅解。\r\n2、每个人的航班到达时间有所差异，到达酒店后请自行到前台办理入住手续，如有疑问可咨询酒店前台，酒店一般入住时间为15点之后，如您到达较早，可将行李寄存在前台，在酒店周边逛逛稍作等待。\r\n3、第一天到海口请勿食用过多热带水果及大量海鲜，以防肠胃不适，影响您的行程哦！[/g]",
								"海口酒店", "早餐", "中餐", "晚餐"),
						new TripDateData(
								2,
								"① 灵秀美人岛[b]【分界洲岛】[/b]，国家首个岛屿型5A景区，岛上辟有“鬼斧神工”、“大洞天”、“剌桐花艳”等20多处自然景观，秀丽的风景、柔软的海滩、清澈蔚蓝的海水，椰树婆娑（含过渡及游览不少于150分钟）。\r\n② 以“玫瑰、浪漫、爱“为主题 亚洲规模最大的玫瑰花海[b]【亚龙湾玫瑰谷】[/b]，奔赴一场极致浪漫的玫瑰之约（游览不少于60分钟）！\r\n③ 安排欣赏[b]【骏达车技表演】[/b]，由欧洲五国顶尖车手联手打造，一场国际顶级，惊险刺激，挑战极限的超高品位汽车特技（汽车和摩托车）表演，一起感受速度与激情（欣赏不少于70分钟）。\r\n\r\n[g]提示： \r\n1.【分界洲岛】该景点可自费参加潜水及海上项目活动，需参加者请提前与导游沟通好并带上游泳装备；旺季期间排队上岛时间较长，该岛60岁以上（含60岁）及行动不便的游客、孕妇，需填写景区免责声明方可登船上岛，70岁以上老人谢绝上岛； [/g]",
								"三亚酒店", "早餐", "中餐", "晚餐")

				), true);
		BaseDTO dto = new LineDetailDTO("0", null, lineDetailData);
		return dto2Json(dto);
	}

	static class LineDetailDTO extends BaseDTO {
		public LineDetailData Data;

		public LineDetailDTO(String Code, String Msg, LineDetailData Data) {
			super(Code, Msg);
			this.Data = Data;
		}
	}

	static class LineDetailData {
		public String LineNo;
		public Date STARTTOURDATE;
		public Date LASTTOURDATE;
		public int COMPANY_ID;
		public String C_LINETYPE_ID;
		public String C_SUBTYPE_ID;
		public String C_LINETAG;
		public String C_LINETAG_02;
		public String C_SETOUTCITY;
		public String C_INTENTCITY;
		public int CLOSEDAYS;
		public int TOURDAYS;
		public String LINENAME;
		public String TRAFFIC_01;
		public String TRAFFIC_02;
		public String CORPS_MAN;
		public String CORPS_TAG;
		public String MEET_MAN;
		public String MEET_TAG;
		public String MUSTER_ADDR;
		public String PIC;
		public String TOURDATE_LIST;
		public String QIJIA;
		public String LINE_CHARA;
		public String SERVICES;
		public String ITEM;
		public String PROCEEDING_01;
		public String PROCEEDING_02;
		public String PRICEBH_01;
		public String PRICEBH_02;
		public String SHOP;
		public String ZSONG;
		public String ERTONG;
		public Date C_TOURDATE;
		public int MS_PRICE_01;
		public int MS_PRICE_02;
		public int JS_PRICE_01;
		public int JS_PRICE_02;
		public int SingleRoomPrice;
		public String C_Station01;
		public String C_Station02;
		public int DateStatusCode;
		public int DateNumber;
		public List<TripDateData> TRIPDATE;
		public boolean TripDetail;

		public LineDetailData(String lineNo, Date sTARTTOURDATE,
				Date lASTTOURDATE, int cOMPANY_ID, String c_LINETYPE_ID,
				String c_SUBTYPE_ID, String c_LINETAG, String c_LINETAG_02,
				String c_SETOUTCITY, String c_INTENTCITY, int cLOSEDAYS,
				int tOURDAYS, String lINENAME, String tRAFFIC_01,
				String tRAFFIC_02, String cORPS_MAN, String cORPS_TAG,
				String mEET_MAN, String mEET_TAG, String mUSTER_ADDR,
				String pIC, String tOURDATE_LIST, String qIJIA,
				String lINE_CHARA, String sERVICES, String iTEM,
				String pROCEEDING_01, String pROCEEDING_02, String pRICEBH_01,
				String pRICEBH_02, String sHOP, String zSONG, String eRTONG,
				Date c_TOURDATE, int mS_PRICE_01, int mS_PRICE_02,
				int jS_PRICE_01, int jS_PRICE_02, int singleRoomPrice,
				String c_Station01, String c_Station02, int dateStatusCode,
				int dateNumber, List<TripDateData> tRIPDATE, boolean tripDetail) {
			super();
			this.LineNo = lineNo;
			this.STARTTOURDATE = sTARTTOURDATE;
			this.LASTTOURDATE = lASTTOURDATE;
			this.COMPANY_ID = cOMPANY_ID;
			this.C_LINETYPE_ID = c_LINETYPE_ID;
			this.C_SUBTYPE_ID = c_SUBTYPE_ID;
			this.C_LINETAG = c_LINETAG;
			this.C_LINETAG_02 = c_LINETAG_02;
			this.C_SETOUTCITY = c_SETOUTCITY;
			this.C_INTENTCITY = c_INTENTCITY;
			this.CLOSEDAYS = cLOSEDAYS;
			this.TOURDAYS = tOURDAYS;
			this.LINENAME = lINENAME;
			this.TRAFFIC_01 = tRAFFIC_01;
			this.TRAFFIC_02 = tRAFFIC_02;
			this.CORPS_MAN = cORPS_MAN;
			this.CORPS_TAG = cORPS_TAG;
			this.MEET_MAN = mEET_MAN;
			this.MEET_TAG = mEET_TAG;
			this.MUSTER_ADDR = mUSTER_ADDR;
			this.PIC = pIC;
			this.TOURDATE_LIST = tOURDATE_LIST;
			this.QIJIA = qIJIA;
			this.LINE_CHARA = lINE_CHARA;
			this.SERVICES = sERVICES;
			this.ITEM = iTEM;
			this.PROCEEDING_01 = pROCEEDING_01;
			this.PROCEEDING_02 = pROCEEDING_02;
			this.PRICEBH_01 = pRICEBH_01;
			this.PRICEBH_02 = pRICEBH_02;
			this.SHOP = sHOP;
			this.ZSONG = zSONG;
			this.ERTONG = eRTONG;
			this.C_TOURDATE = c_TOURDATE;
			this.MS_PRICE_01 = mS_PRICE_01;
			this.MS_PRICE_02 = mS_PRICE_02;
			this.JS_PRICE_01 = jS_PRICE_01;
			this.JS_PRICE_02 = jS_PRICE_02;
			this.SingleRoomPrice = singleRoomPrice;
			this.C_Station01 = c_Station01;
			this.C_Station02 = c_Station02;
			this.DateStatusCode = dateStatusCode;
			this.DateNumber = dateNumber;
			this.TRIPDATE = tRIPDATE;
			this.TripDetail = tripDetail;
		}
	}

	static class TripDateData {
		public int DAYS;
		public String JOURNEY;
		public String HOTEL;
		public String Eat01;
		public String Eat02;
		public String Eat03;

		public TripDateData(int dAYS, String jOURNEY, String hOTEL,
				String eat01, String eat02, String eat03) {
			super();
			this.DAYS = dAYS;
			this.JOURNEY = jOURNEY;
			this.HOTEL = hOTEL;
			this.Eat01 = eat01;
			this.Eat02 = eat02;
			this.Eat03 = eat03;
		}
	}

	public static String linePlanListJson() {
		BaseDTO dto = new LinePlanListDTO("0", null, Arrays.asList(
				new LinePlanData(3396510, new Date("2017-05-20"), "周六", 1490,
						1440, 1290, 1240, 0, 8), new LinePlanData(3396513,
						new Date("2017-06-18"), "周日", 1640, 1460, 1440, 1260,
						0, 6)));
		return dto2Json(dto);
	}

	static class LinePlanListDTO extends BaseDTO {
		public List<LinePlanData> Data;

		public LinePlanListDTO(String Code, String Msg, List<LinePlanData> Data) {
			super(Code, Msg);
			this.Data = Data;
		}
	}

	static class LinePlanData {
		public int ListId;
		public Date TourDate;
		public String Week;
		public int Price01;
		public int Price02;
		public int JsPrice01;
		public int JsPrice02;
		public int DateStatusCode;
		public int DateNumber;

		public LinePlanData(int listId, Date tourDate, String week,
				int price01, int price02, int jsPrice01, int jsPrice02,
				int dateStatusCode, int dateNumber) {
			super();
			ListId = listId;
			TourDate = tourDate;
			Week = week;
			Price01 = price01;
			Price02 = price02;
			JsPrice01 = jsPrice01;
			JsPrice02 = jsPrice02;
			DateStatusCode = dateStatusCode;
			DateNumber = dateNumber;
		}

	}

	public static String tripDetailJson() {
		TripDetailData tdd1 = new TripDetailData(
				1,
				"义乌<img src=\"http://develop.boktour.com/images/t-plane.gif\">海口",
				"不含",
				"不含",
				"不含",
				"海口酒店",
				Arrays.asList(new DateInfoData(
						"",
						"乘机抵达“国际旅游岛”，接机员已提前在此恭候您到来，随后前往下榻酒店，沿途您可欣赏到椰城-海口美丽的景色。\n&nbsp;",
						Arrays.asList(
								new InfoPicData(
										new InfoPicPicData(
												"三亚",
												"http://upload.boktour.com/bk_resources/1/20151113023223156.jpg",
												"http://upload.boktour.com/bk_resources/1/s/20151113023223156_s.jpg",
												0)),
								new InfoPicData(
										new InfoPicPicData(
												"三亚",
												"http://upload.boktour.com/bk_resources/1/20151113023205045.jpg",
												"http://upload.boktour.com/bk_resources/1/s/20151113023205045_s.jpg",
												0)),
								new InfoPicData(
										new InfoPicPicData(
												"三亚",
												"http://upload.boktour.com/bk_resources/1/20151113023146808.jpg",
												"http://upload.boktour.com/bk_resources/1/s/20151113023146808_s.jpg",
												0))),
						Arrays.asList(
								new InfoRemarkData(
										"温馨提示",
										"<font color=\"#00cc00\"><b>1、接机人员一般都会提前在机场等候客人（海口机场接送机电话：17789797323，18889770911），请您下飞机后务必及时开机，保持手机畅通。接机为滚动接机，会接临近时间段的游客，您抵达机场后需要稍作等待（一般40分钟左右），请您谅解。&nbsp;<br>2、每个人的航班到达时间有所差异，到达酒店后请自行到前台办理入住手续，如有疑问可咨询酒店前台，酒店一般入住时间为15点之后，如您到达较早，可将行李寄存在前台，在酒店周边逛逛稍作等待。&nbsp;</b></font>&nbsp;"),
								new InfoRemarkData(
										"特别说明",
										"&nbsp;<font color=\"#00cc00\"><b>3、第一天到海口请勿食用过多热带水果及大量海鲜，以防肠胃不适，影响您的行程哦！</b></font>&nbsp; &nbsp;")),
						Arrays.asList(new InfoShopData("购物点1", "主营产品", "60分钟"),
								new InfoShopData("购物点2", "主营产品", "30分钟")))));

		TripDetailData tdd2 = new TripDetailData(
				2,
				"海口<img src=\"http://develop.boktour.com/images/t-bus.gif\">三亚",
				"含",
				"含",
				"含",
				"三亚酒店",
				Arrays.asList(new DateInfoData(
						"",
						"① 灵秀美人岛<b><font color=\"#cc0000\">【分界洲岛】</font></b>，国家首个岛屿型5A景区，岛上辟有“鬼斧神工”、“大洞天”、“剌桐花艳”等20多处自然景观，秀丽的风景、柔软的海滩、清澈蔚蓝的海水，椰树婆娑（含过渡及游览不少于150分钟）。\n<br>② 以“玫瑰、浪漫、爱“为主题 亚洲规模最大的玫瑰花海<b><font color=\"#cc0000\">【亚龙湾玫瑰谷】</font></b>，奔赴一场极致浪漫的玫瑰之约（游览不少于60分钟）！\n<br>③ 安排欣赏<b><font color=\"#cc0000\">【骏达车技表演】</font></b>，由欧洲五国顶尖车手联手打造，一场国际顶级，惊险刺激，挑战极限的超高品位汽车特技（汽车和摩托车）表演，一起感受速度与激情（欣赏不少于70分钟）。\n",
						Arrays.asList(
								new InfoPicData(new InfoPicPicData("分界洲岛",
										"bk_resources/1/20121221101026.jpg",
										"", 0)),
								new InfoPicData(
										new InfoPicPicData(
												"亚龙湾玫瑰谷",
												"bk_resources/1/20150420032214421.png",
												"bk_resources/1/s/20150420032214421_s.png",
												0)),
								new InfoPicData(new InfoPicPicData("分界洲岛",
										"bk_resources/1/20121221101005.jpg",
										"", 0))),
						Arrays.asList(new InfoRemarkData(
								"温馨提示",
								"<font color=\"#00cc00\"><b>【分界洲岛】该景点可自费参加潜水及海上项目活动，需参加者请提前与导游沟通好并带上游泳装备；旺季期间排队上岛时间较长，该岛60岁以上（含60岁）及行动不便的游客、孕妇，需填写景区免责声明方可登船上岛，70岁以上老人谢绝上岛；&nbsp;</b></font>&nbsp;&nbsp;&nbsp;")),
						new ArrayList<InfoShopData>())));

		BaseDTO dto = new TripDetailDTO("0", null, 0, 0, Arrays.asList(tdd1,
				tdd2));
		return dto2Json(dto);
	}

	static class TripDetailDTO extends BaseDTO {
		public int RecordCount;
		public int PageCount;
		public List<TripDetailData> Data;

		public TripDetailDTO(String Code, String Msg, int RecordCount,
				int PageCount, List<TripDetailData> Data) {
			super(Code, Msg);
			this.RecordCount = RecordCount;
			this.PageCount = PageCount;
			this.Data = Data;
		}
	}

	static class TripDetailData {
		public int ARRAY;
		public String INFO;
		public String MEAL01;
		public String MEAL02;
		public String MEAL03;
		public String HOTEL;
		public List<DateInfoData> DATE_INFO;

		public TripDetailData(int aRRAY, String iNFO, String mEAL01,
				String mEAL02, String mEAL03, String hOTEL,
				List<DateInfoData> dATE_INFO) {
			super();
			ARRAY = aRRAY;
			INFO = iNFO;
			MEAL01 = mEAL01;
			MEAL02 = mEAL02;
			MEAL03 = mEAL03;
			HOTEL = hOTEL;
			DATE_INFO = dATE_INFO;
		}

	}

	static class DateInfoData {
		public String TIME;
		public String INFO;
		public List<InfoPicData> INFO_PIC;
		public List<InfoRemarkData> INFO_REMARK;
		public List<InfoShopData> INFO_SHOP;

		public DateInfoData(String tIME, String iNFO,
				List<InfoPicData> iNFO_PIC, List<InfoRemarkData> iNFO_REMARK,
				List<InfoShopData> iNFO_SHOP) {
			super();
			TIME = tIME;
			INFO = iNFO;
			INFO_PIC = iNFO_PIC;
			INFO_REMARK = iNFO_REMARK;
			INFO_SHOP = iNFO_SHOP;
		}
	}

	static class InfoPicData {
		public InfoPicPicData PIC;

		public InfoPicData(InfoPicPicData pIC) {
			super();
			PIC = pIC;
		}
	}

	static class InfoPicPicData {
		public String PIC_NAME;
		public String URL;
		public String URL_S;
		private int count;

		public InfoPicPicData(String pIC_NAME, String uRL, String uRL_S,
				int count) {
			super();
			PIC_NAME = pIC_NAME;
			URL = uRL;
			URL_S = uRL_S;
			this.count = count;
		}
	}

	static class InfoRemarkData {
		public String TITLE;
		public String REMARK;

		public InfoRemarkData(String tITLE, String rEMARK) {
			super();
			TITLE = tITLE;
			REMARK = rEMARK;
		}
	}

	static class InfoShopData {
		public String NAME;
		public String PRODUCT;
		public String STOPTIME;

		public InfoShopData(String nAME, String pRODUCT, String sTOPTIME) {
			super();
			NAME = nAME;
			PRODUCT = pRODUCT;
			STOPTIME = sTOPTIME;
		}
	}

	public static String linePicJson() {
		BaseDTO dto = new LinePicDTO(
				"0",
				null,
				Arrays.asList(
						new LinePicData(
								"http://upload.boktour.com/bk_resources/2277/20120529030012.jpg"),
						new LinePicData(
								"http://upload.boktour.com/bk_resources/1/20121218092930.jpg"),
						new LinePicData(
								"http://upload.boktour.com/bk_resources/8819/20130411103242.jpg")));
		return dto2Json(dto);
	}

	static class LinePicDTO extends BaseDTO {
		public List<LinePicData> Data;

		public LinePicDTO(String Code, String Msg, List<LinePicData> Data) {
			super(Code, Msg);
			this.Data = Data;
		}
	}

	static class LinePicData {
		public String Pic;

		public LinePicData(String pic) {
			super();
			Pic = pic;
		}
	}

}
