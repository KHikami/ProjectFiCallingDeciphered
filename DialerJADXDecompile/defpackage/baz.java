package defpackage;

import java.util.Comparator;

/* compiled from: PG */
/* renamed from: baz */
final class baz implements Comparator {
    private /* synthetic */ baw a;

    baz(baw baw) {
        this.a = baw;
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        bbb bbb = (bbb) obj2;
        bbe bbe = ((bbb) obj).b;
        String b = aim.b(bbe.a, bbe.b, this.a.c);
        if (b == null) {
            b = "";
        }
        bbe bbe2 = bbb.b;
        String b2 = aim.b(bbe2.a, bbe2.b, this.a.c);
        if (b2 == null) {
            b2 = "";
        }
        return b.compareToIgnoreCase(b2);
    }
}
