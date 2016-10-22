import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class aup {
    private static final aus a;
    private static final auh<Object, Object> b;
    private final List<aur<?, ?>> c;
    private final aus d;
    private final Set<aur<?, ?>> e;
    private final ll<List<Exception>> f;

    static {
        a = new aus();
        b = new auq();
    }

    public aup(ll<List<Exception>> llVar) {
        this(llVar, a);
    }

    private aup(ll<List<Exception>> llVar, aus aus) {
        this.c = new ArrayList();
        this.e = new HashSet();
        this.f = llVar;
        this.d = aus;
    }

    synchronized <Model, Data> void a(Class<Model> cls, Class<Data> cls2, auj<Model, Data> auj_Model__Data) {
        a(cls, cls2, auj_Model__Data, true);
    }

    synchronized <Model, Data> void b(Class<Model> cls, Class<Data> cls2, auj<Model, Data> auj_Model__Data) {
        a(cls, cls2, auj_Model__Data, false);
    }

    private <Model, Data> void a(Class<Model> cls, Class<Data> cls2, auj<Model, Data> auj_Model__Data, boolean z) {
        this.c.add(z ? this.c.size() : 0, new aur(cls, cls2, auj_Model__Data));
    }

    synchronized <Model, Data> List<auj<Model, Data>> c(Class<Model> cls, Class<Data> cls2, auj<Model, Data> auj_Model__Data) {
        List<auj<Model, Data>> b;
        b = b(cls, cls2);
        a(cls, cls2, auj_Model__Data);
        return b;
    }

    private synchronized <Model, Data> List<auj<Model, Data>> b(Class<Model> cls, Class<Data> cls2) {
        List<auj<Model, Data>> arrayList;
        arrayList = new ArrayList();
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            aur aur = (aur) it.next();
            if (aur.a(cls, cls2)) {
                it.remove();
                arrayList.add(aur.b);
            }
        }
        return arrayList;
    }

    synchronized <Model> List<auh<Model, ?>> a(Class<Model> cls) {
        List<auh<Model, ?>> arrayList;
        try {
            arrayList = new ArrayList();
            for (aur aur : this.c) {
                if (!this.e.contains(aur) && aur.a(cls)) {
                    this.e.add(aur);
                    arrayList.add(a(aur));
                    this.e.remove(aur);
                }
            }
        } catch (Throwable th) {
            this.e.clear();
        }
        return arrayList;
    }

    synchronized List<Class<?>> b(Class<?> cls) {
        List<Class<?>> arrayList;
        arrayList = new ArrayList();
        for (aur aur : this.c) {
            if (!arrayList.contains(aur.a) && aur.a(cls)) {
                arrayList.add(aur.a);
            }
        }
        return arrayList;
    }

    public synchronized <Model, Data> auh<Model, Data> a(Class<Model> cls, Class<Data> cls2) {
        auh<Model, Data> aun;
        try {
            List arrayList = new ArrayList();
            Object obj = null;
            for (aur aur : this.c) {
                if (this.e.contains(aur)) {
                    obj = 1;
                } else if (aur.a(cls, cls2)) {
                    this.e.add(aur);
                    arrayList.add(a(aur));
                    this.e.remove(aur);
                }
            }
            if (arrayList.size() > 1) {
                aun = new aun(arrayList, this.f);
            } else if (arrayList.size() == 1) {
                aun = (auh) arrayList.get(0);
            } else if (obj != null) {
                aun = b;
            } else {
                throw new dt((Class) cls, (Class) cls2);
            }
        } catch (Throwable th) {
            this.e.clear();
        }
        return aun;
    }

    private <Model, Data> auh<Model, Data> a(aur<?, ?> aur___) {
        return (auh) gwb.I(aur___.b.a(this));
    }
}
