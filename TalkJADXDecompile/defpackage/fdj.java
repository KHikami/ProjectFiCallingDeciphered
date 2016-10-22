package defpackage;

import android.content.Context;
import android.os.Build.VERSION;
import android.provider.Telephony.Sms;
import com.google.android.apps.hangouts.sms.SmsReceiver;
import java.util.ArrayList;
import java.util.List;

/* renamed from: fdj */
public final class fdj {
    public boolean a() {
        boolean z = true;
        Context H = gwb.H();
        if (fde.c == null) {
            fde.c = Boolean.valueOf(((fzw) jyn.a(H, fzw.class)).i());
        } else if (gwb.b(fde.c) && jyn.b(H, gae.class) != null) {
            fdj.a(false);
        }
        boolean equals;
        if (glq.c(H)) {
            if (VERSION.SDK_INT >= 19) {
                ehz ehz = (ehz) jyn.a(H, ehz.class);
                List arrayList = new ArrayList();
                arrayList.add("android.permission.READ_SMS");
                arrayList.add("android.permission.RECEIVE_SMS");
                arrayList.add("android.permission.SEND_SMS");
                arrayList.add("android.permission.RECEIVE_MMS");
                if (ehz.a(arrayList)) {
                    equals = H.getPackageName().equals(Sms.getDefaultSmsPackage(H));
                } else {
                    equals = false;
                }
                if (gwb.b(fde.c) != equals) {
                    fdj.a(equals);
                    if (gwb.b(fde.c) != equals) {
                        z = false;
                    }
                    ba.b(z);
                }
            }
        } else if (gwb.b(fde.c)) {
            fdj.a(false);
            if (gwb.b(fde.c)) {
                equals = false;
            } else {
                equals = true;
            }
            ba.b(equals);
        }
        return gwb.b(fde.c);
    }

    public static void a(boolean z) {
        Context H = gwb.H();
        fzw fzw = (fzw) jyn.a(H, fzw.class);
        bko l = fde.l();
        fde.c = Boolean.valueOf(z);
        fzw.d(z);
        if (z) {
            l = fde.k();
            fvy.a(l.g(), H);
            if (fzw.a(l.g())) {
                fde.a(H, true);
            }
        } else {
            fzb.a(l);
            fde.a(H, false);
        }
        SmsReceiver.a();
    }
}
