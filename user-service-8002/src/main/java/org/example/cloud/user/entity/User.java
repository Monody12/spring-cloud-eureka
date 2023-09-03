package user.entity;

import lombok.Data;

@Data
public class User{
    private Integer id;
    private String username;
    private String nickname;
    private String password;
}