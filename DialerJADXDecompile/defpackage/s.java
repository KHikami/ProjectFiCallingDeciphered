package defpackage;

import android.view.View;
import java.util.Comparator;

/* compiled from: PG */
/* renamed from: s */
public final class s implements Comparator {
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        View view = (View) obj2;
        float q = kn.q((View) obj);
        float q2 = kn.q(view);
        if (q > q2) {
            return -1;
        }
        if (q < q2) {
            return 1;
        }
        return 0;
    }
}
