package defpackage;

import android.view.View;
import java.util.Comparator;
import oa;

/* renamed from: ah */
public final class ah implements Comparator<View> {
    public /* synthetic */ int compare(Object obj, Object obj2) {
        View view = (View) obj2;
        float r = oa.r((View) obj);
        float r2 = oa.r(view);
        if (r > r2) {
            return -1;
        }
        if (r < r2) {
            return 1;
        }
        return 0;
    }
}
