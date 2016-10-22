package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: amr */
public final class amr {
    private final auk a;
    private final ayz b;
    private final azd c;
    private final azf d;
    private final aoi e;
    private final ayd f;
    private final azc g;
    private final azb h;
    private final ll<List<Exception>> i;

    public amr() {
        this.g = new azc();
        this.h = new azb();
        this.i = bas.a();
        this.a = new auk(this.i);
        this.b = new ayz();
        this.c = new azd();
        this.d = new azf();
        this.e = new aoi();
        this.f = new ayd();
    }

    public <Data> amr a(Class<Data> cls, ant<Data> ant_Data) {
        this.b.a(cls, ant_Data);
        return this;
    }

    public <Data, TResource> amr a(Class<Data> cls, Class<TResource> cls2, aoa<Data, TResource> aoa_Data__TResource) {
        this.c.a(aoa_Data__TResource, cls, cls2);
        return this;
    }

    public <Data, TResource> amr b(Class<Data> cls, Class<TResource> cls2, aoa<Data, TResource> aoa_Data__TResource) {
        this.c.b(aoa_Data__TResource, cls, cls2);
        return this;
    }

    public <TResource> amr a(Class<TResource> cls, aob<TResource> aob_TResource) {
        this.d.a(cls, aob_TResource);
        return this;
    }

    public amr a(aoh aoh) {
        this.e.a(aoh);
        return this;
    }

    public <TResource, Transcode> amr a(Class<TResource> cls, Class<Transcode> cls2, ayc<TResource, Transcode> ayc_TResource__Transcode) {
        this.f.a(cls, cls2, ayc_TResource__Transcode);
        return this;
    }

    public <Model, Data> amr a(Class<Model> cls, Class<Data> cls2, auj<Model, Data> auj_Model__Data) {
        this.a.a(cls, cls2, auj_Model__Data);
        return this;
    }

    public <Model, Data> amr b(Class<Model> cls, Class<Data> cls2, auj<Model, Data> auj_Model__Data) {
        this.a.b(cls, cls2, auj_Model__Data);
        return this;
    }

    public <Model, Data> amr c(Class<Model> cls, Class<Data> cls2, auj<Model, Data> auj_Model__Data) {
        this.a.c(cls, cls2, auj_Model__Data);
        return this;
    }

    public <Data, TResource, Transcode> aqo<Data, TResource, Transcode> a(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        aqo<Data, TResource, Transcode> b = this.h.b(cls, cls2, cls3);
        if (b == null && !this.h.a(cls, cls2, cls3)) {
            List arrayList = new ArrayList();
            for (Class cls4 : this.c.b(cls, cls2)) {
                for (Class cls5 : this.f.b(cls4, cls3)) {
                    arrayList.add(new apo(cls, cls4, cls5, this.c.a(cls, cls4), this.f.a(cls4, cls5), this.i));
                }
            }
            if (arrayList.isEmpty()) {
                b = null;
            } else {
                b = new aqo(cls, cls2, cls3, arrayList, this.i);
            }
            this.h.a(cls, cls2, cls3, b);
        }
        return b;
    }

    public <Model, TResource, Transcode> List<Class<?>> b(Class<Model> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        List<Class<?>> a = this.g.a(cls, cls2);
        if (a != null) {
            return a;
        }
        List<Class<?>> arrayList = new ArrayList();
        for (Class b : this.a.a((Class) cls)) {
            for (Class cls4 : this.c.b(b, cls2)) {
                if (!(this.f.b(cls4, cls3).isEmpty() || arrayList.contains(cls4))) {
                    arrayList.add(cls4);
                }
            }
        }
        this.g.a(cls, cls2, Collections.unmodifiableList(arrayList));
        return arrayList;
    }

    public boolean a(aqr<?> aqr_) {
        return this.d.a(aqr_.b()) != null;
    }

    public <X> aob<X> b(aqr<X> aqr_X) {
        aob<X> a = this.d.a(aqr_X.b());
        if (a != null) {
            return a;
        }
        throw new dt(aqr_X.b());
    }

    public <X> ant<X> a(X x) {
        ant<X> a = this.b.a(x.getClass());
        if (a != null) {
            return a;
        }
        throw new dt(x.getClass(), (byte) 0);
    }

    public <X> aog<X> b(X x) {
        return this.e.a((Object) x);
    }

    public <Model> List<auh<Model, ?>> c(Model model) {
        List<auh<Model, ?>> a = this.a.a((Object) model);
        if (!a.isEmpty()) {
            return a;
        }
        throw new dt((Object) model);
    }
}
