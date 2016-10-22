import android.content.AsyncTaskLoader;
import android.content.Context;
import android.content.Loader.ForceLoadContentObserver;
import android.database.Cursor;
import android.database.MatrixCursor;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
public class aoz extends AsyncTaskLoader {
    private final Context a;
    private Cursor b;
    private String c;
    private axc d;
    private ForceLoadContentObserver e;

    public /* synthetic */ void deliverResult(Object obj) {
        a((Cursor) obj);
    }

    public /* synthetic */ void onCanceled(Object obj) {
        Cursor cursor = (Cursor) obj;
        super.onCanceled(cursor);
        if (this.e != null) {
            this.a.getContentResolver().unregisterContentObserver(this.e);
            this.e = null;
        }
        b(cursor);
    }

    public aoz(Context context) {
        super(context);
        aoz.class.getSimpleName();
        this.a = context;
    }

    private void a(Cursor cursor) {
        if (isReset()) {
            b(cursor);
            return;
        }
        Cursor cursor2 = this.b;
        this.b = cursor;
        if (this.e == null) {
            this.e = new ForceLoadContentObserver(this);
            this.a.getContentResolver().registerContentObserver(avw.a, true, this.e);
        }
        if (isStarted()) {
            super.deliverResult(cursor);
        }
        if (cursor2 != null && cursor2 != cursor) {
            b(cursor2);
        }
    }

    protected void onStartLoading() {
        if (this.b != null) {
            a(this.b);
        }
        if (this.b == null) {
            forceLoad();
        }
    }

    protected void onStopLoading() {
        cancelLoad();
    }

    protected void onReset() {
        onStopLoading();
        if (this.e != null) {
            this.a.getContentResolver().unregisterContentObserver(this.e);
            this.e = null;
        }
        if (this.b != null) {
            b(this.b);
            this.b = null;
        }
    }

    private static void b(Cursor cursor) {
        if (cursor != null) {
            cursor.close();
        }
    }

    public final void a(String str) {
        this.c = axc.a(str, axd.a);
        this.d = new axc(this.c, axd.a);
    }

    public /* synthetic */ Object loadInBackground() {
        if (!buf.i(this.a)) {
            return new MatrixCursor(ael.a);
        }
        ArrayList a = buf.G(this.a).a(this.a).a(this.c, this.d);
        MatrixCursor matrixCursor = new MatrixCursor(ael.a);
        Object[] objArr = new Object[ael.a.length];
        Iterator it = a.iterator();
        while (it.hasNext()) {
            avy avy = (avy) it.next();
            objArr[0] = Long.valueOf(avy.b);
            objArr[3] = avy.d;
            objArr[4] = Long.valueOf(avy.a);
            objArr[5] = avy.e;
            objArr[6] = Long.valueOf(avy.f);
            objArr[7] = avy.c;
            objArr[9] = Integer.valueOf(avy.g);
            matrixCursor.addRow(objArr);
        }
        return matrixCursor;
    }
}
