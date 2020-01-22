package nju.software.convoy.data.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
public class Trip extends TripKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column trip.APPROVE
     *
     * @mbg.generated Wed Jan 22 14:39:00 CST 2020
     */
    private Byte approve;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column trip.DEPARTMENT
     *
     * @mbg.generated Wed Jan 22 14:39:00 CST 2020
     */
    private String department;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column trip.ADDRESS
     *
     * @mbg.generated Wed Jan 22 14:39:00 CST 2020
     */
    private String address;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column trip.REASON
     *
     * @mbg.generated Wed Jan 22 14:39:00 CST 2020
     */
    private String reason;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column trip.TIME
     *
     * @mbg.generated Wed Jan 22 14:39:00 CST 2020
     */
    private Date time;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column trip.CITY_FROM
     *
     * @mbg.generated Wed Jan 22 14:39:00 CST 2020
     */
    private String cityFrom;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column trip.CITY_TO
     *
     * @mbg.generated Wed Jan 22 14:39:00 CST 2020
     */
    private String cityTo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column trip.TRANSPORT
     *
     * @mbg.generated Wed Jan 22 14:39:00 CST 2020
     */
    private String transport;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column trip.APPROVE
     *
     * @return the value of trip.APPROVE
     *
     * @mbg.generated Wed Jan 22 14:39:00 CST 2020
     */
    public Byte getApprove() {
        return approve;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column trip.APPROVE
     *
     * @param approve the value for trip.APPROVE
     *
     * @mbg.generated Wed Jan 22 14:39:00 CST 2020
     */
    public void setApprove(Byte approve) {
        this.approve = approve;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column trip.DEPARTMENT
     *
     * @return the value of trip.DEPARTMENT
     *
     * @mbg.generated Wed Jan 22 14:39:00 CST 2020
     */
    public String getDepartment() {
        return department;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column trip.DEPARTMENT
     *
     * @param department the value for trip.DEPARTMENT
     *
     * @mbg.generated Wed Jan 22 14:39:00 CST 2020
     */
    public void setDepartment(String department) {
        this.department = department == null ? null : department.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column trip.ADDRESS
     *
     * @return the value of trip.ADDRESS
     *
     * @mbg.generated Wed Jan 22 14:39:00 CST 2020
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column trip.ADDRESS
     *
     * @param address the value for trip.ADDRESS
     *
     * @mbg.generated Wed Jan 22 14:39:00 CST 2020
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column trip.REASON
     *
     * @return the value of trip.REASON
     *
     * @mbg.generated Wed Jan 22 14:39:00 CST 2020
     */
    public String getReason() {
        return reason;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column trip.REASON
     *
     * @param reason the value for trip.REASON
     *
     * @mbg.generated Wed Jan 22 14:39:00 CST 2020
     */
    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column trip.TIME
     *
     * @return the value of trip.TIME
     *
     * @mbg.generated Wed Jan 22 14:39:00 CST 2020
     */
    public Date getTime() {
        return time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column trip.TIME
     *
     * @param time the value for trip.TIME
     *
     * @mbg.generated Wed Jan 22 14:39:00 CST 2020
     */
    public void setTime(Date time) {
        this.time = time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column trip.CITY_FROM
     *
     * @return the value of trip.CITY_FROM
     *
     * @mbg.generated Wed Jan 22 14:39:00 CST 2020
     */
    public String getCityFrom() {
        return cityFrom;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column trip.CITY_FROM
     *
     * @param cityFrom the value for trip.CITY_FROM
     *
     * @mbg.generated Wed Jan 22 14:39:00 CST 2020
     */
    public void setCityFrom(String cityFrom) {
        this.cityFrom = cityFrom == null ? null : cityFrom.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column trip.CITY_TO
     *
     * @return the value of trip.CITY_TO
     *
     * @mbg.generated Wed Jan 22 14:39:00 CST 2020
     */
    public String getCityTo() {
        return cityTo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column trip.CITY_TO
     *
     * @param cityTo the value for trip.CITY_TO
     *
     * @mbg.generated Wed Jan 22 14:39:00 CST 2020
     */
    public void setCityTo(String cityTo) {
        this.cityTo = cityTo == null ? null : cityTo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column trip.TRANSPORT
     *
     * @return the value of trip.TRANSPORT
     *
     * @mbg.generated Wed Jan 22 14:39:00 CST 2020
     */
    public String getTransport() {
        return transport;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column trip.TRANSPORT
     *
     * @param transport the value for trip.TRANSPORT
     *
     * @mbg.generated Wed Jan 22 14:39:00 CST 2020
     */
    public void setTransport(String transport) {
        this.transport = transport == null ? null : transport.trim();
    }
}