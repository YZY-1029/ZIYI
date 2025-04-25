package case03;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;

public class PhonePlan {
	private Integer minutes; 
	private Integer internet;
	
	public Integer getminutes() {
		return minutes;
	}
	public Integer getIntternet() {
		return internet;
	}
	
	public PhonePlan(Integer minutes, Integer internet) {
		this.minutes = minutes;
		this.internet = internet;
	}
	//規則
	static class phoneRule {
		private String time;
		private Integer flow;
		private BiPredicate<Integer, Integer> plan;
		
		public phoneRule(String time, Integer flow, BiPredicate<Integer, Integer> plan) {
			this.time = time;
			this.flow = flow;
			this.plan = plan;
		}
		// 符合比對
		public boolean matches(Integer minutes,Integer internet) {
			return plan.test(minutes, internet);
		}
		public String getResult() {
			return time + ":$" + flow;
		}
	}
	 
	//所有規則清單
	private static final List<phoneRule> plan = new ArrayList<>();
	
	//初始化規則
	static {
		plan.add(new phoneRule("商務型",1499,(minutes, internet) -> minutes>1000|| internet>50));
		plan.add(new phoneRule("一般用戶型",660,(minutes, internet) -> minutes>500|| internet>10));
		plan.add(new phoneRule("長輩節省型",200,(minutes, internet) -> minutes<20|| internet<1));
	}
	//推薦方案
	public String getphoneRule() {
		return plan.stream().filter(plan -> plan.matches(minutes, internet))
							 .findFirst()
							 .map(phoneRule::getResult)
							 .orElse("無適合方案");
	}
		
	
	
	
	
	
}
