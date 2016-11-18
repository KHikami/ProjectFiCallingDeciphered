package p000;

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
    List<nxt> f31216a;
    Map<K, V> f31217b;
    private final int f31218c;
    private boolean f31219d;
    private volatile nxv f31220e;

    public /* synthetic */ Object put(Object obj, Object obj2) {
        return m37035a((Comparable) obj, obj2);
    }

    static <FieldDescriptorType extends nwh<FieldDescriptorType>> nxo<FieldDescriptorType, Object> m37033a(int i) {
        return new nxp(i);
    }

    private nxo(int i) {
        this.f31218c = i;
        this.f31216a = Collections.emptyList();
        this.f31217b = Collections.emptyMap();
    }

    public void mo4071a() {
        if (!this.f31219d) {
            Map emptyMap;
            if (this.f31217b.isEmpty()) {
                emptyMap = Collections.emptyMap();
            } else {
                emptyMap = Collections.unmodifiableMap(this.f31217b);
            }
            this.f31217b = emptyMap;
            this.f31219d = true;
        }
    }

    public boolean m37038b() {
        return this.f31219d;
    }

    public int m37039c() {
        return this.f31216a.size();
    }

    public Entry<K, V> m37037b(int i) {
        return (Entry) this.f31216a.get(i);
    }

    public int m37041d() {
        return this.f31217b.size();
    }

    public Iterable<Entry<K, V>> m37042e() {
        if (this.f31217b.isEmpty()) {
            return nxq.f31222b;
        }
        return this.f31217b.entrySet();
    }

    public int size() {
        return this.f31216a.size() + this.f31217b.size();
    }

    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m37032a(comparable) >= 0 || this.f31217b.containsKey(comparable);
    }

    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a = m37032a(comparable);
        if (a >= 0) {
            return ((nxt) this.f31216a.get(a)).getValue();
        }
        return this.f31217b.get(comparable);
    }

    public V m37035a(K k, V v) {
        m37043f();
        int a = m37032a((Comparable) k);
        if (a >= 0) {
            return ((nxt) this.f31216a.get(a)).setValue(v);
        }
        m37043f();
        if (this.f31216a.isEmpty() && !(this.f31216a instanceof ArrayList)) {
            this.f31216a = new ArrayList(this.f31218c);
        }
        int i = -(a + 1);
        if (i >= this.f31218c) {
            return m37034g().put(k, v);
        }
        if (this.f31216a.size() == this.f31218c) {
            nxt nxt = (nxt) this.f31216a.remove(this.f31218c - 1);
            m37034g().put(nxt.m37047a(), nxt.getValue());
        }
        this.f31216a.add(i, new nxt(this, k, v));
        return null;
    }

    public void clear() {
        m37043f();
        if (!this.f31216a.isEmpty()) {
            this.f31216a.clear();
        }
        if (!this.f31217b.isEmpty()) {
            this.f31217b.clear();
        }
    }

    public V remove(Object obj) {
        m37043f();
        Comparable comparable = (Comparable) obj;
        int a = m37032a(comparable);
        if (a >= 0) {
            return m37040c(a);
        }
        if (this.f31217b.isEmpty()) {
            return null;
        }
        return this.f31217b.remove(comparable);
    }

    V m37040c(int i) {
        m37043f();
        V value = ((nxt) this.f31216a.remove(i)).getValue();
        if (!this.f31217b.isEmpty()) {
            Iterator it = m37034g().entrySet().iterator();
            this.f31216a.add(new nxt(this, (Entry) it.next()));
            it.remove();
        }
        return value;
    }

    private int m37032a(K k) {
        int compareTo;
        int size = this.f31216a.size() - 1;
        if (size >= 0) {
            compareTo = k.compareTo(((nxt) this.f31216a.get(size)).m37047a());
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
            compareTo = k.compareTo(((nxt) this.f31216a.get(size)).m37047a());
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
        if (this.f31220e == null) {
            this.f31220e = new nxv(this);
        }
        return this.f31220e;
    }

    void m37043f() {
        if (this.f31219d) {
            throw new UnsupportedOperationException();
        }
    }

    private SortedMap<K, V> m37034g() {
        m37043f();
        if (this.f31217b.isEmpty() && !(this.f31217b instanceof TreeMap)) {
            this.f31217b = new TreeMap();
        }
        return (SortedMap) this.f31217b;
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
        int c = m37039c();
        if (c != nxo.m37039c()) {
            return entrySet().equals(nxo.entrySet());
        }
        for (int i = 0; i < c; i++) {
            if (!m37037b(i).equals(nxo.m37037b(i))) {
                return false;
            }
        }
        if (c != size) {
            return this.f31217b.equals(nxo.f31217b);
        }
        return true;
    }

    public int hashCode() {
        int i = 0;
        for (int i2 = 0; i2 < m37039c(); i2++) {
            i += ((nxt) this.f31216a.get(i2)).hashCode();
        }
        if (m37041d() > 0) {
            return this.f31217b.hashCode() + i;
        }
        return i;
    }
}
