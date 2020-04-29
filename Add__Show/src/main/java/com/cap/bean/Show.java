package com.cap.bean;




import java.sql.Time;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="show")

public class Show {
	
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seqGenerator")
	@SequenceGenerator(name="seqGenerator", initialValue=4000, allocationSize=1)
	
	
	private Integer showId;
	private Time showStartTime;
	private Time showEndTime;
	/* private List<Seat> seats; */
	private String showName;
	
	@ManyToOne(optional = false)
    @JoinColumn(name="MOVIE_ID")
	private Movie movie;
	
	private Integer screenId;
	private Integer theatreId;
	
	
	public Integer getShowId() {
		return showId;
	}
	public void setShowId(Integer showId) {
		this.showId = showId;
	}
	public Time getShowStartTime() {
		return showStartTime;
	}
	public void setShowStartTime(Time showStartTime) {
		this.showStartTime = showStartTime;
	}
	public Time getShowEndTime() {
		return showEndTime;
	}
	public void setShowEndTime(Time showEndTime) {
		this.showEndTime = showEndTime;
	}
	public String getShowName() {
		return showName;
	}
	public void setShowName(String showName) {
		this.showName = showName;
	}
	
	
	
	public Movie getMovie() {
		return movie;
	}
	public void setMovie(Movie movie) {
		this.movie = movie;
	}
	public Integer getScreenId() {
		return screenId;
	}
	public void setScreenId(Integer screenId) {
		this.screenId = screenId;
	}
	public Integer getTheatreId() {
		return theatreId;
	}
	public void setTheatreId(Integer theatreId) {
		this.theatreId = theatreId;
	}
	@Override
	public String toString() {
		return "Show [showId=" + showId + ", showStartTime=" + showStartTime + ", showEndTime=" + showEndTime
				+ ", showName=" + showName + ", movie=" + movie + ", screenId=" + screenId + ", theatreId=" + theatreId
				+ "]";
	}
		
}