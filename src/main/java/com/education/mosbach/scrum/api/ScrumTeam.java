package com.education.mosbach.scrum.api;

import java.util.Iterator;

public interface ScrumTeam extends Iterator<TeamMember> {

    String getName();
    TeamMember getProductOwner();
    TeamMember getScrumMaster();

}
