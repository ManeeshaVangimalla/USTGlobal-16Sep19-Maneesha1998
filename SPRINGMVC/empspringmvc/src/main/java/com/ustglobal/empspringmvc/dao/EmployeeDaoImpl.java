package com.ustglobal.empspringmvc.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.ustglobal.empspringmvc.dto.EmployeeBean;

@Repository
public class EmployeeDaoImpl  implements EmployeeDAO
{
    @PersistenceUnit
	private EntityManagerFactory factory ;

	@Override
	public EmployeeBean login(int id, String password) 
	{
		String jpql = "from EmployeeBean where id=:id and password=:password";
		EntityManager manager = factory.createEntityManager();
		//		Query query = manager.createQuery(jpql);
		TypedQuery<EmployeeBean> query = manager.createQuery(jpql,EmployeeBean.class);//By using Typed Query we perform downcasting here only
		query.setParameter("id", id);
		query.setParameter("password", password);
		try {
			//			EmployeeBean bean =(EmployeeBean)query.getSingleResult());  // By using query we use downcasting here
			EmployeeBean bean = query.getSingleResult();// here no need of downcasting byy using TypedQuery
			return bean;
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}//End of login()

	@Override
	public int register(EmployeeBean bean)
	{
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		try {
			manager.persist(bean);
			transaction.commit();
			return bean.getId();
		}catch(Exception e)
		{
			e.printStackTrace();
			return -1;
		}
	}// End of register()

	@Override
	public boolean deleteEmployee(int id) 
	{
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		EmployeeBean bean = manager.find(EmployeeBean.class, id);
		manager.remove(bean);
		transaction.commit();
		return true;
	}//End of deleteEmployee()

	@Override
	public EmployeeBean searchEmployee(int id)
	{
		EntityManager manager = factory.createEntityManager();
		return manager.find(EmployeeBean.class, id);
		
	}//End of searchEmployee()

	@Override
	public boolean updateEmployee(EmployeeBean bean)
	{
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		EmployeeBean employeebean = manager.find(EmployeeBean.class,bean.getId());
		employeebean.setName(bean.getName());
		employeebean.setGender(bean.getGender());
		employeebean.setPassword(bean.getPassword());
		employeebean.setdoj(bean.getdoj());
		transaction.commit();

		return true;
	}

	@Override
	public boolean changePassword(int id, String password)
	{
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		EmployeeBean bean = manager.find(EmployeeBean.class, id);
		bean.setPassword(password);
		transaction.commit();
		return true;
	}

}
