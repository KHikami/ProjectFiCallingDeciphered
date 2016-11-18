package p000;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public final class izf<E> {
    private final izg<E> f19471a = new izg();

    public E m23573a(String str, E e) {
        boolean z;
        int i = 0;
        if (str.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        ba.m4577a(z);
        ba.m4536a((Object) e);
        byte[] bytes = str.getBytes(Charset.defaultCharset());
        izg izg = this.f19471a;
        int length = bytes.length;
        izg izg2 = izg;
        while (i < length) {
            byte b = bytes[i];
            if (izg2.f19473b == null) {
                izg2.f19473b = new lp();
            }
            izg = (izg) izg2.f19473b.m29844a(b);
            if (izg == null) {
                izg = new izg();
                izg2.f19473b.m29845a(b, izg);
            }
            i++;
            izg2 = izg;
        }
        if (izg2.f19472a != null) {
            return izg2.f19472a;
        }
        izg2.f19472a = e;
        return null;
    }

    public E m23574a(ByteBuffer byteBuffer, int i, int i2) {
        izg izg = this.f19471a;
        int i3 = i + i2;
        while (i < i3) {
            byte b = byteBuffer.get(i);
            if (izg.f19473b != null) {
                izg = (izg) izg.f19473b.m29844a(b);
                if (izg != null) {
                    i++;
                }
            }
            return null;
        }
        return izg.f19472a;
    }
}
