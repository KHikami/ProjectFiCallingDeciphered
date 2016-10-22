import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.android.incallui.InCallActivity;
import java.util.Iterator;

/* compiled from: PG */
public final class bcb implements OnCancelListener {
    private /* synthetic */ InCallActivity a;

    bcb(InCallActivity inCallActivity) {
        this.a = inCallActivity;
    }

    public final void onCancel(DialogInterface dialogInterface) {
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
