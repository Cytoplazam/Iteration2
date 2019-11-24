/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package income;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author CYTO
 */
public class CompanyShare {
    private BigDecimal SSS;
    private BigDecimal PI;
    private BigDecimal PH;
    
    public CompanyShare()
    {
        this.SSS = SSS;
        this.PI = PI;
        this.PH = PH;
    }
    
    /*public BigDecimal ComputeShare()
    {
        BigDecimal income;
        income = this.monthlySales;
        
        for(int i = 0; i < expenses.size(); i++)
            income = income.subtract(expenses.get(i).getTotalExpense());
        
        return income;
    }*/
}
