package defpackage;

import android.database.Cursor;
import android.net.Uri;
import android.os.AsyncTask;
import android.provider.ContactsContract.Data;

/* compiled from: PG */
/* renamed from: aet */
abstract class aet extends AsyncTask {
    public Uri a;
    public String b;
    public String c;
    public byte[] d;
    public long e;
    private /* synthetic */ aes f;

    protected abstract void a();

    protected /* synthetic */ Object doInBackground(Object[] objArr) {
        return b();
    }

    public aet(aes aes, Uri uri) {
        this.f = aes;
        this.a = uri;
    }

    private Void b() {
        this.f.d.getContentResolver().getType(this.a);
        a();
        if (this.e != 0) {
            Cursor query = this.f.d.getContentResolver().query(Data.CONTENT_URI, aes.b, "_id=?", new String[]{String.valueOf(this.e)}, null);
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        this.d = query.getBlob(0);
                    }
                    query.close();
                } catch (Throwable th) {
                    query.close();
                }
            }
        }
        return null;
    }
}
