package com.rsk.java;

import org.jetbrains.annotations.Nullable;

public class OrgMeeting {
    private String title;

    public void addTitle(String title) {
        this.title = title;
    }

    public @Nullable
    String meetingTitle() {
        return title;
    }
}
