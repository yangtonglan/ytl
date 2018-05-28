package dao;

import java.util.List;

import Entity.Jihui;
public interface JihuiDao {
	public void delete(Jihui jiHui);
    public void update(Jihui jiHui);
    public void add(Jihui jiHui);
    public List<Jihui> getJihui();
   
}