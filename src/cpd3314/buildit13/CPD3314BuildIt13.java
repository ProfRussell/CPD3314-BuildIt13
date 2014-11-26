/*
 * Copyright 2014 Len Payne <len.payne@lambtoncollege.ca>.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package cpd3314.buildit13;

/**
 * The Controller for a Small Employee Record Tool.
 * @author Len Payne <len.payne@lambtoncollege.ca>
 */
public class CPD3314BuildIt13 {

    // Static References to an Employee Record and the Single ViewFrame
    private static Employee employee;
    private static EmployeeViewFrame evf;

    /**
     * Retrieves the employee stored in the Controller
     * @return - the Employee
     */
    public static Employee getEmployee() {
        return employee;
    }

    /**
     * Sets the employee stored in the Controller and updates the ViewFrame
     * @param employee - the Employee
     */
    public static void setEmployee(Employee employee) {
        CPD3314BuildIt13.employee = employee;
        evf.updateEmployee(employee);
    }
    
    /**
     * Makes the EmployeeViewFrame visible
     */
    public static void viewEmployee() {
        if (evf == null)
            evf = new EmployeeViewFrame(employee);
        evf.setVisible(true);
    }
    
    /**
     * Launches a new EmployeeEditFrame
     */
    public static void editEmployee() {
        new EmployeeEditFrame(employee).setVisible(true);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        employee = new Employee();
        viewEmployee();
    }

}
