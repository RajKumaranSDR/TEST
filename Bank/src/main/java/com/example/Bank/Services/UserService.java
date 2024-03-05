package com.example.Bank.Services;

import com.example.Bank.Model.User;
import com.example.Bank.Repository.UserRepository;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Transactional
public class UserService {
    @Id
    private long AccountNum;

    private UserRepository userRepository;

    public UserService userService;

    public void saveMyUser(User user){
        userRepository.save(user);

    }

}
