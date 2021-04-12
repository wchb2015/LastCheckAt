package com.lastcheckat.model;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
public class LastCheckAt {

    private String name;
    private Long id;
    private Integer itemId;
    private Date lastCheckAt;
    private boolean isCurrent;
    private Date createdAt;

}
