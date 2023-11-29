package com.day.isky.controller;

import com.day.isky.web.domain.AjaxResult;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.SneakyThrows;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.SequencedCollection;

/**
 * Represents a controller class that handles the "hello" endpoint.
 * This class is used to return a "hello world" string when the endpoint is invoked.
 */
@Tag(name = "HelloController", description = "测试")
@RestController
@RequestMapping("/h")
public class HelloController {


    /**
     * This method is used to return a string "hello world".
     *
     * @return the string "hello world"
     */
    @Operation(summary = "获取动物园详情", description = "返回单个对象",
            parameters = {@Parameter(name = "id", description = "动物园id")})
    @ApiResponse(responseCode = "2xx",description = "动物园实体对象")
    @SneakyThrows
    @GetMapping("hello")
    public String getHelloMessage(String id) {

        String s1 = "hello";
        String s2 = "world";
        String target = STR. "\{ s1 } \{ s2 }!" ;
        System.out.println(target);
        return "hello world";
    }

    /**
     * This method is used to return an AjaxResult object.
     * 在Java21中引入了全新的SequencedCollection、SequencedSet 、SequencedMap 接口，
     * 来表示顺序集合，
     * 这些接口提供了在集合开头或结尾处添加、修改或删除元素的方法，以及反转集合的功能。
     *
     * @return the AjaxResult object containing the SequencedCollection object
     */
    @RequestMapping("/px")
    public AjaxResult getCollection() {

        SequencedCollection collection = new ArrayList();
        collection.add("a");
        collection.add("c");
        collection.add("e");
        collection.add("o");

        return AjaxResult.success(collection);
    }

}
