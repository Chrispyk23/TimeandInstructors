package timeandinstructors;
import javax.swing.*;

public class TimeAndInstructors {
    public static void main(String[] args) {
        String[][] courses = new String[5][5];
        courses[0][0] = "CIS101";
        courses[0][1] = "Mon 9am";
        courses[0][2] = "Farrell";
        courses[1][0] = "CS220";
        courses[1][1] = "Mon 1pm";
        courses[1][2] = "Mithcell";
        courses[2][0] = "CIS 203";
        courses[2][1] = "Tues 11 am";
        courses[2][2] = "Donald";
        courses[3][0] = "CS 340";
        courses[3][1] = "Thurs 8 am";
        courses[3][2] = "Robinson";
        courses[4][0] = "MS125";
        courses[4][1] = "Weds 2 pm";
        courses[4][2] = "Williams";
        
        String entry, message = "Enter a course";
        int num, x;
        boolean isFound = false;
        while (!isFound)
        {
            entry = JOptionPane.showInputDialog(null,message);
            for(x = 0; x < courses.length; ++x)
                if(entry.equals(courses[x][0]))
                {
                    isFound = true;
                    JOptionPane.showMessageDialog(null, 
                      "Course;" + entry + "Time:" + courses[x][1] +
                              "Instructor:" + courses[x][2]);
                }
            if(!isFound)
                JOptionPane.showMessageDialog(null, "Sorry - no such course");
        }
    }
    
}
