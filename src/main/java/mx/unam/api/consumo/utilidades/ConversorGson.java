package mx.unam.api.consumo.utilidades;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

public class ConversorGson {
    public ConversorGson() {
    }

    public String formatoJson(String responseBody) {
        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.setPrettyPrinting().create();
        JsonElement jsonElement = JsonParser.parseString(responseBody);
        return gson.toJson(jsonElement);
    }
}
