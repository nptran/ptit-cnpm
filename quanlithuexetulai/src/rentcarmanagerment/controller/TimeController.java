
package rentcarmanagerment.controller;

import java.util.Calendar;
import java.util.Date;
import lombok.NoArgsConstructor;

/**
 *
 * @author Tran Phuc
 */
@NoArgsConstructor
public class TimeController {
    
    public static Date generateTime(int month, int year) {
        Calendar calendar = Calendar.getInstance();
        calendar.clear();
        calendar.set(Calendar.MONTH, month);
        calendar.set(Calendar.YEAR, year);
        Date date = calendar.getTime();
        
        return date;
    } 

}
