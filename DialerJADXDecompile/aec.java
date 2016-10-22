import android.content.AsyncTaskLoader;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;

/* compiled from: PG */
public final class aec extends AsyncTaskLoader {
    private static final String[] c;
    int a;
    boolean b;
    private final ContentObserver d;
    private MatrixCursor e;

    public final /* synthetic */ Object loadInBackground() {
        return a();
    }

    static {
        c = new String[]{"_id", "directoryType", "displayName", "photoSupport"};
    }

    public aec(Context context) {
        super(context);
        this.d = new aed(this, new Handler());
    }

    protected final void onStartLoading() {
        getContext().getContentResolver().registerContentObserver(aee.a, false, this.d);
        forceLoad();
    }

    protected final void onStopLoading() {
        getContext().getContentResolver().unregisterContentObserver(this.d);
    }

    private Cursor a() {
        Throwable th;
        Cursor cursor = null;
        if (this.a == 0) {
            if (this.e == null) {
                this.e = new MatrixCursor(c);
                this.e.addRow(new Object[]{Long.valueOf(0), getContext().getString(buf.ew), null});
                this.e.addRow(new Object[]{Long.valueOf(1), getContext().getString(buf.fC), null});
            }
            return this.e;
        }
        String str;
        MatrixCursor matrixCursor = new MatrixCursor(c);
        Context context = getContext();
        PackageManager packageManager = context.getPackageManager();
        switch (this.a) {
            case rq.b /*1*/:
                str = null;
                break;
            case rq.c /*2*/:
                str = "shortcutSupport=2";
                break;
            case rl.e /*3*/:
                str = "shortcutSupport IN (2, 1)";
                break;
            default:
                throw new RuntimeException("Unsupported directory search mode: " + this.a);
        }
        try {
            Cursor query = context.getContentResolver().query(aee.a, aee.b, str, null, "_id");
            if (query == null) {
                if (query != null) {
                    query.close();
                }
                return matrixCursor;
            }
            while (query.moveToNext()) {
                long j = query.getLong(0);
                if (this.b || !buf.a(j)) {
                    String string;
                    String str2;
                    int i;
                    Object string2 = query.getString(1);
                    int i2 = query.getInt(2);
                    if (!(TextUtils.isEmpty(string2) || i2 == 0)) {
                        try {
                            string = packageManager.getResourcesForApplication(string2).getString(i2);
                        } catch (Exception e) {
                            str2 = "ContactEntryListAdapter";
                            String str3 = "Cannot obtain directory type from package: ";
                            string = String.valueOf(string2);
                            if (string.length() != 0) {
                                string = str3.concat(string);
                            } else {
                                try {
                                    string = new String(str3);
                                } catch (RuntimeException e2) {
                                    cursor = query;
                                } catch (Throwable th2) {
                                    cursor = query;
                                    th = th2;
                                }
                            }
                            Log.e(str2, string);
                        }
                        str2 = query.getString(3);
                        i = query.getInt(4);
                        matrixCursor.addRow(new Object[]{Long.valueOf(j), string, str2, Integer.valueOf(i)});
                    }
                    string = null;
                    str2 = query.getString(3);
                    i = query.getInt(4);
                    matrixCursor.addRow(new Object[]{Long.valueOf(j), string, str2, Integer.valueOf(i)});
                }
            }
            if (query != null) {
                query.close();
            }
            return matrixCursor;
        } catch (RuntimeException e3) {
            try {
                Log.w("ContactEntryListAdapter", "Runtime Exception when querying directory");
                if (cursor != null) {
                    cursor.close();
                }
                return matrixCursor;
            } catch (Throwable th3) {
                th = th3;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        }
    }

    protected final void onReset() {
        stopLoading();
    }
}
