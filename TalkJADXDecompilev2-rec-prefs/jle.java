package p000;

import android.graphics.Bitmap;
import java.util.SortedSet;

final class jle implements jkz {
    private static final jlb f20410a = new jlf();

    jle() {
    }

    public jla mo3558a(int i, int i2) {
        return new jla(i, i2, f20410a);
    }

    public jla mo3559a(Bitmap bitmap) {
        return mo3558a(bitmap.getWidth(), bitmap.getHeight());
    }

    public jla mo3560a(jla jla, SortedSet<jla> sortedSet, jlc jlc) {
        for (jla jla2 : sortedSet) {
            if (jla2.f20395b >= jla.f20395b && jla2.f20394a >= jla.f20394a) {
                if (jlc == jlc.APPROXIMATE) {
                    return jla2;
                }
                if (jla2.f20395b == jla.f20395b && jla2.f20394a == jla.f20394a) {
                    return jla2;
                }
            }
        }
        return null;
    }

    public void mo3561a(jla jla, Bitmap bitmap) {
    }
}
