package nju.software.convoy.data.entity;

import java.util.Date;

public class Attendance {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column attendance.ID
     *
     * @mbg.generated Thu Jan 16 13:28:12 CST 2020
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column attendance.DATE
     *
     * @mbg.generated Thu Jan 16 13:28:12 CST 2020
     */
    private Date date;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column attendance.NUM
     *
     * @mbg.generated Thu Jan 16 13:28:12 CST 2020
     */
    private Integer num;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column attendance.DEPARTMENT
     *
     * @mbg.generated Thu Jan 16 13:28:12 CST 2020
     */
    private String department;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column attendance.ID
     *
     * @return the value of attendance.ID
     *
     * @mbg.generated Thu Jan 16 13:28:12 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column attendance.ID
     *
     * @param id the value for attendance.ID
     *
     * @mbg.generated Thu Jan 16 13:28:12 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column attendance.DATE
     *
     * @return the value of attendance.DATE
     *
     * @mbg.generated Thu Jan 16 13:28:12 CST 2020
     */
    public Date getDate() {
        return date;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column attendance.DATE
     *
     * @param date the value for attendance.DATE
     *
     * @mbg.generated Thu Jan 16 13:28:12 CST 2020
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column attendance.NUM
     *
     * @return the value of attendance.NUM
     *
     * @mbg.generated Thu Jan 16 13:28:12 CST 2020
     */
    public Integer getNum() {
        return num;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column attendance.NUM
     *
     * @param num the value for attendance.NUM
     *
     * @mbg.generated Thu Jan 16 13:28:12 CST 2020
     */
    public void setNum(Integer num) {
        this.num = num;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column attendance.DEPARTMENT
     *
     * @return the value of attendance.DEPARTMENT
     *
     * @mbg.generated Thu Jan 16 13:28:12 CST 2020
     */
    public String getDepartment() {
        return department;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column attendance.DEPARTMENT
     *
     * @param department the value for attendance.DEPARTMENT
     *
     * @mbg.generated Thu Jan 16 13:28:12 CST 2020
     */
    public void setDepartment(String department) {
        this.department = department == null ? null : department.trim();
    }
}