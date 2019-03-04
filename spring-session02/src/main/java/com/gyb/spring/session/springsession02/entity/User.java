package com.gyb.spring.session.springsession02.entity;

import lombok.*;

import java.io.Serializable;

/**
 * @author gengyuanbo
 * 2019/02/28
 */

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User implements Serializable {

    private String id;
    private String name;
    private String password;
}
