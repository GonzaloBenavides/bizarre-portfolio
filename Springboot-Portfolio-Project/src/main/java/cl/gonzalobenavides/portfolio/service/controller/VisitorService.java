package cl.gonzalobenavides.portfolio.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.gonzalobenavides.portfolio.model.Visitor;
import cl.gonzalobenavides.portfolio.model.dao.VisitorDAO;

@Service
public class VisitorService implements VisitorServiceInterface {

	@Autowired
	private VisitorDAO dao;
	
	@Override
	public Visitor add(Visitor visitor) {
		return dao.save(visitor);
	}
	
	
}
