package defpackage;

import android.os.ParcelFileDescriptor;
import java.io.File;

final class atq implements ats<ParcelFileDescriptor> {
    atq() {
    }

    public /* synthetic */ void a(Object obj) {
        ((ParcelFileDescriptor) obj).close();
    }

    public Class<ParcelFileDescriptor> a() {
        return ParcelFileDescriptor.class;
    }

    public /* synthetic */ Object a(File file) {
        return ParcelFileDescriptor.open(file, 268435456);
    }
}
