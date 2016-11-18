package defpackage;

import java.util.Map.Entry;

final class nxf<K> implements Entry<K, Object> {
    private Entry<K, nxe> a;

    nxf(Entry<K, nxe> entry) {
        this.a = entry;
    }

    public K getKey() {
        return this.a.getKey();
    }

    public Object getValue() {
        nxe nxe = (nxe) this.a.getValue();
        if (nxe == null) {
            return null;
        }
        return nxe.a();
    }

    public Object setValue(Object obj) {
        if (obj instanceof nxi) {
            return ((nxe) this.a.getValue()).b((nxi) obj);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }
}
