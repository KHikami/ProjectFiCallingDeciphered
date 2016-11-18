package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class auk {
    private final aup f2359a;
    private final aul f2360b;

    public auk(ll<List<Exception>> llVar) {
        this(new aup(llVar));
    }

    private auk(aup aup) {
        this.f2360b = new aul();
        this.f2359a = aup;
    }

    public synchronized <Model, Data> void m4044a(Class<Model> cls, Class<Data> cls2, auj<Model, Data> auj_Model__Data) {
        this.f2359a.m4065a(cls, cls2, auj_Model__Data);
        this.f2360b.m4048a();
    }

    public synchronized <Model, Data> void m4045b(Class<Model> cls, Class<Data> cls2, auj<Model, Data> auj_Model__Data) {
        this.f2359a.m4067b(cls, cls2, auj_Model__Data);
        this.f2360b.m4048a();
    }

    public synchronized <Model, Data> void m4046c(Class<Model> cls, Class<Data> cls2, auj<Model, Data> auj_Model__Data) {
        Iterator it = this.f2359a.m4068c(cls, cls2, auj_Model__Data).iterator();
        while (it.hasNext()) {
            it.next();
        }
        this.f2360b.m4048a();
    }

    public synchronized <A> List<auh<A, ?>> m4043a(A a) {
        List<auh<A, ?>> arrayList;
        Class cls = a.getClass();
        List a2 = this.f2360b.m4047a(cls);
        if (a2 == null) {
            a2 = Collections.unmodifiableList(this.f2359a.m4064a(cls));
            this.f2360b.m4049a(cls, a2);
        }
        List list = a2;
        int size = list.size();
        arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            auh auh = (auh) list.get(i);
            if (auh.mo378a(a)) {
                arrayList.add(auh);
            }
        }
        return arrayList;
    }

    public synchronized List<Class<?>> m4042a(Class<?> cls) {
        return this.f2359a.m4066b(cls);
    }
}
