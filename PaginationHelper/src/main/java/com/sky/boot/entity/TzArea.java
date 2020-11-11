package com.sky.boot.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Administrator
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TzArea {
    private Long areaId;

    private String areaName;

    private Long parentId;

    private Integer level;
}