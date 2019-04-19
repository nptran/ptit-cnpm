package rentcarmanagerment.model;

import java.util.Date;
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
    
    private int id;
    
    private String paymentType;
    
//  ngày xuất hóa đơn
    private Date date;
    
//  tình trạng thanh toán
    private boolean isPaid;
    
//  chú thích thêm nếu phát sinh phí ngoài dự kiến
    private String note;

//  phí phát sinh, tiền phạt
    private CostIncurred costIncurred;
    
}