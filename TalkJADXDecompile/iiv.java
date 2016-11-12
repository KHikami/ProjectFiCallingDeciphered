import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class iiv { //Account mapper (not relevant to our stuff though)
    private final Map<String, iiu> a;//hashmap that maps a string to an "Account" so to put it

    public iiv() {
        this.a = new ConcurrentHashMap();
    }

    public iiu a(String str) { //given a string
        iiu iiu = (iiu) this.a.get(str);
        if (iiu != null) { //if an iiu exists for the string, iiu returned
            return iiu;
        }
        iiu = new iiu(str); //otherwise, new iiu is created
        a(iiu);
        return iiu;
    }

    public void a(iiu iiu) {
        this.a.put(iiu.a(), iiu);
    }
}
