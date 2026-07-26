package p1;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="team")
public class Team {

	@Id
	@Column(name="teamid")
	int teamid;
	@Column(name="teamname")
	String teamname;
	@OneToMany(targetEntity = Player.class, cascade = CascadeType.ALL)
	Set<Player> allBatters;
	
	public Team() {
		// TODO Auto-generated constructor stub
	}
	
	public Team(int teamid, String teamname, Set<Player> allBatters) {
		this.teamid = teamid;
		this.teamname = teamname;
		this.allBatters = allBatters;
	}

	public int getTeamid() {
		return teamid;
	}

	public void setTeamid(int teamid) {
		this.teamid = teamid;
	}

	public String getTeamname() {
		return teamname;
	}

	public void setTeamname(String teamname) {
		this.teamname = teamname;
	}

	public Set<Player> getAllBatters() {
		return allBatters;
	}

	public void setAllBatters(Set<Player> allBatters) {
		this.allBatters = allBatters;
	}
	
}
