
package rentcarmanagerment.model;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import rentcarmanagerment.model.user.Employee;

/**
 *
 * @author Tran Phuc
 */

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Contract {

    private int id;
    
    private Date sd;
    
    private Date ed;
    
//  trạng thái kích hoạt giao dịch
    private boolean isActivate;
    
//  tiền cọc
    private double deposit;
    
//  giá thuê trên hợp đồng cho một ngày, bằng 0 khi khách hủy giao dịch
    private double price_per_day;
    
    private Car car;
    
    private Employee employee;
    
    private Customer customer;
    
    private Bill bill;
    
//  tổng doanh thu từ hợp đồng
//    private static double totalCost = deposit + (sd.getDate() - ed.getDate())*price_per_day;
}
