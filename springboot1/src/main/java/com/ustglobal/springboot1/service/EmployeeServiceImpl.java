package com.ustglobal.springboot1.service;

import java.util.List;

import com.ustglobal.springboot1.dao.EmployeeDAO;
import com.ustglobal.springboot1.dto.EmployeeBean;

//@Service
public class EmployeeServiceImpl implements EmployeeService{

	//@Autowired
	private EmployeeDAO dao;
	@Override
	public boolean addEmployee(EmployeeBean bean) {

		if(bean.getName()==null||bean.getPassword()==null){
			return false;
		}else if(bean.getPassword().length()<8) {
			return false;
		}
		return dao.addEmployee(bean);
		
	}

	@Override
	public boolean modifyEmployee(EmployeeBean bean) {
		if(bean.getName()==null||bean.getPassword()==null){
			return false;
		}else if(bean.getPassword().length()<8) {
			return false;
		}
		return dao.modifyEmployee(bean);
	}

	@Override
	public boolean deleteEmployee(int id) {
	
		return dao.deleteEmployee(id);
	}

	@Override
	public EmployeeBean getEmployee(int id) {
		
		return dao.getEmployee(id);
	}

	@Override
	public List<EmployeeBean> getAllEmployee() {
		
		return dao.getAllEmployee();
	}

}
