import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import java.util.SortedSet;

final class jli implements jkz {
    private static final jlb a;

    jli() {
    }

    static {
        a = new jlj();
    }

    public jla a(int i, int i2) {
        return new jla(i, i2, a);
    }

    public jla a(Bitmap bitmap) {
        return new jla(bitmap.getWidth(), bitmap.getHeight(), (long) bitmap.getAllocationByteCount(), a);
    }

    public jla a(jla jla, SortedSet<jla> sortedSet, jlc jlc) {
        return !sortedSet.isEmpty() ? (jla) sortedSet.first() : null;
    }

    public void a(jla jla, Bitmap bitmap) {
        bitmap.reconfigure(jla.b, jla.a, Config.ARGB_8888);
    }
}
