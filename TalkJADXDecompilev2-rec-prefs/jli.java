package p000;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import java.util.SortedSet;

final class jli implements jkz {
    private static final jlb f20417a = new jlj();

    jli() {
    }

    public jla mo3558a(int i, int i2) {
        return new jla(i, i2, f20417a);
    }

    public jla mo3559a(Bitmap bitmap) {
        return new jla(bitmap.getWidth(), bitmap.getHeight(), (long) bitmap.getAllocationByteCount(), f20417a);
    }

    public jla mo3560a(jla jla, SortedSet<jla> sortedSet, jlc jlc) {
        return !sortedSet.isEmpty() ? (jla) sortedSet.first() : null;
    }

    public void mo3561a(jla jla, Bitmap bitmap) {
        bitmap.reconfigure(jla.f20395b, jla.f20394a, Config.ARGB_8888);
    }
}
