package defpackage;

/* renamed from: iyt */
public final class iyt extends iyw {
    iyt(int i) {
        super(i);
    }

    public int a(iyz iyz) {
        return iyz.a().getInt((this.b + iyz.b()) + 4);
    }

    public int a(iyz iyz, int i) {
        ba.b(i, a(iyz));
        return iyz.h(((((this.b + iyz.b()) + 4) + 4) + iyz.b()) + (iyz.b() * i));
    }

    public String b(iyz iyz, int i) {
        ba.b(i, a(iyz));
        return "[" + i + "]";
    }

    public String b(iyz iyz) {
        return "Object[" + a(iyz) + "]";
    }
}
