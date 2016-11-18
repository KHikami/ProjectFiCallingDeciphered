package p000;

import android.app.Activity;
import android.content.pm.PackageManager;

final class cr implements Runnable {
    final /* synthetic */ String[] f8927a;
    final /* synthetic */ Activity f8928b;
    final /* synthetic */ int f8929c;

    cr(String[] strArr, Activity activity, int i) {
        this.f8927a = strArr;
        this.f8928b = activity;
        this.f8929c = i;
    }

    public void run() {
        int[] iArr = new int[this.f8927a.length];
        PackageManager packageManager = this.f8928b.getPackageManager();
        String packageName = this.f8928b.getPackageName();
        int length = this.f8927a.length;
        for (int i = 0; i < length; i++) {
            iArr[i] = packageManager.checkPermission(this.f8927a[i], packageName);
        }
        ((cs) this.f8928b).onRequestPermissionsResult(this.f8929c, this.f8927a, iArr);
    }
}
