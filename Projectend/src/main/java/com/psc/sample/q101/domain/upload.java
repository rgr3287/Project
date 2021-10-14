package com.psc.sample.q101.domain;


import lombok.*;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

// implements Serializable

@Entity @Table(name = "upload")
@AllArgsConstructor
@ToString
@Getter
@Setter
@NoArgsConstructor
public class upload implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

	@Id
    private String email;//이메일! 주로 이걸로 찾을듯!


    private String post; //계시물 글 내용

    private String fileName; // 파일 이름

    private String fileOrName; //파일 진짜 이름

    private String fileUrl;

    private long Latitude; //위도

    private long Hardness; //경도

    private String date; //업로드 날짜



}
