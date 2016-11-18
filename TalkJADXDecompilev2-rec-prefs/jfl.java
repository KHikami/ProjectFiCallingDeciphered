package p000;

import android.os.Bundle;

public class jfl implements kcd, kcn, kcq {
    private int f19961a;

    public jfl(kbu kbu) {
        kbu.m25514a((kcq) this);
    }

    public int m24090a() {
        int i = this.f19961a;
        this.f19961a = i + 1;
        return i;
    }

    public void mo643a(Bundle bundle) {
        if (bundle == null) {
            this.f19961a = 16383;
        } else {
            this.f19961a = bundle.getInt("com.google.android.apps.photos.activityresult.SafeRequstCodeGenerator.NextRequestCode");
        }
    }

    public void mo645b(Bundle bundle) {
        bundle.putInt("com.google.android.apps.photos.activityresult.SafeRequstCodeGenerator.NextRequestCode", this.f19961a);
    }
}
