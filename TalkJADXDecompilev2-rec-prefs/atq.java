package p000;

import android.os.ParcelFileDescriptor;
import java.io.File;

final class atq implements ats<ParcelFileDescriptor> {
    atq() {
    }

    public /* synthetic */ void mo389a(Object obj) {
        ((ParcelFileDescriptor) obj).close();
    }

    public Class<ParcelFileDescriptor> mo387a() {
        return ParcelFileDescriptor.class;
    }

    public /* synthetic */ Object mo388a(File file) {
        return ParcelFileDescriptor.open(file, 268435456);
    }
}
