package com.lmsapp.service;

import java.util.List;

import com.lmsapp.dao.LeaveTypeDAO;
import com.lmsapp.model.LeaveType;

public class LeaveTypeService {

	private LeaveTypeDAO leaveTypeDAO = new LeaveTypeDAO();

	public List<LeaveType> list() {
		return leaveTypeDAO.list();
	}

	public LeaveType findById(Long id) {
		return leaveTypeDAO.findById(id);
	}

	public void activate(Long id) {

		LeaveType findById = leaveTypeDAO.findById(id);
		findById.setActive(true);
		leaveTypeDAO.update(id, findById);
	}

	public void deActivate(Long id) {

		LeaveType findById = leaveTypeDAO.findById(id);
		findById.setActive(false);
		leaveTypeDAO.update(id, findById);
	}

}
