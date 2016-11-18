package defpackage;

import java.util.Map.Entry;

final class kfo implements Entry<String, Object> {
    final /* synthetic */ kfn a;
    private Object b;
    private final kfu c;

    public /* synthetic */ Object getKey() {
        return a();
    }

    kfo(kfn kfn, kfu kfu, Object obj) {
        this.a = kfn;
        this.c = kfu;
        this.b = bc.a(obj);
    }

    private String a() {
        String b = this.c.b();
        if (this.a.b.a) {
            return b.toLowerCase();
        }
        return b;
    }

    public Object getValue() {
        return this.b;
    }

    public Object setValue(Object obj) {
        Object obj2 = this.b;
        this.b = bc.a(obj);
        this.c.a(this.a.a, obj);
        return obj2;
    }

    public int hashCode() {
        return a().hashCode() ^ getValue().hashCode();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Entry)) {
            return false;
        }
        Entry entry = (Entry) obj;
        if (a().equals(entry.getKey()) && getValue().equals(entry.getValue())) {
            return true;
        }
        return false;
    }
}
