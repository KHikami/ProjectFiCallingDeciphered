import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;

final class dnt implements OnDismissListener {
    final /* synthetic */ dnr a;

    dnt(dnr dnr) {
        this.a = dnr;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        this.a.e = null;
        this.a.a(this.a.c.a());
    }
}
