package defpackage;

import android.content.AsyncQueryHandler;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.android.dialer.app.calllog.CallLogNotificationsService;

/* compiled from: PG */
/* renamed from: aoa */
public final class aoa extends AsyncQueryHandler {
    private Context a;

    public aoa(Context context, ContentResolver contentResolver) {
        super(contentResolver);
        this.a = context;
    }

    protected final void onUpdateComplete(int i, Object obj, int i2) {
        if (i != 50) {
            return;
        }
        if (this.a != null) {
            Intent intent = new Intent(this.a, CallLogNotificationsService.class);
            intent.setAction("com.android.dialer.calllog.UPDATE_VOICEMAIL_NOTIFICATIONS");
            this.a.startService(intent);
            return;
        }
        Log.w("VoicemailQueryHandler", "Unknown update completed: ignoring: " + i);
    }
}
