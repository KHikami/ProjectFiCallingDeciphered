package defpackage;

import android.os.Environment;
import android.os.StatFs;

/* renamed from: jjs */
final class jjs implements jjt {
    jjs() {
    }

    public long a() {
        return new StatFs(Environment.getDataDirectory().getPath()).getTotalBytes();
    }

    public long b() {
        return new StatFs(Environment.getDataDirectory().getPath()).getFreeBytes();
    }
}
