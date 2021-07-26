package lk.ijse.springboot.controller;

import lk.ijse.springboot.dto.UserDTO;
import lk.ijse.springboot.service.UserService;
import lk.ijse.springboot.util.StandardResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity saveUser(@RequestBody UserDTO userDTO){
        //System.out.println(userDTO.toString());
        UserDTO user = userService.saveUser(userDTO);
        return new ResponseEntity(new StandardResponse("201", "success", user), HttpStatus.CREATED);
    }

    @GetMapping(path = "/{username}/{password}")
    public ResponseEntity userLogin(@PathVariable String username, @PathVariable String password) {
        System.out.println("Controller");
        UserDTO user = userService.userLogin(username,password);
        return new ResponseEntity(new StandardResponse("200", "success", user), HttpStatus.OK);
    }
}
