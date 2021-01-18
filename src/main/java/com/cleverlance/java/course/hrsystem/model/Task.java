package com.cleverlance.java.course.hrsystem.model;

public class Task {

    private int companyID;
    private String nameCZ;
    private String nameEN;

    public Task() {

    }

    public int getCompanyID() {
        return companyID;
    }

    public String getNameCZ() {
        return nameCZ;
    }

    public String getNameEN() {
        return nameEN;
    }

    public void setCompanyID(int companyID) {
        this.companyID = companyID;
    }

    public void setNameCZ(String nameCZ) {
        this.nameCZ = nameCZ;
    }

    public void setNameEN(String nameEN) {
        this.nameEN = nameEN;
    }

    @Override
    public String toString() {
        return "Task{" +
                "companyID='" + companyID + '\'' +
                ", nameCZ='" + nameCZ + '\'' +
                ", nameEN='" + nameEN + '\'' +
                '}';
    }

}
