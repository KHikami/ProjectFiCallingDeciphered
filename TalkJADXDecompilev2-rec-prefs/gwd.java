package p000;

import android.app.Activity;
import android.content.Intent;

final class gwd extends gwc {
    final /* synthetic */ Activity f16278a;
    final /* synthetic */ Intent f16279b;
    final /* synthetic */ int f16280c;

    gwd(Activity activity, Intent intent, int i) {
        this.f16278a = activity;
        this.f16279b = intent;
        this.f16280c = i;
    }

    public void mo2355a() {
        this.f16278a.startActivityForResult(this.f16279b, this.f16280c);
    }
}
