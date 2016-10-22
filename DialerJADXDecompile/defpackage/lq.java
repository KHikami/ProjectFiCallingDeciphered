package defpackage;

import android.view.View;
import java.util.Comparator;

/* compiled from: PG */
/* renamed from: lq */
public final class lq implements Comparator {
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        lk lkVar = (lk) ((View) obj).getLayoutParams();
        lk lkVar2 = (lk) ((View) obj2).getLayoutParams();
        if (lkVar.a != lkVar2.a) {
            return lkVar.a ? 1 : -1;
        } else {
            return lkVar.e - lkVar2.e;
        }
    }
}
