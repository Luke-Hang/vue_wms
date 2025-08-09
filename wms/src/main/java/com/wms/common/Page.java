package com.wms.common;

import lombok.Data;

import java.util.List;
@Data
public class Page<T> {
    private List<T> list;
    private long total;
    private int size;
    private int current;
}
