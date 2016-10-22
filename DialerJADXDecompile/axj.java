import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Handler;
import android.provider.Settings.System;
import android.text.TextUtils;

/* compiled from: PG */
public final class axj {
    private static final String a;

    static {
        a = System.DEFAULT_NOTIFICATION_URI.toString();
    }

    public static void a(Context context, Handler handler, int i, String str, int i2) {
        Object string;
        Uri actualDefaultRingtoneUri = RingtoneManager.getActualDefaultRingtoneUri(context, 1);
        CharSequence string2 = context.getString(buf.jv);
        if (actualDefaultRingtoneUri == null) {
            string = context.getString(buf.ju);
        } else {
            Ringtone ringtone = RingtoneManager.getRingtone(context, actualDefaultRingtoneUri);
            if (ringtone != null) {
                try {
                    CharSequence title = ringtone.getTitle(context);
                    if (TextUtils.isEmpty(title)) {
                        title = string2;
                    }
                    string2 = title;
                } catch (SQLiteException e) {
                }
            }
        }
        handler.sendMessage(handler.obtainMessage(1, string));
    }
}
