package p000;

import android.os.Environment;
import android.os.StatFs;

final class jjs implements jjt {
    jjs() {
    }

    public long mo3527a() {
        return new StatFs(Environment.getDataDirectory().getPath()).getTotalBytes();
    }

    public long mo3528b() {
        return new StatFs(Environment.getDataDirectory().getPath()).getFreeBytes();
    }
}
