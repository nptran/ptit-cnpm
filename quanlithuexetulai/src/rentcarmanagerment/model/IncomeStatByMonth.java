package rentcarmanagerment.model;


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
public class IncomeStatByMonth extends Bill{
    
    //Thời gian thống kê(tháng hoặc ngày/tháng)
    private String time;
    
    private int numOfTransactions;
    
    private double revenueFromContract;
    
    private double sumCostIncurred;
    
    private double actualRevenue;
    
}