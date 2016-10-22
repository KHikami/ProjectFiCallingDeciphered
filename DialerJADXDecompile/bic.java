import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* compiled from: PG */
final class bic implements OnClickListener {
    private /* synthetic */ Activity a;
    private /* synthetic */ bia b;

    bic(bia bia, Activity activity) {
        this.b = bia;
        this.a = activity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        new bie(this.b, this.a).execute(new Void[0]);
        dialogInterface.dismiss();
    }
}
