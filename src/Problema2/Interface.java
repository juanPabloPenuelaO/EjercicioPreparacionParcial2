package Problema2;

import Problema2.DTO;
import java.io.IOException;
import java.util.List;
public interface Interface {

    DTO findById(int id);

    List<DTO> findAll()throws IOException, ClassNotFoundException;
    void save(DTO toy) throws IOException;
    void update(DTO toy) throws IOException;
    void delete(DTO toy) throws IOException;

}
