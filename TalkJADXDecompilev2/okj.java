package defpackage;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class okj {
    static final meu a = meu.a(',');
    public static final okj b = new okj().a(new ojv(), true).a(ojw.a, false);
    private final Map<String, okk> c;
    private final String d;

    private okj a(oki oki, boolean z) {
        return new okj(oki, z, this);
    }

    private okj(oki oki, boolean z, okj okj) {
        String a = oki.a();
        bm.a(!a.contains(","), "Comma is currently not allowed in message encoding");
        int size = okj.c.size();
        if (!okj.c.containsKey(oki.a())) {
            size++;
        }
        Map linkedHashMap = new LinkedHashMap(size);
        for (okk okk : okj.c.values()) {
            String a2 = okk.a.a();
            if (!a2.equals(a)) {
                linkedHashMap.put(a2, new okk(okk.a, okk.b));
            }
        }
        linkedHashMap.put(a, new okk(oki, z));
        this.c = Collections.unmodifiableMap(linkedHashMap);
        this.d = a.a(b());
    }

    private okj() {
        this.c = new LinkedHashMap(0);
        this.d = "";
    }

    public String a() {
        return this.d;
    }

    private Set<String> b() {
        Set hashSet = new HashSet(this.c.size());
        for (Entry entry : this.c.entrySet()) {
            if (((okk) entry.getValue()).b) {
                hashSet.add((String) entry.getKey());
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    public oki a(String str) {
        okk okk = (okk) this.c.get(str);
        return okk != null ? okk.a : null;
    }
}
