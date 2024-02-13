package com.capsule.main.shelf;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShelfDAO {
	
	@Autowired
	private ShelfMapper sMapper;

	public List<ShelfDTO> getShelfList(String id) {
		return sMapper.getShelfList(id);
	}
}
