package p000;

import android.os.Environment;
import java.io.File;

final class elx implements Runnable {
    final /* synthetic */ elw f11830a;

    elx(elw elw) {
        this.f11830a = elw;
    }

    public void run() {
        String valueOf = String.valueOf(Environment.getExternalStorageDirectory());
        fxe.m16462a(new File(new StringBuilder(String.valueOf(valueOf).length() + 16).append(valueOf).append("/testapns.xml.gz").toString()), 99);
    }
}
