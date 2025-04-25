package case04;

import java.security.MessageDigest;

public class SimolePasswordHash {
	
	// 產生雜湊(哈希)
	public static String hashPassword(String password) throws Exception{
		// 使用 SHA-256  雜湊演算法
		MessageDigest md = MessageDigest.getInstance("SHA-256");
		byte[] hashBytes = md.digest(password.getBytes());
		// 將 byte[] 轉成16進為字串
		StringBuilder sb = new StringBuilder();
		for(byte b : hashBytes) {
			sb.append(String.format("%02x", b));  // "02是只抓兩個"  "x是十六進位" "%代表你要格式化的東西"
		}
		return sb.toString();
		
	}
	
	public static void main(String[] args) throws Exception {
		String password = "1234";
		String hash = hashPassword(password);
		System.out.println(password);
		System.out.println(hash);

	}
	
}
