package p000;

import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

public final class atf implements ant<ByteBuffer> {
    public /* bridge */ /* synthetic */ boolean mo383a(Object obj, File file, anz anz) {
        return atf.m3973a((ByteBuffer) obj, file);
    }

    private static boolean m3973a(ByteBuffer byteBuffer, File file) {
        try {
            bah.m4666a(byteBuffer, file);
            return true;
        } catch (IOException e) {
            return false;
        }
    }
}
