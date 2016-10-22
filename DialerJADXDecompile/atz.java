import android.app.DialogFragment;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* compiled from: PG */
public final class atz implements OnClickListener {
    private /* synthetic */ DialogFragment a;

    public atz(DialogFragment dialogFragment) {
        this.a = dialogFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.dismiss();
    }
}
