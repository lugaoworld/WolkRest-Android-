package com.wolkabout.wolkrestandroid.dto;

public class ReportIdDto {

    private int id;

    public ReportIdDto() {
    }

    public ReportIdDto(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "ReportIdDto{" +
                "id=" + id +
                '}';
    }
}
