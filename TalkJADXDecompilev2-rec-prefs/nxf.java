package p000;

import java.util.Map.Entry;

final class nxf<K> implements Entry<K, Object> {
    private Entry<K, nxe> f31212a;

    nxf(Entry<K, nxe> entry) {
        this.f31212a = entry;
    }

    public K getKey() {
        return this.f31212a.getKey();
    }

    public Object getValue() {
        nxe nxe = (nxe) this.f31212a.getValue();
        if (nxe == null) {
            return null;
        }
        return nxe.m37028a();
    }

    public Object setValue(Object obj) {
        if (obj instanceof nxi) {
            return ((nxe) this.f31212a.getValue()).m37025b((nxi) obj);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }
}
