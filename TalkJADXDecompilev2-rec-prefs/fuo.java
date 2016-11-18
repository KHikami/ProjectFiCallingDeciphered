package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.android.apps.hangouts.settings.NotificationSettingsActivity;
import com.google.android.libraries.social.settings.PreferenceCategory;

public final class fuo extends jzn implements jwg {
    bko f14041a;
    jvv f14042b;
    private jca f14043c;

    public fuo() {
        jwf jwf = new jwf(this, this.lifecycle);
    }

    protected void onAttachBinder(Bundle bundle) {
        super.onAttachBinder(bundle);
        this.f14043c = (jca) this.binder.m25443a(jca.class);
    }

    public void mo495a() {
        int i;
        int i2;
        String str;
        String u;
        Object i3;
        PreferenceCategory b;
        SharedPreferences b2;
        this.f14041a = fde.m15018e(this.f14043c.mo2317a());
        boolean M = this.f14041a.m5626M();
        jwo jwo = new jwo(this.context);
        fbx fbx = (fbx) this.binder.m25443a(fbx.class);
        boolean w = this.f14041a.m5654w();
        int i4 = (this.f14041a.m5653v() || w) ? 1 : 0;
        if (fbx.mo1968a(this.context, this.f14041a) && this.f14041a.m5650s()) {
            bko bko = this.f14041a;
            bbn bbn = (bbn) jyn.m25433b(this.context, bbn.class);
            if (bbn == null || !bbn.mo2199a(bko.m5629a())) {
                i = 1;
            } else {
                i = 0;
            }
            if (i != 0) {
                i2 = 1;
                if (i4 == 0 || i2 != 0) {
                    str = "";
                    u = this.f14041a.m5652u();
                    if (u == null) {
                        i3 = glq.m18038i(gwb.m1400H(), u);
                    } else {
                        u = str;
                    }
                    if (M) {
                        i = bc.cY;
                    } else {
                        i = bc.tj;
                    }
                    b = jwo.m25346b(getString(i, i3));
                    if (i2 != 0) {
                        boolean b3 = fbx.mo1972b(getActivity(), this.f14041a);
                        jwi jvv = new jvv(this.context, this.f14043c.mo2317a(), getString(bc.cU));
                        jvv.m5148g(bc.cV);
                        jvv.m5128b((Object) Boolean.valueOf(b3));
                        jvv.m5121a(new fup(this));
                        b.m10483c(jvv);
                    }
                    if (i4 != 0) {
                        b2 = jwy.m25356b(getActivity());
                        if (b2.contains("gv_sms")) {
                            b2.edit().remove("gv_sms").commit();
                        }
                        this.f14042b = new jvv(this.context, this.f14043c.mo2317a(), "gv_sms", Boolean.valueOf(w));
                        this.f14042b.m5132c("gv_sms");
                        this.f14042b.m5148g(bc.cX);
                        b.m10483c(this.f14042b);
                        this.f14042b.m5121a(new fuq(this));
                        Context context = this.context;
                        kbu kbu = this.lifecycle;
                        if (M) {
                            i4 = bc.cZ;
                        } else {
                            i4 = bc.tq;
                        }
                        jwi a = NotificationSettingsActivity.m9176a(context, kbu, jwo, i4, null, "gv_sms_sound_key", 2, "gv_sms_vibrate_boolean_key");
                        b.m10483c(a);
                        a.m5141e("gv_sms");
                        context = this.context;
                        kbu = this.lifecycle;
                        if (M) {
                            i4 = bc.da;
                        } else {
                            i4 = bc.tr;
                        }
                        a = NotificationSettingsActivity.m9176a(context, kbu, jwo, i4, null, "gv_voicemail_sound_key", 2, "gv_voicemail_vibrate_boolean_key");
                        b.m10483c(a);
                        a.m5141e("gv_sms");
                    }
                }
                return;
            }
        }
        i2 = 0;
        if (i4 == 0) {
        }
        str = "";
        u = this.f14041a.m5652u();
        if (u == null) {
            u = str;
        } else {
            i3 = glq.m18038i(gwb.m1400H(), u);
        }
        if (M) {
            i = bc.cY;
        } else {
            i = bc.tj;
        }
        b = jwo.m25346b(getString(i, i3));
        if (i2 != 0) {
            boolean b32 = fbx.mo1972b(getActivity(), this.f14041a);
            jwi jvv2 = new jvv(this.context, this.f14043c.mo2317a(), getString(bc.cU));
            jvv2.m5148g(bc.cV);
            jvv2.m5128b((Object) Boolean.valueOf(b32));
            jvv2.m5121a(new fup(this));
            b.m10483c(jvv2);
        }
        if (i4 != 0) {
            b2 = jwy.m25356b(getActivity());
            if (b2.contains("gv_sms")) {
                b2.edit().remove("gv_sms").commit();
            }
            this.f14042b = new jvv(this.context, this.f14043c.mo2317a(), "gv_sms", Boolean.valueOf(w));
            this.f14042b.m5132c("gv_sms");
            this.f14042b.m5148g(bc.cX);
            b.m10483c(this.f14042b);
            this.f14042b.m5121a(new fuq(this));
            Context context2 = this.context;
            kbu kbu2 = this.lifecycle;
            if (M) {
                i4 = bc.cZ;
            } else {
                i4 = bc.tq;
            }
            jwi a2 = NotificationSettingsActivity.m9176a(context2, kbu2, jwo, i4, null, "gv_sms_sound_key", 2, "gv_sms_vibrate_boolean_key");
            b.m10483c(a2);
            a2.m5141e("gv_sms");
            context2 = this.context;
            kbu2 = this.lifecycle;
            if (M) {
                i4 = bc.da;
            } else {
                i4 = bc.tr;
            }
            a2 = NotificationSettingsActivity.m9176a(context2, kbu2, jwo, i4, null, "gv_voicemail_sound_key", 2, "gv_voicemail_vibrate_boolean_key");
            b.m10483c(a2);
            a2.m5141e("gv_sms");
        }
    }
}
