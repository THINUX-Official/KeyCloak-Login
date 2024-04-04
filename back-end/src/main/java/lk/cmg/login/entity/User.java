package lk.cmg.login.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: THINUX
 * @created: 04-Apr-24 - 11:25 AM
 */

@Entity
@NoArgsConstructor
@Data
public class User {
    @Id
    @GeneratedValue
    private int id;
    private String email;
    private String password;
}
