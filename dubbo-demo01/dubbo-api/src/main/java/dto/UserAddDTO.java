package dto;

import java.io.Serializable;

/**
 * @Description:
 * @Author: Roark
 * @Date: 2023/1/17
 * @Version V1.0
 */
public class UserAddDTO implements Serializable {

    /**
     * 昵称
     */
    private String name;
    /**
     * 性别
     */
    private Integer gender;

    public String getName() {
        return name;
    }

    public UserAddDTO setName(String name) {
        this.name = name;
        return this;
    }

    public Integer getGender() {
        return gender;
    }

    public UserAddDTO setGender(Integer gender) {
        this.gender = gender;
        return this;
    }
}
