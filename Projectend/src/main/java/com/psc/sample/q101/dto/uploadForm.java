package com.psc.sample.q101.dto;


import com.psc.sample.q101.domain.upload;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Getter
@Setter
public class uploadForm {

    private String email;//이메일! 주로 이걸로 찾을듯!
    private String post; //계시물 글 내용
    private String fileName; // 파일 이름
    private String fileOrName; //파일 진짜 이름
    private String fileUrl;
    private long Latitude; //위도
    private long Hardness; //경도
    private String date; //업로드 날짜



    public upload toEntity () {
        return new upload(null,email,post,fileName,fileOrName,fileUrl,Latitude,Hardness,date);

    }
}
