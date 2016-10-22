import android.app.Activity;
import android.content.pm.PackageManager;

/* compiled from: PG */
final class cj implements Runnable {
    private /* synthetic */ String[] a;
    private /* synthetic */ Activity b;
    private /* synthetic */ int c;

    cj(String[] strArr, Activity activity, int i) {
        this.a = strArr;
        this.b = activity;
        this.c = i;
    }

    public final void run() {
        int[] iArr = new int[this.a.length];
        PackageManager packageManager = this.b.getPackageManager();
        String packageName = this.b.getPackageName();
        int length = this.a.length;
        for (int i = 0; i < length; i++) {
            iArr[i] = packageManager.checkPermission(this.a[i], packageName);
        }
        ((ck) this.b).onRequestPermissionsResult(this.c, this.a, iArr);
    }
}
