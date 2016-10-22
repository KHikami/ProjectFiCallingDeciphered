package com.google.android.libraries.hangouts.video.internal;

import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.view.Surface;
import com.google.android.apps.common.proguard.UsedByNative;
import gwb;
import iil;
import ilu;
import ilv;
import ilw;
import ilx;
import ily;
import ilz;
import ima;
import imb;
import imc;
import imd;
import ime;
import irg;
import itx;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;

public abstract class MediaCodecDecoder {
    private static int g;
    private static final Object h;
    private static int l;
    private final Runnable A;
    public volatile int a;
    public final ime b;
    public Surface c;
    public final Handler d;
    public final AtomicReference<irg> e;
    public final Runnable f;
    private final DecoderManager i;
    private volatile int j;
    private MediaCodec k;
    private boolean m;
    private volatile boolean n;
    private int o;
    private int p;
    private int q;
    private boolean r;
    private int s;
    private boolean t;
    private boolean u;
    private final Object v;
    private boolean w;
    private final HandlerThread x;
    private MediaFormat y;
    private final Runnable z;

    @UsedByNative
    public class FrameDataOutputParams {
        @UsedByNative
        public int height;
        @UsedByNative
        public boolean isEndOfStream;
        @UsedByNative
        public int size;
        @UsedByNative
        public long timestamp;
        @UsedByNative
        public int width;
    }

    public abstract ByteBuffer a(int i);

    public abstract void b(int i);

    public abstract int c();

    public void a(MediaCodec mediaCodec) {
    }

    public void a() {
    }

    public void b() {
    }

    public MediaCodec d() {
        return this.k;
    }

    public Handler e() {
        return this.d;
    }

    public void a(Exception exception) {
        itx.a("vclib", "MediaCodec reported exception: ", (Throwable) exception);
        this.s++;
        if (this.s < 3) {
            itx.a(6, "vclib", "Attempting to reset decoder.");
            this.d.postDelayed(this.z, 200);
        } else if (this.j == 1) {
            itx.a(6, "vclib", "Too many consecutive hardware failures. Switching to SW MediaCodec.");
            this.u = true;
            this.d.postDelayed(this.z, 200);
        } else {
            itx.a(6, "vclib", "Too many consecutive hardware failures. Attempting software fallback.");
            if (h() && this.b != null) {
                gwb.a(new ilu(this));
            }
            this.t = true;
            k();
            this.i.notifyHardwareFailed(this.a);
        }
    }

    static {
        l = Integer.MAX_VALUE;
        if ("manta".equals(Build.HARDWARE)) {
            l = 3;
        }
        h = new Object();
    }

    public MediaCodecDecoder(DecoderManager decoderManager, ime ime) {
        this.e = new AtomicReference();
        this.z = new ilw(this);
        this.A = new ilx(this);
        this.f = new ily(this);
        this.i = decoderManager;
        this.b = ime;
        this.a = 0;
        this.j = -1;
        this.v = new Object();
        this.w = true;
        this.r = true;
        this.x = new HandlerThread("DecoderHandlerThread", -4);
        this.x.start();
        this.d = new Handler(this.x.getLooper());
    }

    private void m() {
        if (this.k != null) {
            try {
                this.k.stop();
            } catch (IllegalStateException e) {
            }
            this.k.release();
            this.k = null;
            if (this.m) {
                synchronized (h) {
                    g--;
                }
            }
        }
    }

    private String n() {
        if (this.j == 0) {
            return "video/x-vnd.on2.vp8";
        }
        if (this.j == 1) {
            return "video/avc";
        }
        iil.a("Unknown codec type: " + this.j);
        return null;
    }

    void c(int i) {
        if (this.j != i) {
            this.j = i;
            if (this.b != null) {
                gwb.a(new ilz(this, i));
            }
        }
    }

    public void a(Surface surface, Runnable runnable) {
        this.d.post(new ima(this, surface, runnable));
    }

    public int f() {
        int i;
        synchronized (this.v) {
            i = this.j;
        }
        return i;
    }

    public MediaFormat g() {
        MediaFormat mediaFormat;
        synchronized (this.v) {
            mediaFormat = this.y;
        }
        return mediaFormat;
    }

    public boolean h() {
        boolean z;
        synchronized (this.v) {
            z = this.r && !this.t;
        }
        return z;
    }

    public void d(int i) {
        if (this.a != i) {
            this.d.post(new imb(this, i));
        }
    }

