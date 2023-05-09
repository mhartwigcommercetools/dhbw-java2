package com.education.mosbach.scrum.impl;

import com.education.mosbach.scrum.api.ScrumTeam;
import com.education.mosbach.scrum.api.TeamMember;

import java.util.ArrayList;
import java.util.List;

public class PongScrumTeam implements ScrumTeam {

    List<TeamMember> dev_team = new ArrayList<>();
    private int iterator_step = 0;

    public PongScrumTeam() {
        dev_team.add(new TeamMemberImpl("Timo", "Hernadi", "Java Backend"));
        dev_team.add(new TeamMemberImpl("Tobi", "Bahlke", "Frontend"));
    }

    @Override
    public String getName() {
        return "The Pong Game Development Team";
    }

    @Override
    public TeamMember getProductOwner() {
        return
                new TeamMemberImpl("Elias", "Werner", "ProductOwner");
    }

    @Override
    public TeamMember getScrumMaster() {
        return
                new TeamMemberImpl("Niklas", "Michel", "ScrumMaster");
    }

    @Override
    public boolean hasNext() {
        return (iterator_step <= 3);
    }

    @Override
    public TeamMember next() {
        if (iterator_step == 0) {
            iterator_step++;
            return getProductOwner();
        }
        if (iterator_step == 1) {
            iterator_step++;
            return getScrumMaster();
        }
        if (iterator_step == 2) {
            iterator_step++;
            return dev_team.get(0);
        }
        if (iterator_step == 3) {
            iterator_step++;
            return dev_team.get(1);
        }
        return null;
    }

    public static void main(String[] args) {
        ScrumTeam myPongSrcumTeam = new PongScrumTeam();

        System.out.println("Team " + myPongSrcumTeam.getName());
        System.out.println("members:");

        // while (myPongSrcumTeam.hasNext())
        //     System.out.println(myPongSrcumTeam.next());

        // for (int i = 0 ; myPongSrcumTeam.hasNext(); i++ )
        //     System.out.println(myPongSrcumTeam.next());

        myPongSrcumTeam.forEachRemaining(System.out::println);

    }


}
