public class mkt<E> extends mjl<E> {
    public /* synthetic */ mjl a(Object obj) {
        return c(obj);
    }

    public /* synthetic */ mjm a(Object[] objArr) {
        return b(objArr);
    }

    public /* synthetic */ mjm b(Object obj) {
        return c(obj);
    }

    public mkt() {
        this(4);
    }

    private mkt(int i) {
        super(4);
    }

    public mkt<E> c(E e) {
        super.a((Object) e);
        return this;
    }

    public mkt<E> b(E... eArr) {
        super.a((Object[]) eArr);
        return this;
    }

    public mks<E> a() {
        mks<E> a = mks.a(this.b, this.a);
        this.b = a.size();
        return a;
    }
}
