package cart.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDTO {
	// 對應 entity.Product 欄位資訊
	private Integer productId;
	private String productName;
	private Integer price;
	private Integer qty;
	private String imageBase64;
	// 自訂欄位 total (庫存成本: price * qty)
	private Integer total;
	
}
