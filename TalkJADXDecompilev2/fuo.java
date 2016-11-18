package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.android.apps.hangouts.settings.NotificationSettingsActivity;
import com.google.android.libraries.social.settings.PreferenceCategory;

public final class fuo extends jzn implements jwg {
    bko a;
    jvv b;
    private jca c;

    public fuo() {
        jwf jwf = new jwf(this, this.lifecycle);
    }

    protected void onAttachBinder(Bundle bundle) {
        super.onAttachBinder(bundle);
        this.c = (jca) this.binder.a(jca.class);
    }

    public void a() {
        int i;
        int i2;
        String str;
        String u;
        Object i3;
        PreferenceCategory b;
        SharedPreferences b2;
        this.a = fde.e(this.c.a());
        boolean M = this.a.M();
        jwo jwo = new jwo(this.context);
        fbx fbx = (fbx) this.binder.a(fbx.class);
        boolean w = this.a.w();
        int i4 = (this.a.v() || w) ? 1 : 0;
        if (fbx.a(this.context, this.a) && this.a.s()) {
            bko bko = this.a;
            bbn bbn = (bbn) jyn.b(this.context, bbn.class);
            if (bbn == null || !bbn.a(bko.a())) {
                i = 1;
            } else {
                i = 0;
            }
            if (i != 0) {
                i2 = 1;
                if (i4 == 0 || i2 != 0) {
                    str = "";
                    u = this.a.u();
                    if (u == null) {
                        i3 = glq.i(gwb.H(), u);
                    } else {
                        u = str;
                    }
                    if (M) {
                        i = bc.cY;
                    } else {
                        i = bc.tj;
                    }
                    b = jwo.b(getString(i, i3));
                    if (i2 != 0) {
                        boolean b3 = fbx.b(getActivity(), this.a);
                        jwi jvv = new jvv(this.context, this.c.a(), getString(bc.cU));
                        jvv.g(bc.cV);
                        jvv.b((Object) Boolean.valueOf(b3));
                        jvv.a(new fup(this));
                        b.c(jvv);
                    }
                    if (i4 != 0) {
                        b2 = jwy.b(getActivity());
                        if (b2.contains("gv_sms")) {
                            b2.edit().remove("gv_sms").commit();
                        }
                        this.b = new jvv(this.context, this.c.a(), "gv_sms", Boolean.valueOf(w));
                        this.b.c("gv_sms");
                        this.b.g(bc.cX);
                        b.c(this.b);
                        this.b.a(new fuq(this));
                        Context context = this.context;
                        kbu kbu = this.lifecycle;
                        if (M) {
                            i4 = bc.cZ;
                        } else {
                            i4 = bc.tq;
                        }
                        jwi a = NotificationSettingsActivity.a(context, kbu, jwo, i4, null, "gv_sms_sound_key", 2, "gv_sms_vibrate_boolean_key");
                        b.c(a);
                        a.e("gv_sms");
                        context = this.context;
                        kbu = this.lifecycle;
                        if (M) {
                            i4 = bc.da;
                        } else {
                            i4 = bc.tr;
                        }
                        a = NotificationSettingsActivity.a(context, kbu, jwo, i4, null, "gv_voicemail_sound_key", 2, "gv_voicemail_vibrate_boolean_key");
                        b.c(a);
                        a.e("gv_sms");
                    }
                }
                return;
            }
        }
        i2 = 0;
        if (i4 == 0) {
        }
        str = "";
        u = this.a.u();
        if (u == null) {
            u = str;
        } else {
            i3 = glq.i(gwb.H(), u);
        }
        if (M) {
            i = bc.cY;
        } else {
            i = bc.tj;
        }
        b = jwo.b(getString(i, i3));
        if (i2 != 0) {
            boolean b32 = fbx.b(getActivity(), this.a);
            jwi jvv2 = new jvv(this.context, this.c.a(), getString(bc.cU));
            jvv2.g(bc.cV);
            jvv2.b((Object) Boolean.valueOf(b32));
            jvv2.a(new fup(this));
            b.c(jvv2);
        }
        if (i4 != 0) {
            b2 = jwy.b(getActivity());
            if (b2.contains("gv_sms")) {
                b2.edit().remove("gv_sms").commit();
            }
            this.b = new jvv(this.context, this.c.a(), "gv_sms", Boolean.valueOf(w));
            this.b.c("gv_sms");
            this.b.g(bc.cX);
            b.c(this.b);
            this.b.a(new fuq(this));
            Context context2 = this.context;
            kbu kbu2 = this.lifecycle;
            if (M) {
                i4 = bc.cZ;
            } else {
                i4 = bc.tq;
            }
            jwi a2 = NotificationSettingsActivity.a(context2, kbu2, jwo, i4, null, "gv_sms_sound_key", 2, "gv_sms_vibrate_boolean_key");
            b.c(a2);
            a2.e("gv_sms");
            context2 = this.context;
            kbu2 = this.lifecycle;
            if (M) {
                i4 = bc.da;
            } else {
                i4 = bc.tr;
            }
            a2 = NotificationSettingsActivity.a(context2, kbu2, jwo, i4, null, "gv_voicemail_sound_key", 2, "gv_voicemail_vibrate_boolean_key");
            b.c(a2);
            a2.e("gv_sms");
        }
    }
}
