package tenniskata;
public class TennisKata { 
 
    //Defino las variables a utilizar 
    //Control de juegos 
    public static int juegosJ1; 
    public static int juegosJ2; 
     
    //Array de puntos 
    static int marcador[]={0,15,30,40,100,200}; 
     
    //Posición en el array marcadores 
    public static int posJ1=0; 
    public static int posJ2=0; 
     
     
     
    public static void main(String[] args) { 
         
      
        while (juegosJ1 <6 && juegosJ2 <6) 
     { 
         //Creo el punto aleatorio (true punto J1 false punto J2) 
         if (crearPunto()) 
         { 
         //Punto para el jugador J1 
                switch(posJ1) 
 
                { 
                //40 
                case 2: 
                    switch(posJ2) 
                    {  
                        case 3: 
                            posJ1=posJ1+1; 
                            TennisKata.mostrarMarcador(posJ1, posJ2, juegosJ1, juegosJ2); 
                            System.out.println("Deuce"); 
                            TennisKata.resetVariablesDeuce(); 
                            break; 
                        default: 
                            posJ1=posJ1+1; 
                            TennisKata.mostrarMarcador(posJ1, posJ2, juegosJ1, juegosJ2); 
                            break;                      
                    } 
                break; 
                //+1     
                case 3: 
                    switch(posJ2) 
                    {  
                        case 3: 
                            posJ1=posJ1+1; 
                            System.out.println("Ventaja J1");                             
                            TennisKata.mostrarMarcador(posJ1, posJ2, juegosJ1, juegosJ2); 
                            break; 
                        case 4: 
                            posJ1=posJ1+1; 
                            TennisKata.resetVariablesDeuce(); 
                            TennisKata.mostrarMarcador(posJ1, posJ2, juegosJ1, juegosJ2); 
                            System.out.println("Deuce");                             
                            break; 
                        default: 
                            posJ1=posJ1+1; 
                            System.out.println("Juego para el J1"); 
                            juegosJ1=juegosJ1+1;  
                            TennisKata.mostrarJuegos(juegosJ1, juegosJ2); 
                            TennisKata.resetVariables();                                
                            break;                                                   
                    } 
                   break; 
                //+2 
                case 4: 
                    posJ1=posJ1+1; 
                    System.out.println("Juego para el J1"); 
                    juegosJ1=juegosJ1+1;  
                    TennisKata.mostrarJuegos(juegosJ1, juegosJ2); 
                    TennisKata.resetVariables(); 
                        
                    break;  
                default: 
                    posJ1=posJ1+1; 
                    TennisKata.mostrarMarcador(posJ1, posJ2, juegosJ1, juegosJ2); 
                    break;                     
 
                }; 
         } 
         else 
         { 
         //punto J2 
                switch(posJ2) 
 
                { 
                //40 
                case 2: 
                    switch(posJ1) 
                    {  
                        case 3: 
                            posJ2=posJ2+1; 
                            TennisKata.mostrarMarcador(posJ1, posJ2, juegosJ1, juegosJ2); 
                            System.out.println("Deuce"); 
                            TennisKata.resetVariablesDeuce(); 
                            break; 
                        default: 
                            posJ2=posJ2+1; 
                            TennisKata.mostrarMarcador(posJ1, posJ2, juegosJ1, juegosJ2); 
                            break;         
                    }           
                break; 
                //+1     
                case 3: 
                    switch(posJ1) 
                    {  
                        case 3: 
                            posJ2=posJ2+1; 
                            System.out.println("Ventaja J2");                             
                            TennisKata.mostrarMarcador(posJ1, posJ2, juegosJ1, juegosJ2); 
                            break; 
                        case 4: 
                            posJ2=posJ2+1; 
                            TennisKata.resetVariablesDeuce(); 
                            TennisKata.mostrarMarcador(posJ1, posJ2, juegosJ1, juegosJ2); 
                            System.out.println("Deuce");                             
                            break; 
                       default: 
                            posJ2=posJ2+1; 
                            System.out.println("Juego para el J2"); 
                            juegosJ2=juegosJ2+1;  
                            TennisKata.mostrarJuegos(juegosJ1, juegosJ2);                             
                            TennisKata.resetVariables();   
                            break;        
                    }  
                    break; 
                //+2 
                case 4: 
                    posJ2=posJ2+1; 
                    System.out.println("Juego para el J2"); 
                    juegosJ2=juegosJ2+1;  
                    TennisKata.mostrarJuegos(juegosJ1, juegosJ2);                             
                    TennisKata.resetVariables();                          
                    break;  
                default:  
                    posJ2=posJ2+1; 
                    TennisKata.mostrarMarcador(posJ1, posJ2, juegosJ1, juegosJ2); 
                    break;                     
                }; 
         } 
     } 
     if (juegosJ1 ==6) 
     { 
     System.out.println("¡J1 Ganador del Juego!"); 
     } 
     else 
     System.out.println("¡J2 Ganador del Juego!"); 
  } 
 
         
             
 
 
     
     
    public static boolean crearPunto(){ 
        int numeroAleatorio = (int) (Math.random()*10+1); 
        if (numeroAleatorio%2==0) 
            return true;   
        else 
            return false;    
    } 
    public static void resetVariables(){ 
    posJ1=0; 
    posJ2=0;     
    } 
    public static void resetVariablesDeuce(){ 
    posJ1=3; 
    posJ2=3;  
    } 
     
    public static void mostrarMarcador(int posJ1,int posJ2,int juegosJ1, int juegosJ2){ 
     
        if(marcador[posJ1]==100) 
        { 
        //V 
            System.out.println("V - " + marcador[posJ2]+ "   Juegos: " + juegosJ1 +" "+ juegosJ2 );             
        } 
        if(marcador[posJ2]==100) 
        { 
        //V 
            System.out.println(marcador[posJ1]+ " - V   Juegos: " + juegosJ1 +" "+ juegosJ2 );         
        } 
         
        if(marcador[posJ1]!=100 && marcador[posJ2]!=100) 
        { 
        System.out.println(marcador[posJ1]+ " - " + marcador[posJ2]+ "   Juegos: " + juegosJ1 +" "+ juegosJ2 ); 
        } 
    } 
     
    public static void mostrarJuegos(int juegosJ1, int juegosJ2){ 
     
        System.out.println("   Juegos: " + juegosJ1 +" "+ juegosJ2 ); 
         
    }     
} 
