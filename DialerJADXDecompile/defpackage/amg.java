package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.AsyncTask;

/* compiled from: PG */
/* renamed from: amg */
public final class amg extends AsyncTask {
    private /* synthetic */ Context a;
    private /* synthetic */ String b;
    private /* synthetic */ amm c;

    public amg(Context context, String str, amm amm) {
        this.a = context;
        this.b = str;
        this.c = amm;
    }

    public final /* synthetic */ Object doInBackground(Object[] objArr) {
        ContentResolver contentResolver = this.a.getContentResolver();
        Uri e = axk.e(this.a);
        String valueOf = String.valueOf("_id IN (");
        String str = this.b;
        contentResolver.delete(e, new StringBuilder((String.valueOf(valueOf).length() + 1) + String.valueOf(str).length()).append(valueOf).append(str).append(")").toString(), null);
        return null;
    }

    public final /* synthetic */ void onPostExecute(Object obj) {
        if (this.c != null) {
            this.c.a();
        }
    }
}
