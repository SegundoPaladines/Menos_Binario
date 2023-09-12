import java.util.Random;

import javax.swing.JOptionPane;

public class App {

    public static int DeterminarMayor(int[] vector){

        int resultado=0;
        int tamano = vector.length;

        for(int i=0; i<tamano; i++){

            resultado=vector[i];

            if(vector[i]>resultado){

                resultado=vector[i];

            }

        }
        return resultado;
    }

    public static int [] LlenarVector(int [] vector){

        int tamano = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño del vector"));

        for (int i=0; i<tamano; i++){

            vector[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el elemento " +i));

        }


        return vector;

    }

    public static int calcularPromedio(int [] vector){

        int tamano=vector.length;
        int resultado=0;
        for (int i=0; i<tamano; i++){

            resultado=resultado+vector[i];

        }

        resultado=resultado/tamano;

        return resultado;

    }

    public static void Adivinar(){
        Random r = new Random();
        int numero = r.nextInt(100);
        System.out.println(numero);

        int adv=-1;

        while(adv!=numero){

            adv=Integer.parseInt(JOptionPane.showInputDialog("Ingrese Un Numero"));
            if(adv>numero){

                JOptionPane.showMessageDialog(null, "El munero Ingresado Es Mayor");

            }else if(adv<numero){

                JOptionPane.showMessageDialog(null, "El munero Ingresado Es Menor");

            }else{
                JOptionPane.showMessageDialog(null, "Adivinaste Adivinador");
            }

        }
    }

    public static void AdivinarPC(){

        String[] respuestas = {
				
            "Es Mayor",
            "Es Menor",
            "Es Mi Numero"
        };

        String respuesta="";
        int inicio = 1;
        int termina= 100;
        int rango = 0;
        if((inicio+termina)%2==0){
            rango = (inicio+termina)/2;
        }else{
            rango = ((inicio+termina)+1)/2;
        }
        int numero=termina/2;

        while(!respuesta.equalsIgnoreCase("Es Mi Numero")){
            try {


                respuesta= (String) JOptionPane.showInputDialog(null,numero + " Es Mayor, Menor O Igual Que Su Numero", "Numero", JOptionPane.DEFAULT_OPTION, null, respuestas, respuestas[0]);

                if(respuesta.equalsIgnoreCase("Es Mayor")){

                        termina=numero-1;
                        rango=termina-inicio;

                }else if(respuesta.equalsIgnoreCase("Es Menor")){

                        inicio=numero+1;
                        rango=termina-inicio;
                }
                else{
                    JOptionPane.showMessageDialog(null, "El Numero es: "+numero);
                }

                numero=inicio+(rango/2);
                System.out.println("=========================================================================================");
                System.out.println("El numero es: " + numero +" inicio: "+inicio + " termina: " + termina);
                System.out.println("Rango: " + rango);
                System.out.println("=========================================================================================");
                if(rango<=0){

                    JOptionPane.showMessageDialog(null, "El Numero es: "+numero);
                        break;

                }
                rango=rango/2;
                
            } catch (Exception e) {

                JOptionPane.showMessageDialog(null,"Exepcion Capturada :\n"+e.getMessage().toString(), "Error",1);

            }
        }
    }
    public static void main(String[] args) throws Exception {

        
        System.out.println(aleatorios);

        AdivinarPC();
    }
}
