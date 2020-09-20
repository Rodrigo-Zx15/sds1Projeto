package com.devsuperior.dspesquisa.entities;
import java.util.NoSuchElementException;
import com.devsuperior.dspesquisa.entities.enums.Platform;

public interface InterfaceLista {
	 	public void add(int index, Long id, String title, Platform platform, Genre genre) 
	 			throws NoSuchElementException;
	    public boolean isEmpty();
	    public int size();
	    public Game remove(int index)throws IndexOutOfBoundsException;
	    public int update(int index, Long id, String title, Platform platform, Genre genre) 
	    		throws IndexOutOfBoundsException;
	    public Game get(int index);
}
