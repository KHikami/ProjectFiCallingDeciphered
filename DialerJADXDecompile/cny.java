import com.google.android.gms.common.api.Scope;

public final class cny {
    public static final bqz a;
    public static final bqy b;
    private static brb c;
    private static brb d;
    private static bqz e;

    static {
        c = new brb();
        d = new brb();
        a = new cnz();
        e = new coa();
        Scope scope = new Scope("profile");
        scope = new Scope("email");
        b = new bqy("SignIn.API", a, c);
        bqy bqy = new bqy("SignIn.INTERNAL_API", e, d);
        coc coc = new coc();
    }
}
