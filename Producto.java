package carrito.tp5;

//-----------------------CLASE PRODUCTO--------------------------

class Producto {  //  CREO LA CLASE PRODCUTO
	// ATRIBUTOS DE LA CLASE PRODUCTO
    String ProdNombre;  
    int ProdCantidad;    
    double ProdPrecio;

    // CREO EL CONSTRUCTOR QUE LLEVA EL MISMO NOMBRE QUE LA CLASE Y SE USA PARA INICIALIZAR LOS ATRIBUTOS
    // DE LA CLASE, AL SER INSTANCIADA
    
    public Producto(String ProdNombre, int ProdCantidad, double ProdPrecio){  
        this.ProdNombre = ProdNombre; 
        this.ProdCantidad= ProdCantidad; 
        this.ProdPrecio = ProdPrecio;
    }
}

//-----------CREO LA CLASE itemCarrito, que HEREDA DE PRODUCTO------------------------

class itemCarrito extends Producto{   
    double ItemCPrecTotal; // ATRIBUTO PROPIO DE LA CLASE CARRITO
    
    // CONSTRUCTOR DE LA CLASE itemCarrito
        public itemCarrito(String ProdNombre, int ProdCantidad, double ProdPrecio, double ItemCPrecTotal){

        super(ProdNombre, ProdCantidad, ProdPrecio);  
        this.ItemCPrecTotal =  ItemCPrecTotal;  		   
    }

}


//-----------CREO LA CLASE DESCUENTO, QUE HEREDA DE ITEMCARRITO------------------------

class Descuento extends itemCarrito { // CREO LA CLASE Descuento, que HEREDA DE itemCarrito
    double DescuentoDesc;  // ATRIBUTO PROPIO DE LA CLASE DESCUENTO

    // constructor de la clase Descuento
    
    public Descuento(String ProdNombre, int ProdCantidad, double ProdPrecio, double ItemCPrecTotal, double DescuentoDesc){
        super(ProdNombre,ProdCantidad,ProdPrecio,ItemCPrecTotal);
        this.DescuentoDesc = DescuentoDesc;
    }


}