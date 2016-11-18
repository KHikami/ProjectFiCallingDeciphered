package defpackage;

import android.view.View;
import java.util.Comparator;

public final class pi implements Comparator<View> {
    public /* synthetic */ int compare(Object obj, Object obj2) {
        pa paVar = (pa) ((View) obj).getLayoutParams();
        pa paVar2 = (pa) ((View) obj2).getLayoutParams();
        if (paVar.a != paVar2.a) {
            return paVar.a ? 1 : -1;
        } else {
            return paVar.e - paVar2.e;
        }
    }
}
