package lk.ijse.springboot.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserDTO {
    private String id;
    private String name;
    private String username;
    private String address;
    private int mobileNo;
    private String email;
    private String password;
    private String type;

    private String nic;
    private String employeeId;

    public UserDTO(String name, String username, String address, int mobileNo, String email, String password, String type) {
        this.name = name;
        this.username = username;
        this.address = address;
        this.mobileNo = mobileNo;
        this.email = email;
        this.password = password;
        this.type = type;
    }

    public UserDTO(String name, String username, int mobileNo, String email, String password, String type, String nic, String employeeId) {
        this.name = name;
        this.username = username;
        this.mobileNo = mobileNo;
        this.email = email;
        this.password = password;
        this.type = type;
        this.nic = nic;
        this.employeeId = employeeId;
    }

    public UserDTO(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
