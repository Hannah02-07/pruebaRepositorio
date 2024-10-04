public class codigo {
    public static void main (string [] args){
        char [] palabra1={'a','m','o','r'};
        char[] palabra2={'r','o','m','a'};
        int contador =0;
        int longPalabra1= palabra1.length;
        int longPalabra2 = palabra2.length;
        for (int i=0 ; i<longPalabra1; i++){
            for(int j=0; j <longPalabra2; j++ ){
                if (palabra1[i]==palabra2[j]){
                    contador++;
                    palabra2[j]=' ';
                    break;
                    if (contador==longPalabra1){
                        System.out.print("son anagramas");
                    }
                    else{
                        System.out.print("no son anagramas");
                }
                }
            }
        }







}
}