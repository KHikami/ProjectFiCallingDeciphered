package p000;

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
    private final ikz f18038A;
    private MediaMuxer f18039B;
    private int f18040C = -1;
    private long f18041D = 0;
    private final ijt f18042a;
    private final EncoderManager f18043b;
    private final irc f18044c;
    private MediaCodec f18045d;
    private ikz f18046e;
    private final long f18047f;
    private final int f18048g;
    private final AtomicInteger f18049h;
    private int f18050i;
    private int f18051j;
    private final int f18052k;
    private int f18053l;
    private final int f18054m;
    private final int f18055n;
    private ByteBuffer f18056o;
    private int f18057p;
    private final Object f18058q;
    private int f18059r;
    private volatile boolean f18060s;
    private final inw f18061t;
    private volatile boolean f18062u = false;
    private volatile float f18063v;
    private int f18064w;
    private int f18065x;
    private final Random f18066y = new Random();
    private long f18067z;

    protected abstract ByteBuffer mo3266a(int i);

    protected abstract void mo3267a();

    protected abstract void mo3268a(MediaCodec mediaCodec, MediaFormat mediaFormat);

    protected abstract int mo3269b();

    protected MediaCodec m22290c() {
        return this.f18045d;
    }

    protected int m22292d() {
        return this.f18057p;
    }

    protected void m22286a(IllegalStateException illegalStateException) {
        itx.m23281a("vclib", "MediaCodec encoder exception:", (Throwable) illegalStateException);
        this.f18062u = true;
    }

    public imj(ijn ijn, irc irc, long j, int i, int i2, int i3, int i4, int i5, int i6, ikz ikz) {
        this.f18042a = ijn.m21967e();
        this.f18043b = ijn.m21970h();
        this.f18044c = irc;
        this.f18047f = j;
        this.f18048g = i;
        this.f18054m = i2;
        this.f18055n = i3;
        this.f18050i = i4;
        this.f18051j = i5;
        if (i6 <= 0) {
            i6 = 2;
        }
        this.f18052k = i6;
        itx.m23282a("vclib", "Maximum outstanding encoder frames set to %d", Integer.valueOf(this.f18052k));
        this.f18049h = new AtomicInteger(0);
        this.f18057p = 0;
        this.f18058q = new Object();
        this.f18060s = false;
        this.f18063v = 0.0f;
        this.f18064w = 0;
        this.f18065x = 0;
        this.f18061t = new inw("MediaCodecEncoder");
        this.f18038A = ikz;
    }

    public boolean m22293e() {
        return this.f18062u;
    }

    public long m22294f() {
        return this.f18047f;
    }

    public int m22295g() {
        return this.f18048g;
    }

    public int m22296h() {
        return this.f18054m;
    }

    public int m22297i() {
        return this.f18055n;
    }

    public int m22298j() {
        return this.f18050i;
    }

    public int m22299k() {
        return this.f18051j;
    }

    public int m22300l() {
        return this.f18053l;
    }

    public String m22301m() {
        if (this.f18048g == 0) {
            return "video/x-vnd.on2.vp8";
        }
        if (this.f18048g == 1) {
            return "video/avc";
        }
        iil.m21870a("Unknown codec type: " + this.f18048g);
        return null;
    }

    protected MediaCodec m22280a(String str) {
        return MediaCodec.createEncoderByType(str);
    }

    protected int m22279a(long j, ByteBuffer byteBuffer, int i, int i2, int i3, int i4, int i5, boolean z) {
        return this.f18043b.sendEncodedFrame(this.f18047f, j, byteBuffer, i, i2, i3, i4, i5, z);
    }

    public boolean m22287a(int i, int i2, int i3, long j, boolean z, float[] fArr) {
        synchronized (this.f18058q) {
            if (this.f18062u) {
                return false;
            } else if (this.f18046e == null) {
                return false;
            } else {
                boolean z2;
                Object[] objArr;
                int i4;
                if (!this.f18060s) {
                    if (this.f18066y.nextFloat() < this.f18063v) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!z2) {
                        z2 = false;
                        this.f18060s = false;
                        if (this.f18049h.intValue() >= this.f18052k) {
                            objArr = new Object[]{Integer.valueOf(this.f18054m), Integer.valueOf(this.f18055n), Integer.valueOf(this.f18049h.intValue())};
                            z2 = true;
                        }
                        if (z2) {
                            this.f18046e.m22218b();
                            if (this.f18046e.m22217a(j)) {
                                i4 = this.f18054m;
                                itx.m23277a(6, "vclib", "Unable to start frame operation for encoder: (" + i4 + "x" + this.f18055n + ". Encode failed.");
                                return false;
                            }
                            this.f18061t.m22400a(i, i2, i3, z);
                            this.f18061t.m22401a(this.f18050i, this.f18051j, true);
                            this.f18061t.m22403a(fArr);
                            this.f18061t.mo3345d();
                            this.f18046e.m22220d();
                            this.f18049h.incrementAndGet();
                            return true;
                        }
                        return false;
                    }
                }
                z2 = true;
                this.f18060s = false;
                if (this.f18049h.intValue() >= this.f18052k) {
                    objArr = new Object[]{Integer.valueOf(this.f18054m), Integer.valueOf(this.f18055n), Integer.valueOf(this.f18049h.intValue())};
                    z2 = true;
                }
                if (z2) {
                    this.f18046e.m22218b();
                    if (this.f18046e.m22217a(j)) {
                        this.f18061t.m22400a(i, i2, i3, z);
                        this.f18061t.m22401a(this.f18050i, this.f18051j, true);
                        this.f18061t.m22403a(fArr);
                        this.f18061t.mo3345d();
                        this.f18046e.m22220d();
                        this.f18049h.incrementAndGet();
                        return true;
                    }
                    i4 = this.f18054m;
                    itx.m23277a(6, "vclib", "Unable to start frame operation for encoder: (" + i4 + "x" + this.f18055n + ". Encode failed.");
                    return false;
                }
                return false;
            }
        }
    }

    private static ByteBuffer m22278a(ByteBuffer byteBuffer, int i, int i2) {
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.position(i);
        duplicate.limit(i + i2);
        return duplicate.slice();
    }

    public void m22283a(int i, BufferInfo bufferInfo) {
        boolean z = true;
        iil.m21883f();
        if (!this.f18062u) {
            ByteBuffer a = mo3266a(i);
            if (a != null) {
                if (!(this.f18039B == null || this.f18040C == -1)) {
                    if (this.f18041D == 0) {
                        this.f18041D = bufferInfo.presentationTimeUs;
                    }
                    BufferInfo bufferInfo2 = new BufferInfo();
                    bufferInfo2.offset = bufferInfo.offset;
                    bufferInfo2.size = bufferInfo.size;
                    bufferInfo2.flags = bufferInfo.flags;
                    bufferInfo2.presentationTimeUs = bufferInfo.presentationTimeUs - this.f18041D;
                    this.f18039B.writeSampleData(this.f18040C, a.duplicate(), bufferInfo2);
                }
                if ((bufferInfo.flags & 2) != 0) {
                    if (this.f18048g != 1) {
                        z = false;
                    }
                    iil.m21874a("Expected condition to be true", z);
                    this.f18056o = ByteBuffer.allocateDirect(bufferInfo.size);
                    this.f18056o.put(imj.m22278a(a, bufferInfo.offset, bufferInfo.size));
                    this.f18045d.releaseOutputBuffer(i, false);
                    return;
                }
                ByteBuffer byteBuffer;
                this.f18042a.m22073e().m23033b(Long.valueOf(bufferInfo.presentationTimeUs), SystemClock.elapsedRealtime());
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - this.f18067z >= 1000 && this.f18065x != 0) {
                    this.f18067z = currentTimeMillis;
                    this.f18063v = (0.25f * (((float) this.f18064w) / ((float) (this.f18064w + this.f18065x)))) + (0.75f * this.f18063v);
                    this.f18064w = 0;
                    this.f18065x = 0;
                }
                boolean z2 = (bufferInfo.flags & 1) != 0;
                if (z2) {
                    this.f18057p = 0;
                    if (this.f18056o != null) {
                        this.f18056o.rewind();
                        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(this.f18056o.capacity() + bufferInfo.size);
                        allocateDirect.put(this.f18056o);
                        allocateDirect.put(imj.m22278a(a, bufferInfo.offset, bufferInfo.size));
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
                int b = mo3269b();
                this.f18057p++;
                this.f18053l++;
                if (m22279a(currentTimeMillis, byteBuffer, bufferInfo.offset, bufferInfo.size, this.f18050i, this.f18051j, b, z2) > 0) {
                    this.f18060s = true;
                    this.f18064w++;
                } else {
                    this.f18065x++;
                }
                this.f18045d.releaseOutputBuffer(i, false);
                int decrementAndGet = this.f18049h.decrementAndGet();
                if (decrementAndGet < 0) {
                    itx.m23288c("vclib", "The encoder for resolution: (%dx%d) produced extra frames, recovering.", Integer.valueOf(this.f18054m), Integer.valueOf(this.f18055n));
                    this.f18049h.compareAndSet(decrementAndGet, 0);
                }
            }
        }
    }

    protected void m22285a(MediaFormat mediaFormat) {
        if (!this.f18062u) {
            if (this.f18039B != null && this.f18040C == -1) {
                this.f18040C = this.f18039B.addTrack(mediaFormat);
                this.f18039B.start();
            }
            if (this.f18050i != mediaFormat.getInteger("width") || this.f18051j != mediaFormat.getInteger("height")) {
                int i = this.f18050i;
                int i2 = this.f18051j;
                String valueOf = String.valueOf(mediaFormat);
                itx.m23277a(6, "vclib", new StringBuilder(String.valueOf(valueOf).length() + 123).append("Encoder is unable to handle the exact requested camera size. Original size requested: ").append(i).append("x").append(i2).append(", new format: ").append(valueOf).toString());
                synchronized (this.f18058q) {
                    this.f18050i = mediaFormat.getInteger("width");
                    this.f18051j = mediaFormat.getInteger("height");
                }
            }
        }
    }

    public void m22302n() {
        if (!this.f18062u) {
            int i = this.f18054m;
            itx.m23277a(3, "vclib", "Encoder keyframe request for resolution: (" + i + "," + this.f18055n + ")");
            Bundle bundle = new Bundle();
            bundle.putInt("request-sync", 0);
            this.f18045d.setParameters(bundle);
        }
    }

    public void m22291c(int i) {
        if (!this.f18062u) {
            int i2 = i * 950;
            if (i2 != this.f18059r) {
                int i3 = this.f18054m;
                itx.m23277a(3, "vclib", "Encoder bitrate changing to " + i2 + " for resolution: (" + i3 + "x" + this.f18055n + ")");
                this.f18059r = i2;
                Bundle bundle = new Bundle();
                bundle.putInt("video-bitrate", this.f18059r);
                this.f18045d.setParameters(bundle);
            }
        }
    }

    public ikz m22303o() {
        ikz ikz;
        synchronized (this.f18058q) {
            ikz = this.f18046e;
            this.f18046e = null;
        }
        if (this.f18045d != null) {
            String valueOf = String.valueOf(this.f18045d.getName());
            int i = this.f18054m;
            new StringBuilder(String.valueOf(valueOf).length() + 50).append("Releasing encoder: ").append(valueOf).append(", size: ").append(i).append("x").append(this.f18055n);
            try {
                this.f18045d.stop();
            } catch (IllegalStateException e) {
            }
            this.f18045d.release();
            this.f18045d = null;
        }
        if (!(this.f18039B == null || this.f18040C == -1)) {
            try {
                this.f18039B.stop();
                this.f18039B.release();
            } catch (Throwable e2) {
                itx.m23281a("vclib", "Failed to release media muxer", e2);
            }
        }
        this.f18039B = null;
        return ikz;
    }

    public boolean m22289b(int i) {
        this.f18059r = i * 950;
        try {
            this.f18045d = m22280a(m22301m());
            String str;
            if (this.f18045d == null) {
                String str2 = "vclib";
                str = "Unable to create a hardware encoder for ";
                String valueOf = String.valueOf(m22301m());
                if (valueOf.length() != 0) {
                    valueOf = str.concat(valueOf);
                } else {
                    valueOf = new String(str);
                }
                itx.m23277a(6, str2, valueOf);
                return false;
            }
            boolean z;
            if (itx.m23283a()) {
                Object[] objArr = new Object[]{Integer.valueOf(this.f18054m), Integer.valueOf(this.f18055n), Integer.valueOf(this.f18050i), Integer.valueOf(this.f18051j)};
                new Object[1][0] = Integer.valueOf(this.f18059r);
                new Object[1][0] = this.f18045d.getName();
                new Object[1][0] = Long.valueOf(this.f18047f);
            }
            MediaFormat createVideoFormat = MediaFormat.createVideoFormat(m22301m(), this.f18050i, this.f18051j);
            createVideoFormat.setInteger("color-format", 2130708361);
            createVideoFormat.setInteger("bitrate", this.f18059r);
            createVideoFormat.setInteger("frame-rate", 30);
            createVideoFormat.setInteger("i-frame-interval", 120);
            if (Log.isLoggable("vclib_save_video", 3)) {
                int i2;
                if (this.f18048g == 0) {
                    i2 = 1;
                } else {
                    z = false;
                }
                int i3 = this.f18054m;
                int i4 = this.f18055n;
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
                    this.f18039B = new MediaMuxer(str, i2);
                } catch (Throwable e) {
                    itx.m23281a("vclib", "Unable to create MediaMuxer", e);
                    this.f18039B = null;
                }
            }
            try {
                ikz ikz;
                mo3268a(this.f18045d, createVideoFormat);
                new Object[1][0] = createVideoFormat;
                this.f18045d.configure(createVideoFormat, null, null, 1);
                if (this.f18038A == null || this.f18038A.m22216a() == null) {
                    ikz = new ikz(this.f18044c, this.f18045d.createInputSurface());
                } else {
                    if (VERSION.SDK_INT >= 23) {
                        z = true;
                    } else {
                        z = false;
                    }
                    iil.m21874a("Expected condition to be true", z);
                    ikz = this.f18038A;
                    this.f18045d.setInputSurface(this.f18038A.m22216a());
                }
                this.f18045d.start();
                synchronized (this.f18058q) {
                    iil.m21872a("Existing input surface on the encoder instance.", this.f18046e);
                    this.f18046e = ikz;
                }
                mo3267a();
                return true;
            } catch (IllegalStateException e2) {
                itx.m23277a(6, "vclib", "Encoder initialization failed.");
                m22286a(e2);
                return false;
            }
        } catch (Throwable e3) {
            itx.m23281a("vclib", "Unable to create hardware encoder. Exception:", e3);
            return false;
        }
    }
}
