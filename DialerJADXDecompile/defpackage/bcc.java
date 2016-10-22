package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.android.incallui.InCallActivity;
import java.util.Iterator;

/* compiled from: PG */
/* renamed from: bcc */
public final class bcc implements OnClickListener {
    private /* synthetic */ InCallActivity a;

    bcc(InCallActivity inCallActivity) {
        this.a = inCallActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.d = null;
        azs azs = azs.a;
        Iterator it = azs.e.iterator();
        while (it.hasNext()) {
            ayo ayo = (ayo) it.next();
            it.remove();
            azs.h(ayo);
        }
        bcj.b().g();
    }
}
