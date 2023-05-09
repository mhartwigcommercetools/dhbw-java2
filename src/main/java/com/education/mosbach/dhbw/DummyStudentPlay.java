package com.education.mosbach.dhbw;

import com.education.mosbach.dhbw.api.Student;
import com.education.mosbach.dhbw.impl.StudentImpl;

import java.util.ArrayList;
import java.util.List;

public class DummyStudentPlay {

    public void swap(List<Student> myStudents, int pos1, int pos2) {
        Student temp = myStudents.get(pos1);
        myStudents.set(pos1, myStudents.get(pos2));
        myStudents.set(pos2, temp);
    }
    public List<Student> sortStudents(List<Student> myStudents) {

        for (int j = 0; j < myStudents.size() - 1; j++)
                for (int i = 0; i < myStudents.size() - 1; i++) {
                    if (myStudents.get(i).compareTo(myStudents.get(i+1)) > 0)
                                swap(myStudents, i, i+1);
                }
        return myStudents;
    }

    public static void main(String[] args) {

        List<Student> myStudents = new ArrayList<>();
        myStudents.add(new StudentImpl(
                "Jonas",
                "Scherpf",
                1.1,
                7464,
                "Wirtschaftsinformatik"
            )
        );
        myStudents.add(new StudentImpl(
                        "Timo",
                        "Hernadi",
                        1.8,
                        79464,
                        "Wirtschaftsinformatik"
                )
        );
        myStudents.add(new StudentImpl(
                        "Tobias",
                        "Bahlke",
                        1.3,
                        559464,
                        "Wirtschaftsinformatik"
                )
        );
        myStudents.add(new StudentImpl(
                        "Elias",
                        "Werner",
                        2.7,
                        19464,
                        "Wirtschaftsinformatik"
                )
        );

        myStudents.forEach(System.out::println);

        DummyStudentPlay dummyStudentPlay = new DummyStudentPlay();
        dummyStudentPlay.sortStudents(myStudents);
        myStudents.forEach(System.out::println);


    }


}
