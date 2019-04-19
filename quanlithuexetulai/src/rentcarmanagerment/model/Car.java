
package rentcarmanagerment.model;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Tran Phuc
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Car {

    private Integer id;
    
    //biển số xe
    private String lincense;
    
    //nhãn hiệu
    private String brand;
    
    //số ghế
    private short capacity;
    
    //giá thuê
    private float price;
    
    //mô tả
    private String desc;
    
    //vị trí xe
    private String location;
    
    /**
     * @true xe đang rảnh
     * @false xe đang được thuê
     */
    private boolean status;
    
    private List<Contract> contracts;
    
}
