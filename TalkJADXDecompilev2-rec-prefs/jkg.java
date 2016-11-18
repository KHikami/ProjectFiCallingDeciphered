package p000;

import android.support.rastermill.FrameSequence;
import java.nio.ByteBuffer;

public final class jkg {
    public final FrameSequence f20350a;

    public jkg(FrameSequence frameSequence) {
        this.f20350a = frameSequence;
    }

    public static boolean m24551a(ByteBuffer byteBuffer) {
        boolean z = true;
        if (byteBuffer.remaining() < 21) {
            return false;
        }
        try {
            boolean z2 = byteBuffer.get(0) == (byte) 82 && byteBuffer.get(1) == (byte) 73 && byteBuffer.get(2) == (byte) 70 && byteBuffer.get(3) == (byte) 70 && byteBuffer.get(8) == (byte) 87 && byteBuffer.get(9) == (byte) 69 && byteBuffer.get(10) == (byte) 66 && byteBuffer.get(11) == (byte) 80 && byteBuffer.get(12) == (byte) 86 && byteBuffer.get(13) == (byte) 80 && byteBuffer.get(14) == (byte) 56 && byteBuffer.get(15) == (byte) 88;
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
