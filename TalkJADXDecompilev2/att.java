package defpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

final class att implements ats<InputStream> {
    att() {
    }

    public /* synthetic */ void a(Object obj) {
        ((InputStream) obj).close();
    }

    public Class<InputStream> a() {
        return InputStream.class;
    }

    public /* synthetic */ Object a(File file) {
        return new FileInputStream(file);
    }
}
