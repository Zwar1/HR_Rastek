//package HR_rastek.demo.Entity;
//
//import jakarta.persistence.*;
//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//import java.util.Set;
//
//@Getter
//@Setter
//@AllArgsConstructor
//@NoArgsConstructor
//@Entity
//@Table(name = "users")
//
//public class UserEntity {
//    @Id
//    private String username;
//
//    private String password;
//
//    private String name;
//
//    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
//    private Set<EmployeeEntity> employees;
//
//
//
//}
