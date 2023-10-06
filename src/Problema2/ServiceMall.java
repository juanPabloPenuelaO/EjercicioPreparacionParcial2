package Problema2;

import Problema2.Serializable;
import Problema2.Interface;
import Problema2.DTO;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
public class ServiceMall implements Interface{

        private final String FILE_NAME = "dto.ser";
        private List<DTO> dtoList;

        public ServiceMall() {
            try {
                dtoList = (List<DTO>) Serializable.readObjectFromFile(FILE_NAME);
            } catch (IOException | ClassNotFoundException e) {
                dtoList = new ArrayList<>();
            }
        }

        @Override
        public DTO findById(int id) {
            for (DTO dto : dtoList) {
                if (dto.getId() == id) {
                    return dto;
                }
            }
            return null;
        }

        @Override
        public List<DTO> findAll() throws IOException, ClassNotFoundException {
            return dtoList;
        }

        @Override
        public void save(DTO dto) throws IOException {
            dtoList.add(dto);
            Serializable.writeObjectToFile(dtoList, FILE_NAME);
        }

        @Override
        public void update(DTO dto) throws IOException {
            for (int i = 0; i < dtoList.size(); i++) {
                if (dtoList.get(i).getId() == dto.getId()) {
                    dtoList.set(i, dto);
                    Serializable.writeObjectToFile(dtoList, FILE_NAME);
                    return;
                }
            }
        }

        @Override
        public void delete(DTO dto) throws IOException {
            dtoList.removeIf(d -> d.getId() == dto.getId());
            Serializable.writeObjectToFile(dtoList, FILE_NAME);
        }
    }