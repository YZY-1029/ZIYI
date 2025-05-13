package com.example.demo.config;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration  // 代表它是一個配置檔案
public class ChatConfig {
	
	@Bean  // 此物件是被 spring 管理, 其他城市可以透過 @Autowired (chatClient) 自動綁定來取得該物件(不需要 new)
	public ChatClient chatClient(ChatClient.Builder builder) {
		return builder.build();
	}
}
