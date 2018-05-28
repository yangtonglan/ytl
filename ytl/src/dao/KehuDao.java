package dao;

import java.util.List;

import Entity.Kehu;
import Entity.User;

public interface KehuDao {
    public void delete(Kehu kuhe);
    public void update(Kehu kuhe);
    public void add(Kehu kuhe);
    public Kehu getKehuById(int id);
    public List<Kehu> getKehu();
   
}