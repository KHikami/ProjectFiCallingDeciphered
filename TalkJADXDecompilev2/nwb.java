package defpackage;

public class nwb<ContainingType extends nxi, Type> {
    final ContainingType a;
    final Type b;
    final nxi c;
    final nwh d;

    public nwb(nxi nxi, Object obj, nxi nxi2, nwh nwh) {
        this();
        if (nxi == null) {
            throw new IllegalArgumentException("Null containingTypeDefaultInstance");
        } else if (nwh.b() == nyi.MESSAGE && nxi2 == null) {
            throw new IllegalArgumentException("Null messageDefaultInstance");
        } else {
            this.a = nxi;
            this.b = obj;
            this.c = nxi2;
            this.d = nwh;
        }
    }

    public int a() {
        return this.d.a();
    }

    public nxi b() {
        return this.c;
    }

    Object a(Object obj) {
        if (this.d.c() == nyn.ENUM) {
            return Integer.valueOf(((nww) obj).a());
        }
        return obj;
    }
}
