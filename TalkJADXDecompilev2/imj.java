package defpackage;

import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Environment;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.libraries.hangouts.video.internal.EncoderManager;
import java.nio.ByteBuffer;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class imj {
    private final ikz A;
    private MediaMuxer B;
    private int C = -1;
    private long D = 0;
    private final ijt a;
    private final EncoderManager b;
    private final irc c;
    private MediaCodec d;
    private ikz e;
    private final long f;
    private final int g;
    private final AtomicInteger h;
    private int i;
    private int j;
    private final int k;
    private int l;
    private final int m;
    private final int n;
    private ByteBuffer o;
    private int p;
    private final Object q;
    private int r;
    private volatile boolean s;
    private final inw t;
    private volatile boolean u = false;
    private volatile float v;
    private int w;
    private int x;
    private final Random y = new Random();
    private long z;

    protected abstract ByteBuffer a(int i);

    protected abstract void a();

    protected abstract void a(MediaCodec mediaCodec, MediaFormat mediaFormat);

    protected abstract int b();

    protected MediaCodec c() {
        return this.d;
    }

    protected int d() {
        return this.p;
    }

    protected void a(IllegalStateException illegalStateException) {
        itx.a("vclib", "MediaCodec encoder exception:", (Throwable) illegalStateException);
        this.u = true;
    }

    public imj(ijn ijn, irc irc, long j, int i, int i2, int i3, int i4, int i5, int i6, ikz ikz) {
        this.a = ijn.e();
        this.b = ijn.h();
        this.c = irc;
        this.f = j;
        this.g = i;
        this.m = i2;
        this.n = i3;
        this.i = i4;
        this.j = i5;
        if (i6 <= 0) {
            i6 = 2;
        }
        this.k = i6;
        itx.a("vclib", "Maximum outstanding encoder frames set to %d", Integer.valueOf(this.k));
        this.h = new AtomicInteger(0);
        this.p = 0;
        this.q = new Object();
        this.s = false;
        this.v = 0.0f;
        this.w = 0;
        this.x = 0;
        this.t = new inw("MediaCodecEncoder");
        this.A = ikz;
    }

    public boolean e() {
        return this.u;
    }

    public long f() {
        return this.f;
    }

    public int g() {
        return this.g;
    }

    public int h() {
        return this.m;
    }

    public int i() {
        return this.n;
    }

    public int j() {
        return this.i;
    }

    public int k() {
        return this.j;
    }

    public int l() {
        return this.l;
    }

    public String m() {
        if (this.g == 0) {
            return "video/x-vnd.on2.vp8";
        }
        if (this.g == 1) {
            return "video/avc";
        }
        iil.a("Unknown codec type: " + this.g);
        return null;
    }

    protected MediaCodec a(String str) {
        return MediaCodec.createEncoderByType(str);
    }

    protected int a(long j, ByteBuffer byteBuffer, int i, int i2, int i3, int i4, int i5, boolean z) {
        return this.b.sendEncodedFrame(this.f, j, byteBuffer, i, i2, i3, i4, i5, z);
    }

    public boolean a(int i, int i2, int i3, long j, boolean z, float[] fArr) {
        synchronized (this.q) {
            if (this.u) {
                return false;
            } else if (this.e == null) {
                return false;
            } else {
                boolean z2;
                Object[] objArr;
                int i4;
                if (!this.s) {
                    if (this.y.nextFloat() < this.v) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!z2) {
                        z2 = false;
                        this.s = false;
                        if (this.h.intValue() >= this.k) {
                            objArr = new Object[]{Integer.valueOf(this.m), Integer.valueOf(this.n), Integer.valueOf(this.h.intValue())};
                            z2 = true;
                        }
                        if (z2) {
                            this.e.b();
                            if (this.e.a(j)) {
                                i4 = this.m;
                                itx.a(6, "vclib", "Unable to start frame operation for encoder: (" + i4 + "x" + this.n + ". Encode failed.");
                                return false;
                            }
                            this.t.a(i, i2, i3, z);
                            this.t.a(this.i, this.j, true);
                            this.t.a(fArr);
                            this.t.d();
                            this.e.d();
                            this.h.incrementAndGet();
                            return true;
                        }
                        return false;
                    }
                }
                z2 = true;
                this.s = false;
                if (this.h.intValue() >= this.k) {
                    objArr = new Object[]{Integer.valueOf(this.m), Integer.valueOf(this.n), Integer.valueOf(this.h.intValue())};
                    z2 = true;
                }
                if (z2) {
                    this.e.b();
                    if (this.e.a(j)) {
                        this.t.a(i, i2, i3, z);
                        this.t.a(this.i, this.j, true);
                        this.t.a(fArr);
                        this.t.d();
                        this.e.d();
                        this.h.incrementAndGet();
                        return true;
                    }
                    i4 = this.m;
                    itx.a(6, "vclib", "Unable to start frame operation for encoder: (" + i4 + "x" + this.n + ". Encode failed.");
                    return false;
                }
                return false;
            }
        }
    }

    private static ByteBuffer a(ByteBuffer byteBuffer, int i, int i2) {
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.position(i);
        duplicate.limit(i + i2);
        return duplicate.slice();
    }

    public void a(int i, BufferInfo bufferInfo) {
        boolean z = true;
        iil.f();
        if (!this.u) {
            ByteBuffer a = a(i);
            if (a != null) {
                if (!(this.B == null || this.C == -1)) {
                    if (this.D == 0) {
                        this.D = bufferInfo.presentationTimeUs;
                    }
                    BufferInfo bufferInfo2 = new BufferInfo();
                    bufferInfo2.offset = bufferInfo.offset;
                    bufferInfo2.size = bufferInfo.size;
                    bufferInfo2.flags = bufferInfo.flags;
                    bufferInfo2.presentationTimeUs = bufferInfo.presentationTimeUs - this.D;
                    this.B.writeSampleData(this.C, a.duplicate(), bufferInfo2);
                }
                if ((bufferInfo.flags & 2) != 0) {
                    if (this.g != 1) {
                        z = false;
                    }
                    iil.a("Expected condition to be true", z);
                    this.o = ByteBuffer.allocateDirect(bufferInfo.size);
                    this.o.put(imj.a(a, bufferInfo.offset, bufferInfo.size));
                    this.d.releaseOutputBuffer(i, false);
                    return;
                }
                ByteBuffer byteBuffer;
                this.a.e().b(Long.valueOf(bufferInfo.presentationTimeUs), SystemClock.elapsedRealtime());
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - this.z >= 1000 && this.x != 0) {
                    this.z = currentTimeMillis;
                    this.v = (0.25f * (((float) this.w) / ((float) (this.w + this.x)))) + (0.75f * this.v);
                    this.w = 0;
                    this.x = 0;
                }
                boolean z2 = (bufferInfo.flags & 1) != 0;
                if (z2) {
                    this.p = 0;
                    if (this.o != null) {
                        this.o.rewind();
                        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(this.o.capacity() + bufferInfo.size);
                        allocateDirect.put(this.o);
                        allocateDirect.put(imj.a(a, bufferInfo.offset, bufferInfo.size));
                        allocateDirect.rewind();
                        bufferInfo.offset = 0;
                        bufferInfo.size = allocateDirect.capacity();
                        a = allocateDirect;
                    }
                    byteBuffer = a;
                } else {
                    byteBuffer = a;
                }
                currentTimeMillis = bufferInfo.presentationTimeUs / 1000;
                int b = b();
                this.p++;
                this.l++;
                if (a(currentTimeMillis, byteBuffer, bufferInfo.offset, bufferInfo.size, this.i, this.j, b, z2) > 0) {
                    this.s = true;
                    this.w++;
                } else {
                    this.x++;
                }
                this.d.releaseOutputBuffer(i, false);
                int decrementAndGet = this.h.decrementAndGet();
                if (decrementAndGet < 0) {
                    itx.c("vclib", "The encoder for resolution: (%dx%d) produced extra frames, recovering.", Integer.valueOf(this.m), Integer.valueOf(this.n));
                    this.h.compareAndSet(decrementAndGet, 0);
                }
            }
        }
    }

    protected void a(MediaFormat mediaFormat) {
        if (!this.u) {
            if (this.B != null && this.C == -1) {
                this.C = this.B.addTrack(mediaFormat);
                this.B.start();
            }
            if (this.i != mediaFormat.getInteger("width") || this.j != mediaFormat.getInteger("height")) {
                int i = this.i;
                int i2 = this.j;
                String valueOf = String.valueOf(mediaFormat);
                itx.a(6, "vclib", new StringBuilder(String.valueOf(valueOf).length() + 123).append("Encoder is unable to handle the exact requested camera size. Original size requested: ").append(i).append("x").append(i2).append(", new format: ").append(valueOf).toString());
                synchronized (this.q) {
                    this.i = mediaFormat.getInteger("width");
                    this.j = mediaFormat.getInteger("height");
                }
            }
        }
    }

    public void n() {
        if (!this.u) {
            int i = this.m;
            itx.a(3, "vclib", "Encoder keyframe request for resolution: (" + i + "," + this.n + ")");
            Bundle bundle = new Bundle();
            bundle.putInt("request-sync", 0);
            this.d.setParameters(bundle);
        }
    }

    public void c(int i) {
        if (!this.u) {
            int i2 = i * 950;
            if (i2 != this.r) {
                int i3 = this.m;
                itx.a(3, "vclib", "Encoder bitrate changing to " + i2 + " for resolution: (" + i3 + "x" + this.n + ")");
                this.r = i2;
                Bundle bundle = new Bundle();
                bundle.putInt("video-bitrate", this.r);
                this.d.setParameters(bundle);
            }
        }
    }

    public ikz o() {
        ikz ikz;
        synchronized (this.q) {
            ikz = this.e;
            this.e = null;
        }
        if (this.d != null) {
            String valueOf = String.valueOf(this.d.getName());
            int i = this.m;
            new StringBuilder(String.valueOf(valueOf).length() + 50).append("Releasing encoder: ").append(valueOf).append(", size: ").append(i).append("x").append(this.n);
            try {
                this.d.stop();
            } catch (IllegalStateException e) {
            }
            this.d.release();
            this.d = null;
        }
        if (!(this.B == null || this.C == -1)) {
            try {
                this.B.stop();
                this.B.release();
            } catch (Throwable e2) {
                itx.a("vclib", "Failed to release media muxer", e2);
            }
        }
        this.B = null;
        return ikz;
    }

    public boolean b(int i) {
        this.r = i * 950;
        try {
            this.d = a(m());
            String str;
            if (this.d == null) {
                String str2 = "vclib";
                str = "Unable to create a hardware encoder for ";
                String valueOf = String.valueOf(m());
                if (valueOf.length() != 0) {
                    valueOf = str.concat(valueOf);
                } else {
                    valueOf = new String(str);
                }
                itx.a(6, str2, valueOf);
                return false;
            }
            boolean z;
            if (itx.a()) {
                Object[] objArr = new Object[]{Integer.valueOf(this.m), Integer.valueOf(this.n), Integer.valueOf(this.i), Integer.valueOf(this.j)};
                new Object[1][0] = Integer.valueOf(this.r);
                new Object[1][0] = this.d.getName();
                new Object[1][0] = Long.valueOf(this.f);
            }
            MediaFormat createVideoFormat = MediaFormat.createVideoFormat(m(), this.i, this.j);
            createVideoFormat.setInteger("color-format", 2130708361);
            createVideoFormat.setInteger("bitrate", this.r);
            createVideoFormat.setInteger("frame-rate", 30);
            createVideoFormat.setInteger("i-frame-interval", 120);
            if (Log.isLoggable("vclib_save_video", 3)) {
                int i2;
                if (this.g == 0) {
                    i2 = 1;
                } else {
                    z = false;
                }
                int i3 = this.m;
                int i4 = this.n;
                long currentTimeMillis = System.currentTimeMillis();
                str = i2 != 0 ? "webm" : "mp4";
                str = new StringBuilder(String.valueOf(str).length() + 51).append("vclib-").append(i3).append("x").append(i4).append("-").append(currentTimeMillis).append(".").append(str).toString();
                String valueOf2 = String.valueOf(Environment.getExternalStorageDirectory().getPath());
                str = new StringBuilder((String.valueOf(valueOf2).length() + 1) + String.valueOf(str).length()).append(valueOf2).append("/").append(str).toString();
                try {
                    if (i2 != 0) {
                        i2 = 1;
                    } else {
                        i2 = 0;
                    }
                    this.B = new MediaMuxer(str, i2);
                } catch (Throwable e) {
                    itx.a("vclib", "Unable to create MediaMuxer", e);
                    this.B = null;
                }
            }
            try {
                ikz ikz;
                a(this.d, createVideoFormat);
                new Object[1][0] = createVideoFormat;
                this.d.configure(createVideoFormat, null, null, 1);
                if (this.A == null || this.A.a() == null) {
                    ikz = new ikz(this.c, this.d.createInputSurface());
                } else {
                    if (VERSION.SDK_INT >= 23) {
                        z = true;
                    } else {
                        z = false;
                    }
                    iil.a("Expected condition to be true", z);
                    ikz = this.A;
                    this.d.setInputSurface(this.A.a());
                }
                this.d.start();
                synchronized (this.q) {
                    iil.a("Existing input surface on the encoder instance.", this.e);
                    this.e = ikz;
                }
                a();
                return true;
            } catch (IllegalStateException e2) {
                itx.a(6, "vclib", "Encoder initialization failed.");
                a(e2);
                return false;
            }
        } catch (Throwable e3) {
            itx.a("vclib", "Unable to create hardware encoder. Exception:", e3);
            return false;
        }
    }
}
