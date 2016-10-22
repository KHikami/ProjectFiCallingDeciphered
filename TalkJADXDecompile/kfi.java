import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeSet;
import java.util.WeakHashMap;

public final class kfi {
    private static final Map<Class<?>, kfi> c;
    private static final Map<Class<?>, kfi> d;
    public final boolean a;
    final List<String> b;
    private final Class<?> e;
    private final IdentityHashMap<String, kfu> f;

    static {
        c = new WeakHashMap();
        d = new WeakHashMap();
    }

    public static kfi a(Class<?> cls) {
        return a(cls, false);
    }

    public static kfi a(Class<?> cls, boolean z) {
        if (cls == null) {
            return null;
        }
        kfi kfi;
        Map map = z ? d : c;
        synchronized (map) {
            kfi = (kfi) map.get(cls);
            if (kfi == null) {
                kfi = new kfi(cls, z);
                map.put(cls, kfi);
            }
        }
        return kfi;
    }

    public kfu a(String str) {
        if (str != null) {
            if (this.a) {
                str = str.toLowerCase();
            }
            str = str.intern();
        }
        return (kfu) this.f.get(str);
    }

    public Field b(String str) {
        kfu a = a(str);
        return a == null ? null : a.a();
    }

    public boolean a() {
        return this.e.isEnum();
    }

    private kfi(Class<?> cls, boolean z) {
        this.f = new IdentityHashMap();
        this.e = cls;
        this.a = z;
        boolean z2 = (z && cls.isEnum()) ? false : true;
        String valueOf = String.valueOf(cls);
        bc.a(z2, new StringBuilder(String.valueOf(valueOf).length() + 31).append("cannot ignore case on an enum: ").append(valueOf).toString());
        Collection treeSet = new TreeSet(new kfj(this));
        for (Field field : cls.getDeclaredFields()) {
            kfu a = kfu.a(field);
            if (a != null) {
                Object intern;
                String b = a.b();
                if (z) {
                    intern = b.toLowerCase().intern();
                } else {
                    valueOf = b;
                }
                kfu kfu = (kfu) this.f.get(intern);
                boolean z3 = kfu == null;
                String str = "two fields have the same %sname <%s>: %s and %s";
                Object[] objArr = new Object[4];
                objArr[0] = z ? "case-insensitive " : "";
                objArr[1] = intern;
                objArr[2] = field;
                objArr[3] = kfu == null ? null : kfu.a();
                bc.a(z3, str, objArr);
                this.f.put(intern, a);
                treeSet.add(intern);
            }
        }
        Class superclass = cls.getSuperclass();
        if (superclass != null) {
            kfi a2 = a(superclass, z);
            treeSet.addAll(a2.b);
            for (Entry entry : a2.f.entrySet()) {
                valueOf = (String) entry.getKey();
                if (!this.f.containsKey(valueOf)) {
                    this.f.put(valueOf, (kfu) entry.getValue());
                }
            }
        }
        this.b = treeSet.isEmpty() ? Collections.emptyList() : Collections.unmodifiableList(new ArrayList(treeSet));
    }

    public Collection<kfu> b() {
        return Collections.unmodifiableCollection(this.f.values());
    }
}
