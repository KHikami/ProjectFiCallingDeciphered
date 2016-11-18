package p000;

import android.text.Spannable;
import java.util.Comparator;

final class gog implements Comparator<gof> {
    Spannable f15788a;

    public /* synthetic */ int compare(Object obj, Object obj2) {
        return m18214a((gof) obj, (gof) obj2);
    }

    gog(Spannable spannable) {
        this.f15788a = spannable;
    }

    private int m18214a(gof gof, gof gof2) {
        int spanStart = this.f15788a.getSpanStart(gof);
        int spanStart2 = this.f15788a.getSpanStart(gof2);
        if (spanStart < spanStart2) {
            return -1;
        }
        return spanStart == spanStart2 ? 0 : 1;
    }
}
