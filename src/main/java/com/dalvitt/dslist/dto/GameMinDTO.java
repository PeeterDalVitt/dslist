package com.dalvitt.dslist.dto;

import com.dalvitt.dslist.entities.Game;
import com.dalvitt.dslist.projections.GameMinProjection;

public class GameMinDTO {

	private Long id;
	private Integer year; 
	private String title;
	private String imgUrl;
	private String shortDescription;

	public GameMinDTO () {
	}

	public GameMinDTO(Game entity) {
		id = entity.getId();
		year = entity.getYear();
		title = entity.getTitle();
		imgUrl = entity.getImgUrl();
		shortDescription = entity.getShortDescription();
	}
	
	public GameMinDTO(GameMinProjection projection) {
		id = projection.getId();
		year = projection.getYear();
		title = projection.getTitle();
		imgUrl = projection.getImgUrl();
		shortDescription = projection.getShortDescription();
	}


	public Long getId() {
		return id;
	}

	public Integer getYear() {
		return year;
	}

	public String getTitle() {
		return title;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public String getShortDescription() {
		return shortDescription;
	}
	
	
	
}
