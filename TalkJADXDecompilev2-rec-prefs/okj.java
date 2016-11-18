package p000;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class okj {
    static final meu f33131a = meu.a(',');
    public static final okj f33132b = new okj().m38633a(new ojv(), true).m38633a(ojw.f33111a, false);
    private final Map<String, okk> f33133c;
    private final String f33134d;

    private okj m38633a(oki oki, boolean z) {
        return new okj(oki, z, this);
    }

    private okj(oki oki, boolean z, okj okj) {
        String a = oki.mo4156a();
        bm.a(!a.contains(","), "Comma is currently not allowed in message encoding");
        int size = okj.f33133c.size();
        if (!okj.f33133c.containsKey(oki.mo4156a())) {
            size++;
        }
        Map linkedHashMap = new LinkedHashMap(size);
        for (okk okk : okj.f33133c.values()) {
            String a2 = okk.f33135a.mo4156a();
            if (!a2.equals(a)) {
                linkedHashMap.put(a2, new okk(okk.f33135a, okk.f33136b));
            }
        }
        linkedHashMap.put(a, new okk(oki, z));
        this.f33133c = Collections.unmodifiableMap(linkedHashMap);
        this.f33134d = f33131a.a(m38634b());
    }

    private okj() {
        this.f33133c = new LinkedHashMap(0);
        this.f33134d = "";
    }

    public String m38635a() {
        return this.f33134d;
    }

    private Set<String> m38634b() {
        Set hashSet = new HashSet(this.f33133c.size());
        for (Entry entry : this.f33133c.entrySet()) {
            if (((okk) entry.getValue()).f33136b) {
                hashSet.add((String) entry.getKey());
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    public oki m38636a(String str) {
        okk okk = (okk) this.f33133c.get(str);
        return okk != null ? okk.f33135a : null;
    }
}
