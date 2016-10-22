import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Vibrator;
import android.text.TextUtils;
import com.google.android.libraries.social.settings.PreferenceCategory;
import java.util.Map;

public final class fvy extends jzn implements jwg {
    fzw a;
    jcf b;
    private PreferenceCategory c;
    private jca d;

    public fvy() {
        jwf jwf = new jwf(this, this.lifecycle);
    }

    protected void onAttachBinder(Bundle bundle) {
        super.onAttachBinder(bundle);
        this.d = (jca) this.binder.a(jca.class);
        this.b = (jcf) this.binder.a(jcf.class);
        this.a = (fzw) this.binder.a(fzw.class);
    }

    public void onResume() {
        super.onResume();
        b();
    }

    public static void a(int i, Context context) {
        if (((fzw) jyn.a(context, fzw.class)).i()) {
            ((bhl) jyn.a(context, bhl.class)).a(new fks(i, context));
        }
    }

    void b() {
        jwi jxk;
        jwi jwi;
        CharSequence charSequence;
        Object obj;
        Object obj2;
        CharSequence charSequence2;
        String str;
        Object obj3;
        String u;
        boolean i = fde.i();
        this.c.c();
        if (VERSION.SDK_INT < 19) {
            jxk = new jxk(this.context);
            jxk.a(i);
            jxk.g(bc.cA);
            jxk.h(bc.cz);
            jxk.a(new fvz(this));
            jwi = jxk;
        } else {
            jwi = new jwi(this.context);
            Intent intent;
            if (i) {
                if (VERSION.SDK_INT >= 23) {
                    intent = new Intent("android.provider.Telephony.ACTION_CHANGE_DEFAULT");
                } else {
                    intent = new Intent("android.settings.WIRELESS_SETTINGS");
                    intent.setPackage("com.android.settings");
                }
                jwi.g(bc.kR);
                jwi.h(bc.kQ);
                jwi.a(intent);
            } else {
                intent = new Intent("android.provider.Telephony.ACTION_CHANGE_DEFAULT");
                intent.setPackage("com.android.settings");
                intent.putExtra("package", "com.google.android.talk");
                jwi.g(bc.kP);
                jwi.h(bc.kO);
                jwi.a(intent);
            }
        }
        this.c.c(jwi);
        bko a = fde.a(this.context);
        if (a != null && fde.e().length > 1) {
            jwi jwi2 = new jwi(this.context);
            jwi2.g(bc.kn);
            jwi2.b(a.a());
            jwi2.a(gwb.E());
            this.c.c(jwi2);
        }
        bko k = fde.k();
        if (k == null || !k.F()) {
            charSequence = null;
            obj = null;
            obj2 = null;
        } else {
            String f = glq.f(this.context);
            if (TextUtils.isEmpty(f)) {
                charSequence = null;
                String str2 = "unknown_sim_number";
                int i2 = 1;
            } else {
                String e = glq.e(this.context, f);
                charSequence = glq.i(this.context, f);
                obj = e;
                obj2 = 1;
            }
        }
        CharSequence charSequence3;
        if (k == null || !k.w()) {
            charSequence2 = null;
            str = null;
            charSequence3 = null;
            obj3 = null;
        } else {
            e = k.C();
            u = k.u();
            if (e == null || u == null) {
                charSequence2 = null;
                str = u;
                charSequence3 = null;
                obj3 = null;
            } else {
                charSequence2 = glq.i(this.context, u);
                str = u;
                u = e;
                obj3 = 1;
            }
        }
        if (obj2 == null || r0 == null) {
            jxk = null;
        } else {
            int i3;
            jwi fwf = new fwf(this.context, null);
            fwf.g(bc.kE);
            fwf.a(this.a.j());
            e = fwf.h();
            if (e == null || !(e.equals(u) || e.equals(obj))) {
                str = glq.e(this.context, str);
                if (e == null || !e.equals(str)) {
                    fwf.a("auto");
                    this.a.a("auto");
                } else {
                    fwf.a(u);
                    this.a.a(u);
                }
            }
            boolean M = k.M();
            Map kyVar = new ky();
            ba.b(!TextUtils.isEmpty(u), (Object) "A null/empty GV phone number is unexpected here");
            String str3 = "auto";
            if (this.a.d()) {
                obj3 = getString(bc.ky);
            } else {
                obj3 = getString(bc.kw);
            }
            kyVar.put(str3, obj3);
            if (TextUtils.isEmpty(charSequence)) {
                kyVar.put(obj, getString(bc.kC));
            } else {
                kyVar.put(obj, getString(bc.kD, charSequence));
            }
            if (TextUtils.isEmpty(charSequence2)) {
                kyVar.put(u, getString(M ? bc.kF : bc.kA));
            } else {
                if (M) {
                    i3 = bc.kG;
                } else {
                    i3 = bc.kB;
                }
                kyVar.put(u, getString(i3, charSequence2));
            }
            boolean d = this.a.d();
            CharSequence[] charSequenceArr = new String[3];
            if (d) {
                i3 = bc.kz;
            } else {
                i3 = bc.kx;
            }
            charSequenceArr[0] = getString(i3);
            charSequenceArr[1] = getString(M ? bc.kF : bc.kA);
            charSequenceArr[2] = getString(bc.kC);
            fwf.b(charSequenceArr);
            CharSequence[] charSequenceArr2 = new String[3];
            if (d) {
                i3 = bc.ky;
            } else {
                i3 = bc.kw;
            }
            charSequenceArr2[0] = getString(i3);
            if (charSequence2 != null) {
                e = charSequence2;
            } else {
                e = getString(bc.kH);
            }
            charSequenceArr2[1] = e;
            if (charSequence != null) {
                e = charSequence;
            } else {
                e = getString(bc.kH);
            }
            charSequenceArr2[2] = e;
            fwf.a(charSequenceArr2);
            fwf.c(new String[]{"auto", u, obj});
            fwf.b((CharSequence) kyVar.get(this.a.j()));
            fwf.a(new fwa(this, fwf, kyVar));
            jxk = fwf;
        }
        if (jxk != null) {
            this.c.c(jxk);
        }
        jxk = new jwi(this.context);
        jxk.g(bc.F);
        jxk.a(gwb.g(this.d.a()));
        this.c.c(jxk);
        a(((jxg) jyn.a(this.context, jxg.class)).b(), i);
        jwi.d(glq.c(this.context));
    }

