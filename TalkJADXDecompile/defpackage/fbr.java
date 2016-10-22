package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: fbr */
public final class fbr {
    private final String a;
    private final Map<fbs, String> b;

    fbr(String str) {
        this.b = new HashMap();
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
