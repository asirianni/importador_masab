/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package importador;

/**
 *
 * @author adrians
 */
public class Productos {
    private String codigo_proveedor;
    private String codigo_producto;
    private String descripcion_producto;
    String[] lista_cod_productos;

    public String getCodigo_proveedor() {
        return codigo_proveedor;
    }

    public void setCodigo_proveedor(String codigo_proveedor) {
        this.codigo_proveedor = codigo_proveedor;
    }

    public String getCodigo_producto() {
        return codigo_producto;
    }

    public void setCodigo_producto(String codigo_producto) {
        this.codigo_producto = codigo_producto;
    }

    public String getDescripcion_producto() {
        return descripcion_producto;
    }

    public void setDescripcion_producto(String descripcion_producto) {
        this.descripcion_producto = descripcion_producto;
    }
    
    
    
            
}
