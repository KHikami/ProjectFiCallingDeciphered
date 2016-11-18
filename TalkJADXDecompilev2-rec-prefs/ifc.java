package p000;

import android.util.Log;

final class ifc implements ieb {
    final /* synthetic */ ifa f17632a;

    ifc(ifa ifa) {
        this.f17632a = ifa;
    }

    public void mo2185a(idr idr) {
        String valueOf = String.valueOf(idr);
        Log.e("ClearcutLogger", new StringBuilder(String.valueOf(valueOf).length() + 34).append("ClearcutLogger connection failed: ").append(valueOf).toString());
    }
}
