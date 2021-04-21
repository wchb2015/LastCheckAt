package com.lastcheckat.model;

import lombok.Data;

import java.util.Date;

@Data
public class LastCheckAt {

    private String name;
    private Long id;
    private Integer itemId;
    private Date lastCheckAt;
    private boolean isCurrent;
    private Date createdAt;


    private String diff;

    public void setDiff(String diff)
    {
        this.diff = diff;
    }
}
