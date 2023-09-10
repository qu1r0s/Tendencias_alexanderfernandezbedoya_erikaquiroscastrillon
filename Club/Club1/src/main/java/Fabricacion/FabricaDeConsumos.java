package Fabricacion;

import ClubMax.Club;
import ClubMax.Consumo;
import Consumoimp.Bebida;
import Consumoimp.BebidaCaliente;
import Consumoimp.BebidaNoAlcoholica;
import Consumoimp.Entrada;
import Consumoimp.EntradaCompartir;
import Consumoimp.EntradaUnica;
import Consumoimp.PlatoMixto;
import Consumoimp.PlatoVegano;
import Consumoimp.Postre;
import java.util.ArrayList;

public class FabricaDeConsumos {


    /*public Consumo RegistrarConsumo(int TipoConsumo) {
        switch (TipoConsumo) {
            case 1: {
               System.out.println("Ha elegido la opcion de platos");
               return this.creadorDePlatos(int TipoConsumo);
            }
            case 2: {
               System.out.println("Ha elegido la opcion de Bebidas");
               return this.creadorDeBebidas(int TipoConsumo);
            }
            default: {
               System.out.println("Dato no valido"); 
               return null;
            }
        }
    }   */
    private Consumo creadorDeBebidasAlcoholicas(int bebidaSeleccionada) {
        switch (bebidaSeleccionada) {
            case 1: {

                System.out.println("ha elegido un vodka");
                break;
            }
            case 2: {
                System.out.println("ha elegido un tequila");
                break;
            }

        }
        return null;
    }

    public Consumo creadorDeBebidas(int tipoBebida, int tipoBebidaFria, int detalle) {
        switch (tipoBebida) {
            case 1: {
                return creadorDeBebidasFrias(tipoBebidaFria, detalle);
            }
            case 2: {
                return creadorDeBebidasCalientes(detalle);
            }
            default: {
                return null;
            }
        }
    }

    private Consumo creadorDeBebidasCalientes(int detalle) {
        switch (detalle) {
            case 1: {
                return creadorDeBebidasCalientesAdicion(detalle);
            }
            default: {
                return null;
            }
        }
    }
    private Consumo creadorDeBebidasCalientesAdicion(int detalle) {
        switch (detalle) {
            case 0: {
                String adicion = "Escogio una adicion ";
                String tamaño = "Pequeño";
                String nombreconsumo = "cafe Expreso";
                double precioconsumo = 400;
                return new BebidaCaliente(adicion, tamaño, nombreconsumo, precioconsumo);

            }
            case 1: {
                String adicion = "No Escogio una adicion ";
                String tamaño = "Grande";
                String nombreconsumo = "Aromatica";
                double precioconsumo = 300;
                return new BebidaCaliente(adicion, tamaño, nombreconsumo, precioconsumo);
            }
            default:
                return null;
        }
    }

    private Consumo creadorDeBebidasFrias(int tipoBebidaFria, int detalle) {
        switch (tipoBebidaFria) {
            case 1: {
                return creadorDeBebidasAlcoholicas(detalle);
            }
            case 2: {
                return creadorDeBebidasNoAlcoholicas(detalle);
            }
            default: {
                return null;
            }
        }
    }

    private Consumo creadorDeBebidasNoAlcoholicas(int detalle) {
        switch (detalle) {
            case 0: {
                int gramajeAzucar = 4;
                String tamaño = "Grande";
                String nombreconsumo = "Malteada";
                double precioconsumo = 300;
                return new BebidaNoAlcoholica(gramajeAzucar, tamaño, nombreconsumo, precioconsumo);

            }
            case 1: {
                int gramajeAzucar = 2;
                String tamaño = "Mediano";
                String nombreconsumo = "chocolate frio";
                double precioconsumo = 300;
                return new BebidaNoAlcoholica(gramajeAzucar, tamaño, nombreconsumo, precioconsumo);
            }
            default:
                return null;
        }
    }

    public Consumo creadorDePlatos(int entradas, int tipoplato, int detalle, int platoFuerte, int postre) {
        switch (tipoplato) {
            case 1: {
                return creadorDeEntradas(entradas,detalle);
            }
            case 2: {
                return creadorDePlatoFuerte(platoFuerte,detalle);
            }
            case 3: {
                return creadorDePostres(postre,detalle);
            }
            default: {
                return null;
            }
        }
    }
    private Consumo creadorDeEntradas(int entradas, int detalle) {
        switch (entradas) {
            case 1: {
                return creadorDeEntradaUnica(detalle);
            }
            case 2: {
                return creadorDeEntradaCompartir(detalle);
            }
            default: {
                return null;
            }
        }
    }
        private Consumo creadorDeEntradaUnica(int adicion) {
        switch (adicion) {
            case 0: {
                boolean porcionUnica = true ;
                boolean opcionSalsa = true;
                String nombreconsumo = "PAILFAN ";
                String ingredientes = "Salsas, carne ";
                double precioconsumo = 600;
                return new EntradaUnica(porcionUnica,opcionSalsa,ingredientes, nombreconsumo, precioconsumo);
                
            }
            default:
                return null;
        }
    }
         private Consumo creadorDeEntradaCompartir(int compartir) {
        switch (compartir) {
            case 0: {
                boolean porcionUnica = true ;
                boolean opcionSalsa = false;
                String nombreconsumo = "Mariscos en Salsa ";
                String ingredientes = "Mariscos, Salsas";
                double precioconsumo = 600;
                return new EntradaCompartir(porcionUnica,opcionSalsa,ingredientes, nombreconsumo, precioconsumo);

            }
            default:
                return null;
        }
    }
    
