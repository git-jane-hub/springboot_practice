package com.ict.boot3.domain;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder(toBuilder = true)
public class UserDTO {
    private Long id;
    private String name;
    private String nickname;
    private Long age;
}
