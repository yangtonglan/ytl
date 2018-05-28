package dao;

import java.util.List;
import Entity.Duisho;

public interface DuishoDao {
	public void delete(Duisho duiSho);
    public void update(Duisho duiSho);
    public void add(Duisho duiSho);
    public List<Duisho> getDuisho();
   
}