    public Consumo creadorDePlatoFuerte(int platoFuerte, int datalle) {
        switch (platoFuerte) {
            case 1: {
                return creadorDePlatoMixto(datalle);
            }
            case 2: {
                return creadorDePlatoVegano(datalle);
            }
            default: {
                return null;
            }
        }
    }

    private Consumo creadorDePlatoMixto(int adicion) {
        switch (adicion) {
            case 0: {
                String salsas = "Sin adición";
                BebidaNoAlcoholica bebidaFriaNoAlcoholica = (BebidaNoAlcoholica) creadorDeBebidasNoAlcoholicas(1);
                String ingredientes = "Carne res, Pollo, Ensaladas, Papas ";
                String nombreconsumo = "Kebab ";
                String BebidaNoAlcoholica = "Agua de Jamaica ";
                double precioconsumo = 600;
                String mixto = "No ";
                String bebida = "Aguita de coco";
                return new PlatoMixto(salsas,mixto, bebida,ingredientes, nombreconsumo, precioconsumo);

            }
            case 1: {
                String salsas = "Con adicion";
                BebidaNoAlcoholica bebidaFriaNoAlcoholica = (BebidaNoAlcoholica) creadorDeBebidasNoAlcoholicas(1);
                String ingredientes = "Pasta, Carnes, Queso ";
                String nombreconsumo = "spaghetti a la carbonara ";
                String BebidaNoAlcoholica = " Jugos, Aguas ";
                double precioconsumo = 500;
                String mixto = "Si ";
                String bebida = "Aguita de jamaica";
                return new PlatoMixto(salsas,mixto, bebida,ingredientes, nombreconsumo, precioconsumo);
            }
            default:
                return null;
        }
    }

    private Consumo creadorDePlatoVegano(int adicion) {
        switch (adicion) {
            case 0: {

                String adicciones = "Con adicion";
                String BebidaNoAlcoholica = "Jugos, Aguas";
                BebidaNoAlcoholica bebidaFriaNoAlcoholica = (BebidaNoAlcoholica) creadorDeBebidasNoAlcoholicas(1);
                double precioconsumo = 600;
                String nombreconsumo = "Tofu Con Berenjena ";
                String ingredientes = "Tofu, Berenjena, Garbanzo, setas ";
                String mixto = "Si ";
                String bebida = "Aguita de tamarindo";
                return new PlatoVegano(adicciones,  mixto,  bebida, ingredientes, nombreconsumo,precioconsumo);

            }
            case 1: {
                String adicciones = "Con adicion";
                String BebidaNoAlcoholica = "Jugos, Aguas";
                BebidaNoAlcoholica bebidaFriaNoAlcoholica = (BebidaNoAlcoholica) creadorDeBebidasNoAlcoholicas(2);
                double precioconsumo = 600;
                String nombreconsumo = "Sopas Veganas ";
                String ingredientes = "Crema zanahorias, puerros, pimienta ";
                String mixto = "no ";
                String bebida = "Aguita de pera";
                
                return new PlatoVegano(adicciones,  mixto,  bebida, ingredientes, nombreconsumo,precioconsumo);
            }
            default:
                return null;
        }
    }
    public Consumo creadorDePostres(int postre, int datalle) {
        switch (postre) {
            case 1: {
                return creadorDePostre(datalle);
            }
            default: {
                return null;
            }
        }
    }
     private Consumo creadorDePostre(int adicion) {
        switch (adicion) {
            case 0: {
                String nombreconsumo = "Postre de Fresa ";
                String ingredientes = "Fresa, Nata, Helado ";
                double precioconsumo = 400;
                return new Postre(ingredientes, nombreconsumo,  precioconsumo);
            }
            case 1: {
                String nombreconsumo = "Postre - tres leches ";
                String ingredientes = "Leche condensada, Nata, Helado ";
                double precioconsumo = 450;
                return new Postre(ingredientes, nombreconsumo,  precioconsumo);
            }
            
            default:
                return null;
        }
    }
}
