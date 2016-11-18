package p000;

public final class iyt extends iyw {
    iyt(int i) {
        super(i);
    }

    public int mo3419a(iyz iyz) {
        return iyz.m23538a().getInt((this.b + iyz.m23539b()) + 4);
    }

    public int mo3420a(iyz iyz, int i) {
        ba.m4592b(i, mo3419a(iyz));
        return iyz.m23547h(((((this.b + iyz.m23539b()) + 4) + 4) + iyz.m23539b()) + (iyz.m23539b() * i));
    }

    public String mo3422b(iyz iyz, int i) {
        ba.m4592b(i, mo3419a(iyz));
        return "[" + i + "]";
    }

    public String mo3421b(iyz iyz) {
        return "Object[" + mo3419a(iyz) + "]";
    }
}
