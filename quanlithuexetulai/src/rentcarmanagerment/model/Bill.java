package rentcarmanagerment.model;

import java.util.Date;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Tran Phuc
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Bill {
    
    private String paymentType;
    
//  ngày xuất hóa đơn
    private Date date_payment;
    
//  tình trạng thanh toán
//    private boolean isPaid;
    
//  chú thích thêm nếu phát sinh phí ngoài dự kiến
    private String note;

//  phí phát sinh, tiền phạt
    private List<CostIncurred> costIncurred;
    
}