package p000;

import android.content.pm.IPackageStatsObserver;
import com.google.android.libraries.performance.primes.metriccapture.PackageStatsCapture.PackageStatsInvocation;

public final class izo extends PackageStatsInvocation {
    public izo(String str, Class[] clsArr) {
        super(str, clsArr);
    }

    Object[] mo3426a(String str, int i, IPackageStatsObserver iPackageStatsObserver) {
        return new Object[]{str, iPackageStatsObserver};
    }
}
