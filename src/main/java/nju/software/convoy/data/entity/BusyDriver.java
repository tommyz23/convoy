package nju.software.convoy.data.entity;

import java.util.Date;

public class BusyDriver {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column busy_driver.ID
     *
     * @mbg.generated Wed Apr 29 18:28:50 SGT 2020
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column busy_driver.DRIVER
     *
     * @mbg.generated Wed Apr 29 18:28:50 SGT 2020
     */
    private String driver;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column busy_driver.START
     *
     * @mbg.generated Wed Apr 29 18:28:50 SGT 2020
     */
    private Date start;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column busy_driver.END
     *
     * @mbg.generated Wed Apr 29 18:28:50 SGT 2020
     */
    private Date end;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column busy_driver.LICENSE
     *
     * @mbg.generated Wed Apr 29 18:28:50 SGT 2020
     */
    private Integer license;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column busy_driver.ID
     *
     * @return the value of busy_driver.ID
     *
     * @mbg.generated Wed Apr 29 18:28:50 SGT 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column busy_driver.ID
     *
     * @param id the value for busy_driver.ID
     *
     * @mbg.generated Wed Apr 29 18:28:50 SGT 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column busy_driver.DRIVER
     *
     * @return the value of busy_driver.DRIVER
     *
     * @mbg.generated Wed Apr 29 18:28:50 SGT 2020
     */
    public String getDriver() {
        return driver;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column busy_driver.DRIVER
     *
     * @param driver the value for busy_driver.DRIVER
     *
     * @mbg.generated Wed Apr 29 18:28:50 SGT 2020
     */
    public void setDriver(String driver) {
        this.driver = driver == null ? null : driver.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column busy_driver.START
     *
     * @return the value of busy_driver.START
     *
     * @mbg.generated Wed Apr 29 18:28:50 SGT 2020
     */
    public Date getStart() {
        return start;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column busy_driver.START
     *
     * @param start the value for busy_driver.START
     *
     * @mbg.generated Wed Apr 29 18:28:50 SGT 2020
     */
    public void setStart(Date start) {
        this.start = start;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column busy_driver.END
     *
     * @return the value of busy_driver.END
     *
     * @mbg.generated Wed Apr 29 18:28:50 SGT 2020
     */
    public Date getEnd() {
        return end;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column busy_driver.END
     *
     * @param end the value for busy_driver.END
     *
     * @mbg.generated Wed Apr 29 18:28:50 SGT 2020
     */
    public void setEnd(Date end) {
        this.end = end;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column busy_driver.LICENSE
     *
     * @return the value of busy_driver.LICENSE
     *
     * @mbg.generated Wed Apr 29 18:28:50 SGT 2020
     */
    public Integer getLicense() {
        return license;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column busy_driver.LICENSE
     *
     * @param license the value for busy_driver.LICENSE
     *
     * @mbg.generated Wed Apr 29 18:28:50 SGT 2020
     */
    public void setLicense(Integer license) {
        this.license = license;
    }
}