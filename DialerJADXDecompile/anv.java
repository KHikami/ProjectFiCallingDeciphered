import android.content.ContentValues;
import android.provider.CallLog.Calls;
import android.util.Log;

/* compiled from: PG */
public final class anv implements Runnable {
    private /* synthetic */ anu a;

    public anv(anu anu) {
        this.a = anu;
    }

    public final void run() {
        if (buf.a(this.a.a)) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("new", Integer.valueOf(0));
            contentValues.put("is_read", Integer.valueOf(1));
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("new");
            stringBuilder.append(" = 1 AND ");
            stringBuilder.append("type");
            stringBuilder.append(" = ?");
            try {
                this.a.a.getContentResolver().update(Calls.CONTENT_URI, contentValues, stringBuilder.toString(), new String[]{Integer.toString(3)});
            } catch (Throwable e) {
                Log.w("MissedCallNotifier", "ContactsProvider update command failed", e);
            }
        }
        this.a.c().cancel("MissedCallNotifier", 1);
    }
}
