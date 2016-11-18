package p000;

import java.io.File;
import java.io.FilenameFilter;

final class emy implements FilenameFilter {
    final /* synthetic */ emx f11869a;

    emy(emx emx) {
        this.f11869a = emx;
    }

    public boolean accept(File file, String str) {
        return str != null && (str.startsWith("mmsdump-") || str.startsWith("smsdump-"));
    }
}
