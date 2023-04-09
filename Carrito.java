package carrito.tp5;
// PLANTEO TP5 

import java.util.Scanner;

public class Carrito {
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);  // obj teclado, para leer datos de pantalla
       System.out.println("Por favor, ingrese un producto a su carrito.."); 
       System.out.println("............................................."); 
       System.out.println("Ingrese el nombre del producto: "); 
       String ProdNombre1 =   teclado.next();

       System.out.println("Ingrese la cantidad: "); 
       int ProdCantidad1 = teclado.nextInt();
       
       System.out.println("Ingrese el precio: "); 
       int ProdPrecio1 = teclado.nextInt();
       
       Producto comprar = new Producto(ProdNombre1,ProdCantidad1,ProdPrecio1 ); // tomate 8 100
                 
       //double ItemCPrecTotal;
       itemCarrito itemC = new itemCarrito(comprar.ProdNombre, comprar.ProdCantidad, comprar.ProdPrecio,comprar.ProdCantidad*comprar.ProdPrecio);
        System.out.println("Precio sin descuento: " + itemC.ItemCPrecTotal);

        if(itemC.ItemCPrecTotal>1000){
            Descuento compraDesc = new Descuento(
            		itemC.ProdNombre,
            		itemC.ProdCantidad,
            		itemC.ProdPrecio,
            		itemC.ItemCPrecTotal,
            		itemC.ItemCPrecTotal - (itemC.ItemCPrecTotal * 0.10)
            );
            double total = compraDesc.DescuentoDesc;
            System.out.println("Producto a llevar : " + itemC.ProdNombre);
            System.out.println("Precio Unitario ($): " + itemC.ProdPrecio);
            System.out.println("Cantidad: " + itemC.ProdCantidad);
            System.out.println("Total: " + itemC.ItemCPrecTotal);
            System.out.println("..............................."); 
            System.out.println("Descuento del 10%: " + itemC.ItemCPrecTotal * 0.10);
            System.out.println("...............................");
            System.out.println("Total a pagar con descuento: " + total);
            
        }else{
        	System.out.println("Producto: " + itemC.ProdNombre);
            System.out.println("Precio Unitario: " + itemC.ProdPrecio);
            System.out.println("Cantidad: " + itemC.ProdCantidad);
            System.out.println("Total: " + itemC.ItemCPrecTotal);
            System.out.println("..............................."); 
            System.out.println("Sin descuento. La compra debe superar los 1000$...");
        }
    }
}