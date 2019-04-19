
package rentcarmanagerment.model.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author Tran Phuc
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
       
    private final String role = "USER"; 
    
    private String username;
   
    private String password;

    private String name;
    
    private String address;
    
    private String email;
    
}
