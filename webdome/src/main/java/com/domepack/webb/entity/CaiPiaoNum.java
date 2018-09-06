package com.domepack.webb.entity;

public class CaiPiaoNum {
    private Long id;

    private String seriesId;

    private Integer numOne;

    private Integer numTwo;

    private Integer numThree;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSeriesId() {
        return seriesId;
    }

    public void setSeriesId(String seriesId) {
        this.seriesId = seriesId == null ? null : seriesId.trim();
    }

    public Integer getNumOne() {
        return numOne;
    }

    public void setNumOne(Integer numOne) {
        this.numOne = numOne;
    }

    public Integer getNumTwo() {
        return numTwo;
    }

    public void setNumTwo(Integer numTwo) {
        this.numTwo = numTwo;
    }

    public Integer getNumThree() {
        return numThree;
    }

    public void setNumThree(Integer numThree) {
        this.numThree = numThree;
    }
}