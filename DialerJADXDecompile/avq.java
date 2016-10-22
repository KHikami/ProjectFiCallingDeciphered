import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.os.Handler;
import android.os.Looper;
import android.provider.CallLog.Calls;
import android.provider.VoicemailContract.Status;
import android.provider.VoicemailContract.Voicemails;
import android.util.Log;
import java.lang.ref.WeakReference;

/* compiled from: PG */
public final class avq extends acc {
    public final int a;
    public final Context b;
    private final WeakReference c;

    public avq(Context context, ContentResolver contentResolver, avs avs) {
        this(context, contentResolver, avs, -1);
    }

    public avq(Context context, ContentResolver contentResolver, avs avs, int i) {
        super(contentResolver);
        this.b = context.getApplicationContext();
        this.c = new WeakReference(avs);
        this.a = i;
    }

    protected final Handler createHandler(Looper looper) {
        return new avr(this, looper);
    }

    public final void a() {
        if (axk.f(this.b)) {
            startQuery(57, null, Status.CONTENT_URI, awh.a, null, null, null);
        }
    }

    public final void b() {
        if (axk.f(this.b)) {
            startQuery(58, null, Voicemails.CONTENT_URI, new String[]{"_id"}, "is_read=0 AND deleted=0", null, null);
        }
    }

    public final void c() {
        if (buf.h(this.b)) {
            startQuery(59, null, Calls.CONTENT_URI, new String[]{"_id"}, d(), null, null);
        }
    }

    protected final synchronized void a(int i, Object obj, Cursor cursor) {
        if (cursor != null) {
            if (i == 54 || i == 60) {
                try {
                    if (a(cursor)) {
                        cursor = null;
                    }
                } catch (Throwable th) {
                    if (cursor != null) {
                        cursor.close();
                    }
                }
            } else if (i == 57) {
                r0 = (avs) this.c.get();
                if (r0 != null) {
                    r0.b(cursor);
                }
            } else if (i == 58) {
                r0 = (avs) this.c.get();
                if (r0 != null) {
                    r0.c(cursor);
                }
            } else if (i == 59) {
                r0 = (avs) this.c.get();
                if (r0 != null) {
                    r0.d(cursor);
                }
            } else {
                Log.w("CallLogQueryHandler", "Unknown query completed: ignoring: " + i);
            }
            if (cursor != null) {
                cursor.close();
            }
        }
    }

    public final boolean a(Cursor cursor) {
        avs avs = (avs) this.c.get();
        if (avs != null) {
            return avs.a(cursor);
        }
        return false;
    }

    public static String d() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("is_read = 0 OR ").append("is_read IS NULL");
        stringBuilder.append(" AND ");
        stringBuilder.append("type = ").append(3);
        return stringBuilder.toString();
    }
}
