package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.AsyncTask;

/* compiled from: PG */
/* renamed from: amk */
public final class amk extends AsyncTask {
    private /* synthetic */ Context a;
    private /* synthetic */ Uri b;
    private /* synthetic */ long c;

    public amk(Context context, Uri uri, long j) {
        this.a = context;
        this.b = uri;
        this.c = j;
    }

    public final /* synthetic */ Object doInBackground(Object[] objArr) {
        Cursor query = this.a.getContentResolver().query(this.b, new String[]{"duration"}, null, null, null);
        if (query != null && query.moveToFirst() && query.getInt(query.getColumnIndex("duration")) <= 0) {
            ContentValues contentValues = new ContentValues(1);
            contentValues.put("duration", Long.valueOf(this.c));
            this.a.getContentResolver().update(this.b, contentValues, null, null);
        }
        return null;
    }
}
