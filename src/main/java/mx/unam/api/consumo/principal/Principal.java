package mx.unam.api.consumo.principal;

import mx.unam.api.consumo.servicio.ConsumoApi;
import mx.unam.api.consumo.utilidades.ConversorGson;


public class Principal {
    public static void main(String[] args) {
        String url = "https://valorant-api.com/v1/agents";
        ConsumoApi consumoApi = new ConsumoApi();
        ConversorGson conversor = new ConversorGson();
        System.out.println(conversor.formatoJson(consumoApi.obtenerDatos(url)));
    }
}