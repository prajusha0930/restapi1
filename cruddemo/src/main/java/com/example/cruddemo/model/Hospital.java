package com.example.cruddemo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
/*import jakarta.persistence.Table;*/

@Entity
/*@Table(name="Hospitaldetails")*/
public class Hospital {
@Id
private int id;
private String name;
private int roomno;
private String phno;
private String gname;

public Hospital() {
	super();
}

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
public int getRoomno() {
	return roomno;
}
public void setRoomno(int roomno) {
	this.roomno = roomno;
}
public String getPhno() {
	return phno;
}
public void setPhno(String phno) {
	this.phno = phno;
}
public String getGname() {
	return gname;
}
public void setGname(String gname) {
	this.gname = gname;
}
public Hospital(int id, String name, int roomno, String phno, String gname) {
	super();
	this.id = id;
	this.name = name;
	this.roomno = roomno;
	this.phno = phno;
	this.gname = gname;
}
/*@Override
public String toString() {
	return "Hospital [id=" + id + ", name=" + name + ", roomno=" + roomno + ", phno=" + phno + ", gname=" + gname + "]";
}*/

}
