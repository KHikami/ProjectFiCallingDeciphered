package p000;

import android.content.Context;
import android.os.Build.VERSION;
import android.provider.Telephony.Sms;
import com.google.android.apps.hangouts.sms.SmsReceiver;
import java.util.ArrayList;
import java.util.List;

public final class fdj {
    public boolean m15069a() {
        boolean z = true;
        Context H = gwb.m1400H();
        if (fde.f12726c == null) {
            fde.f12726c = Boolean.valueOf(((fzw) jyn.m25426a(H, fzw.class)).mo2161i());
        } else if (gwb.m2061b(fde.f12726c) && jyn.m25433b(H, gae.class) != null) {
            fdj.m15068a(false);
        }
        boolean equals;
        if (glq.m18015c(H)) {
            if (VERSION.SDK_INT >= 19) {
                ehz ehz = (ehz) jyn.m25426a(H, ehz.class);
                List arrayList = new ArrayList();
                arrayList.add("android.permission.READ_SMS");
                arrayList.add("android.permission.RECEIVE_SMS");
                arrayList.add("android.permission.SEND_SMS");
                arrayList.add("android.permission.RECEIVE_MMS");
                if (ehz.mo1883a(arrayList)) {
                    equals = H.getPackageName().equals(Sms.getDefaultSmsPackage(H));
                } else {
                    equals = false;
                }
                if (gwb.m2061b(fde.f12726c) != equals) {
                    fdj.m15068a(equals);
                    if (gwb.m2061b(fde.f12726c) != equals) {
                        z = false;
                    }
                    ba.m4609b(z);
                }
            }
        } else if (gwb.m2061b(fde.f12726c)) {
            fdj.m15068a(false);
            if (gwb.m2061b(fde.f12726c)) {
                equals = false;
            } else {
                equals = true;
            }
            ba.m4609b(equals);
        }
        return gwb.m2061b(fde.f12726c);
    }

    public static void m15068a(boolean z) {
        Context H = gwb.m1400H();
        fzw fzw = (fzw) jyn.m25426a(H, fzw.class);
        bko l = fde.m15033l();
        fde.f12726c = Boolean.valueOf(z);
        fzw.mo2154d(z);
        if (z) {
            l = fde.m15031k();
            fvy.m16344a(l.m5638g(), H);
            if (fzw.mo2146a(l.m5638g())) {
                fde.m14997a(H, true);
            }
        } else {
            fzb.m16668a(l);
            fde.m14997a(H, false);
        }
        SmsReceiver.m9184a();
    }
}
