package defpackage;

import android.util.Log;

/* renamed from: ifc */
final class ifc implements ieb {
    final /* synthetic */ ifa a;

    ifc(ifa ifa) {
        this.a = ifa;
    }

    public void a(idr idr) {
        String valueOf = String.valueOf(idr);
        Log.e("ClearcutLogger", new StringBuilder(String.valueOf(valueOf).length() + 34).append("ClearcutLogger connection failed: ").append(valueOf).toString());
    }
}
