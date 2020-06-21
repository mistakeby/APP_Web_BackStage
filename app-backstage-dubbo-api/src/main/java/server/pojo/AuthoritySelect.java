package server.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class AuthoritySelect<T> {
    private List<T> AS;
}
