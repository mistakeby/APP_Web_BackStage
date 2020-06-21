package server.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import server.pojo.Pagination;
import java.util.List;
@Data
@AllArgsConstructor
public class TableResult<T> {
    private List<T> AS;
    private Pagination pagination;
}
