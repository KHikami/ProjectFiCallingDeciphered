public final class mjs<E> extends mjl<E> {
    public /* synthetic */ mjl a(Object obj) {
        return c(obj);
    }

    public /* synthetic */ mjm a(Object[] objArr) {
        return b(objArr);
    }

    public /* synthetic */ mjm b(Object obj) {
        return c(obj);
    }

    public mjs() {
        this(4);
    }

    private mjs(int i) {
        super(4);
    }

    public mjs<E> c(E e) {
        super.a((Object) e);
        return this;
    }

    private mjs<E> b(E... eArr) {
        super.a((Object[]) eArr);
        return this;
    }

    public mjq<E> a() {
        return mjq.b(this.a, this.b);
    }
}
