package rentcarmanagerment.model.user;

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
public class Manager extends User {

    private final String role = "MOD";
    
    private String name;

}
