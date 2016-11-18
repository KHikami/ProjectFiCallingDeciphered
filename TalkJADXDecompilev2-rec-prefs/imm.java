package p000;

import android.media.MediaCodec;
import android.media.MediaFormat;
import java.nio.ByteBuffer;

public final class imm extends imj {
    private final imn f18072a = new imn(this);
    private int f18073b;
    private final String f18074c;

    public imm(ijn ijn, irc irc, long j, int i, int i2, int i3, int i4, int i5, int i6, ikz ikz, int i7) {
        super(ijn, irc, j, i, i2, i3, i4, i5, i6, ikz);
        if ("video/x-vnd.on2.vp8".equals(m22301m())) {
            this.f18073b = i7;
            if (i7 == 2) {
                this.f18074c = "webrtc.vp8.2-layer";
                return;
            } else if (i7 == 3) {
                this.f18074c = "webrtc.vp8.3-layer";
                return;
            } else {
                this.f18074c = null;
                this.f18073b = 0;
                return;
            }
        }
        this.f18074c = null;
        this.f18073b = 0;
    }

    protected void mo3268a(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        if (this.f18074c != null) {
            mediaFormat.setString("ts-schema", this.f18074c);
        }
        mediaCodec.setCallback(this.f18072a);
    }

    protected void mo3267a() {
        if (this.f18074c != null && !m22290c().getInputFormat().containsKey("ts-schema")) {
            itx.m23277a(4, "vclib", "HW encoder doesn't support temporal scalability; disabling.");
            this.f18073b = 0;
        }
    }

    protected ByteBuffer mo3266a(int i) {
        try {
            return m22290c().getOutputBuffer(i);
        } catch (IllegalStateException e) {
            m22286a(e);
            return null;
        }
    }

    protected int mo3269b() {
        if (this.f18073b < 2) {
            return -1;
        }
        if (this.f18073b == 2) {
            return m22292d() % 2;
        }
        if (this.f18073b == 3) {
            int d = m22292d() % 4;
            if (d == 0) {
                return 0;
            }
            return d == 2 ? 1 : 2;
        } else {
            iil.m21870a("Unexpected temporal layer count: " + this.f18073b);
            return -1;
        }
    }
}
