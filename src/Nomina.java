import java.util.HashMap;
import java.util.Scanner;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;

public class Nomina {

	public  String fecha;
	public int id;
	
	Nomina(int id, String fecha){
		this.id=id;
		this.fecha = fecha;
	}
	
		
	Cargo crg1 = new Cargo(1, "Auxiliar", 5000);
	Cargo crg2 = new Cargo(2, "Jefe", 6000);
	
    public static void main(String[] args){
   
      HashMap<Integer,String> nomina = new HashMap<Integer,String>();

      Scanner lector = new Scanner(System.in);

      int codigo;

      String fecha;

      int opcion = 0;
      
      while(opcion!=6){

          System.out.println("Escoja una opcion: ");

          System.out.println("1. Agregar Nomina");

          System.out.println("2. Listar la nomina");

          System.out.println("3. Elimina registro");

          System.out.println("4. calculadora");
          
          System.out.println("5. listar Empleado y Total a pagar");
          
          System.out.println("6 Salir");

          opcion=lector.nextInt();

        switch(opcion){

              case 1:  

              for (int i = 1; i<=2; i++)

              {

                  System.out.println("Ingrese el id del empleado a la nomina, empleado"+" "+i);

                  codigo=lector.nextInt();

                  System.out.println("Fecha de ingreso a nomina (dd/MM/yyyy): ");

                  fecha=lector.next();

                  agregarNominaEmp(codigo,fecha,nomina);

                  

              }

              break;

              

              case 2:

                  mostrarNomina(nomina);

                  break;

                  

              case 3:

                  System.out.println("Introduzca el idnomina: ");

                  codigo=lector.nextInt();

                  eliminar(codigo,nomina);

                  break;
                  
              case 4:

                  System.out.println("Mostrar Calculadora ");

                  codigo=lector.nextInt();

                  calculadora();

                  break;
                  
              case 5:
     
            	   	  //codigo=lector.nextInt();
                      List<Empleado> ejemploLista = new ArrayList<Empleado>();
                	  List<Cargo> ejemploLista2 = new ArrayList<Cargo>();
                      ejemploLista.add(new Empleado(1,"1020410", "Kate"));
                      ejemploLista.add(new Empleado(2,"1020416", "osman"));
                      ejemploLista.add(new Empleado(3,"1050917", "Richard"));
                      ejemploLista.add(new Empleado(4,"1254917", "Pacho"));
                      ejemploLista.add(new Empleado(5,"1256717", "Edilberto"));
                      ejemploLista2.add(new Cargo(1, "Auxiliar", 1000000));
                      ejemploLista2.add(new Cargo(2, "Vendedor", 1200000));
                      ejemploLista2.add(new Cargo(3, "Auxiliar", 1000000));
                      ejemploLista2.add(new Cargo(4, "Asesor", 1300000));
                      ejemploLista2.add(new Cargo(5, "Coordinador", 1400000));
                      System.out.println(ejemploLista.size());
                      
                      System.out.println("Lista de empleados con el total a pagar");
                      System.out.println("-----------------------------------");
                      for (int i = 0; i <=4; i++) {
                          
                          if (ejemploLista2.get(i).id == ejemploLista.get(i).id ) { //<-- sólo se toman encuenta los empleados que esten en el cargo 
                        	  System.out.println("ID: " + ejemploLista.get(i).id + " Documento: "
                                      + ejemploLista.get(i).documento + " " +
                                       "Nombre: " + ejemploLista.get(i).nombre + 
                              " Cargo: " + ejemploLista2.get(i).descrip + "  ->Total a pagar : "
                                      + ejemploLista2.get(i).sueldo);
                                      
                          }
                     
                      
                           
      
              }
                      break;

          }

     }

  

  }


  public static void agregarNominaEmp(int idemp,String fecha, HashMap<Integer,String> listNomina){

      if(listNomina.containsKey(idemp)){

          System.out.println("No se puede registrar, existe ya este codigo...");

      }else{

          listNomina.put(idemp, fecha);

      }
   }

  

  public static void mostrarNomina(HashMap<Integer,String> listaNomina){

      int clave;

      Iterator<Integer> empleNomina=listaNomina.keySet().iterator();

      System.out.println("LISTA DE NOMINA: ");

      while(empleNomina.hasNext()){

          clave=empleNomina.next();

          System.out.println(clave+" - "+listaNomina.get(clave));

      }

  }

  

  public static void eliminar(int cod,HashMap<Integer,String> listaNomina){

      if(listaNomina.containsKey(cod)){

          listaNomina.remove(cod);

          System.out.println("Registro"+" "+cod+" "+"eliminado!");

      }else{

          System.out.println("Error no existe registro!");

      }

  }
  
  public static void calculadora() {
	    calcular cal= new calcular();
		
	    cal.sumarnumeros(5,3);
		cal.restarnumeros(5, 2);
		cal.mulnumeros(10, 5);
		cal.divnumeros(6, 4);
				
  }
}
	
	