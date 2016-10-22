package defpackage;

import android.app.Fragment;
import android.content.Context;
import android.content.pm.PackageManager;
import java.util.Arrays;

/* compiled from: PG */
/* renamed from: bw */
final class bw implements Runnable {
    private /* synthetic */ String[] a;
    private /* synthetic */ Fragment b;
    private /* synthetic */ int c;

    bw(bx bxVar, String[] strArr, Fragment fragment, int i) {
        this.a = strArr;
        this.b = fragment;
        this.c = i;
    }

    public final void run() {
        int[] iArr = new int[this.a.length];
        Context activity = this.b.getActivity();
        if (activity != null) {
            PackageManager packageManager = activity.getPackageManager();
            String packageName = activity.getPackageName();
            int length = this.a.length;
            for (int i = 0; i < length; i++) {
                iArr[i] = packageManager.checkPermission(this.a[i], packageName);
            }
        } else {
            Arrays.fill(iArr, -1);
        }
        ((cc) this.b).onRequestPermissionsResult(this.c, this.a, iArr);
    }
}
