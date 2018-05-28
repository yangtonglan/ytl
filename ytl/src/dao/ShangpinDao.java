package dao;

import java.util.List;

import Entity.Kehu;
import Entity.Shangpin;

public interface ShangpinDao {
    public void delete(Shangpin shangpin);
    public void update(Shangpin shangpin);
    public void add(Shangpin shangpin);
    public List<Shangpin> getShangpin();
    public Shangpin getShangpinById(int id);
}