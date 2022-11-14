package com.busygind.lab3;

import lombok.Getter;
import lombok.Setter;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "mainBean")
@Getter
@Setter
public class MainBean {
    private String inputText;
}
