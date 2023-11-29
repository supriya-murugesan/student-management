package com.example.mvcexamples.FirstMvcproject.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="students")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
         private int id;
	@Column(name="first_name")
         private String fName;
	@Column(name="last_name")
		 private String lName;
	@Column(name="email")
         private String eMail;
		@Override
	public String toString() {
		return "Student [id=" + id + ", fName=" + fName + ", lName=" + lName + ", eMail=" + eMail + "]";
	}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getfName() {
			return fName;
		}
		public void setfName(String fName) {
			this.fName = fName;
		}
		public String getlName() {
			return lName;
		}
		public void setlName(String lName) {
			this.lName = lName;
		}
		public String geteMail() {
			return eMail;
		}
		public void seteMail(String eMail) {
			this.eMail = eMail;
		}
		public Student() {
			
		}
		public Student(String fName, String lName, String eMail) {
			super();
			this.fName = fName;
			this.lName = lName;
			this.eMail = eMail;
		}
         
}
