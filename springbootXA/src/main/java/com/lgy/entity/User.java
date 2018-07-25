package com.lgy.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Data //等于@Setter  + @Getter
public class User {


    private  String name;

    private  Integer age;
    private  Integer id;
}
