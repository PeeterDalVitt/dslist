package com.dalvitt.dslist.entities;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_game")
public class Game {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "game_year")
	private Integer year;	//Pra não dar brete com o banco de dados do SQL, trocar o nome year
	private String genre;
	private String title;
	private String platforms;
	private Double score;
	private String imgUrl;
	@Column(columnDefinition = "TEXT") 
	private String shortDescription;
	@Column(columnDefinition = "TEXT") 
	private String longDescription;
	
	public Game() {
	}

	public Game(Long id, Integer year, String genre, String platforms, Double score, String imgUrl,
			String shortDescription, String longDescription) {
		super();
		this.id = id;
		this.year = year;
		this.genre = genre;
		this.platforms = platforms;
		this.score = score;
		this.imgUrl = imgUrl;
		this.shortDescription = shortDescription;
		this.longDescription = longDescription;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Game other = (Game) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
	
	
	
}