    public void i() {
        int i = 4;
        iil.e();
        int codecType = this.i.getCodecType(this.a);
        if (this.j != codecType) {
            if (codecType == -1) {
                this.n = false;
            }
            j();
            return;
        }
        FrameDataOutputParams frameDataOutputParams = new FrameDataOutputParams();
        if (this.i.getNextEncodedFrameMetadata(this.a, this.w, frameDataOutputParams)) {
            boolean z;
            int i2;
            codecType = frameDataOutputParams.width;
            int i3 = frameDataOutputParams.height;
            if (codecType <= 0 || i3 <= 0 || (codecType == this.p && i3 == this.q)) {
                z = false;
            } else {
                codecType = 1;
            }
            if (codecType != 0) {
                boolean h = h();
                codecType = frameDataOutputParams.width;
                int i4 = frameDataOutputParams.height;
                z = VERSION.SDK_INT >= 21 ? a(codecType, i4) : codecType <= 1920 && i4 <= 1920 && (codecType <= 1080 || i4 <= 1080);
                this.r = z;
                if (!this.r) {
                    itx.a(5, "vclib", "Unsupported resolution for decode for ssrc: " + this.a + " (" + frameDataOutputParams.width + "x" + frameDataOutputParams.height + ")");
                    this.i.notifyResolutionNotSupported(this.a, frameDataOutputParams.width, frameDataOutputParams.height);
                }
                z = h();
                if (h() != h) {
                    itx.a(3, "vclib", "Changed support capabilities for ssrc: %d. Now: %b", Integer.valueOf(this.a), Boolean.valueOf(z));
                    if (this.b != null) {
                        gwb.a(new imc(this, z));
                    }
                }
                if (!(this.p == 0 || this.q == 0)) {
                    i2 = this.a;
                    i3 = this.p;
                    itx.a(4, "vclib", "Dynamic resolution change detected for ssrc: " + i2 + " (" + i3 + "x" + this.q + " -> " + frameDataOutputParams.width + "x" + frameDataOutputParams.height + ")");
                    if (!this.i.c()) {
                        j();
                        return;
                    }
                }
            }
            this.w = false;
            if (!(frameDataOutputParams.width == 0 || frameDataOutputParams.height == 0)) {
                this.p = frameDataOutputParams.width;
                this.q = frameDataOutputParams.height;
            }
            if (this.r) {
                i2 = c();
                if (i2 == -1) {
                    this.o++;
                    if (this.o >= 100) {
                        a(new IllegalStateException("Too many failed getNextInputBuffer calls."));
                        return;
                    }
                    return;
                }
                this.o = 0;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (this.i.consumeNextEncodedFrame(this.a, frameDataOutputParams.timestamp, a(i2))) {
                    if (!frameDataOutputParams.isEndOfStream) {
                        i = 0;
                    }
                    long j = frameDataOutputParams.timestamp * 11;
                    this.k.queueInputBuffer(i2, 0, frameDataOutputParams.size, j, i);
                    b(i2);
                    irg irg = (irg) this.e.get();
                    if (irg != null) {
                        irg.a(Long.valueOf(j), elapsedRealtime);
                        return;
                    }
                    return;
                }
                itx.a(6, "vclib", "Unable to consume encoded frame.");
                return;
            }
            this.i.consumeNextEncodedFrame(this.a, frameDataOutputParams.timestamp, null);
        }
    }

    private boolean a(int i, int i2) {
        boolean z = false;
        if (i2 <= i) {
            int i3 = i2;
            i2 = i;
            i = i3;
        }
        if (this.k == null) {
            itx.a(6, "vclib", "Getting Codec info when mediaCodec is null");
        } else {
            try {
                z = this.k.getCodecInfo().getCapabilitiesForType(n()).getVideoCapabilities().isSizeSupported(i2, i);
            } catch (IllegalArgumentException e) {
                itx.a(5, "vclib", String.format("decoder (ssrc=%d) failed getCapabilitiesForType for MIME type %s. Claiming unsupported size.", new Object[]{Integer.valueOf(this.a), n()}));
            }
        }
        return z;
    }

