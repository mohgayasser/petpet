package gov.iti.jets.persistent.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private Date birthday;
    private String password;
    private String job;
    private String email;

    @Column(name = "credit_limit")
    private int cridetLimit;

    private String country;
    private String street;
    private String city;
    private String phone;
    private String ZIP;

    public User() {
    }

    public User(int id, String name, Date birthday, String password, String job, String email, int cridetLimit,
            String country, String street, String city, String phone, String zIP) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.password = password;
        this.job = job;
        this.email = email;
        this.cridetLimit = cridetLimit;
        this.country = country;
        this.street = street;
        this.city = city;
        this.phone = phone;
        ZIP = zIP;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCridetLimit() {
        return cridetLimit;
    }

    public void setCridetLimit(int cridetLimit) {
        this.cridetLimit = cridetLimit;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getZIP() {
        return ZIP;
    }

    public void setZIP(String zIP) {
        ZIP = zIP;
    }

}
