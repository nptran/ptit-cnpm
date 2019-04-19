package rentcarmanagerment.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author Tran Phuc
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CostIncurred {

    private int id;
    
    private double amount;
    
    private String desc;
    
}
