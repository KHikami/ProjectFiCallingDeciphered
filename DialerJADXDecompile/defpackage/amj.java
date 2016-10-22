package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.os.AsyncTask;
import android.provider.CallLog.Calls;
import android.text.TextUtils;

/* compiled from: PG */
/* renamed from: amj */
final class amj extends AsyncTask {
    private /* synthetic */ long[] a;
    private /* synthetic */ Context b;

    amj(long[] jArr, Context context) {
        this.a = jArr;
        this.b = context;
    }

    public final /* synthetic */ Object doInBackground(Object[] objArr) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("type").append(" = ").append(3);
        stringBuilder.append(" AND ");
        Long[] lArr = new Long[this.a.length];
        for (int i = 0; i < this.a.length; i++) {
            lArr[i] = Long.valueOf(this.a[i]);
        }
        StringBuilder append = stringBuilder.append("_id");
        String valueOf = String.valueOf(TextUtils.join(",", lArr));
        append.append(new StringBuilder(String.valueOf(valueOf).length() + 6).append(" IN (").append(valueOf).append(")").toString());
        ContentValues contentValues = new ContentValues(1);
        contentValues.put("is_read", "1");
        this.b.getContentResolver().update(Calls.CONTENT_URI, contentValues, stringBuilder.toString(), null);
        return null;
    }
}
