package defpackage;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class iiv {
    private final Map<String, iiu> a = new ConcurrentHashMap();

    public iiu a(String str) {
        iiu iiu = (iiu) this.a.get(str);
        if (iiu != null) {
            return iiu;
        }
        iiu = new iiu(str);
        a(iiu);
        return iiu;
    }

    public void a(iiu iiu) {
        this.a.put(iiu.a(), iiu);
    }
}
