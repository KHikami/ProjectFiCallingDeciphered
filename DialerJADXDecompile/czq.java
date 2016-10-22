import java.util.Collection;

/* compiled from: PG */
class czq extends czr {
    Object[] a;
    int b;

    public /* synthetic */ czr b(Object obj) {
        return a(obj);
    }

    czq(int i) {
        buf.a(i, "initialCapacity");
        this.a = new Object[i];
        this.b = 0;
    }

    private final void a(int i) {
        if (this.a.length < i) {
            this.a = daz.a(this.a, czr.a(this.a.length, i));
        }
    }

    public czq a(Object obj) {
        cob.i(obj);
        a(this.b + 1);
        Object[] objArr = this.a;
        int i = this.b;
        this.b = i + 1;
        objArr[i] = obj;
        return this;
    }

    public czr a(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            a(collection.size() + this.b);
        }
        super.a(iterable);
        return this;
    }
}
