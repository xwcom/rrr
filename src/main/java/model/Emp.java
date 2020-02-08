package model;

import lombok.Data;

import java.io.Serializable;

@Data
public class Emp implements Serializable {
    private static final long serialVersionUID = -5572017499942395550L;
    private Integer eid;
    private String ename;
    private Dept dept;
}
