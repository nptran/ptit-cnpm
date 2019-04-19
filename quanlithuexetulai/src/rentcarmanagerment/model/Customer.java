package rentcarmanagerment.model;

import java.io.Serializable;
import java.util.List;
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
public class Customer implements Serializable {

    private int id;
    
    private String name;
    
    private String gender;
    
    private String tel;
    
    private String email;
    
    private String address;
    
    private List<Contract> contracts;
    
}
