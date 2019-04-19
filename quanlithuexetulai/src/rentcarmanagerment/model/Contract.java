
package rentcarmanagerment.model;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
    private float deposit;
    
//  giá thuê trên hợp đồng
    private float cost;
    
    private Bill bill;
    
}
