package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public final class aku {
    private String f1156a;
    private List<String> f1157b;
    private Map<String, Collection<String>> f1158c = new HashMap();
    private String f1159d;
    private List<String> f1160e;
    private byte[] f1161f;

    public void m2796a(String str) {
        if (this.f1156a != null) {
            String.format("Property name is re-defined (existing: %s, requested: %s", new Object[]{this.f1156a, str});
        }
        this.f1156a = str;
    }

    public void m2802b(String str) {
        if (this.f1157b == null) {
            this.f1157b = new ArrayList();
        }
        this.f1157b.add(str);
    }

    public void m2797a(String str, String str2) {
        Collection collection;
        if (this.f1158c.containsKey(str)) {
            collection = (Collection) this.f1158c.get(str);
        } else {
            if (str.equals("TYPE")) {
                collection = new HashSet();
            } else {
                collection = new ArrayList();
            }
            this.f1158c.put(str, collection);
        }
        collection.add(str2);
    }

    public void m2804c(String str) {
        this.f1159d = str;
    }

    public void m2800a(String... strArr) {
        this.f1160e = Arrays.asList(strArr);
    }

    public void m2798a(List<String> list) {
        this.f1160e = list;
    }

    public void m2799a(byte[] bArr) {
        this.f1161f = bArr;
    }

    public String m2795a() {
        return this.f1156a;
    }

    public Map<String, Collection<String>> m2801b() {
        return this.f1158c;
    }

    public Collection<String> m2805d(String str) {
        return (Collection) this.f1158c.get(str);
    }

    public String m2803c() {
        return this.f1159d;
    }

    public List<String> m2806d() {
        return this.f1160e;
    }

    public byte[] m2807e() {
        return this.f1161f;
    }
}
