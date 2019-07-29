package com.atguigu.dao;

import org.springframework.stereotype.Repository;

@Repository
public class BookDao {

    private  String labele="1";


    public String getLabele() {
        return labele;
    }

    public void setLabele(String labele) {
        this.labele = labele;
    }

    @Override
    public String toString() {
        return "BookDao{" +
                "labele='" + labele + '\'' +
                '}';
    }
}
