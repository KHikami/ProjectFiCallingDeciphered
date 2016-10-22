import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public final class aku {
    private String a;
    private List<String> b;
    private Map<String, Collection<String>> c;
    private String d;
    private List<String> e;
    private byte[] f;

    public aku() {
        this.c = new HashMap();
    }

    public void a(String str) {
        if (this.a != null) {
            String.format("Property name is re-defined (existing: %s, requested: %s", new Object[]{this.a, str});
        }
        this.a = str;
    }

    public void b(String str) {
        if (this.b == null) {
            this.b = new ArrayList();
        }
        this.b.add(str);
    }

    public void a(String str, String str2) {
        Collection collection;
        if (this.c.containsKey(str)) {
            collection = (Collection) this.c.get(str);
        } else {
            if (str.equals("TYPE")) {
                collection = new HashSet();
            } else {
                collection = new ArrayList();
            }
            this.c.put(str, collection);
        }
        collection.add(str2);
    }

    public void c(String str) {
        this.d = str;
    }

    public void a(String... strArr) {
        this.e = Arrays.asList(strArr);
    }

    public void a(List<String> list) {
        this.e = list;
    }

    public void a(byte[] bArr) {
        this.f = bArr;
    }

    public String a() {
        return this.a;
    }

    public Map<String, Collection<String>> b() {
        return this.c;
    }

    public Collection<String> d(String str) {
        return (Collection) this.c.get(str);
    }

    public String c() {
        return this.d;
    }

    public List<String> d() {
        return this.e;
    }

    public byte[] e() {
        return this.f;
    }
}
