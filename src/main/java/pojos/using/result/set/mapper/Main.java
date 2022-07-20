package pojos.using.result.set.mapper;

import pojos.and.daos.CustomerDaoImpl;

public class Main {
    public static void main(String[] args) {
        CustomerDaoImpl customerDao = new CustomerDaoImpl();
        System.out.println(customerDao.getByID(5));
        System.out.println();
        System.out.println(customerDao.getByIDs(customerDao.getRandomIds(5)));

    }
}
