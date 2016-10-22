import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.AsyncTask;
import java.util.Objects;

/* compiled from: PG */
public final class ber extends AsyncTask {
    private final Context a;
    private final bet b;
    private final String c;
    private final long d;

    public final /* synthetic */ Object doInBackground(Object[] objArr) {
        Cursor query = this.a.getContentResolver().query(axk.e(this.a), bes.a, "number= ?", new String[]{this.c}, "date DESC LIMIT 1");
        if (query != null && query.moveToFirst()) {
            long j = query.getLong(1);
            if (this.d > j && this.d - j < 3000) {
                long j2 = query.getLong(0);
                ContentResolver contentResolver = this.a.getContentResolver();
                Uri e = axk.e(this.a);
                String valueOf = String.valueOf("_id IN (");
                contentResolver.delete(e, new StringBuilder(String.valueOf(valueOf).length() + 21).append(valueOf).append(j2).append(")").toString(), null);
                return Long.valueOf(j2);
            }
        }
        return Long.valueOf(-1);
    }

    public final /* synthetic */ void onPostExecute(Object obj) {
        boolean z;
        Long l = (Long) obj;
        bet bet = this.b;
        if (l.longValue() >= 0) {
            z = true;
        } else {
            z = false;
        }
        bet.a(z);
    }

    public ber(Context context, bet bet, String str, long j) {
        this.a = (Context) Objects.requireNonNull(context);
        this.b = (bet) Objects.requireNonNull(bet);
        this.c = str;
        this.d = j;
    }
}
