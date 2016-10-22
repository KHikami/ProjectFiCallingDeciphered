import android.location.Location;
import android.os.AsyncTask;
import android.util.Log;
import java.lang.ref.WeakReference;

/* compiled from: PG */
class biw extends AsyncTask {
    private static final String a;
    private WeakReference b;

    protected /* synthetic */ Object doInBackground(Object[] objArr) {
        return a((Location[]) objArr);
    }

    protected /* synthetic */ void onPostExecute(Object obj) {
        String str = (String) obj;
        biu biu = (biu) this.b.get();
        if (biu != null) {
            try {
                biu.a(str);
            } catch (Throwable e) {
                Log.e(a, "onPostExecute: Exception!!!", e);
            }
        }
    }

    static {
        a = biw.class.getSimpleName();
    }

    public biw(WeakReference weakReference) {
        this.b = weakReference;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String a(android.location.Location... r5) {
        /*
        r4 = this;
        r1 = 0;
        r0 = r4.b;
        r0 = r0.get();
        r0 = (biu) r0;
        if (r0 != 0) goto L_0x000c;
    L_0x000b:
        return r1;
    L_0x000c:
        if (r5 == 0) goto L_0x0011;
    L_0x000e:
        r2 = r5.length;
        if (r2 != 0) goto L_0x0019;
    L_0x0011:
        r0 = a;
        r2 = "onLocationChanged: No location provided";
        android.util.Log.e(r0, r2);
        goto L_0x000b;
    L_0x0019:
        r2 = 0;
        r2 = r5[r2];	 Catch:{ bld -> 0x0053, JSONException -> 0x005f, Exception -> 0x006b }
        r2 = biv.a(r2);	 Catch:{ bld -> 0x0053, JSONException -> 0x005f, Exception -> 0x006b }
        r3 = 53249; // 0xd001 float:7.4618E-41 double:2.63085E-319;
        android.net.TrafficStats.setThreadStatsTag(r3);	 Catch:{ bld -> 0x0053, JSONException -> 0x005f, Exception -> 0x006b }
        r0 = r0.getContext();	 Catch:{ bld -> 0x0053, JSONException -> 0x005f, Exception -> 0x006b }
        r0 = blo.a(r0, r2);	 Catch:{ bld -> 0x0053, JSONException -> 0x005f, Exception -> 0x006b }
        r2 = new org.json.JSONObject;	 Catch:{ bld -> 0x0053, JSONException -> 0x005f, Exception -> 0x006b }
        r2.<init>(r0);	 Catch:{ bld -> 0x0053, JSONException -> 0x005f, Exception -> 0x006b }
        r0 = "results";
        r0 = r2.optJSONArray(r0);	 Catch:{ bld -> 0x0053, JSONException -> 0x005f, Exception -> 0x006b }
        if (r0 == 0) goto L_0x007c;
    L_0x003b:
        r2 = r0.length();	 Catch:{ bld -> 0x0053, JSONException -> 0x005f, Exception -> 0x006b }
        if (r2 <= 0) goto L_0x007c;
    L_0x0041:
        r2 = 0;
        r0 = r0.optJSONObject(r2);	 Catch:{ bld -> 0x0053, JSONException -> 0x005f, Exception -> 0x006b }
        if (r0 == 0) goto L_0x007c;
    L_0x0048:
        r2 = "formatted_address";
        r0 = r0.getString(r2);	 Catch:{ bld -> 0x0053, JSONException -> 0x005f, Exception -> 0x006b }
    L_0x004e:
        android.net.TrafficStats.clearThreadStatsTag();
        r1 = r0;
        goto L_0x000b;
    L_0x0053:
        r0 = move-exception;
        r2 = a;	 Catch:{ all -> 0x0077 }
        r3 = "onLocationChanged: AuthException";
        android.util.Log.w(r2, r3, r0);	 Catch:{ all -> 0x0077 }
        android.net.TrafficStats.clearThreadStatsTag();
        goto L_0x000b;
    L_0x005f:
        r0 = move-exception;
        r2 = a;	 Catch:{ all -> 0x0077 }
        r3 = "onLocationChanged: JSONException";
        android.util.Log.w(r2, r3, r0);	 Catch:{ all -> 0x0077 }
        android.net.TrafficStats.clearThreadStatsTag();
        goto L_0x000b;
    L_0x006b:
        r0 = move-exception;
        r2 = a;	 Catch:{ all -> 0x0077 }
        r3 = "doInBackground: Exception!!!";
        android.util.Log.e(r2, r3, r0);	 Catch:{ all -> 0x0077 }
        android.net.TrafficStats.clearThreadStatsTag();
        goto L_0x000b;
    L_0x0077:
        r0 = move-exception;
        android.net.TrafficStats.clearThreadStatsTag();
        throw r0;
    L_0x007c:
        r0 = r1;
        goto L_0x004e;
        */
        throw new UnsupportedOperationException("Method not decompiled: biw.a(android.location.Location[]):java.lang.String");
    }
}
