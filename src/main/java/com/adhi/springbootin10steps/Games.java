package com.adhi.springbootin10steps;

public class Games {
	
	private int id;
	private String GameName;
	private String Console;
	public String getConsole() {
		return Console;
	}
	public void setConsole(String console) {
		Console = console;
	}
	public String getGameName() {
		return GameName;
	}
	public void setGameName(String gameName) {
		GameName = gameName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Games(int id, String gameName, String console) {
		super();
		this.id = id;
		GameName = gameName;
		Console = console;
	}
	@Override
	public String toString() {
		return "Games [id=" + id + ", GameName=" + GameName + ", Console=" + Console + "]";
	}
	
	
	

}
