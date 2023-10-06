package Problema2;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class MainMall {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Interface serviceMall = new ServiceMall();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Que servicio requiere?");
            System.out.println("1. Agregar centro comercial");
            System.out.println("2. Actualizar centro comercial");
            System.out.println("3. Eliminar centro comercial");
            System.out.println("4. Consultar los centros comerciales disponibles");
            System.out.println("5. Salir");

            int option = scanner.nextInt();
            scanner.nextLine();

            if (option == 1) {
                System.out.println("Ingrese el ID:");
                int id = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Ingrese el nombre del centro comercial:");
                String nameMall = scanner.nextLine();

                System.out.println("Ingrese la ciudad:");
                String city = scanner.nextLine();

                System.out.println("Ingrese la dirección:");
                String direction = scanner.nextLine();

                DTO dto = new DTO(id, nameMall, city, direction);
                serviceMall.save(dto);
            } else if (option == 2) {
                System.out.println("Ingrese el ID de la información a actualizar:");
                int id = scanner.nextInt();
                scanner.nextLine();

                DTO dto = serviceMall.findById(id);

                if (dto == null) {
                    System.out.println("No se encontró información con ese ID.");
                } else {
                    System.out.println("Ingrese el nuevo nombre del centro comercial:");
                    String nameMall = scanner.nextLine();

                    System.out.println("Ingrese la nueva ciudad:");
                    String city = scanner.nextLine();

                    System.out.println("Ingrese la nueva dirección:");
                    String direction = scanner.nextLine();

                    dto.setNameMall(nameMall);
                    dto.setCity(city);
                    dto.setDirection(direction);

                    serviceMall.update(dto);
                }
            } else if (option == 3) {
                System.out.println("Ingrese el ID de la información a eliminar:");
                int id = scanner.nextInt();
                scanner.nextLine();

                DTO dto = serviceMall.findById(id);

                if (dto == null) {
                    System.out.println("No se encontró información con ese ID.");
                } else {
                    serviceMall.delete(dto);
                }
            } else if (option == 4) {
                List<DTO> allDtos = serviceMall.findAll();
                System.out.println("Centros comerciales disponibles:");
                for (DTO d : allDtos) {
                    System.out.println("ID: " + d.getId() + ", Nombre: " + d.getNameMall() + ", Ciudad: " + d.getCity() + ", Dirección: " + d.getDirection());
                }
            } else if (option == 5) {
                break;
            } else {
                System.out.println("Opción inválida.");
            }
        }
    }
}
