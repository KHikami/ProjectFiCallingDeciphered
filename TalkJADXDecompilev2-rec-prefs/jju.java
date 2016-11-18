package p000;

import android.os.Environment;
import android.os.StatFs;

final class jju implements jjt {
    jju() {
    }

    public long mo3527a() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
    }

    public long mo3528b() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return ((long) statFs.getFreeBlocks()) * ((long) statFs.getBlockSize());
    }
}
