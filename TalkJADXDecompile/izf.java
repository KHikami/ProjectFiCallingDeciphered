import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public final class izf<E> {
    private final izg<E> a;

    public izf() {
        this.a = new izg();
    }

    public E a(String str, E e) {
        boolean z;
        int i = 0;
        if (str.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        ba.a(z);
        ba.a((Object) e);
        byte[] bytes = str.getBytes(Charset.defaultCharset());
        izg izg = this.a;
        int length = bytes.length;
        izg izg2 = izg;
        while (i < length) {
            byte b = bytes[i];
            if (izg2.b == null) {
                izg2.b = new lp();
            }
            izg = (izg) izg2.b.a(b);
            if (izg == null) {
                izg = new izg();
                izg2.b.a(b, izg);
            }
            i++;
            izg2 = izg;
        }
        if (izg2.a != null) {
            return izg2.a;
        }
        izg2.a = e;
        return null;
    }

    public E a(ByteBuffer byteBuffer, int i, int i2) {
        izg izg = this.a;
        int i3 = i + i2;
        while (i < i3) {
            byte b = byteBuffer.get(i);
            if (izg.b != null) {
                izg = (izg) izg.b.a(b);
                if (izg != null) {
                    i++;
                }
            }
            return null;
        }
        return izg.a;
    }
}
