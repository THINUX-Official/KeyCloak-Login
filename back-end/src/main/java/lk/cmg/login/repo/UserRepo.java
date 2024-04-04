package lk.cmg.login.repo;

import lk.cmg.login.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author: THINUX
 * @created: 04-Apr-24 - 11:29 AM
 */
public interface UserRepo extends JpaRepository<User, Integer> {

}
