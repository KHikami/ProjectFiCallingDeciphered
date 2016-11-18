package p000;

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
    fzw f14126a;
    jcf f14127b;
    private PreferenceCategory f14128c;
    private jca f14129d;

    public fvy() {
        jwf jwf = new jwf(this, this.lifecycle);
    }

    protected void onAttachBinder(Bundle bundle) {
        super.onAttachBinder(bundle);
        this.f14129d = (jca) this.binder.m25443a(jca.class);
        this.f14127b = (jcf) this.binder.m25443a(jcf.class);
        this.f14126a = (fzw) this.binder.m25443a(fzw.class);
    }

    public void onResume() {
        super.onResume();
        m16349b();
    }

    public static void m16344a(int i, Context context) {
        if (((fzw) jyn.m25426a(context, fzw.class)).mo2161i()) {
            ((bhl) jyn.m25426a(context, bhl.class)).mo550a(new fks(i, context));
        }
    }

    void m16349b() {
        jwi jxk;
        jwi jwi;
        CharSequence charSequence;
        Object obj;
        Object obj2;
        CharSequence charSequence2;
        String str;
        Object obj3;
        String u;
        boolean i = fde.m15028i();
        this.f14128c.mo1328c();
        if (VERSION.SDK_INT < 19) {
            jxk = new jxk(this.context);
            jxk.mo534a(i);
            jxk.m5148g(bc.cA);
            jxk.m5150h(bc.cz);
            jxk.m5121a(new fvz(this));
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
                jwi.m5148g(bc.kR);
                jwi.m5150h(bc.kQ);
                jwi.m5117a(intent);
            } else {
                intent = new Intent("android.provider.Telephony.ACTION_CHANGE_DEFAULT");
                intent.setPackage("com.android.settings");
                intent.putExtra("package", "com.google.android.talk");
                jwi.m5148g(bc.kP);
                jwi.m5150h(bc.kO);
                jwi.m5117a(intent);
            }
        }
        this.f14128c.m10483c(jwi);
        bko a = fde.m14991a(this.context);
        if (a != null && fde.m15020e().length > 1) {
            jwi jwi2 = new jwi(this.context);
            jwi2.m5148g(bc.kn);
            jwi2.mo2102b(a.m5629a());
            jwi2.m5117a(gwb.m1385E());
            this.f14128c.m10483c(jwi2);
        }
        bko k = fde.m15031k();
        if (k == null || !k.m5619F()) {
            charSequence = null;
            obj = null;
            obj2 = null;
        } else {
            String f = glq.m18025f(this.context);
            if (TextUtils.isEmpty(f)) {
                charSequence = null;
                String str2 = "unknown_sim_number";
                int i2 = 1;
            } else {
                String e = glq.m18021e(this.context, f);
                charSequence = glq.m18038i(this.context, f);
                obj = e;
                obj2 = 1;
            }
        }
        CharSequence charSequence3;
        if (k == null || !k.m5654w()) {
            charSequence2 = null;
            str = null;
            charSequence3 = null;
            obj3 = null;
        } else {
            e = k.m5616C();
            u = k.m5652u();
            if (e == null || u == null) {
                charSequence2 = null;
                str = u;
                charSequence3 = null;
                obj3 = null;
            } else {
                charSequence2 = glq.m18038i(this.context, u);
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
            fwf.m5148g(bc.kE);
            fwf.m16373a(this.f14126a.mo2162j());
            e = fwf.m16386h();
            if (e == null || !(e.equals(u) || e.equals(obj))) {
                str = glq.m18021e(this.context, str);
                if (e == null || !e.equals(str)) {
                    fwf.m16373a("auto");
                    this.f14126a.mo2143a("auto");
                } else {
                    fwf.m16373a(u);
                    this.f14126a.mo2143a(u);
                }
            }
            boolean M = k.m5626M();
            Map kyVar = new ky();
            ba.m4610b(!TextUtils.isEmpty(u), (Object) "A null/empty GV phone number is unexpected here");
            String str3 = "auto";
            if (this.f14126a.mo2155d()) {
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
            boolean d = this.f14126a.mo2155d();
            CharSequence[] charSequenceArr = new String[3];
            if (d) {
                i3 = bc.kz;
            } else {
                i3 = bc.kx;
            }
            charSequenceArr[0] = getString(i3);
            charSequenceArr[1] = getString(M ? bc.kF : bc.kA);
            charSequenceArr[2] = getString(bc.kC);
            fwf.m16380b(charSequenceArr);
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
            fwf.m16389a(charSequenceArr2);
            fwf.m16382c(new String[]{"auto", u, obj});
            fwf.mo2102b((CharSequence) kyVar.get(this.f14126a.mo2162j()));
            fwf.m5121a(new fwa(this, fwf, kyVar));
            jxk = fwf;
        }
        if (jxk != null) {
            this.f14128c.m10483c(jxk);
        }
        jxk = new jwi(this.context);
        jxk.m5148g(bc.f2922F);
        jxk.m5117a(gwb.m2210g(this.f14129d.mo2317a()));
        this.f14128c.m10483c(jxk);
        m16346a(((jxg) jyn.m25426a(this.context, jxg.class)).mo3625b(), i);
        jwi.m5137d(glq.m18015c(this.context));
    }

    private void m16346a(jwu jwu, boolean z) {
        for (int a = jwu.mo531a() - 1; a >= 0; a--) {
            jwi a2 = jwu.m10477a(a);
            if (a2 instanceof jwu) {
                m16346a((jwu) a2, z);
            } else {
                a2.m5137d(z);
            }
        }
    }

    public void mo495a() {
        int a = this.f14129d.mo2317a();
        jwo jwo = new jwo(this.context);
        this.f14128c = jwo.m25341a(bc.kT);
        PreferenceCategory a2 = jwo.m25341a(bc.kU);
        jwi ftv = new ftv(this.context);
        a2.m10483c(ftv);
        String valueOf = String.valueOf("sms_notification_sound_key");
        ftv.m5132c(new StringBuilder(String.valueOf(valueOf).length() + 12).append(a).append(".").append(valueOf).toString());
        ftv.m5148g(bc.ku);
        ftv.m16224b(2);
        ftv.m5142e(true);
        ftv.m5121a(new fwb(this, a));
        ftv.m16231a(((fuz) jyn.m25426a(this.context, fuz.class)).m16285a(this.f14129d.mo2317a(), fvd.LOCAL_SMS));
        if (((Vibrator) getActivity().getSystemService("vibrator")).hasVibrator()) {
            jwi jvv = new jvv(this.context, this.f14129d.mo2317a(), "sms_notification_vibrate_bool_key");
            a2.m10483c(jvv);
            jvv.m5148g(bc.kv);
            jvv.mo534a(this.f14129d.mo2320c().mo3439a("sms_notification_vibrate_bool_key", true));
        }
        PreferenceCategory a3 = jwo.m25341a(bc.kS);
        if ((ajf.m2609a().mo2136t() && glq.m18023e(this.context)) || fde.m15029j() != null) {
            m16345a(a3, bc.it, bc.is, "group_mms_key", null);
        }
        m16345a(a3, bc.aH, bc.aG, "delete_old_messages_key", null);
        if (ajf.m2609a().mo2134r()) {
            m16345a(a3, bc.kr, bc.kq, "sms_delivery_report_key", null);
        }
        m16345a(a3, bc.cw, bc.cv, "enable_auto_retrieve_key", null);
        m16345a(a3, bc.cu, bc.ct, "enable_auto_retrieve_in_roaming_key", null);
        if (m16347c()) {
            jvv = new jwi(this.context);
            jvv.m5148g(bc.kN);
            jvv.m5122a(new fwc(this));
            a3.m10483c(jvv);
        }
        if (!fyi.m16622b(this.context)) {
            jvv = new jwi(this.context);
            jvv.m5148g(bc.kp);
            jvv.m5150h(bc.ko);
            jvv.m5117a(gwb.m1380D());
            a3.m10483c(jvv);
        }
        if (gld.m17936a()) {
            if (fyi.m16628c(this.context)) {
                m16345a(a3, bc.tL, bc.tK, "use_local_apn_pref_key", new fwd(this));
            }
            m16345a(a3, bc.bA, bc.bz, "dump_sms_pref_key", null);
            m16345a(a3, bc.by, bc.bx, "dump_mms_pref_key", null);
        }
        m16349b();
    }

    private boolean m16347c() {
        if (!ajf.m2609a().mo2138v()) {
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

    private void m16345a(PreferenceCategory preferenceCategory, int i, int i2, String str, jwm jwm) {
        jwi jxk = new jxk(this.context);
        preferenceCategory.m10483c(jxk);
        jxk.m5148g(i);
        if (i2 != 0) {
            jxk.m5150h(i2);
        }
        jxk.mo534a(this.f14126a.mo2149b(str));
        if (jwm != null) {
            jxk.m5121a(jwm);
        } else {
            jxk.m5121a(new fwe(this, str));
        }
    }
}
