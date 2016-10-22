package defpackage;

import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: atf */
public final class atf implements ant<ByteBuffer> {
    public /* bridge */ /* synthetic */ boolean a(Object obj, File file, anz anz) {
        return atf.a((ByteBuffer) obj, file);
    }

    private static boolean a(ByteBuffer byteBuffer, File file) {
        try {
            bah.a(byteBuffer, file);
            return true;
        } catch (IOException e) {
            return false;
        }
    }
}
