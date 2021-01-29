package com.gifmis.demo.entities;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;

@Entity
@Table (name="students")

    public class Students{

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "students_seq")
    @SequenceGenerator(name = "students_seq", sequenceName = "students_seq", allocationSize = 1)
    private Long id;
        // Properties or Variables
        private String university;  // University is a constant
        private String matriculationNumber;
        private String faculty;
        private String department;
        private String course;
        private int level;
        private String firstName;
        private String lastName;
        private String middleName;
        private String dateOfBirth;
        private String stateOfOrigin;


        public String getUniversity() {
            return university;
        }

        public void setUniversity(String university) {
            this.university = university;
        }

        public String getMatriculationNumber() {
            return matriculationNumber;
        }

        public void setMatriculationNumber(String matriculationNumber) {
            this.matriculationNumber = matriculationNumber;
        }

        public String getFaculty() {
            return faculty;
        }

        public void setFaculty(String faculty) {
            this.faculty = faculty;
        }

        public String getDepartment() {
            return department;
        }

        public void setDepartment(String department) {
            this.department = department;
        }

        public String getCourse() {
            return course;
        }

        public void setCourse(String course) {
            this.course = course;
        }

        public int getLevel() {
            return level;
        }

        public void setLevel(int level) {
            this.level = level;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getMiddleName() {
            return middleName;
        }

        public void setMiddleName(String middleName) {
            this.middleName = middleName;
        }

        public String getDateOfBirth() {
            return dateOfBirth;
        }

        public void setDateOfBirth(String dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
        }

        public String getStateOfOrigin() {
            return stateOfOrigin;
        }

        public void setStateOfOrigin(String stateOfOrigin) {
            this.stateOfOrigin = stateOfOrigin;
        }
    }
