package com.wms.common;

import lombok.Data;

import java.util.List;
@Data
public class PageResult<T> {

    private List<T> list;
    private long total;
    private int size;
    private int current;


    public static<T> PageResult<T> success(Page<T> page){
        PageResult<T> result = new PageResult<>();
        result.setList(page.getList());
        result.setTotal(page.getTotal());
        result.setSize(page.getSize());
        result.setCurrent(page.getCurrent());
        return result;
    }

}
