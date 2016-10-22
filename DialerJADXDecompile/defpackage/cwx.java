package defpackage;

import android.content.pm.IPackageStatsObserver;
import com.google.android.libraries.performance.primes.metriccapture.PackageStatsCapture.PackageStatsInvocation;

/* compiled from: PG */
/* renamed from: cwx */
public final class cwx extends PackageStatsInvocation {
    public cwx(String str, Class[] clsArr) {
        super(str, clsArr);
    }

    final Object[] a(String str, int i, IPackageStatsObserver iPackageStatsObserver) {
        return new Object[]{str, Integer.valueOf(i), iPackageStatsObserver};
    }
}
