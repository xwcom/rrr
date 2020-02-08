package dao;

import model.Ren;

import java.util.List;

public interface RenDao {

    //添加
    void addRen(Ren ren);

    //删除
    void delRen(Integer id);

    //修改
    void updateRen(Ren ren);

    //查询1：根据ID查某一个
    Ren queryRenById(Integer id);

    //查询2：模糊查询
    List<Ren> queryRenByWhere(Ren ren);

    //查询3：查询所有书
    List<Ren> queryRen();
}
