package umc.test.board.dto.user;
import lombok.Getter;
import umc.test.board.domain.User;

@Getter
public class UserResponseDto {
    private Long id;
    private String name;
    private int age;

    public UserResponseDto(User entity) {
        this.id = entity.getId();
        this.name = entity.getName();
        this.age = entity.getAge();
    }
}