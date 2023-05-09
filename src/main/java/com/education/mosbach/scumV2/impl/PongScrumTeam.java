package com.education.mosbach.scumV2.impl;

import com.education.mosbach.scumV2.api.ScrumTeamV2;
import com.education.mosbach.scumV2.api.TeamMemberV2;

import java.util.ArrayList;
import java.util.List;

public class PongScrumTeam<T extends TeamMemberV2> implements ScrumTeamV2 {

    List<T> team = new ArrayList<>();

    @Override
    public String getName() {
        return null;
    }

    @Override
    public TeamMemberV2 getProductOwner() {
        return null;
    }

    @Override
    public TeamMemberV2 getScrumMaster() {
        return null;
    }

    void add(T teamMember) {
        team.add(teamMember);
    }

    public static void main(String[] args) {

        // List<Integer> myNumbers = new ArrayList<>();

        PongScrumTeam<TeamMemberV2> pongScrumTeam = new PongScrumTeam<>();          // works
        // PongScrumTeam<Object> pongScrumTeam = new PongScrumTeam<>();             // does not work

        pongScrumTeam.add(new ProductOwnerV2Impl());
        pongScrumTeam.add(new ScrumMasterV2Impl());
        pongScrumTeam.add(new DeveloperV2Impl());
        pongScrumTeam.add(new DeveloperV2Impl());

    }



}
