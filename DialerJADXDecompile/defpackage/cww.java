package defpackage;

import android.content.pm.IPackageStatsObserver;
import com.google.android.libraries.performance.primes.metriccapture.PackageStatsCapture.PackageStatsInvocation;

/* compiled from: PG */
/* renamed from: cww */
public final class cww extends PackageStatsInvocation {
    public cww(String str, Class[] clsArr) {
        super(str, clsArr);
    }

    final Object[] a(String str, int i, IPackageStatsObserver iPackageStatsObserver) {
        return new Object[]{str, iPackageStatsObserver};
    }
}
