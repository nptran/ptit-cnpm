package rentcarmanagerment.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import rentcarmanagerment.model.Contract;
import rentcarmanagerment.model.IncomeStatByMonth;

/**
 *
 * @author Tran Phuc
 */
public class StatByMonthDAO extends BaseDAO {

    private static List<Contract> transactions;

    public StatByMonthDAO() {
        try {
            getInstance();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public List<IncomeStatByMonth> getIncomeStat(String year, int sm, int em) throws SQLException {
        List<IncomeStatByMonth> listStat = new ArrayList<>();

        String billBetweenMonths = "SELECT \n"
                + "	month(date_payment) AS month, \n"
                + "	COUNT(id_contract_bill) AS NumberOfTransactions, \n"
                + "	SUM((price_per_day)*(dayofyear(endDate)-dayofyear(startDate)) + IF(price_per_day=0,deposit,0)) AS revenue_from_contract, \n"
                + "	SUM(incurred.amount) AS cost_incurred, \n"
                + "	(SUM((price_per_day)*(dayofyear(endDate)-dayofyear(startDate)) + IF(price_per_day=0,deposit,0)))+SUM(incurred.amount) AS actual_revenue\n"
                + "FROM rentcar.contract_bill, (SELECT id_bill_contract, SUM(amount) AS amount FROM rentcar.cost_incurred GROUP BY id_bill_contract) AS incurred\n"
                + "WHERE year(date_payment) = ? \n"
                + "AND month(date_payment) BETWEEN ? AND ?\n"
                + "AND rentcar.contract_bill.id_contract_bill = incurred.id_bill_contract\n"
                + "AND isActive = 1\n"
                + "GROUP BY month(date_payment)\n"
                + "ORDER BY month(date_payment)";
        PreparedStatement statement = con.prepareStatement(billBetweenMonths);
        statement.setString(1, year);
        statement.setInt(2, sm);
        statement.setInt(3, em);

        ResultSet rs = statement.executeQuery();
        IncomeStatByMonth i = null;
        while (rs.next()) {

            i = new IncomeStatByMonth();
            i.setTime(String.valueOf(rs.getInt(1)));
            i.setNumOfTransactions(rs.getInt(2));
            i.setRevenueFromContract(rs.getDouble(3));
            i.setSumCostIncurred(rs.getDouble(4));
            i.setActualRevenue(rs.getDouble(5));

            listStat.add(i);
        }

        return listStat;
    }

    public List<IncomeStatByMonth> getIncomeStatDetails(String year, int month) throws SQLException {
        List<IncomeStatByMonth> listStat = new ArrayList<>();

        String billInMonth = "SELECT \n"
                + "	date_format(date_payment, \"%d/%m\") AS month, \n"
                + "	COUNT(id_contract_bill) AS NumberOfTransactions, \n"
                + "	SUM((price_per_day)*(dayofyear(endDate)-dayofyear(startDate)) + IF(price_per_day=0,deposit,0)) AS revenue_from_contract, \n"
                + "	SUM(incurred.amount) AS cost_incurred, \n"
                + "	(SUM((price_per_day)*(dayofyear(endDate)-dayofyear(startDate)) + IF(price_per_day=0,deposit,0)))+SUM(incurred.amount) AS actual_revenue\n"
                + "FROM rentcar.contract_bill, (SELECT id_bill_contract, SUM(amount) AS amount FROM rentcar.cost_incurred GROUP BY id_bill_contract) AS incurred\n"
                + "WHERE year(date_payment) = ? \n"
                + "AND month(date_payment) = ?\n"
                + "AND rentcar.contract_bill.id_contract_bill = incurred.id_bill_contract\n"
                + "AND isActive = 1\n"
                + "GROUP BY date(date_payment)\n"
                + "ORDER BY date(date_payment)";
        PreparedStatement statement = con.prepareStatement(billInMonth);
        statement.setString(1, year);
        statement.setInt(2, month);

        ResultSet rs = statement.executeQuery();
        IncomeStatByMonth i = null;
        while (rs.next()) {
            i = new IncomeStatByMonth();
            i.setTime(rs.getString(1));
            i.setNumOfTransactions(rs.getInt(2));
            i.setRevenueFromContract(rs.getDouble(3));
            i.setSumCostIncurred(rs.getDouble(4));
            i.setActualRevenue(rs.getDouble(5));

            listStat.add(i);
        }

        return listStat;
    }

}
