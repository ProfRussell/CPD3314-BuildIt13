/*
 * Copyright 2014 Len Payne <len.payne@lambtoncollege.ca>.
 * Updated 2015 Mark Russell <mark.russell@lambtoncollege.ca>.
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
 * The Employee Data Model
 * @author Len Payne <len.payne@lambtoncollege.ca>
 */
public class Employee {

    // Instance Variables for Employee Data
    private String name;
    private String id;
    private String jobTitle;
    private String email;
    private String phone;
    private String gender;

    /**
     * Default No-Arg Constructor
     */
    public Employee() {
    }

    /**
     * Convenience Constructor to Set Everything
     * @param name - the Name
     * @param id - the ID
     * @param jobTitle - the Job Title
     * @param email - the E-Mail
     * @param phone - the Phone Number
     * @param gender - the Gender
     */
    public Employee(String name, String id, String jobTitle, String email, String phone, String gender) {
        this.name = name;
        this.id = id;
        this.jobTitle = jobTitle;
        this.email = email;
        this.phone = phone;
        this.gender = gender;
    }

    /**
     * Retrieves the Employee Name
     * @return - the Name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the Employee Name
     * @param name - the Name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Retrieves the Employee ID
     * @return - the ID
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the Employee ID
     * @param id - the ID
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Retrieves the Employee Job Title
     * @return - the Job Title
     */
    public String getJobTitle() {
        return jobTitle;
    }

    /**
     * Sets the Employee Job Title
     * @param jobTitle - the Job Title
     */
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    /**
     * Retrieves the Employee E-Mail
     * @return - the E-Mail
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the Employee E-Mail
     * @param email - the E-Mail
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Retrieves the Employee Phone Number
     * @return - the Phone Number
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Sets the Employee Phone Number
     * @param phone - the Phone Number
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * Retrieves the Employee Gender
     * @return - the Gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * Sets the Employee Gender
     * @param gender - the Gender
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

}
