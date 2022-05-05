
package org.proydesa.test;


public class testRepasoMatches {
    
    
    public static void main(String[] args) {
        
        //boolean ban=coincidencia("Jjajsj");
        
        
//        System.out.println(coincidencia("j jajsj"));
//        System.out.println("\n");
//        System.out.println(coincidencia("Jjajs"));
//        System.out.println("\n");
//        System.out.println(coincidencia("1jajsj"));
//        System.out.println("\n");
//        System.out.println(coincidencia("j1jsj"));
//        System.out.println("\n");
//        System.out.println(coincidencia("J@ajsj"));
//        System.out.println("\n");
//        System.out.println(coincidencia("Jjajsjaas"));
    
//           System.out.println(ejercicioUno("4asdasd"));
//           System.out.println("\n");
//           System.out.println(ejercicioUno("4Asdasd"));
//           System.out.println("\n");                      
//           System.out.println(ejercicioUno("4sdasd"));
//           System.out.println("\n");
//           System.out.println(ejercicioUno("4asdasdd"));
//           System.out.println("\n");
//           System.out.println(ejercicioUno("asdasdd"));
           

//           System.out.println(ejercicioDos("54 351 123541"));
//           System.out.println("\n");
//           System.out.println(ejercicioDos("4Asdasd"));
//           System.out.println("\n");                      
//           System.out.println(ejercicioDos("54 351 12354"));
//           System.out.println("\n");
//           System.out.println(ejercicioDos("54351 123541"));
//           System.out.println("\n");
//           System.out.println(ejercicioDos("asdasdd"));
        
           System.out.println(ejercicioTres("54 351 123541"));
           System.out.println("\n");
           System.out.println(ejercicioTres("4Asdasd"));
           System.out.println("\n");                      
           System.out.println(ejercicioTres("AsDd15@gmail.com"));
           System.out.println("\n");
           System.out.println(ejercicioTres("asd15@gmail.com"));
           System.out.println("\n");
           System.out.println(ejercicioTres("asd15@gmail.or"));
    
    }
    
    
        //Devuelve un booleano dependiendo si hay coincidencia o no 
    
    // ^ inicio
    // $ final 
    //Corchetes
    //[a-z] [0-9][a-d] rangos
    //(hola|HOLA) opciones 
    // ? opcional  0 o 1
    // * opcional 0 veces o muchas veces
    // + 1 o muchas
    //{n} cantidad de veces que queremos ver algo de ese tipo 
    
    //Que el usuario SOLO empieze con mayuscula y que el nombre luego tenga 5 letras 
    //minusculas
    public static boolean coincidencia(String texto){
    
        //sintaxis
        //return nombreString.matches("Coincidencia")
        return texto.matches("^[A-Z,a-z]{1}+[ ]+[a-z]{5,10}$");
        //PUEDE TENER COMA EL CASO DE LA CANTIAD DE ELEMENTOS
        //{m,n} siendo m un numero menor y n uno mayor
        //[rango1,rangoDos] para los casos de los rangos nosotros 
        //Podemos expandirlos con una coma dejando siempre los rangos diferenciados
       
        //entre signo menos -
        //[ ] eso distingue un espacio
    
        
    
    }
    
    public static boolean ejercicioUno(String texto){
        
        return texto.matches("^[0-9]{1}+[a-z]{6,7}$");
    
    };

        public static boolean ejercicioDos(String texto){
        
        //return texto.matches("^[5]{1}+[4]{1}+[ ]+[3]{1}+[5]{1}+[1]{1}+[ ]+[0-9]{6}$");
        return texto.matches("^(54 351 ){1}+[0-9]{6}$");
    };  
        
        public static boolean ejercicioTres(String texto){
        
        return texto.matches("^[a-z,A-z]{4}+[0-9]{2}+(@gmail.com){1}$");
    
    };

       
    
}


/*


1)Verificacion para un id de un empleado que
debe empezar por un numero y tener luego entre 6 y 7 letras minusculas

2)Verificar un numero de telefono que debe tener 
54 351 (6 numeros cualquiera)

3)Verificar un correo electronico que tenga lo siguiente

4letras(mayusculas o minusculas) 2 numeros @ gmail.com

ejemplo bien escrito 

asdd15@gmail.com

ejemplo mal escrito

asd15@gmail.or


asd15@gmail.com





*/


/*Extra


Verificador para carga de texto un while
CREAR UN PROGRAMA QUE CARGUE UNA SERIE DE PALABRA A UNA LISTA
PARA ESTO DEBERAN DESARROLAR UN CARGAR TEXTO(SCANNER)
Y LUEGO HACER UNA FUNCION CON UN CICLO EN DONDE PARA CADA SITUACION DE CARGA
NOSOTROS DEBAMOS INDICAR CON UN "SI" O UN "NO" SI QUEREMOS SEGUIR CARGANDO
HACER VERIFICACION EN CASO DE QUE LA PERSONA NO INGRESI NI SI NI NO 
EN ESE CASO SE DEBE DECIR QUE "INGRESO FUE INCORRECTO"
CUANDO SE SELECCIONE EL NO MOSTRAR LA LISTA CARGADA



*/