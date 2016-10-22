package defpackage;

import android.os.AsyncTask;
import android.os.SystemClock;
import android.util.Log;

/* renamed from: iiq */
public abstract class iiq<Params, Progress, Result> extends AsyncTask<Params, Progress, Result> {
    public static long j;
    private final long a;
    private boolean b;

    public abstract Result a(Params... paramsArr);

    static {
        j = 40000;
    }

    public iiq() {
        this(10000);
    }

    public iiq(long j) {
        iil.a();
        this.a = j;
    }

    public final iiq<Params, Progress, Result> b(Params... paramsArr) {
        iil.a();
        this.b = true;
        executeOnExecutor(THREAD_POOL_EXECUTOR, paramsArr);
        return this;
    }

    protected final Result doInBackground(Params... paramsArr) {
        String str;
        String str2;
        Object[] objArr;
        iil.a("Expected condition to be true", this.b);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long elapsedRealtime2;
        try {
            Result a = a((Object[]) paramsArr);
            elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
            if (elapsedRealtime2 > this.a) {
                str = "Babel";
                str2 = "%s TOOK TOO LONG! (%dms > %dms)";
                objArr = new Object[3];
                objArr[0] = getClass().isAnonymousClass() ? toString() : getClass().getSimpleName();
                objArr[1] = Long.valueOf(elapsedRealtime2);
                objArr[2] = Long.valueOf(this.a);
                Log.println(5, str, String.format(str2, objArr));
            }
            return a;
        } catch (Throwable th) {
            elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
            if (elapsedRealtime2 > this.a) {
                str = "Babel";
                str2 = "%s TOOK TOO LONG! (%dms > %dms)";
                objArr = new Object[3];
                objArr[0] = getClass().isAnonymousClass() ? toString() : getClass().getSimpleName();
                objArr[1] = Long.valueOf(elapsedRealtime2);
                objArr[2] = Long.valueOf(this.a);
                Log.println(5, str, String.format(str2, objArr));
            }
        }
    }

    public void onPostExecute(Result result) {
        iil.a("Use SafeAsyncTask.executeOnThreadPool");
    }

    public static void a(Runnable runnable) {
        THREAD_POOL_EXECUTOR.execute(runnable);
    }
}
