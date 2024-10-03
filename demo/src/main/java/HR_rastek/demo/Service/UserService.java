package HR_rastek.demo.Service;

import HR_rastek.demo.DTO.RegisterReq;
import HR_rastek.demo.Entity.UserEntity;
import HR_rastek.demo.Repository.UserRepository;
import HR_rastek.demo.Security.BCrypt;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.ConstraintViolationException;
import jakarta.validation.Validator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.server.ResponseStatusException;

import java.util.Set;


@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private Validator validator;

    @Transactional
    public void register(RegisterReq request){
        Set<ConstraintViolation<RegisterReq>> constraintViolations = validator.validate(request);
        if(constraintViolations.size() != 0){
            throw new ConstraintViolationException(constraintViolations);
        }
        if(userRepository.existsById(request.getUsername())){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Username Already Registered");
        }

        UserEntity userEntity = new UserEntity();
        userEntity.setUsername(request.getUsername());
        userEntity.setPassword(BCrypt.hashpw(request.getPassword(), BCrypt.gensalt()));
        userEntity.setName(request.getName());

        userRepository.save(userEntity);
    }

}
