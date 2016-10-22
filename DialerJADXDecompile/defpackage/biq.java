package defpackage;

import android.graphics.drawable.Drawable;
import android.location.Location;
import android.net.TrafficStats;
import android.os.AsyncTask;
import android.util.Log;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.net.URL;

/* compiled from: PG */
/* renamed from: biq */
class biq extends AsyncTask {
    private static final String a;
    private WeakReference b;

    protected /* synthetic */ Object doInBackground(Object[] objArr) {
        return a((Location[]) objArr);
    }

    protected /* synthetic */ void onPostExecute(Object obj) {
        Drawable drawable = (Drawable) obj;
        biu biu = (biu) this.b.get();
        if (biu != null) {
            try {
                biu.a(drawable);
            } catch (Throwable e) {
                Log.e(a, "onPostExecute: Exception!!!", e);
            }
        }
    }

    static {
        a = biq.class.getSimpleName();
    }

    public biq(WeakReference weakReference) {
        this.b = weakReference;
    }

    private Drawable a(Location... locationArr) {
        biu biu = (biu) this.b.get();
        if (biu == null) {
            return null;
        }
        if (locationArr == null || locationArr.length == 0) {
            Log.e(a, "onLocationChanged: No location provided");
            return null;
        }
        Drawable createFromStream;
        try {
            InputStream inputStream = (InputStream) new URL(biv.a(biu.getContext(), locationArr[0])).getContent();
            TrafficStats.setThreadStatsTag(53248);
            createFromStream = Drawable.createFromStream(inputStream, "src");
            return createFromStream;
        } catch (Exception e) {
            createFromStream = e;
            Log.e(a, "doInBackground: Exception!!!", createFromStream);
            return null;
        } finally {
            TrafficStats.clearThreadStatsTag();
        }
    }
}
