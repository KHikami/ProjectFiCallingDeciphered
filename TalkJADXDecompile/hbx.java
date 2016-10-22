import com.google.android.gms.common.api.Scope;

public final class hbx {
    public static final gue a;
    public static final gue b;
    public static final guc<hxh, hcb> c;
    static final guc<hxh, gwb> d;
    public static final Scope e;
    public static final Scope f;
    public static final gtz<hcb> g;
    public static final gtz<gwb> h;

    static {
        a = new gue((byte) 0);
        b = new gue((byte) 0);
        c = new hby();
        d = new hbz();
        e = new Scope("profile");
        f = new Scope("email");
        g = new gtz("SignIn.API", c, a);
        h = new gtz("SignIn.INTERNAL_API", d, b);
    }
}
