package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class amr {
    private final auk f1331a = new auk(this.f1339i);
    private final ayz f1332b = new ayz();
    private final azd f1333c = new azd();
    private final azf f1334d = new azf();
    private final aoi f1335e = new aoi();
    private final ayd f1336f = new ayd();
    private final azc f1337g = new azc();
    private final azb f1338h = new azb();
    private final ll<List<Exception>> f1339i = bas.m4691a();

    public <Data> amr m2942a(Class<Data> cls, ant<Data> ant_Data) {
        this.f1332b.m4391a(cls, ant_Data);
        return this;
    }

    public <Data, TResource> amr m2944a(Class<Data> cls, Class<TResource> cls2, aoa<Data, TResource> aoa_Data__TResource) {
        this.f1333c.m4408a(aoa_Data__TResource, cls, cls2);
        return this;
    }

    public <Data, TResource> amr m2950b(Class<Data> cls, Class<TResource> cls2, aoa<Data, TResource> aoa_Data__TResource) {
        this.f1333c.m4410b(aoa_Data__TResource, cls, cls2);
        return this;
    }

    public <TResource> amr m2943a(Class<TResource> cls, aob<TResource> aob_TResource) {
        this.f1334d.m4413a(cls, aob_TResource);
        return this;
    }

    public amr m2941a(aoh aoh) {
        this.f1335e.m3555a(aoh);
        return this;
    }

    public <TResource, Transcode> amr m2946a(Class<TResource> cls, Class<Transcode> cls2, ayc<TResource, Transcode> ayc_TResource__Transcode) {
        this.f1336f.m4331a(cls, cls2, ayc_TResource__Transcode);
        return this;
    }

    public <Model, Data> amr m2945a(Class<Model> cls, Class<Data> cls2, auj<Model, Data> auj_Model__Data) {
        this.f1331a.m4044a(cls, cls2, auj_Model__Data);
        return this;
    }

    public <Model, Data> amr m2951b(Class<Model> cls, Class<Data> cls2, auj<Model, Data> auj_Model__Data) {
        this.f1331a.m4045b(cls, cls2, auj_Model__Data);
        return this;
    }

    public <Model, Data> amr m2955c(Class<Model> cls, Class<Data> cls2, auj<Model, Data> auj_Model__Data) {
        this.f1331a.m4046c(cls, cls2, auj_Model__Data);
        return this;
    }

    public <Data, TResource, Transcode> aqo<Data, TResource, Transcode> m2948a(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        aqo<Data, TResource, Transcode> b = this.f1338h.m4404b(cls, cls2, cls3);
        if (b == null && !this.f1338h.m4403a(cls, cls2, cls3)) {
            List arrayList = new ArrayList();
            for (Class cls4 : this.f1333c.m4409b(cls, cls2)) {
                for (Class cls5 : this.f1336f.m4332b(cls4, cls3)) {
                    arrayList.add(new apo(cls, cls4, cls5, this.f1333c.m4407a(cls, cls4), this.f1336f.m4330a(cls4, cls5), this.f1339i));
                }
            }
            if (arrayList.isEmpty()) {
                b = null;
            } else {
                b = new aqo(cls, cls2, cls3, arrayList, this.f1339i);
            }
            this.f1338h.m4402a(cls, cls2, cls3, b);
        }
        return b;
    }

    public <Model, TResource, Transcode> List<Class<?>> m2954b(Class<Model> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        List<Class<?>> a = this.f1337g.m4405a(cls, cls2);
        if (a != null) {
            return a;
        }
        List<Class<?>> arrayList = new ArrayList();
        for (Class b : this.f1331a.m4042a((Class) cls)) {
            for (Class cls4 : this.f1333c.m4409b(b, cls2)) {
                if (!(this.f1336f.m4332b(cls4, cls3).isEmpty() || arrayList.contains(cls4))) {
                    arrayList.add(cls4);
                }
            }
        }
        this.f1337g.m4406a(cls, cls2, Collections.unmodifiableList(arrayList));
        return arrayList;
    }

    public boolean m2949a(aqr<?> aqr_) {
        return this.f1334d.m4412a(aqr_.mo345b()) != null;
    }

    public <X> aob<X> m2952b(aqr<X> aqr_X) {
        aob<X> a = this.f1334d.m4412a(aqr_X.mo345b());
        if (a != null) {
            return a;
        }
        throw new dt(aqr_X.mo345b());
    }

    public <X> ant<X> m2947a(X x) {
        ant<X> a = this.f1332b.m4390a(x.getClass());
        if (a != null) {
            return a;
        }
        throw new dt(x.getClass(), (byte) 0);
    }

    public <X> aog<X> m2953b(X x) {
        return this.f1335e.m3554a((Object) x);
    }

    public <Model> List<auh<Model, ?>> m2956c(Model model) {
        List<auh<Model, ?>> a = this.f1331a.m4043a((Object) model);
        if (!a.isEmpty()) {
            return a;
        }
        throw new dt((Object) model);
    }
}
