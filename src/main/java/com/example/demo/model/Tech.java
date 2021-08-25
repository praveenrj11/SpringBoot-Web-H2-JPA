package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Tech {
	
	@Id
	private int id;
	private String name;
	private String sub;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSub() {
		return sub;
	}
	public void setSub(String sub) {
		this.sub = sub;
	}
	
	@Override
	public String toString() {
		return "Tech [id=" + id + ", name=" + name + ", sub=" + sub + "]";
	}
	
	
}
