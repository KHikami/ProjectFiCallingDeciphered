package p000;

import java.io.File;

public class aru {
    final int f2241a;
    final asa f2242b;

    public art m3884a() {
        File a = this.f2242b.m3903a();
        if (a == null) {
            return null;
        }
        if (a.mkdirs() || (a.exists() && a.isDirectory())) {
            return asb.m3905a(a, this.f2241a);
        }
        return null;
    }

    public aru(asa asa, int i) {
        this.f2241a = i;
        this.f2242b = asa;
    }
}
