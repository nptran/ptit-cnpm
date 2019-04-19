
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
@AllArgsConstructor
@NoArgsConstructor
public class IncomeStat extends Bill {
    
    private int id;
    
    private Date sd;
    
    private Date ed;
    
    private double revenue;
    
}
