package com.ssh.influence.domain;
import java.sql.Timestamp;
public class Influence {
	private Integer InfluenceId;
	private long num;//µÚ¼¸ÆÚ
	private String name;
	private Timestamp StartTime;
	private Timestamp EndTime;
	private Integer Deletes;
	public Integer getInfluenceId() {
		return InfluenceId;
	}
	public void setInfluenceId(Integer influenceId) {
		InfluenceId = influenceId;
	}
	private Integer Valid;
	
	public long getNum() {
		return num;
	}
	public void setNum(long num) {
		this.num = num;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Timestamp getStartTime() {
		return StartTime;
	}
	public void setStartTime(Timestamp startTime) {
		StartTime = startTime;
	}
	public Timestamp getEndTime() {
		return EndTime;
	}
	public void setEndTime(Timestamp endTime) {
		EndTime = endTime;
	}
	public Integer getDeletes() {
		return Deletes;
	}
	public void setDeletes(Integer deletes) {
		Deletes = deletes;
	}
	public Integer getValid() {
		return Valid;
	}
	public void setValid(Integer valid) {
		Valid = valid;
	}
	
	
}
