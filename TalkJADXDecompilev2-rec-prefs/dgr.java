package p000;

import android.util.Base64;

final class dgr implements Runnable {
    final /* synthetic */ String f9711a;
    final /* synthetic */ dgg f9712b;

    dgr(dgg dgg, String str) {
        this.f9712b = dgg;
        this.f9711a = str;
    }

    public void run() {
        inx.m22408a().m22415a(Base64.decode(this.f9711a, 0));
    }
}
