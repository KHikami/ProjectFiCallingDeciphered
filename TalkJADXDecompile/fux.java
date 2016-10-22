import android.os.Bundle;
import com.google.android.libraries.social.settings.PreferenceCategory;
import com.google.android.libraries.social.settings.PreferenceScreen;

public final class fux extends jzn implements jwg {
    static final lo<Integer, Integer> a;
    jca b;
    iih c;
    private PreferenceCategory d;

    public fux() {
        jwf jwf = new jwf(this, this.lifecycle);
    }

    static {
        lo loVar = new lo();
        a = loVar;
        loVar.put(Integer.valueOf(10), Integer.valueOf(3390));
        a.put(Integer.valueOf(25), Integer.valueOf(3389));
        a.put(Integer.valueOf(30), Integer.valueOf(3388));
    }

    protected void onAttachBinder(Bundle bundle) {
        super.onAttachBinder(bundle);
        this.b = (jca) this.binder.a(jca.class);
        this.c = (iih) this.binder.a(iih.class);
    }

    public void a() {
        String str;
        boolean z;
        boolean z2 = true;
        int a = this.b.a();
        int f = ((fuz) jyn.a(this.context, fuz.class)).f(a);
        switch (f) {
            case wi.dr /*10*/:
                str = "NONE";
                break;
            case wi.dz /*25*/:
                str = "IMPORTANT_ONLY";
                break;
            default:
                str = "ALL";
                break;
        }
        jwo jwo = new jwo(this.context);
        PreferenceScreen b = ((jxg) jyn.a(this.context, jxg.class)).b();
        this.d = jwo.a(getString(bc.cS));
        b.c(this.d);
        jwi jwb = new jwb(this.context);
        jwi a2 = fvh.a(this.context, bc.ac, "chat_notification_sound_key", 2, this.b);
        jwi a3 = fvh.a(this.context, this.b.a(), bc.kv, "chat_notification_vibrate_bool_key", this.b.c().a("chat_notification_vibrate_bool_key", true));
        jwb.b(gwb.dr);
        jwb.c(gwb.ds);
        jwb.a(new fuy(this, a, a2, a3, jwb));
        jwb.g(bc.kt);
        jwb.a(bc.kt);
        jwb.a(str);
        jwb.b(jwb.i());
        boolean z3 = f == 10;
        if (z3) {
            z = false;
        } else {
            z = true;
        }
        a2.d(z);
        if (z3) {
            z2 = false;
        }
        a3.d(z2);
        this.d.c(jwb);
        this.d.c(a2);
        this.d.c(a2);
        this.d.c(a3);
    }
}
