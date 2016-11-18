package p000;

import java.util.Map.Entry;

final class kfo implements Entry<String, Object> {
    final /* synthetic */ kfn f21585a;
    private Object f21586b;
    private final kfu f21587c;

    public /* synthetic */ Object getKey() {
        return m25731a();
    }

    kfo(kfn kfn, kfu kfu, Object obj) {
        this.f21585a = kfn;
        this.f21587c = kfu;
        this.f21586b = bc.m4799a(obj);
    }

    private String m25731a() {
        String b = this.f21587c.m25754b();
        if (this.f21585a.f21584b.f21564a) {
            return b.toLowerCase();
        }
        return b;
    }

    public Object getValue() {
        return this.f21586b;
    }

    public Object setValue(Object obj) {
        Object obj2 = this.f21586b;
        this.f21586b = bc.m4799a(obj);
        this.f21587c.m25753a(this.f21585a.f21583a, obj);
        return obj2;
    }

    public int hashCode() {
        return m25731a().hashCode() ^ getValue().hashCode();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Entry)) {
            return false;
        }
        Entry entry = (Entry) obj;
        if (m25731a().equals(entry.getKey()) && getValue().equals(entry.getValue())) {
            return true;
        }
        return false;
    }
}
