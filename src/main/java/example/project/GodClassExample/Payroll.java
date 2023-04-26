package example.project.GodClassExample;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Payroll {

    Map<String, PaySchedule> staffCategoryPaySchedule;

    public Payroll(Map<String, PaySchedule> staffCategoryPaySchedule) {
        this.staffCategoryPaySchedule = staffCategoryPaySchedule;
    }

    public PaySchedule getStaffCategoryPaySchedule(String staffCategory) {
        return staffCategoryPaySchedule.get(staffCategory);
    }

    public void setPayDay(String date, String staffCategory) {
        staffCategoryPaySchedule.put(staffCategory, new PaySchedule(date));
    }

    public String getPayDay(String staffCategory) {
        return getStaffCategoryPaySchedule(staffCategory).getPayDay();
    }

}
