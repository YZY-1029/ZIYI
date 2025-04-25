package case03;

import java.util.ArrayList;
import java.util.List;

public class GuestbookMain {
	
	private static List<Guestbook> guestbooks = new ArrayList<>();
	
	public static void main(String[] args) {
		//留言
		Guestbook g1 = new Guestbook("Hello 大家好");
		guestbooks.add(g1); // 存入留言
		System.out.println(guestbooks);
		Guestbook g2 = new Guestbook("好像塊嚇死ㄌ");
		guestbooks.add(g2); // 存入留言
		System.out.println(guestbooks);
		
	}
	
	
}
