package com.taowritescode.ndp.student;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	String matricule;
	String lastname;
	String firstname;
	Date dateOfBirth;
}
