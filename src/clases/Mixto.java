/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author user
 */
public class Mixto {
    int parte_entera;
    int numerador;
    int denominador;
    
    public Mixto(int parte_entera, int numerador, int denominador)throws DenominadorCeroException{
        this.parte_entera= parte_entera;
        this.numerador=numerador;
        this.denominador=denominador;
        if(denominador == 0){
            throw new DenominadorCeroException();
        }
    }

    public int getParte_entera() {
        return parte_entera;
    }

    public int getNumerador() {
        return numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setParte_entera(int parte_entera) {
        this.parte_entera = parte_entera;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    
    public Mixto sumar(Mixto f2) throws DenominadorCeroException{
        Mixto m;
        int nume1, deno1, nume2, deno2, numefn, denofn, entero, numem, denom;
        nume1 = (this.parte_entera * this.denominador) + this.numerador;
        deno1 = this.denominador;
        nume2 = (f2.parte_entera * f2.denominador) + f2.numerador;
        deno2 = f2.denominador;
        numefn = (nume1 * deno2) + (deno1 * nume2);
        denofn = (deno1 * deno2);
        entero = numefn / denofn;
        numem = numefn % denofn;
        denom = denofn;
        m = new Mixto(entero, numem, denom);
        return m;
    }
    
    
      public Mixto restar(Mixto f2) throws DenominadorCeroException{
        Mixto m;
        int nume1, deno1, nume2, deno2, numefn, denofn, entero, numem, denom;
        nume1 = (this.parte_entera * this.denominador) + this.numerador;
        deno1 = this.denominador;
        nume2 = (f2.parte_entera * f2.denominador) + f2.numerador;
        deno2 = f2.denominador;
        numefn = (nume1 * deno2) - (deno1 * nume2);
        denofn = (deno1 * deno2);
        entero = numefn / denofn;
        numem = numefn % denofn;
        denom = denofn;
        m = new Mixto(entero, numem, denom);
        return m;
    }
    
    
      public Mixto mulitplicar(Mixto f2) throws DenominadorCeroException {
         Mixto m;
        int nume1, deno1, nume2, deno2, numefn, denofn, entero, numem, denom;
        nume1 = (this.parte_entera* this.denominador) + this.numerador;
        deno1 = this.denominador;
        nume2 = (f2.parte_entera * f2.denominador) + f2.numerador;
        deno2 = f2.denominador;
        numefn = (nume1 * nume2);
        denofn = (deno1 * deno2);
        entero = numefn / denofn;
        numem = numefn % denofn;
        denom = denofn;
        m = new Mixto(entero, numem, denom);
        return m;
    }
      
      public Mixto dividir(Mixto f2) throws DenominadorCeroException {
        Mixto m;
        int nume1, deno1, nume2, deno2, numefn, denofn, entero, numem, denom;
        nume1 = (this.parte_entera* this.denominador) + this.numerador;
        deno1 = this.denominador;
        nume2 = (f2.parte_entera * f2.denominador) + f2.numerador;
        deno2 = f2.denominador;
        numefn = (nume1 * nume2);
        denofn = (deno1 * deno2);
        entero = numefn / denofn;
        numem = numefn % denofn;
        denom = denofn;
        m = new Mixto(entero, numem, denom);
        return m;
      }
}
