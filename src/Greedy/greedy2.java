package Greedy;

import java.util.ArrayList;
import java.util.List;


class greedy2 {
    public static void main(String[] args) {
        double[] Coordenadas = {-3.5 , -2.8 , -1.7 , -1.6 , -1.0 , 0.8 , 1 , 1.5}; //lista de coordenadas ordenadas de manera ascendente
        
        List<double[]> listIntervalos =  new Funcion().Intervalos(Coordenadas);
        
        listIntervalos.forEach(a -> {
            System.out.println("{" + a[0] + " , " + a[1]+"}");
        });
    }
}

class Funcion{
    public List<double[]> Intervalos(double[] coordenadas){
        
        int cont = 0;
        int start = 0;
        
        double[] ITemp = new double[2];
        
        List<double[]> listIntervalos = new ArrayList<>();
        
        while(cont <= coordenadas.length -1){
            ITemp [0] = coordenadas[start];
            ITemp [1] = coordenadas[start] + 1; 
            if(coordenadas[cont] >= ITemp[0] && coordenadas[cont] <= ITemp[1]){
                cont++;
            }else{
                start = cont ;
                cont++;
                listIntervalos.add(new double[]{ITemp[0] , ITemp[1]});
            }
        }
        
        listIntervalos.add(new double[]{ITemp[0] , ITemp[1]});

        return listIntervalos;
    }
}

