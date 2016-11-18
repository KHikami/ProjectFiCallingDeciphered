package p000;

public class nwb<ContainingType extends nxi, Type> {
    final ContainingType f31161a;
    final Type f31162b;
    final nxi f31163c;
    final nwh f31164d;

    public nwb(nxi nxi, Object obj, nxi nxi2, nwh nwh) {
        this();
        if (nxi == null) {
            throw new IllegalArgumentException("Null containingTypeDefaultInstance");
        } else if (nwh.b() == nyi.MESSAGE && nxi2 == null) {
            throw new IllegalArgumentException("Null messageDefaultInstance");
        } else {
            this.f31161a = nxi;
            this.f31162b = obj;
            this.f31163c = nxi2;
            this.f31164d = nwh;
        }
    }

    public int m36914a() {
        return this.f31164d.a();
    }

    public nxi m36916b() {
        return this.f31163c;
    }

    Object m36915a(Object obj) {
        if (this.f31164d.c() == nyn.ENUM) {
            return Integer.valueOf(((nww) obj).mo4132a());
        }
        return obj;
    }
}
