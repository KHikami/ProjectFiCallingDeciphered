package p000;

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
    private static final Map<Class<?>, kfi> f21562c = new WeakHashMap();
    private static final Map<Class<?>, kfi> f21563d = new WeakHashMap();
    public final boolean f21564a;
    final List<String> f21565b;
    private final Class<?> f21566e;
    private final IdentityHashMap<String, kfu> f21567f = new IdentityHashMap();

    public static kfi m25710a(Class<?> cls) {
        return kfi.m25711a(cls, false);
    }

    public static kfi m25711a(Class<?> cls, boolean z) {
        if (cls == null) {
            return null;
        }
        kfi kfi;
        Map map = z ? f21563d : f21562c;
        synchronized (map) {
            kfi = (kfi) map.get(cls);
            if (kfi == null) {
                kfi = new kfi(cls, z);
                map.put(cls, kfi);
            }
        }
        return kfi;
    }

    public kfu m25712a(String str) {
        if (str != null) {
            if (this.f21564a) {
                str = str.toLowerCase();
            }
            str = str.intern();
        }
        return (kfu) this.f21567f.get(str);
    }

    public Field m25714b(String str) {
        kfu a = m25712a(str);
        return a == null ? null : a.m25752a();
    }

    public boolean m25713a() {
        return this.f21566e.isEnum();
    }

    private kfi(Class<?> cls, boolean z) {
        this.f21566e = cls;
        this.f21564a = z;
        boolean z2 = (z && cls.isEnum()) ? false : true;
        String valueOf = String.valueOf(cls);
        bc.m4815a(z2, new StringBuilder(String.valueOf(valueOf).length() + 31).append("cannot ignore case on an enum: ").append(valueOf).toString());
        Collection treeSet = new TreeSet(new kfj(this));
        for (Field field : cls.getDeclaredFields()) {
            kfu a = kfu.m25748a(field);
            if (a != null) {
                Object intern;
                String b = a.m25754b();
                if (z) {
                    intern = b.toLowerCase().intern();
                } else {
                    valueOf = b;
                }
                kfu kfu = (kfu) this.f21567f.get(intern);
                boolean z3 = kfu == null;
                String str = "two fields have the same %sname <%s>: %s and %s";
                Object[] objArr = new Object[4];
                objArr[0] = z ? "case-insensitive " : "";
                objArr[1] = intern;
                objArr[2] = field;
                objArr[3] = kfu == null ? null : kfu.m25752a();
                bc.m4816a(z3, str, objArr);
                this.f21567f.put(intern, a);
                treeSet.add(intern);
            }
        }
        Class superclass = cls.getSuperclass();
        if (superclass != null) {
            kfi a2 = kfi.m25711a(superclass, z);
            treeSet.addAll(a2.f21565b);
            for (Entry entry : a2.f21567f.entrySet()) {
                valueOf = (String) entry.getKey();
                if (!this.f21567f.containsKey(valueOf)) {
                    this.f21567f.put(valueOf, (kfu) entry.getValue());
                }
            }
        }
        this.f21565b = treeSet.isEmpty() ? Collections.emptyList() : Collections.unmodifiableList(new ArrayList(treeSet));
    }

    public Collection<kfu> m25715b() {
        return Collections.unmodifiableCollection(this.f21567f.values());
    }
}
