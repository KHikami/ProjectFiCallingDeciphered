import android.os.Bundle;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import com.google.android.libraries.social.settings.PreferenceScreen;

public final class fvl extends jzn implements jwg {
    jca a;
    fvv b;
    bko c;
    czg d;
    jxk e;
    jxk f;
    private fvo g;

    public fvl() {
        jwf jwf = new jwf(this, this.lifecycle);
    }

    protected void onAttachBinder(Bundle bundle) {
        super.onAttachBinder(bundle);
        this.a = (jca) this.binder.a(jca.class);
        this.b = (fvv) this.binder.a(fvv.class);
    }

    public void onStart() {
        super.onStart();
        this.g = new fvo(this);
        RealTimeChatService.a(this.g);
    }

    public void onStop() {
        super.onStop();
        RealTimeChatService.b(this.g);
        this.g = null;
    }

    public void a() {
        this.c = fde.e(this.a.a());
        PreferenceScreen b = ((jxg) jyn.a(this.context, jxg.class)).b();
        int a = this.a.a();
        this.e = new jxk(this.context);
        this.e.g(bc.fK);
        this.e.h(bc.fJ);
        this.e.a(this.b.b(a));
        b.c(this.e);
        this.f = new jxk(this.context);
        this.f.g(bc.jT);
        this.f.h(bc.jU);
        this.f.a(this.b.c(a));
        b.c(this.f);
        jwm fvm = new fvm(this);
        this.e.a(fvm);
        this.f.a(fvm);
    }
}