    private void a(jwu jwu, boolean z) {
        for (int a = jwu.a() - 1; a >= 0; a--) {
            jwi a2 = jwu.a(a);
            if (a2 instanceof jwu) {
                a((jwu) a2, z);
            } else {
                a2.d(z);
            }
        }
    }

    public void a() {
        int a = this.d.a();
        jwo jwo = new jwo(this.context);
        this.c = jwo.a(bc.kT);
        PreferenceCategory a2 = jwo.a(bc.kU);
        jwi ftv = new ftv(this.context);
        a2.c(ftv);
        String valueOf = String.valueOf("sms_notification_sound_key");
        ftv.c(new StringBuilder(String.valueOf(valueOf).length() + 12).append(a).append(".").append(valueOf).toString());
        ftv.g(bc.ku);
        ftv.b(2);
        ftv.e(true);
        ftv.a(new fwb(this, a));
        ftv.a(((fuz) jyn.a(this.context, fuz.class)).a(this.d.a(), fvd.LOCAL_SMS));
        if (((Vibrator) getActivity().getSystemService("vibrator")).hasVibrator()) {
            jwi jvv = new jvv(this.context, this.d.a(), "sms_notification_vibrate_bool_key");
            a2.c(jvv);
            jvv.g(bc.kv);
            jvv.a(this.d.c().a("sms_notification_vibrate_bool_key", true));
        }
        PreferenceCategory a3 = jwo.a(bc.kS);
        if ((ajf.a().t() && glq.e(this.context)) || fde.j() != null) {
            a(a3, bc.it, bc.is, "group_mms_key", null);
        }
        a(a3, bc.aH, bc.aG, "delete_old_messages_key", null);
        if (ajf.a().r()) {
            a(a3, bc.kr, bc.kq, "sms_delivery_report_key", null);
        }
        a(a3, bc.cw, bc.cv, "enable_auto_retrieve_key", null);
        a(a3, bc.cu, bc.ct, "enable_auto_retrieve_in_roaming_key", null);
        if (c()) {
            jvv = new jwi(this.context);
            jvv.g(bc.kN);
            jvv.a(new fwc(this));
            a3.c(jvv);
        }
        if (!fyi.b(this.context)) {
            jvv = new jwi(this.context);
            jvv.g(bc.kp);
            jvv.h(bc.ko);
            jvv.a(gwb.D());
            a3.c(jvv);
        }
        if (gld.a()) {
            if (fyi.c(this.context)) {
                a(a3, bc.tL, bc.tK, "use_local_apn_pref_key", new fwd(this));
            }
            a(a3, bc.bA, bc.bz, "dump_sms_pref_key", null);
            a(a3, bc.by, bc.bx, "dump_mms_pref_key", null);
        }
        b();
    }

    private boolean c() {
        if (!ajf.a().v()) {
            return false;
        }
        PackageManager packageManager = getActivity().getPackageManager();
        String str = "com.android.cellbroadcastreceiver";
        try {
            packageManager.getPackageInfo(str, 0);
            if (packageManager.getApplicationEnabledSetting(str) != 2) {
                return true;
            }
            return false;
        } catch (NameNotFoundException e) {
            return false;
        }
    }

    private void a(PreferenceCategory preferenceCategory, int i, int i2, String str, jwm jwm) {
        jwi jxk = new jxk(this.context);
        preferenceCategory.c(jxk);
        jxk.g(i);
        if (i2 != 0) {
            jxk.h(i2);
        }
        jxk.a(this.a.b(str));
        if (jwm != null) {
            jxk.a(jwm);
        } else {
            jxk.a(new fwe(this, str));
        }
    }
}
