package p000;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;

final class cxi implements dpo {
    private final Context f9263a;

    cxi(Context context) {
        this.f9263a = context;
    }

    public void mo1455a(Activity activity, Bundle bundle) {
        Object a = ((cxg) jyn.m25426a(this.f9263a, cxg.class)).mo1453a();
        if (!TextUtils.isEmpty(a)) {
            bundle.putString("features", a);
        }
    }
}
