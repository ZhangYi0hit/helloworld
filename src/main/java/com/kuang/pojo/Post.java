package com.kuang.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@Data
@NoArgsConstructor
@AllArgsConstructor

public class Post {
    Integer id;
    String username;

    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
    String post_date;
    String title;
    String description;
    String imgURL;

}
