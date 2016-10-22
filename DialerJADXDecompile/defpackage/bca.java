package defpackage;

import android.telecom.Call;
import android.telecom.PhoneAccountHandle;
import com.android.incallui.InCallActivity;

/* compiled from: PG */
/* renamed from: bca */
public final class bca extends akd {
    public bca(InCallActivity inCallActivity) {
    }

    public final void a(PhoneAccountHandle phoneAccountHandle, boolean z) {
        bcj b = bcj.b();
        if (b.k != null) {
            ayo b2 = b.k.b();
            if (b2 != null) {
                String str = b2.d;
                Object a = bdp.a();
                if (phoneAccountHandle == null) {
                    bdf.c(a, "error phoneAccountSelected, accountHandle is null");
                }
                Call a2 = bdp.a(str);
                if (a2 != null) {
                    a2.phoneAccountSelected(phoneAccountHandle, z);
                    return;
                }
                String str2 = "error phoneAccountSelected, call not in call list ";
                str = String.valueOf(str);
                bdf.c(a, str.length() != 0 ? str2.concat(str) : new String(str2));
            }
        }
    }

    public final void a() {
        bcj b = bcj.b();
        b.r = true;
        if (b.k != null) {
            ayo b2 = b.k.b();
            if (b2 != null) {
                bdp.a().b(b2.d);
            }
        }
    }
}
