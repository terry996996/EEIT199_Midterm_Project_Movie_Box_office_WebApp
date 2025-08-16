package com.gmail.terry996996.domain;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "movie")
public class MovieBean {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "movie_id")
    private Integer movieid;

    @Column(name = "country", nullable = false)
    private String country;

    @Column(name = "movie_name_cn", nullable = false)
    private String movieName;

    @Column(name = "applicant_company", nullable = false)
    private String applicant;

    @Column(name = "production_unit", nullable = false)
    private String prodUnit;

    @Column(name = "theater_showing_num", nullable = false)
    private Integer showTheaterNum;

    @Column(name = "box_office", nullable = false)
    private Long boxOffice;

    @Column(name = "box_office_sales", nullable = false)
    private Long sales;
    
    @Column(name = "create_name")
    private String createName;
    
    @Column(name = "create_time")
    private LocalDateTime createTime;
    
    @Column(name = "update_name")
    private String updateName;
    
    @Column(name = "update_time")
    private LocalDateTime updateTime;

	public Integer getMovieid() {
		return movieid;
	}

	public void setMovieid(Integer movieid) {
		this.movieid = movieid;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getApplicant() {
		return applicant;
	}

	public void setApplicant(String applicant) {
		this.applicant = applicant;
	}

	public String getProdUnit() {
		return prodUnit;
	}

	public void setProdUnit(String prodUnit) {
		this.prodUnit = prodUnit;
	}

	public Integer getShowTheaterNum() {
		return showTheaterNum;
	}

	public void setShowTheaterNum(Integer showTheaterNum) {
		this.showTheaterNum = showTheaterNum;
	}

	public Long getBoxOffice() {
		return boxOffice;
	}

	public void setBoxOffice(Long boxOffice) {
		this.boxOffice = boxOffice;
	}

	public Long getSales() {
		return sales;
	}

	public void setSales(Long sales) {
		this.sales = sales;
	}

	public String getCreateName() {
		return createName;
	}

	public void setCreateName(String createName) {
		this.createName = createName;
	}

	public LocalDateTime getCreateTime() {
		return createTime;
	}

	public void setCreateTime(LocalDateTime createTime) {
		this.createTime = createTime;
	}

	public String getUpdateName() {
		return updateName;
	}

	public void setUpdateName(String updateName) {
		this.updateName = updateName;
	}

	public LocalDateTime getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(LocalDateTime updateTime) {
		this.updateTime = updateTime;
	}

	@Override
	public String toString() {
		return "MovieBean [movieid=" + movieid + ", country=" + country + ", movieName=" + movieName + ", applicant="
				+ applicant + ", prodUnit=" + prodUnit + ", showTheaterNum=" + showTheaterNum + ", boxOffice="
				+ boxOffice + ", sales=" + sales + ", createName=" + createName + ", createTime=" + createTime
				+ ", updateName=" + updateName + ", updateTime=" + updateTime + "]";
	}



    
}


