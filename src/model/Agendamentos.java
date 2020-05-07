/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author blackNite
 */
public class Agendamentos {
    private Integer cod_age;
    private Integer cod_pet;
    private String data_agendada;
    
       public Integer getcod_age () {
        return cod_age;
    }

    public void setcod_age(Integer cod_age) {
        this.cod_age= cod_age ;
    }

       public Integer getcod_pet () {
        return cod_pet;
    }

    public void setcod_pet(Integer cod_pet) {
        this.cod_pet=cod_pet ;
    }

       public String getdata_agendada () {
        return data_agendada;
    }

    public void setdata_agendada(String data_agendada) {
        this.data_agendada= data_agendada;
    }

}
