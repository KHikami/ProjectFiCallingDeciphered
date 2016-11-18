package p000;

import android.content.Context;
import android.widget.Toast;

final class blg implements Runnable {
    final /* synthetic */ String f3698a;

    blg(String str) {
        this.f3698a = str;
    }

    public void run() {
        Context H = gwb.m1400H();
        Toast.makeText(H, H.getString(bc.gI, new Object[]{this.f3698a}), 0).show();
    }
}
