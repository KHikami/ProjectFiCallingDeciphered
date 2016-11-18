package p000;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class aup {
    private static final aus f2371a = new aus();
    private static final auh<Object, Object> f2372b = new auq();
    private final List<aur<?, ?>> f2373c;
    private final aus f2374d;
    private final Set<aur<?, ?>> f2375e;
    private final ll<List<Exception>> f2376f;

    public aup(ll<List<Exception>> llVar) {
        this(llVar, f2371a);
    }

    private aup(ll<List<Exception>> llVar, aus aus) {
        this.f2373c = new ArrayList();
        this.f2375e = new HashSet();
        this.f2376f = llVar;
        this.f2374d = aus;
    }

    synchronized <Model, Data> void m4065a(Class<Model> cls, Class<Data> cls2, auj<Model, Data> auj_Model__Data) {
        m4061a(cls, cls2, auj_Model__Data, true);
    }

    synchronized <Model, Data> void m4067b(Class<Model> cls, Class<Data> cls2, auj<Model, Data> auj_Model__Data) {
        m4061a(cls, cls2, auj_Model__Data, false);
    }

    private <Model, Data> void m4061a(Class<Model> cls, Class<Data> cls2, auj<Model, Data> auj_Model__Data, boolean z) {
        this.f2373c.add(z ? this.f2373c.size() : 0, new aur(cls, cls2, auj_Model__Data));
    }

    synchronized <Model, Data> List<auj<Model, Data>> m4068c(Class<Model> cls, Class<Data> cls2, auj<Model, Data> auj_Model__Data) {
        List<auj<Model, Data>> b;
        b = m4062b(cls, cls2);
        m4065a(cls, cls2, auj_Model__Data);
        return b;
    }

    private synchronized <Model, Data> List<auj<Model, Data>> m4062b(Class<Model> cls, Class<Data> cls2) {
        List<auj<Model, Data>> arrayList;
        arrayList = new ArrayList();
        Iterator it = this.f2373c.iterator();
        while (it.hasNext()) {
            aur aur = (aur) it.next();
            if (aur.m4072a(cls, cls2)) {
                it.remove();
                arrayList.add(aur.f2378b);
            }
        }
        return arrayList;
    }

    synchronized <Model> List<auh<Model, ?>> m4064a(Class<Model> cls) {
        List<auh<Model, ?>> arrayList;
        try {
            arrayList = new ArrayList();
            for (aur aur : this.f2373c) {
                if (!this.f2375e.contains(aur) && aur.m4071a(cls)) {
                    this.f2375e.add(aur);
                    arrayList.add(m4060a(aur));
                    this.f2375e.remove(aur);
                }
            }
        } catch (Throwable th) {
            this.f2375e.clear();
        }
        return arrayList;
    }

    synchronized List<Class<?>> m4066b(Class<?> cls) {
        List<Class<?>> arrayList;
        arrayList = new ArrayList();
        for (aur aur : this.f2373c) {
            if (!arrayList.contains(aur.f2377a) && aur.m4071a(cls)) {
                arrayList.add(aur.f2377a);
            }
        }
        return arrayList;
    }

    public synchronized <Model, Data> auh<Model, Data> m4063a(Class<Model> cls, Class<Data> cls2) {
        auh<Model, Data> aun;
        try {
            List arrayList = new ArrayList();
            Object obj = null;
            for (aur aur : this.f2373c) {
                if (this.f2375e.contains(aur)) {
                    obj = 1;
                } else if (aur.m4072a(cls, cls2)) {
                    this.f2375e.add(aur);
                    arrayList.add(m4060a(aur));
                    this.f2375e.remove(aur);
                }
            }
            if (arrayList.size() > 1) {
                aun = new aun(arrayList, this.f2376f);
            } else if (arrayList.size() == 1) {
                aun = (auh) arrayList.get(0);
            } else if (obj != null) {
                aun = f2372b;
            } else {
                throw new dt((Class) cls, (Class) cls2);
            }
        } catch (Throwable th) {
            this.f2375e.clear();
        }
        return aun;
    }

    private <Model, Data> auh<Model, Data> m4060a(aur<?, ?> aur___) {
        return (auh) gwb.m1404I(aur___.f2378b.mo380a(this));
    }
}
