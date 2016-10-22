package defpackage;

import android.support.rastermill.FrameSequence;
import java.nio.ByteBuffer;

/* renamed from: jkg */
public final class jkg {
    public final FrameSequence a;

    public jkg(FrameSequence frameSequence) {
        this.a = frameSequence;
    }

    public static boolean a(ByteBuffer byteBuffer) {
        boolean z = true;
        if (byteBuffer.remaining() < 21) {
            return false;
        }
        try {
            boolean z2 = byteBuffer.get(0) == 82 && byteBuffer.get(1) == 73 && byteBuffer.get(2) == (byte) 70 && byteBuffer.get(3) == (byte) 70 && byteBuffer.get(8) == 87 && byteBuffer.get(9) == 69 && byteBuffer.get(10) == 66 && byteBuffer.get(11) == (byte) 80 && byteBuffer.get(12) == 86 && byteBuffer.get(13) == (byte) 80 && byteBuffer.get(14) == 56 && byteBuffer.get(15) == 88;
            if (!z2) {
                return false;
            }
            if ((byteBuffer.get(20) & 2) == 0) {
                z = false;
            }
            byteBuffer.position(0);
            return z;
        } finally {
            byteBuffer.position(0);
        }
    }
}
