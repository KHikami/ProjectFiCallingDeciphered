package defpackage;

import android.os.Environment;
import java.io.File;

final class elx implements Runnable {
    final /* synthetic */ elw a;

    elx(elw elw) {
        this.a = elw;
    }

    public void run() {
        String valueOf = String.valueOf(Environment.getExternalStorageDirectory());
        fxe.a(new File(new StringBuilder(String.valueOf(valueOf).length() + 16).append(valueOf).append("/testapns.xml.gz").toString()), 99);
    }
}
