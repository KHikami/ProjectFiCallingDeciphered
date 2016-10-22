import android.app.Activity;
import android.content.pm.PackageManager;

final class cr implements Runnable {
    final /* synthetic */ String[] a;
    final /* synthetic */ Activity b;
    final /* synthetic */ int c;

    cr(String[] strArr, Activity activity, int i) {
        this.a = strArr;
        this.b = activity;
        this.c = i;
    }

    public void run() {
        int[] iArr = new int[this.a.length];
        PackageManager packageManager = this.b.getPackageManager();
        String packageName = this.b.getPackageName();
        int length = this.a.length;
        for (int i = 0; i < length; i++) {
            iArr[i] = packageManager.checkPermission(this.a[i], packageName);
        }
        ((cs) this.b).onRequestPermissionsResult(this.c, this.a, iArr);
    }
}
