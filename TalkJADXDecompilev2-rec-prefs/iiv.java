package p000;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class iiv {
    private final Map<String, iiu> f17749a = new ConcurrentHashMap();

    public iiu m21904a(String str) {
        iiu iiu = (iiu) this.f17749a.get(str);
        if (iiu != null) {
            return iiu;
        }
        iiu = new iiu(str);
        m21905a(iiu);
        return iiu;
    }

    public void m21905a(iiu iiu) {
        this.f17749a.put(iiu.m21901a(), iiu);
    }
}
