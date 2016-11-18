package p000;

import android.content.pm.PackageInfo;

final class ell extends emv {
    final /* synthetic */ PackageInfo f11815a;
    final /* synthetic */ elk f11816b;

    ell(elk elk, String str, PackageInfo packageInfo) {
        this.f11816b = elk;
        this.f11815a = packageInfo;
        super(str);
    }

    public void mo811a() {
        jxy.m7673a(this.f11815a.packageName, Integer.toString(this.f11815a.versionCode), null, null).mo2341a(this.f11816b.f11814e, "DebugVersionDialog");
    }
}
