import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnShowListener;

/* compiled from: PG */
final class avi implements OnShowListener {
    private /* synthetic */ avh a;

    avi(avh avh) {
        this.a = avh;
    }

    public final void onShow(DialogInterface dialogInterface) {
        AlertDialog alertDialog = (AlertDialog) dialogInterface;
        alertDialog.getButton(-1).setOnClickListener(new avj(this.a, alertDialog));
    }
}
