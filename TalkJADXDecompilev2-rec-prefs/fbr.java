package p000;

import java.util.HashMap;
import java.util.Map;

public final class fbr {
    private final String f12652a;
    private final Map<fbs, String> f12653b = new HashMap();

    fbr(String str) {
        this.f12652a = str;
    }

    String m14912a() {
        return this.f12652a;
    }

    void m14914a(fbs fbs, String str) {
        this.f12653b.put(fbs, str);
    }

    String m14913a(String str) {
        return (String) this.f12653b.get(fbs.m14915a(str));
    }
}
