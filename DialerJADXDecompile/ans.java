import android.content.ContentUris;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.android.dialer.app.CallDetailActivity;

/* compiled from: PG */
final class ans extends ann {
    private /* synthetic */ String a;
    private /* synthetic */ long[] b;
    private /* synthetic */ long c;

    ans(String str, long[] jArr, long j) {
        this.a = str;
        this.b = jArr;
        this.c = j;
    }

    public final Intent a(Context context) {
        Intent intent = new Intent(context, CallDetailActivity.class);
        if (this.a != null) {
            intent.putExtra("EXTRA_VOICEMAIL_URI", Uri.parse(this.a));
        }
        if (this.b == null || this.b.length <= 0) {
            intent.setData(ContentUris.withAppendedId(axk.e(context), this.c));
        } else {
            intent.putExtra("EXTRA_CALL_LOG_IDS", this.b);
        }
        return intent;
    }
}
