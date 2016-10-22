import android.media.MediaCodec;
import android.media.MediaFormat;
import java.nio.ByteBuffer;

public final class imm extends imj {
    private final imn a;
    private int b;
    private final String c;

    public imm(ijn ijn, irc irc, long j, int i, int i2, int i3, int i4, int i5, int i6, ikz ikz, int i7) {
        super(ijn, irc, j, i, i2, i3, i4, i5, i6, ikz);
        this.a = new imn(this);
        if ("video/x-vnd.on2.vp8".equals(m())) {
            this.b = i7;
            if (i7 == 2) {
                this.c = "webrtc.vp8.2-layer";
                return;
            } else if (i7 == 3) {
                this.c = "webrtc.vp8.3-layer";
                return;
            } else {
                this.c = null;
                this.b = 0;
                return;
            }
        }
        this.c = null;
        this.b = 0;
    }

    protected void a(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        if (this.c != null) {
            mediaFormat.setString("ts-schema", this.c);
        }
        mediaCodec.setCallback(this.a);
    }

    protected void a() {
        if (this.c != null && !c().getInputFormat().containsKey("ts-schema")) {
            itx.a(4, "vclib", "HW encoder doesn't support temporal scalability; disabling.");
            this.b = 0;
        }
    }

    protected ByteBuffer a(int i) {
        try {
            return c().getOutputBuffer(i);
        } catch (IllegalStateException e) {
            a(e);
            return null;
        }
    }

    protected int b() {
        if (this.b < 2) {
            return -1;
        }
        if (this.b == 2) {
            return d() % 2;
        }
        if (this.b == 3) {
            int d = d() % 4;
            if (d == 0) {
                return 0;
            }
            return d == 2 ? 1 : 2;
        } else {
            iil.a("Unexpected temporal layer count: " + this.b);
            return -1;
        }
    }
}
