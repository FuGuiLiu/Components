package com.sky.boot;

import com.sky.boot.entity.TzArea;
import com.sky.boot.service.impl.TzAreaServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import java.util.List;

@SpringBootTest
public class Tests {
    @Autowired
    @Qualifier(value = "TzAreaServiceImpl")
    TzAreaServiceImpl tzAreaService;

    @Test
    public void paginationTest() {
        PageRequest pageRequest = PageRequest.of(0, 7, Sort.by(Sort.Order.desc("area_id")));
        List<TzArea> page = tzAreaService.findPage(pageRequest);
        for (TzArea tzArea : page) {
            System.out.println(tzArea);
        }
    }
}
