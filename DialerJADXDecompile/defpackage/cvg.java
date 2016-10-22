package defpackage;

import android.util.Log;

/* compiled from: PG */
/* renamed from: cvg */
final class cvg extends cva {
    private final cxc e;

    cvg(cxc cxc, cuy cuy, int i) {
        super(cuy, i);
        this.e = cxc;
    }

    protected final void b(String str, dln dln) {
        if (dln == null) {
            String str2 = "SingleProcRecorder";
            String str3 = "metric is null, skipping recorded metric for event: ";
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                valueOf = str3.concat(valueOf);
            } else {
                valueOf = new String(str3);
            }
            Log.w(str2, valueOf);
            return;
        }
        if (dln == null) {
            Log.w("MetricStamper", "Unexpected null metric to stamp, Stamping has been skipped.");
            dln = null;
        } else if (cvh.a == null) {
            Log.w("MetricStamper", "MetricStamper.initialize() was never called, stamping has been skipped.");
        } else {
            if (cvh.a.b == null) {
                cvh.a();
            }
            dln.e = new dkr();
            dln.e.a = cvh.a.b;
            dln.e.c = cvh.a.d;
            if (cvh.a.c != null) {
                dln.e.b = cvh.a.c;
            }
        }
        if (str != null) {
            dln.c = str;
        }
        this.e.a(dln);
    }
}
