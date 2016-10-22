package defpackage;

import android.app.FragmentManager;
import android.content.ContentResolver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.AsyncTask;

/* compiled from: PG */
/* renamed from: aco */
final class aco implements OnClickListener {
    final /* synthetic */ ContentResolver a;
    private /* synthetic */ Context b;
    private /* synthetic */ acn c;

    aco(acn acn, Context context, ContentResolver contentResolver) {
        this.c = acn;
        this.b = context;
        this.a = contentResolver;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (buf.i(this.b)) {
            FragmentManager fragmentManager = this.c.getFragmentManager();
            CharSequence string = this.c.getString(buf.ep);
            acq acq = new acq();
            acq.b = string;
            acq.c = null;
            acq.d = 500;
            acq.show(fragmentManager, acq.a);
            acq.e = System.currentTimeMillis();
            acq.setCancelable(false);
            new acp(this, acq).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }
}
