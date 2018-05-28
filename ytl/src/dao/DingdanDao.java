package dao;

import java.util.List;

import Entity.Dingdan;

public interface DingdanDao {
    public void delete(Dingdan dingDan);
    public void update(Dingdan dingDan);
    public void add(Dingdan dingDan);
    public List<Dingdan> getDingdan();
    public Dingdan getDingdanById(int id);
}