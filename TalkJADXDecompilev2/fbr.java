package defpackage;

import java.util.HashMap;
import java.util.Map;

public final class fbr {
    private final String a;
    private final Map<fbs, String> b = new HashMap();

    fbr(String str) {
        this.a = str;
    }

    String a() {
        return this.a;
    }

    void a(fbs fbs, String str) {
        this.b.put(fbs, str);
    }

    String a(String str) {
        return (String) this.b.get(fbs.a(str));
    }
}
