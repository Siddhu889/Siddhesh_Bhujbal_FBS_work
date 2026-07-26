package p1;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="player")
public class Player {

	@Id
	@Column(name="playerid")
	int playerid;
	@Column(name="playername")
	String playername;
	@Column(name="jersey")
	int jersey;
	@ManyToOne(targetEntity = Team.class)
	Team team;
	
	public Player() {
		// TODO Auto-generated constructor stub
	}
	
	public Player(int playerid, String playername, int jersey, Team team) {
		this.playerid = playerid;
		this.playername = playername;
		this.jersey = jersey;
		this.team = team;
	}

	public int getPlayerid() {
		return playerid;
	}

	public void setPlayerid(int playerid) {
		this.playerid = playerid;
	}

	public String getPlayername() {
		return playername;
	}

	public void setPlayername(String playername) {
		this.playername = playername;
	}

	public int getJersey() {
		return jersey;
	}

	public void setJersey(int jersey) {
		this.jersey = jersey;
	}

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}
	
}
