package hiber.service;

import hiber.dao.UserDao;
import hiber.model.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

   private final UserDao userDao;

   public UserServiceImpl(UserDao userDao) {
      this.userDao = userDao;
   }

   @Override
   public void add(User user) {

   }

   @Transactional
   @Override
   public List<User> listUsers() {
      return userDao.listUsers();
   }

   @Transactional
   @Override
   public User getUserByCarAndModel(String car_model, int car_series) {

      return userDao.getUserByCarAndModel(car_model, car_series);

   }
}
