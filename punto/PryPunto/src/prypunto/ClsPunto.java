/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prypunto;

public class ClsPunto {
    //propiedades del punto
    private int _cx;
    private int _cy;
    //metodos constructores
    public ClsPunto() {
       _cx = 0;
       _cy = 0;
       
   }

    public ClsPunto(int _cx, int _cy) {
        this._cx = _cx;
        this._cy = _cy;
    }
     public ClsPunto(ClsPunto p) {
        _cx = p._cx;
        _cy = p._cy;
    }
//metodos get y set
    public int cx() {return _cx;}
    public void cx(int _cx) {this._cx = _cx;}
    public int cy() {return _cy;}
    public void cy(int _cy) {this._cy = _cy;}
    
//metodo de la cls punto
    public void moverx(int dx){
    this._cx+=dx;
    }
    public void movery(int dy){
    this._cy+=dy;
    }
    public void mas(ClsPunto d){
    this._cx+=d._cx;
    this._cy+=d._cy;
    }
    public double magnitud (){return Math.sqrt(_cx*_cx+_cy*_cy);}
    public double angulo (){return Math.atan(_cy/_cx);}
    public String ver (){return "("+_cx+","+_cy+")";}
    
    
    
    
    
    
}
