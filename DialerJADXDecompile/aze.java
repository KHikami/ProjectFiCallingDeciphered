import android.view.View;
import android.view.View.OnLongClickListener;

/* compiled from: PG */
final class aze implements OnLongClickListener {
    private /* synthetic */ ayv a;

    aze(ayv ayv) {
        this.a = ayv;
    }

    public final boolean onLongClick(View view) {
        Object obj = (azo) this.a.e;
        Object c = buf.K(obj.g).c(obj.g);
        if (c != null) {
            bdf.a(obj, "Sending call state button broadcast: ", c);
            obj.g.sendBroadcast(c, "android.permission.READ_PHONE_STATE");
        }
        return false;
    }
}
