package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri.Builder;
import android.os.AsyncTask;
import com.google.android.apps.hangouts.content.EsProvider;

public abstract class bok extends AsyncTask<Void, Void, Void> {
    private static final String[] c;
    public final int a;
    public final String b;
    private final Context d;
    private final jcf e;

    public abstract void a(Cursor cursor);

    protected /* synthetic */ Object doInBackground(Object[] objArr) {
        return a();
    }

    public bok(Context context, jcf jcf, int i, String str) {
        this.d = context;
        this.e = jcf;
        this.a = i;
        this.b = str;
    }

    private Void a() {
        if (this.e.d(this.a)) {
            ContentResolver contentResolver = this.d.getContentResolver();
            int i = this.a;
            Builder buildUpon = EsProvider.u.buildUpon();
            buildUpon.appendQueryParameter("account_id", i);
            Cursor query = contentResolver.query(buildUpon.build(), c, "gaia_id=?", new String[]{this.b}, null);
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        a(query);
                    }
                    query.close();
                } catch (Throwable th) {
                    query.close();
                }
            }
        }
        return null;
    }

    static {
        String[] strArr = new String[(etx.h.length << 1)];
        for (int i = 0; i < etx.h.length; i++) {
            etx etx = etx.h[i];
            int i2 = i << 1;
            strArr[i2] = etx.m;
            strArr[i2 + 1] = etx.n;
        }
        c = strArr;
    }
}
