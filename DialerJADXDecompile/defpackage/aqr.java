package defpackage;

import android.text.TextUtils;
import java.util.Comparator;

/* compiled from: PG */
/* renamed from: aqr */
final class aqr implements Comparator {
    private /* synthetic */ aqq a;

    aqr(aqq aqq) {
        this.a = aqq;
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        adg adg = (adg) obj;
        adg adg2 = (adg) obj2;
        return czg.a.a(adg.l, adg2.l).a(a(adg), a(adg2)).a();
    }

    private final String a(adg adg) {
        if (this.a.l.a() == 1 || TextUtils.isEmpty(adg.c)) {
            return adg.b;
        }
        return adg.c;
    }
}
