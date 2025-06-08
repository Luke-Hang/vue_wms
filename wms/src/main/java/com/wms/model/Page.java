package com.wms.model;

import lombok.Data;

/**
 * @author xiehang
 * @date 2025/6/8 15:52
 */
@Data
public class Page<T> {
    private Integer total;
    private static int PAGE_SIZE = 20;
    private static int PAGE_NUM = 1;
}
