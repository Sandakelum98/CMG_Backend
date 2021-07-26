package lk.ijse.springboot.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@NoArgsConstructor
@AllArgsConstructor
@Data

@Document(collection = "user")
public class User {
    private String id;
    private String name;
    private String username;
    private String address;
    @Indexed(unique=true)
    private int mobileNo;
    @Indexed(unique=true)
    private String email;
    private String password;
    private String type;

    @Indexed(unique=true)
    private String nic;
    @Indexed(unique=true)
    private String employeeId;

    public User(String name, String username, String address, int mobileNo, String email, String password, String type) {
        this.name = name;
        this.username = username;
        this.address = address;
        this.mobileNo = mobileNo;
        this.email = email;
        this.password = password;
        this.type = type;
    }

    public User(String name, String username, int mobileNo, String email, String password, String type, String nic, String employeeId) {
        this.name = name;
        this.username = username;
        this.mobileNo = mobileNo;
        this.email = email;
        this.password = password;
        this.type = type;
        this.nic = nic;
        this.employeeId = employeeId;
    }

    public User(String name, String username, String address, int mobileNo, String email, String password, String type, String nic, String employeeId) {
        this.name = name;
        this.username = username;
        this.address = address;
        this.mobileNo = mobileNo;
        this.email = email;
        this.password = password;
        this.type = type;
        this.nic = nic;
        this.employeeId = employeeId;
    }
}
