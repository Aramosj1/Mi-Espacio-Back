package com.mi_espacio.mi_espacio_back.models.Entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "TB_ENT_USERS")
public class Users implements Serializable {

    //private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ENT_USERS_ID")
    private Long id;
    @Column(name = "ENT_USERS_FIRST_NAME")
    private String firstName;
    @Column(name = "ENT_USERS_SECOND_NAME")
    private String secondName;
    @Column(name = "ENT_USERS_FIRST_LAST_NAME")
    private String firstLastName;
    @Column(name = "ENT_USERS_SECOND_LAST_NAME")
    private String secondLastName;
    @Column(name = "ENT_USERS_BIRTHDAY")
    @Temporal(TemporalType.DATE)
    private Date   birthday;
    @Column(name = "ENT_USERS_USERNAME")
    private String userName;
    @Column(name = "ENT_USERS_PASSWORD")
    private String password;
    @Column(name = "ENT_USERS_CREATE_AT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date   createAt;
    @Column(name = "ENT_USERS_UPDATE_AT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date   updatedAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getFirstLastName() {
        return firstLastName;
    }

    public void setFirstLastName(String firstLastName) {
        this.firstLastName = firstLastName;
    }

    public String getSecondLastName() {
        return secondLastName;
    }

    public void setSecondLastName(String secondLastName) {
        this.secondLastName = secondLastName;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}
