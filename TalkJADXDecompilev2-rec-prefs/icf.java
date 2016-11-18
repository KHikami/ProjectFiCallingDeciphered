package p000;

import java.util.Map;

final class icf extends ich<E, E> {
    final /* synthetic */ ice f17566a;

    icf(ice ice) {
        this.f17566a = ice;
    }

    protected int mo3134a() {
        return this.f17566a.f17563g;
    }

    protected Object mo3136a(int i) {
        return this.f17566a.f17562f[i];
    }

    protected int mo3135a(Object obj) {
        if (obj == null) {
            return this.f17566a.m21574a();
        }
        return this.f17566a.m21575a(obj, obj.hashCode());
    }

    protected Map<E, E> mo3137b() {
        throw new UnsupportedOperationException("not a map");
    }

    protected void mo3138b(int i) {
        this.f17566a.m21576a(i);
    }

    protected void mo3139c() {
        this.f17566a.clear();
    }
}
