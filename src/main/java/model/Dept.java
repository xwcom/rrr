package model;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class Dept implements Serializable {
    private static final long serialVersionUID = -1450529966498716765L;
    private Integer did;
    private String dname;
    private List<Emp> emps;
}
