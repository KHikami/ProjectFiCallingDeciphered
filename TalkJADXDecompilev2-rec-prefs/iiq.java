package p000;

import android.os.AsyncTask;
import android.os.SystemClock;
import android.util.Log;

public abstract class iiq<Params, Progress, Result> extends AsyncTask<Params, Progress, Result> {
    public static long f3070j = 40000;
    private final long f3071a;
    private boolean f3072b;

    public abstract Result mo470a(Params... paramsArr);

    public iiq() {
        this(10000);
    }

    public iiq(long j) {
        iil.m21867a();
        this.f3071a = j;
    }

    public final iiq<Params, Progress, Result> m4950b(Params... paramsArr) {
        iil.m21867a();
        this.f3072b = true;
        executeOnExecutor(THREAD_POOL_EXECUTOR, paramsArr);
        return this;
    }

    protected final Result doInBackground(Params... paramsArr) {
        iil.m21874a("Expected condition to be true", this.f3072b);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long elapsedRealtime2;
        String str;
        String str2;
        Object[] objArr;
        try {
            Result a = mo470a((Object[]) paramsArr);
            elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
            if (elapsedRealtime2 > this.f3071a) {
                str = "Babel";
                str2 = "%s TOOK TOO LONG! (%dms > %dms)";
                objArr = new Object[3];
                objArr[0] = getClass().isAnonymousClass() ? toString() : getClass().getSimpleName();
                objArr[1] = Long.valueOf(elapsedRealtime2);
                objArr[2] = Long.valueOf(this.f3071a);
                Log.println(5, str, String.format(str2, objArr));
            }
            return a;
        } catch (Throwable th) {
            elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
            if (elapsedRealtime2 > this.f3071a) {
                str = "Babel";
                str2 = "%s TOOK TOO LONG! (%dms > %dms)";
                objArr = new Object[3];
                objArr[0] = getClass().isAnonymousClass() ? toString() : getClass().getSimpleName();
                objArr[1] = Long.valueOf(elapsedRealtime2);
                objArr[2] = Long.valueOf(this.f3071a);
                Log.println(5, str, String.format(str2, objArr));
            }
        }
    }

    public void onPostExecute(Result result) {
        iil.m21870a("Use SafeAsyncTask.executeOnThreadPool");
    }

    public static void m4948a(Runnable runnable) {
        THREAD_POOL_EXECUTOR.execute(runnable);
    }
}
