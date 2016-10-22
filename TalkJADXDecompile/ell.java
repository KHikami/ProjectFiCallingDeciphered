import android.content.pm.PackageInfo;

final class ell extends emv {
    final /* synthetic */ PackageInfo a;
    final /* synthetic */ elk b;

    ell(elk elk, String str, PackageInfo packageInfo) {
        this.b = elk;
        this.a = packageInfo;
        super(str);
    }

    public void a() {
        jxy.a(this.a.packageName, Integer.toString(this.a.versionCode), null, null).a(this.b.e, "DebugVersionDialog");
    }
}
