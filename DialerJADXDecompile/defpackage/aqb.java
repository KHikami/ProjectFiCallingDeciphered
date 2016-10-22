package defpackage;

import android.telephony.PhoneNumberUtils;
import android.widget.Toast;

/* compiled from: PG */
/* renamed from: aqb */
final class aqb implements aux {
    private /* synthetic */ String a;
    private /* synthetic */ String b;
    private /* synthetic */ apy c;

    aqb(apy apy, String str, String str2) {
        this.c = apy;
        this.a = str;
        this.b = str2;
    }

    public final void a(Integer num) {
        if (num == null) {
            atq.a(num, this.a, this.b, PhoneNumberUtils.formatNumber(this.a, this.b), Integer.valueOf(aq.l), this.c.getFragmentManager(), this.c);
        } else if (num.intValue() == -1) {
            Toast.makeText(this.c.getContext(), aim.a(this.c.getResources(), cob.ci, this.a), 0).show();
        } else {
            Toast.makeText(this.c.getContext(), aim.a(this.c.getResources(), cob.bb, this.a), 0).show();
        }
    }
}
