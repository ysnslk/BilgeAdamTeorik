package com.yasinsolak.repository;

import com.yasinsolak.entity.User;
import com.yasinsolak.utilty.MyFactoryRepository;
import java.util.List;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.criterion.Restrictions;

public class UserRepository extends MyFactoryRepository<User, Long> {

    public UserRepository() {
        super(new User());
    }
    
    public boolean isUser(String username , String password){
        /**
         *  Select count(*) > 0 from tbluser where username  = ? and password = ?
         */
        CriteriaQuery<User> criteria = getBuilder().createQuery(User.class);
        Root<User> root = criteria.from(User.class);
        criteria.select(root);
        criteria.where(
                getBuilder().and(getBuilder().equal(root.get("username"),username),
                getBuilder().equal(root.get("password"),password))
        );
       List<User> resultUserList =  getEntityManager().createQuery(criteria).getResultList();
        return !resultUserList.isEmpty();
    }
}
