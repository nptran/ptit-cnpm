package rentcarmanagerment.model.user;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import rentcarmanagerment.model.Bill;

/**
 *
 * @author Tran Phuc
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee extends User {

    private final String role = "EMP";

    private List<Bill> bills;
    
    private String name;
    
    private String email;
    
}
