import java.io.*;
import java.util.Scanner;
import java.util.Vector;

public class Main {
    public static void main(String[] args) throws IOException {
        int opcion = 0;
        int opcion2 = 0;

        Scanner entry = new Scanner(System.in);
        Scanner entry2 = new Scanner(System.in);
        Scanner entry3 = new Scanner(System.in);

        VectorH<Paciente> vector = new VectorH<>();
        MyJcF<Paciente> heap = new MyJcF<>();

        System.out.println("*-----Bienvenido a Doctores Queue-----*");
        System.out.println("\n Ingrese su opcion: \n1.HeapVector \n2.Java Collections Framework \n3.Salir \n");
        opcion = entry.nextInt();

        while (opcion == 1) {
            if (opcion == 1) {
                System.out.println("Ingrese el nombre del archivo de pacientes que desea analizar: ");
                String archivo = entry2.nextLine();
                try {
                    BufferedReader file = new BufferedReader(new FileReader(archivo));
                    String line;

                    while ((line = file.readLine()) != null) {
                        String[] temp = line.split(", ");
                        String nombre = temp[0];
                        String condici = temp[1];
                        String codigo = temp[2];
                        vector.add(new Paciente(nombre, condici, codigo));
                    }
                    file.close();
                } catch (FileNotFoundException e) {
                    System.out.println("El siguiente archivo no existe");
                }

                System.out.println("Ingrese la opcion que desea: \n1.Revisar el siguiente paciente \n2.Pedir al siguiente paciente \n3.Salir \n");
                opcion2 = entry3.nextInt();

                while (opcion2 != 3) {
                    if (opcion2 == 1) {
                        if (!vector.isEmpty()) {
                            System.out.println("El siguiente paciente a ser atendido es: ");
                            System.out.println(vector.getFirst().toString());
                            System.out.println("Ingrese la opcion que desea: \n1.Revisar el siguiente paciente \n2.Pedir al siguiente paciente \n3.Salir \n");
                            opcion2 = entry3.nextInt();
                        } else {
                            System.out.println("Ya no hay pacientes para ser atendidos");
                            System.out.println("Ingrese la opcion que desea: \n1.Revisar el siguiente paciente \n2.Pedir al siguiente paciente \n3.Salir \n");
                            opcion2 = entry3.nextInt();
                        }
                    } else if (opcion2 == 2) {
                        if (!vector.isEmpty()) {
                            System.out.println("Estara atendiendo a: ");
                            System.out.println(vector.remove().toString());
                            System.out.println("Ingrese la opcion que desea: \n1.Revisar el siguiente paciente \n2.Pedir al siguiente paciente \n3.Salir \n");
                            opcion2 = entry3.nextInt();
                        } else {
                            System.out.println("Ya no existen pacientes ha ser atendidos");
                            System.out.println("Ingrese la opcion que desea: \n1.Revisar el siguiente paciente \n2.Pedir al siguiente paciente \n3.Salir \n");
                            opcion2 = entry3.nextInt();
                        }
                    } else {
                        System.out.println("Se ingreso una opcion no valida, porfavor intente nuevamente");
                        System.out.println("Ingrese la opcion que desea: \n1.Revisar el siguiente paciente \n2.Pedir al siguiente paciente \n3.Salir \n");
                        opcion2 = entry3.nextInt();
                    }
                }
                System.out.println("\n");
                System.out.println("Si desea ingresar otra opcion: \n1.HeapVector \n2.Java Collections Framework \n3.Salir \n");
                opcion = entry.nextInt();
            } else if (opcion == 2) {
                System.out.println("Ingrese el nombre del archivo de pacientes que desea analizar: ");
                String archivo = entry2.nextLine();
                try {
                    BufferedReader file = new BufferedReader(new FileReader(archivo));
                    String line;

                    while ((line = file.readLine()) != null) {
                        String[] temp = line.split(", ");
                        String nombre = temp[0];
                        String condici = temp[1];
                        String codigo = temp[2];
                        vector.add(new Paciente(nombre, condici, codigo));
                    }
                    file.close();
                } catch (FileNotFoundException e) {
                    System.out.println("El siguiente archivo no existe");
                }

                System.out.println("Ingrese la opcion que desea: \n1.Revisar el siguiente paciente \n2.Pedir al siguiente paciente \n3.Salir \n");
                opcion2 = entry3.nextInt();

                while (opcion2 != 3) {
                    if (opcion2 == 1) {
                        if (!vector.isEmpty()) {
                            System.out.println("El siguiente paciente a ser atendido es: ");
                            System.out.println(vector.getFirst().toString());
                            System.out.println("Ingrese la opcion que desea: \n1.Revisar el siguiente paciente \n2.Pedir al siguiente paciente \n3.Salir \n");
                            opcion2 = entry3.nextInt();
                        } else {
                            System.out.println("Ya no hay pacientes para ser atendidos");
                            System.out.println("Ingrese la opcion que desea: \n1.Revisar el siguiente paciente \n2.Pedir al siguiente paciente \n3.Salir \n");
                            opcion2 = entry3.nextInt();
                        }
                    } else if (opcion2 == 2) {
                        if (!vector.isEmpty()) {
                            System.out.println("Estara atendiendo a: ");
                            System.out.println(vector.remove().toString());
                            System.out.println("Ingrese la opcion que desea: \n1.Revisar el siguiente paciente \n2.Pedir al siguiente paciente \n3.Salir \n");
                            opcion2 = entry3.nextInt();
                        } else {
                            System.out.println("Ya no existen pacientes ha ser atendidos");
                            System.out.println("Ingrese la opcion que desea: \n1.Revisar el siguiente paciente \n2.Pedir al siguiente paciente \n3.Salir \n");
                            opcion2 = entry3.nextInt();
                        }
                    } else {
                        System.out.println("Se ingreso una opcion no valida, porfavor intente nuevamente");
                        System.out.println("Ingrese la opcion que desea: \n1.Revisar el siguiente paciente \n2.Pedir al siguiente paciente \n3.Salir \n");
                        opcion2 = entry3.nextInt();
                    }
                }
                System.out.println("\n");
                System.out.println("Si desea ingresar otra opcion: \n1.HeapVector \n2.Java Collections Framework \n3.Salir \n");
                opcion = entry.nextInt();

            } else {
                System.out.println("La opcion que ingreso no es valida: ");
                System.out.println("Si desea ingresar otra opcion: \n1.HeapVector \n2.Java Collections Framework \n3.Salir \n");
                opcion = entry.nextInt();
            }
        }
        System.out.println("Gracias por utilizar el programa");
    }
}
