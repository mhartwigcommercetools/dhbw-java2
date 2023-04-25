package com.education.mosbach.dhbw.api;

public interface Student {

    String getFirstName();
    String getLastName();
    double getGradeAverage();
    int getMatrikelNummer();
    String getCourse();
    String toString();
    int compareTo(Object o);

}
