package dao;

import model.Dept;
import model.Emp;

import java.util.List;

public interface DeptAsEmpMapper {

    //dept的CRUD
    /**
     * 1. 根据ID号查询Dept中某条记录
     */
    public Dept queryDeptById(Integer id);

    /**
     * 2. 模糊查询
     */
    public List<Dept> queryDeptsByWhere(Dept dept);

    /**
     * 3.查询dept中所有记录
     */
    public List<Dept> queryDepts();


    //emp的CRUD
    /**
     * 1. 根据ID号查询Dept中某条记录
     */
    public Emp queryEmpById(Integer id);

    /**
     * 2. 模糊查询
     */
    public List<Emp> queryEmpsByWhere(Emp emp);

    /**
     * 3.查询dept中所有记录
     */
    public List<Emp> queryEmps();


    //联合查询
    /**
     * 根据部门ID查询部门信息及部门员工信息
     */
    public Dept queryDeptAsEmps(Integer did);

    /**
     * 根据员工ID查询员工信息及部门信息
     */
    public Emp queryEmpsAsDept(Integer eid);








}
