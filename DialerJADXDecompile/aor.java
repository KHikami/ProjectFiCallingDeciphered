import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* compiled from: PG */
final class aor implements OnClickListener {
    private /* synthetic */ aoq a;

    aor(aoq aoq) {
        this.a = aoq;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.dismiss();
    }
}
