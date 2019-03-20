package pl.brenna.dao;

public class MysqlDaoFactory extends DaoFactory{

	@Override
	public BookDao getBookDao() {
		// TODO Auto-generated method stub
		return new MysqlBookDao();
	}

	@Override
	public UserDao getUserDao() {
		// TODO Auto-generated method stub
		return new MysqlUserDao();
	}

}
