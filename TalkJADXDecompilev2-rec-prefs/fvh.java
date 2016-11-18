package p000;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.libraries.social.settings.PreferenceScreen;

public final class fvh extends jzn implements jwg {
    private jca f14091a;

    public fvh() {
        jwf jwf = new jwf(this, this.lifecycle);
    }

    protected void onAttachBinder(Bundle bundle) {
        super.onAttachBinder(bundle);
        this.f14091a = (jca) this.binder.m25443a(jca.class);
    }

    public void mo495a() {
        jwi jvv;
        PreferenceScreen b = ((jxg) this.binder.m25443a(jxg.class)).mo3625b();
        Intent intent = getActivity().getIntent();
        String stringExtra = intent.getStringExtra("notifications_key");
        if (stringExtra != null) {
            jvv = new jvv(this.context, this.f14091a.mo2317a(), stringExtra);
            jvv.m5148g(bc.kt);
            jvv.m5128b((Object) Boolean.valueOf(this.f14091a.mo2320c().mo3439a(stringExtra, true)));
            jvv.m5132c(stringExtra);
            b.m10483c(jvv);
        }
        jvv = fvh.m16307a(this.context, bc.ac, intent.getStringExtra("sound_key"), intent.getIntExtra("sound_type", 0), this.f14091a);
        b.m10483c(jvv);
        jvv.m5141e(stringExtra);
        String stringExtra2 = intent.getStringExtra("vibrate_key");
        jwi a = fvh.m16308a(this.context, this.f14091a.mo2317a(), bc.kv, stringExtra2, this.f14091a.mo2320c().mo3439a(stringExtra2, true));
        b.m10483c(a);
        a.m5141e(stringExtra);
    }

    static jvv m16308a(Context context, int i, int i2, String str, boolean z) {
        jvv jvv = new jvv(context, i, str);
        jvv.m5148g(i2);
        jvv.m5128b((Object) Boolean.valueOf(z));
        return jvv;
    }

    static ftv m16307a(Context context, int i, String str, int i2, jca jca) {
        int i3;
        ftv ftv = new ftv(context);
        ftv.m5148g(i);
        ftv.m16224b(i2);
        ftv.m5121a(new fvi(ftv, i2, jca, str));
        if (i2 == 1) {
            i3 = gwb.iw;
        } else {
            i3 = gwb.ix;
        }
        ftv.m5132c(new StringBuilder(String.valueOf(str).length() + 12).append(jca.mo2317a()).append(".").append(str).toString());
        ftv.m16232a(jca.mo2320c().mo3435a(str, gld.m17944c(i3).toString()));
        return ftv;
    }
}
