/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLClientInfoException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Course;
import model.Slot;

/**
 *
 * @author kharr
 */
public class SlotDBContext extends DBContext {

    public List<Slot> getAll() {
        List<Slot> list = new ArrayList<>();
        String sql = "SELECT [slot_id]\n"
                + "      ,[course_id]\n"
                + "      ,[time]\n"
                + "      ,[location]\n"
                + "  FROM [dbo].[Slots]";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                Slot s = new Slot();
                s.setId(rs.getInt("id"));
                s.setDate(rs.getDate("date"));
                s.setLocation(rs.getString("location"));
                
                Course c = new Course();
                c.setId(rs.getInt("id"));
                c.setCode(rs.getString(""));
                
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return list;
    }
    
    
}
