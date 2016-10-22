import android.graphics.Bitmap;
import java.util.SortedSet;

final class jle implements jkz {
    private static final jlb a;

    jle() {
    }

    static {
        a = new jlf();
    }

    public jla a(int i, int i2) {
        return new jla(i, i2, a);
    }

    public jla a(Bitmap bitmap) {
        return a(bitmap.getWidth(), bitmap.getHeight());
    }

    public jla a(jla jla, SortedSet<jla> sortedSet, jlc jlc) {
        for (jla jla2 : sortedSet) {
            if (jla2.b >= jla.b && jla2.a >= jla.a) {
                if (jlc == jlc.APPROXIMATE) {
                    return jla2;
                }
                if (jla2.b == jla.b && jla2.a == jla.a) {
                    return jla2;
                }
            }
        }
        return null;
    }

    public void a(jla jla, Bitmap bitmap) {
    }
}
