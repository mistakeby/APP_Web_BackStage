package server.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;
@Data
@AllArgsConstructor
public class DataSelect<T> {
    private List<T> DS;
}
