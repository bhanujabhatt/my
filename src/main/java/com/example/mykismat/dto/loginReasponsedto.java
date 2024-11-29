package com.example.mykismat.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class loginReasponsedto {
    String msg;
    Boolean status;

    public void loginResponsedto(String msg, boolean b) {
    }

    @Override
    public String toString() {
        return "loginResponsedto{" +
                "message='" + msg + '\'' +
                ", status=" + status +
                '}';
    }
}
