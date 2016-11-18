package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.libraries.social.settings.PreferenceScreen;

public final class fvh extends jzn implements jwg {
    private jca a;

    public fvh() {
        jwf jwf = new jwf(this, this.lifecycle);
    }

    protected void onAttachBinder(Bundle bundle) {
        super.onAttachBinder(bundle);
        this.a = (jca) this.binder.a(jca.class);
    }

    public void a() {
        jwi jvv;
        PreferenceScreen b = ((jxg) this.binder.a(jxg.class)).b();
        Intent intent = getActivity().getIntent();
        String stringExtra = intent.getStringExtra("notifications_key");
        if (stringExtra != null) {
            jvv = new jvv(this.context, this.a.a(), stringExtra);
            jvv.g(bc.kt);
            jvv.b((Object) Boolean.valueOf(this.a.c().a(stringExtra, true)));
            jvv.c(stringExtra);
            b.c(jvv);
        }
        jvv = fvh.a(this.context, bc.ac, intent.getStringExtra("sound_key"), intent.getIntExtra("sound_type", 0), this.a);
        b.c(jvv);
        jvv.e(stringExtra);
        String stringExtra2 = intent.getStringExtra("vibrate_key");
        jwi a = fvh.a(this.context, this.a.a(), bc.kv, stringExtra2, this.a.c().a(stringExtra2, true));
        b.c(a);
        a.e(stringExtra);
    }

    static jvv a(Context context, int i, int i2, String str, boolean z) {
        jvv jvv = new jvv(context, i, str);
        jvv.g(i2);
        jvv.b((Object) Boolean.valueOf(z));
        return jvv;
    }

    static ftv a(Context context, int i, String str, int i2, jca jca) {
        int i3;
        ftv ftv = new ftv(context);
        ftv.g(i);
        ftv.b(i2);
        ftv.a(new fvi(ftv, i2, jca, str));
        if (i2 == 1) {
            i3 = gwb.iw;
        } else {
            i3 = gwb.ix;
        }
        ftv.c(new StringBuilder(String.valueOf(str).length() + 12).append(jca.a()).append(".").append(str).toString());
        ftv.a(jca.c().a(str, gld.c(i3).toString()));
        return ftv;
    }
}
