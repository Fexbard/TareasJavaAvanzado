package Item1;

import java.util.HashMap;

public class OptionsParser {

    public HashMap<String, String> options = new HashMap();
    private String []args;
    private OptionsParser(){};
    public OptionsParser(String []args) {
        this.args = args;
    }
//INGRESO NOMBRES TIPO optionName AL HASHMAP options VIA registerOption
// EL optionName VIENE DE
    public void registerOption(String optionName) {
        options.put(optionName, "");
    }
//SETEO Y GETEO DE LOS MÉTODOS PRIVADOS, PARA LUEGO LLAMARLOS CON EL GET"nombre"  SET"nombre".
    public String getOption(String optionName) {
        return options.get(optionName);
    }

    public void setValue(String optionName, String value) {
        options.replace(optionName, value);
    }


//ANALIZAR PORQUE NO CREO QUE SEA NECESARIO SACAR LOS GUIONES YA QUE NOS LOS USO EN MI CONFIG DE ARGS[]
    public void parse() {
        for (int i = 0; i < args.length; i++) {
            // Buscamos la opcion en el hashMap. Si existe, extraemos el valor que es
            // la siguiente posición e incrementamos el contador.
            if (options.containsKey("optionName")) {
                setValue("optionName", args[i + 1]);
                i++;
            }
        }

    }

}
