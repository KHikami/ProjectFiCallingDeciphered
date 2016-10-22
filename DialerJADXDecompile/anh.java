import android.app.ProgressDialog;
import android.content.ContentResolver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.AsyncTask;

/* compiled from: PG */
final class anh implements OnClickListener {
    final /* synthetic */ ContentResolver a;
    final /* synthetic */ Context b;
    private /* synthetic */ ang c;

    anh(ang ang, ContentResolver contentResolver, Context context) {
        this.c = ang;
        this.a = contentResolver;
        this.b = context;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        ProgressDialog show = ProgressDialog.show(this.c.getActivity(), this.c.getString(cob.bB), "", true, false);
        show.setOwnerActivity(this.c.getActivity());
        AsyncTask ani = new ani(this, show);
        show.show();
        ani.execute(new Void[0]);
    }
}
