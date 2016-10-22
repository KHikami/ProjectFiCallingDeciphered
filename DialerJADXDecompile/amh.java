import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import com.android.dialer.app.calllog.CallLogNotificationsService;

/* compiled from: PG */
final class amh extends AsyncTask {
    private /* synthetic */ Context a;
    private /* synthetic */ Uri b;

    amh(Context context, Uri uri) {
        this.a = context;
        this.b = uri;
    }

    public final /* synthetic */ Object doInBackground(Object[] objArr) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("is_read", Boolean.valueOf(true));
        this.a.getContentResolver().update(this.b, contentValues, "is_read = 0", null);
        Intent intent = new Intent(this.a, CallLogNotificationsService.class);
        intent.setAction("com.android.dialer.calllog.ACTION_MARK_NEW_VOICEMAILS_AS_OLD");
        this.a.startService(intent);
        return null;
    }
}
