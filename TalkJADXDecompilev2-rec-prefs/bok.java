package p000;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri.Builder;
import android.os.AsyncTask;
import com.google.android.apps.hangouts.content.EsProvider;

public abstract class bok extends AsyncTask<Void, Void, Void> {
    private static final String[] f4098c;
    public final int f4099a;
    public final String f4100b;
    private final Context f4101d;
    private final jcf f4102e;

    public abstract void mo1936a(Cursor cursor);

    protected /* synthetic */ Object doInBackground(Object[] objArr) {
        return m6298a();
    }

    public bok(Context context, jcf jcf, int i, String str) {
        this.f4101d = context;
        this.f4102e = jcf;
        this.f4099a = i;
        this.f4100b = str;
    }

    private Void m6298a() {
        if (this.f4102e.mo3469d(this.f4099a)) {
            ContentResolver contentResolver = this.f4101d.getContentResolver();
            int i = this.f4099a;
            Builder buildUpon = EsProvider.f6018u.buildUpon();
            buildUpon.appendQueryParameter("account_id", i);
            Cursor query = contentResolver.query(buildUpon.build(), f4098c, "gaia_id=?", new String[]{this.f4100b}, null);
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        mo1936a(query);
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
        String[] strArr = new String[(etx.f12266h.length << 1)];
        for (int i = 0; i < etx.f12266h.length; i++) {
            etx etx = etx.f12266h[i];
            int i2 = i << 1;
            strArr[i2] = etx.f12272m;
            strArr[i2 + 1] = etx.f12273n;
        }
        f4098c = strArr;
    }
}
