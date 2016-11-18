package p000;

import android.view.View;
import java.util.Comparator;

public final class pi implements Comparator<View> {
    public /* synthetic */ int compare(Object obj, Object obj2) {
        pa paVar = (pa) ((View) obj).getLayoutParams();
        pa paVar2 = (pa) ((View) obj2).getLayoutParams();
        if (paVar.f34754a != paVar2.f34754a) {
            return paVar.f34754a ? 1 : -1;
        } else {
            return paVar.f34758e - paVar2.f34758e;
        }
    }
}
