package HR_rastek.demo.Service;

import HR_rastek.demo.DTO.CreateUserReq;
import HR_rastek.demo.DTO.RegisterReq;
import HR_rastek.demo.DTO.UserRes;
import HR_rastek.demo.Entity.UserEntity;
import HR_rastek.demo.Repository.UserRepository;
import HR_rastek.demo.Security.BCrypt;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.ConstraintViolationException;
import jakarta.validation.Validator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.Set;


@Service
public class UserService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ValidationService validationService;

    @Transactional
    public UserRes Create_User(CreateUserReq request){

        validationService.validate(request);

        if (userRepository.existsByUsername(request.getUsername())) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Username already exists");
        }

        UserEntity user = new UserEntity();

        user.setUsername(request.getUsername());
        user.setEmail(request.getEmail());
        user.setPassword(BCrypt.hashpw(request.getPassword(), BCrypt.gensalt()));
        userRepository.save(user);

        return UserRes.builder()
                .username(user.getUsername())
                .email(user.getEmail())
                .created_at(user.getCreatedAt())
                .updated_at(user.getUpdatedAt())
                .created_by(user.getCreated_by())
                .build();
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserEntity user = userRepository.findByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException("User not found"));

        // Return a UserDetails object with username, password and no authorities
        return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), new ArrayList<>());
    }
}
