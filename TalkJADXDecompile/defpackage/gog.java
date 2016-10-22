package defpackage;

import android.text.Spannable;
import java.util.Comparator;

/* renamed from: gog */
final class gog implements Comparator<gof> {
    Spannable a;

    public /* synthetic */ int compare(Object obj, Object obj2) {
        return a((gof) obj, (gof) obj2);
    }

    gog(Spannable spannable) {
        this.a = spannable;
    }

    private int a(gof gof, gof gof2) {
        int spanStart = this.a.getSpanStart(gof);
        int spanStart2 = this.a.getSpanStart(gof2);
        if (spanStart < spanStart2) {
            return -1;
        }
        return spanStart == spanStart2 ? 0 : 1;
    }
}
