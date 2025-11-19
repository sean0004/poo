package Clase3;

public class Variables{

    public static void main ( String [] args ) {

        double d1 = 42.0;
        double d2 = 58.5;
        double d3 = 37.2;
        double t1 = 0.9;
        double t2 = 1.4;
        double t3 = 0.8;
        double l1 = 5.1;
        double l2 = 6.9;
        double l3 = 4.3;
        double precioLitro = 1.35;
        double masaCargaKg = 1200;
        double largo = 2.0;
        double ancho = 1.2;
        double alto = 1.1;
        double p1 = 2.5;
        double p2 = 3.0;
        double p3 = 2.0;
        double deprecPorKm = 0.08;
        double volCamionM3 = 10.0;
        double fCO2 = 2.68;
        double galPorLitro = 0.264172;
        double vmín = 30;
        double vmáx = 90;
        double va = 40;
        double vb = 80;
        double ca = 0.05; 
        double cb = 0.09;
        double a = -0.0008;
        double b = 0.08;
        double c = 4.0;
        double v1 = 0;
        double v2 = 0;
        double v3 = 0;
        double Vprom = 0;
        double kml1 = 0;
        double kml2 = 0;
        double kml3 = 0;
        double kmltotal = 0;
        double costoComb = 0;
        double deprec = 0;
        double peajes = 0;
        double costoDirecto = 0;
        double costoPorKm = 0;
        double volumenM3 = 0;
        double densidad = 0;
        double ocupacion = 0;
        double CO2Total = 0;
        double CO2porKm = 0;
        double vms = 0;
        double galTot = 0;
        double vnorm = 0;
        double vmedia = 0;
        double vpond_t = 0;
        double  raiz = 0;
        double cvprom = 0;
        double costoMant = 0;
        double kmlv = 0;
        double kmlModelo = 0;
        double litrosModelo = 0;
        double w1 = 0.25;
        double w2 = 0.25;
        double w3 = 0.25;
        double w4 = 0.25;
        double score = 0;

        v1 = d1 / t1;
        v2 = d2 / t2;
        v3 = d3 / t3;
        Vprom = (d1 * v1 + d2 * v2 + d3 * v3) / (d1 + d2 + d3);

        System.out.println("El resultado es:" + v1);
        System.out.println("El resultado es:" + v2);
        System.out.println("El resultado es:" + v3);
        System.out.println("El resultado es:" + Vprom);
         
        kml1 = d1 / l1;
        kml2 = d2 / l2;
        kml3 = d3 / l3;
        kmltotal = (d1 + d2 + d3) / ( l1 + l2 + l3);

        System.out.println("El resultado es:" + kml1);
        System.out.println("El resultado es:" + kml2);
        System.out.println("El resultado es:" + kml3);

        costoComb = (l1+l2+l3) * precioLitro;
        deprec = (d1+d2+d3) * deprecPorKm;
        peajes = p1+p2+p3;
        costoDirecto = costoComb + deprec + peajes;
        costoPorKm = (costoDirecto) / (d1 + d2 + d3);

        System.out.println("El resultado es:" + costoComb);
        System.out.println("El resultado es:" + deprec);
        System.out.println("El resultado es:" + costoDirecto);
        System.out.println("El resultado es:" + costoPorKm);

        volumenM3 = largo*ancho*alto;
        densidad = masaCargaKg / volumenM3;
        ocupacion = volumenM3 / volCamionM3;

        System.out.println("El resultado es:" + volumenM3);
        System.out.println("El rsultado es:" + densidad);
        System.out.println("El resultado es:" + ocupacion);

        CO2Total = (l1 + l2 + l3) * fCO2;
        CO2porKm = CO2Total / (d1 + d2 + d3);

        System.out.println("El resultado es:" + CO2Total);
        System.out.println("El resulatdo es:" + CO2porKm);

        vms = Vprom * (1000 / 3600);
        galTot = ( l1 + l2 + l3) * galPorLitro;

        System.out.println("El resultado es:" + vms);
        System.out.println("El resultado es:" + galTot);

        vnorm = (Vprom - vmín) / (vmáx - vmín);

        System.out.println("El resultado es." + vnorm);

        vmedia = (v1 + v2 + v3) / 3;
        raiz = Math.sqrt((Math.pow(v1 - vmedia, 2) + Math.pow(v2 - vmedia, 2) + Math.pow(v3 - vmedia, 2)) / 3); 

        System.out.println("El resultado es:" + vmedia);
        System.out.println("El resultado es:" + raiz);

        vpond_t = (t1 * v1 + t2 * v2 + t3 * v3) / (t1 + t2 + t3);
        
        System.out.println("El resultado es:" + vpond_t);

        cvprom = ca + (cb - ca) * (Vprom - va) / (vb - va);
        costoMant = cvprom * (d1 + d2 + d3);
        
        System.out.println("El resultado es:" + cvprom);
        System.out.println("El resultado es:" + costoMant);

        kmlv = a*Math.pow(Vprom, 2) + b * Vprom + c;
        kmlModelo = kmlv * Vprom;
        litrosModelo = (d1 + d2 + d3) / kmlModelo;

        System.out.println("El resultado es:" + kmlv);
        System.out.println("el resultado es:" + kmlModelo);
        System.out.println("El resultado es:" + litrosModelo);

        score = (w1 * 1) / costoPorKm + w2 * kmltotal + (w3 * 1) / CO2porKm + (w4 * 1) / (1 + raiz);

         System.out.println("El resultado es:" + score);
         

         




        

        





        


         





        



    












        







    }

} 