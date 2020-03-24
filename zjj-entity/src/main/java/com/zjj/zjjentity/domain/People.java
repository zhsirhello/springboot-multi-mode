package com.zjj.zjjentity.domain;


import javax.persistence.*;

@Entity
@Table(name = "people")
public class People {
    private int pid;
    private String nam;
    private int sex;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pid")
    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }
    @Column(name = "nam")
    public String getNam() {
        return nam;
    }

    public void setNam(String nam) {
        this.nam = nam;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }
}
