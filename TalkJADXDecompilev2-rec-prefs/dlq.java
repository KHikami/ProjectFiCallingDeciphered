package p000;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

final class dlq implements dpo {
    final /* synthetic */ dlo f10085a;

    dlq(dlo dlo) {
        this.f10085a = dlo;
    }

    public void mo1455a(Activity activity, Bundle bundle) {
        Object obj;
        int a = ((jca) jyn.m25426a((Context) activity, jca.class)).mo2317a();
        dlo dlo = this.f10085a;
        bko e = fde.m15018e(a);
        if (e == null) {
            glk.m17981d("Babel_Call_logs", "Account null.", new Object[0]);
        }
        if (e == null || !gwb.m2155d(e)) {
            obj = null;
        } else {
            obj = 1;
        }
        if (obj != null) {
            boolean z;
            ful ful = (ful) jyn.m25426a((Context) activity, ful.class);
            long e2 = ful.m16269e(a);
            bundle.putString("last_call_timestamp_millis", String.valueOf(e2));
            if (e2 != -1) {
                Calendar instance = Calendar.getInstance();
                instance.setTimeInMillis(e2);
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss Z");
                bundle.putString("last_call_timestamp", simpleDateFormat.format(instance.getTime()));
                simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
                bundle.putString("last_call_timestamp_utc", simpleDateFormat.format(instance.getTime()));
            }
            bundle.putString("last_call_local_session", ful.m16267c(a));
            String str = "last_call_has_log";
            dlo = this.f10085a;
            ful = (ful) jyn.m25426a((Context) activity, ful.class);
            e2 = System.currentTimeMillis();
            long e3 = ful.m16269e(a);
            Object obj2 = (e3 == -1 || e3 >= e2 || e2 >= e3 + gwb.m1519a((Context) activity, "babel_include_last_call_in_feedback_timeout_ms", fls.f13443t)) ? null : 1;
            if (obj2 == null || TextUtils.isEmpty(ful.m16267c(a)) || TextUtils.isEmpty(ful.m16268d(a))) {
                z = false;
            } else {
                z = true;
            }
            bundle.putString(str, String.valueOf(z));
        }
    }
}
