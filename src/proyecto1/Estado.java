/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

/**
 *
 * @author Jing
 */
public class Estado {
    String CodigoEstado;
    String DescripcionEstado;
    
      public Estado() {
    }

    public Estado(String CodigoEstado, String DescripcionEstado) {
        this.CodigoEstado = CodigoEstado;
        this.DescripcionEstado = DescripcionEstado;
    }

    public String getCodigoEstado() {
        return CodigoEstado;
    }

    public void setCodigoEstado(String CodigoEstado) {
        this.CodigoEstado = CodigoEstado;
    }

    public String getDescripcionEstado() {
        return DescripcionEstado;
    }

    public void setDescripcionEstado(String DescripcionEstado) {
        this.DescripcionEstado = DescripcionEstado;
    }

  
    
}
