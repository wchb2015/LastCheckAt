package com.lastcheckat.model;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
public class Item {
    private int id;
    private String name;
    private Date createdAt;
    private Date updatedAt;
}
