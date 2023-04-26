package com.education.mosbach.dhbw.impl;

import com.education.mosbach.dhbw.api.Student;

import java.util.Objects;

public class StudentImpl implements Student, Comparable {

    private String firstName;               // keine Zahl
    private String lastName;                // keine Zahl
    private double gradeAverage;            // zwischen 1.0 und 5.0
    private int matrikelNummer;             // 7-stellig
    private String course;                  // nur "Wirtschaftsinformatik" und "BWL"

    public StudentImpl(String firstName, String lastName, double gradeAverage, int matrikelNummer, String course) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gradeAverage = gradeAverage;
        this.matrikelNummer = matrikelNummer;
        this.course = course;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public double getGradeAverage() {
        return gradeAverage;
    }

    public void setGradeAverage(double gradeAverage) {
        this.gradeAverage = gradeAverage;
    }

    @Override
    public int getMatrikelNummer() {
        return matrikelNummer;
    }

    public void setMatrikelNummer(int matrikelNummer) {
        this.matrikelNummer = matrikelNummer;
    }

    @Override
    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentImpl student = (StudentImpl) o;
        return
                matrikelNummer == student.matrikelNummer;
    }

    @Override
    public int hashCode() {
        return
                Objects.hash(matrikelNummer);
    }


    public static void main(String[] args) {
        Student theSuperStudent = new StudentImpl(
                "Michael",
                "Hartwig",
                2.3,
                123456,
                "Angewandte Informatik"
        );
        System.out.println("The student is currently in the database:");
        System.out.println(theSuperStudent);

        Student theEvenBetterStudent = new StudentImpl(
                "Jonas",
                "Scherpf",
                1.1,
                7464,
                "Wirtschaftsinformatik"
        );

        System.out.println("Sind Jonas und Michael gleich " + theEvenBetterStudent.equals(theSuperStudent));

    }

    @Override
    public String toString() {
        return
                "Student firstName=" + firstName + ", lastName=" + lastName + ", matrikelNummer=" + matrikelNummer;
    }

    @Override
    public int compareTo(Object o) {

        Student otherStudent = (Student) o;

        if (getLastName().compareTo(otherStudent.getLastName()) > 0)
            return 1;
        if (getLastName().compareTo(otherStudent.getLastName()) < 0)
            return -1;

        return
                getFirstName().compareTo(otherStudent.getFirstName());
    }
}
