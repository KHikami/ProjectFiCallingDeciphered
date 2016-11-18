package p000;

public class mkt<E> extends mjl<E> {
    public /* synthetic */ mjl mo3854a(Object obj) {
        return mo3879c(obj);
    }

    public /* synthetic */ mjm mo3839a(Object[] objArr) {
        return mo3878b(objArr);
    }

    public /* synthetic */ mjm mo3840b(Object obj) {
        return mo3879c(obj);
    }

    public mkt() {
        this(4);
    }

    private mkt(int i) {
        super(4);
    }

    public mkt<E> mo3879c(E e) {
        super.mo3854a((Object) e);
        return this;
    }

    public mkt<E> mo3878b(E... eArr) {
        super.mo3839a((Object[]) eArr);
        return this;
    }

    public mks<E> mo3877a() {
        mks<E> a = mks.m32257a(this.b, this.a);
        this.b = a.size();
        return a;
    }
}
