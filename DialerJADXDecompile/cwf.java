import android.util.Log;

/* compiled from: PG */
class cwf {
    public void a(Throwable th) {
        if (Log.isLoggable("PrimesExecutor", 5)) {
            Log.w("PrimesExecutor", "Background task failed", th);
        }
    }

    cwf() {
    }
}
