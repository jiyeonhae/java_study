package com.example.upppp.DTO;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class MemberDTO { //data transfer object //member, 즉 entity에 바로 접근하지 않도록. 안정성확보

    @NotNull //@NotEmpty(message = "NAME EMPTY")
    private String userName; //empty data들어가는거 방지

    public MemberDTO() //member와 지니는 변수 같아야??? idk
    {this.userName = userName;}



}
