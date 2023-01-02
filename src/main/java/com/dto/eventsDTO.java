package com.dto;

public class eventsDTO {
	private String title;
	private String thumbnail;
	private String link;
	private String startdate;
	private String rewarddate;
	
	public eventsDTO() {
	}

	public eventsDTO(String title, String thumbnail, String link, String startdate, String rewarddate) {
		super();
		this.title = title;
		this.thumbnail = thumbnail;
		this.link = link;
		this.startdate = startdate;
		this.rewarddate = rewarddate;
	}

	@Override
	public String toString() {
		return "eventDTO [title=" + title + ", thumbnail=" + thumbnail + ", link=" + link + ", startdate=" + startdate
				+ ", rewarddate=" + rewarddate + "]";
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getThumbnail() {
		return thumbnail;
	}

	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getStartdate() {
		return startdate;
	}

	public void setStartdate(String startdate) {
		this.startdate = startdate;
	}

	public String getRewarddate() {
		return rewarddate;
	}

	public void setRewarddate(String rewarddate) {
		this.rewarddate = rewarddate;
	}
	
}
