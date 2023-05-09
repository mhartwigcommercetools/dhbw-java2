package com.education.mosbach.scrum.impl;

import com.education.mosbach.scrum.api.TeamMember;

public class TeamMemberImpl implements TeamMember {

    private String firstName;
    private String lastName;
    private String title;

    public TeamMemberImpl(String firstName, String lastName, String title) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
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
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return
                getFirstName() + " " + getLastName() + " " + getTitle();
    }
}