    public void a(int i, BufferInfo bufferInfo) {
        iil.e();
        this.s = 0;
        if (this.y == null) {
            synchronized (this.v) {
                this.y = this.k.getOutputFormat();
            }
            if (this.b != null) {
                gwb.a(new imd(this, this.k.getOutputFormat()));
            }
        }
        irg irg = (irg) this.e.get();
        if (irg != null) {
            irg.b(Long.valueOf(bufferInfo.presentationTimeUs), SystemClock.elapsedRealtime());
        }
        long j = bufferInfo.presentationTimeUs / 11;
        int integer = this.y.getInteger("width");
        int integer2 = this.y.getInteger("height");
        this.k.releaseOutputBuffer(i, true);
        this.i.frameDecoded(this.a, j, integer, integer2);
    }

    public void a(MediaFormat mediaFormat) {
        int i = this.a;
        String valueOf = String.valueOf(mediaFormat);
        itx.a(4, "vclib", new StringBuilder(String.valueOf(valueOf).length() + 59).append("decoder (ssrc=").append(i).append(") resolution changed. New format: ").append(valueOf).toString());
        if (this.y == null || this.i.c()) {
            synchronized (this.v) {
                MediaFormat outputFormat = this.k.getOutputFormat();
                if (!this.m && outputFormat.containsKey("crop-right")) {
                    outputFormat.setInteger("width", outputFormat.getInteger("crop-right") + 1);
                    outputFormat.setInteger("height", outputFormat.getInteger("crop-bottom") + 1);
                }
                this.y = outputFormat;
                if (this.b != null) {
                    gwb.a(new ilv(this, outputFormat));
                }
            }
            return;
        }
        itx.a(5, "vclib", "Missed a dynamic resolution change when handling incoming frames. Resetting hw decoder now.");
        j();
    }

    public void j() {
        k();
        int codecType = this.i.getCodecType(this.a);
        c(codecType);
        if (codecType == -1) {
            this.n = false;
            this.d.postDelayed(this.z, 200);
            return;
        }
        synchronized (this.v) {
            if (this.a == 0 || this.c == null || !this.c.isValid()) {
                return;
            }
            if (o()) {
                this.d.post(this.f);
            }
        }
    }

    public void k() {
        b();
        this.d.removeCallbacks(this.z);
        this.d.removeCallbacks(this.f);
        b(-1);
        this.o = 0;
        this.n = false;
        this.p = 0;
        this.q = 0;
        this.y = null;
        m();
        this.w = true;
    }

    public void l() {
        this.d.postAtFrontOfQueue(this.A);
        this.x.quitSafely();
    }

    private boolean o() {
        String valueOf;
        Exception e;
        this.m = !this.u;
        if (this.m) {
            synchronized (h) {
                if (g >= l) {
                    this.m = false;
                } else {
                    g++;
                }
            }
        }
        if (this.m) {
            try {
                this.k = MediaCodec.createDecoderByType(n());
            } catch (Throwable th) {
                valueOf = String.valueOf(th);
                itx.a(6, "vclib", new StringBuilder(String.valueOf(valueOf).length() + 39).append("MediaCodec.createDecoderByType failed, ").append(valueOf).toString());
            }
        } else {
            try {
                itx.a(5, "vclib", "Creating a software decoder.");
                if (this.j == 0) {
                    valueOf = "OMX.google.vp8.decoder";
                } else if (this.j == 1) {
                    valueOf = "OMX.google.h264.decoder";
                } else {
                    iil.a("Unknown codec type: " + this.j);
                    valueOf = null;
                }
                this.k = MediaCodec.createByCodecName(valueOf);
            } catch (Throwable th2) {
                valueOf = String.valueOf(th2);
                itx.a(6, "vclib", new StringBuilder(String.valueOf(valueOf).length() + 37).append("MediaCodec.createByCodecName failed, ").append(valueOf).toString());
            }
        }
        if (this.k == null) {
            itx.a(6, "vclib", "Unable to create a MediaCodec decoder.");
            return false;
        }
        MediaFormat createVideoFormat = MediaFormat.createVideoFormat(n(), 640, 640);
        createVideoFormat.setInteger("max-width", 1920);
        createVideoFormat.setInteger("max-height", 1920);
        a(this.k);
        try {
            this.k.configure(createVideoFormat, this.c, null, 0);
            this.k.start();
            this.n = true;
            a();
            return true;
        } catch (IllegalStateException e2) {
            e = e2;
            itx.a(6, "vclib", "MediaCodec decoder initialization failed.");
            a(e);
            return false;
        } catch (IllegalArgumentException e3) {
            e = e3;
            itx.a(6, "vclib", "MediaCodec decoder initialization failed.");
            a(e);
            return false;
        }
    }
}
