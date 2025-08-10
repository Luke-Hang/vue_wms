package com.wms.entity;

import lombok.Data;

import java.util.HashMap;
@Data
public class QueryPageParam {

    //默认
    private static int PAGE_SIZE=20;
    private static int PAGE_NUM=1;

    private int pageSize=10;

    private int pageNum=1;

    private HashMap param = new HashMap();
}
