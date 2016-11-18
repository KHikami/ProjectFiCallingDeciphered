package defpackage;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

class nxo<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    List<nxt> a;
    Map<K, V> b;
    private final int c;
    private boolean d;
    private volatile nxv e;

    public /* synthetic */ Object put(Object obj, Object obj2) {
        return a((Comparable) obj, obj2);
    }

    static <FieldDescriptorType extends nwh<FieldDescriptorType>> nxo<FieldDescriptorType, Object> a(int i) {
        return new nxp(i);
    }

    private nxo(int i) {
        this.c = i;
        this.a = Collections.emptyList();
        this.b = Collections.emptyMap();
    }

    public void a() {
        if (!this.d) {
            Map emptyMap;
            if (this.b.isEmpty()) {
                emptyMap = Collections.emptyMap();
            } else {
                emptyMap = Collections.unmodifiableMap(this.b);
            }
            this.b = emptyMap;
            this.d = true;
        }
    }

    public boolean b() {
        return this.d;
    }

    public int c() {
        return this.a.size();
    }

    public Entry<K, V> b(int i) {
        return (Entry) this.a.get(i);
    }

    public int d() {
        return this.b.size();
    }

    public Iterable<Entry<K, V>> e() {
        if (this.b.isEmpty()) {
            return nxq.b;
        }
        return this.b.entrySet();
    }

    public int size() {
        return this.a.size() + this.b.size();
    }

    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.b.containsKey(comparable);
    }

    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a = a(comparable);
        if (a >= 0) {
            return ((nxt) this.a.get(a)).getValue();
        }
        return this.b.get(comparable);
    }

    public V a(K k, V v) {
        f();
        int a = a((Comparable) k);
        if (a >= 0) {
            return ((nxt) this.a.get(a)).setValue(v);
        }
        f();
        if (this.a.isEmpty() && !(this.a instanceof ArrayList)) {
            this.a = new ArrayList(this.c);
        }
        int i = -(a + 1);
        if (i >= this.c) {
            return g().put(k, v);
        }
        if (this.a.size() == this.c) {
            nxt nxt = (nxt) this.a.remove(this.c - 1);
            g().put(nxt.a(), nxt.getValue());
        }
        this.a.add(i, new nxt(this, k, v));
        return null;
    }

    public void clear() {
        f();
        if (!this.a.isEmpty()) {
            this.a.clear();
        }
        if (!this.b.isEmpty()) {
            this.b.clear();
        }
    }

    public V remove(Object obj) {
        f();
        Comparable comparable = (Comparable) obj;
        int a = a(comparable);
        if (a >= 0) {
            return c(a);
        }
        if (this.b.isEmpty()) {
            return null;
        }
        return this.b.remove(comparable);
    }

    V c(int i) {
        f();
        V value = ((nxt) this.a.remove(i)).getValue();
        if (!this.b.isEmpty()) {
            Iterator it = g().entrySet().iterator();
            this.a.add(new nxt(this, (Entry) it.next()));
            it.remove();
        }
        return value;
    }

    private int a(K k) {
        int compareTo;
        int size = this.a.size() - 1;
        if (size >= 0) {
            compareTo = k.compareTo(((nxt) this.a.get(size)).a());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        int i = 0;
        int i2 = size;
        while (i <= i2) {
            size = (i + i2) / 2;
            compareTo = k.compareTo(((nxt) this.a.get(size)).a());
            if (compareTo < 0) {
                i2 = size - 1;
            } else if (compareTo <= 0) {
                return size;
            } else {
                i = size + 1;
            }
        }
        return -(i + 1);
    }

    public Set<Entry<K, V>> entrySet() {
        if (this.e == null) {
            this.e = new nxv(this);
        }
        return this.e;
    }

    void f() {
        if (this.d) {
            throw new UnsupportedOperationException();
        }
    }

    private SortedMap<K, V> g() {
        f();
        if (this.b.isEmpty() && !(this.b instanceof TreeMap)) {
            this.b = new TreeMap();
        }
        return (SortedMap) this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nxo)) {
            return super.equals(obj);
        }
        nxo nxo = (nxo) obj;
        int size = size();
        if (size != nxo.size()) {
            return false;
        }
        int c = c();
        if (c != nxo.c()) {
            return entrySet().equals(nxo.entrySet());
        }
        for (int i = 0; i < c; i++) {
            if (!b(i).equals(nxo.b(i))) {
                return false;
            }
        }
        if (c != size) {
            return this.b.equals(nxo.b);
        }
        return true;
    }

    public int hashCode() {
        int i = 0;
        for (int i2 = 0; i2 < c(); i2++) {
            i += ((nxt) this.a.get(i2)).hashCode();
        }
        if (d() > 0) {
            return this.b.hashCode() + i;
        }
        return i;
    }
}
