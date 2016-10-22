import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class auk {
    private final aup a;
    private final aul b;

    public auk(ll<List<Exception>> llVar) {
        this(new aup(llVar));
    }

    private auk(aup aup) {
        this.b = new aul();
        this.a = aup;
    }

    public synchronized <Model, Data> void a(Class<Model> cls, Class<Data> cls2, auj<Model, Data> auj_Model__Data) {
        this.a.a(cls, cls2, auj_Model__Data);
        this.b.a();
    }

    public synchronized <Model, Data> void b(Class<Model> cls, Class<Data> cls2, auj<Model, Data> auj_Model__Data) {
        this.a.b(cls, cls2, auj_Model__Data);
        this.b.a();
    }

    public synchronized <Model, Data> void c(Class<Model> cls, Class<Data> cls2, auj<Model, Data> auj_Model__Data) {
        Iterator it = this.a.c(cls, cls2, auj_Model__Data).iterator();
        while (it.hasNext()) {
            it.next();
        }
        this.b.a();
    }

    public synchronized <A> List<auh<A, ?>> a(A a) {
        List<auh<A, ?>> arrayList;
        Class cls = a.getClass();
        List a2 = this.b.a(cls);
        if (a2 == null) {
            a2 = Collections.unmodifiableList(this.a.a(cls));
            this.b.a(cls, a2);
        }
        List list = a2;
        int size = list.size();
        arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            auh auh = (auh) list.get(i);
            if (auh.a(a)) {
                arrayList.add(auh);
            }
        }
        return arrayList;
    }

    public synchronized List<Class<?>> a(Class<?> cls) {
        return this.a.b(cls);
    }
}
