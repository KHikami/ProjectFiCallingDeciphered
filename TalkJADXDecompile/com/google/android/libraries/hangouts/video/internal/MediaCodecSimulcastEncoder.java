package com.google.android.libraries.hangouts.video.internal;

import android.media.MediaCodec;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import com.google.android.apps.common.proguard.UsedByNative;
import com.google.api.client.http.HttpStatusCodes;
import gwb;
import icb;
import iil;
import ijn;
import ikz;
import ila;
import ild;
import imj;
import imk;
import imm;
import imp;
import imq;
import imr;
import ims;
import imt;
import imu;
import imv;
import itx;
import iuc;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@UsedByNative
public final class MediaCodecSimulcastEncoder implements ila {
    public List<imj> a;
    public final ild b;
    public boolean c;
    public boolean d;
    public boolean e;
    public long f;
    public final Handler g;
    public final boolean h;
    public final imv i;
    public final Map<iuc, ikz> j;
    public final Runnable k;
    public final Runnable l;
    private final ijn m;
    private final EncoderManager n;
    private final int o;
    private final int p;
    private final Object q;
    private int r;
    private int s;
    private int t;
    private final HandlerThread u;
    private final boolean v;
    private final Runnable w;

    @UsedByNative
    public class EncoderConfigurationOutputParams {
        @UsedByNative
        public int codecType;
        @UsedByNative
        public int height;
        @UsedByNative
        public long nativeEncoderId;
        @UsedByNative
        public boolean requiresKeyFrame;
        @UsedByNative
        public int targetBitRate;
        @UsedByNative
        public int targetFrameRate;
        @UsedByNative
        public int temporalLayerCount;
        @UsedByNative
        public int width;
    }

    @UsedByNative
    public class NativeSimulcastEncoderOutputParams {
        @UsedByNative
        public long[] nativeEncoderIds;
    }

    private void a(long j) {
        this.t++;
        if (this.t < 3) {
            itx.a(6, "vclib", "An encoder instance has reported hardware failure. Resetting.");
            f();
            this.g.postDelayed(this.w, 200);
            return;
        }
        itx.a(6, "vclib", "An encoder instance has reported hardware failure too many times. Falling back to software encode.");
        this.d = false;
        f();
        this.n.notifyHardwareFailed(j);
    }

    public boolean d() {
        for (imj imj : this.a) {
            if (imj.e()) {
                if (imj.l() > 0) {
                    this.t = 0;
                }
                a(imj.f());
                return true;
            }
        }
        return false;
    }

    public MediaCodecSimulcastEncoder(ijn ijn, int i, int i2) {
        boolean z = true;
        this.i = new imv(this, 3);
        this.j = new HashMap();
        this.w = new imp(this);
        this.k = new imq(this);
        this.l = new imr(this);
        this.m = ijn;
        this.n = ijn.h();
        this.b = ijn.f();
        this.o = i;
        this.p = i2;
        this.h = icb.a(ijn.a().getContentResolver(), "babel_hangout_force_generate_keyframes", !gwb.aq());
        itx.a("vclib", "Will force generate keyframes in screencast mode: %b", Boolean.valueOf(this.h));
        this.q = new Object();
        this.a = new ArrayList();
        this.u = new HandlerThread("EncoderHandlerThread", -4);
        this.u.start();
        this.g = new Handler(this.u.getLooper());
        if (VERSION.SDK_INT < 23) {
            z = false;
        }
        this.v = z;
    }

    public void a() {
    }

    public void a(boolean z) {
    }

    public void a(int i, int i2, boolean z) {
        if (this.r != i || this.s != i2 || this.c != z) {
            new StringBuilder(73).append("Encoder setResolution with new resolution: Input: ").append(i).append("x").append(i2);
            synchronized (this.q) {
                this.r = i;
                this.s = i2;
                this.c = z;
                this.g.post(this.l);
            }
        }
    }

    public boolean a(int i, long j, boolean z, float[] fArr) {
        synchronized (this.q) {
            if (this.d) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                int i2 = 0;
                for (imj a : this.a) {
                    i2 = a.a(i, this.r, this.s, j, z, fArr) | i2;
                }
                if (i2 != 0) {
                    this.m.e().e().a(Long.valueOf(j / 1000), elapsedRealtime);
                }
                return true;
            }
            return false;
        }
    }

    public int b() {
        int i;
        synchronized (this.q) {
            if (this.a.isEmpty()) {
                i = -1;
            } else {
                i = ((imj) this.a.get(0)).g();
            }
        }
        return i;
    }

    public List<EncoderConfigurationOutputParams> e() {
        iil.f();
        synchronized (this.q) {
            Object obj = this.r >= this.s ? 1 : null;
        }
        NativeSimulcastEncoderOutputParams nativeSimulcastEncoderOutputParams = new NativeSimulcastEncoderOutputParams();
        if (!this.n.getNativeSimulcastEncoderIds(nativeSimulcastEncoderOutputParams) || nativeSimulcastEncoderOutputParams.nativeEncoderIds.length == 0) {
            return null;
        }
        if (nativeSimulcastEncoderOutputParams.nativeEncoderIds.length > 4) {
            iil.a("Got a request for too many simulcast streams: " + nativeSimulcastEncoderOutputParams.nativeEncoderIds.length);
            return null;
        }
        Object obj2 = nativeSimulcastEncoderOutputParams.nativeEncoderIds.length == 1 ? 1 : null;
        List<EncoderConfigurationOutputParams> arrayList = new ArrayList(nativeSimulcastEncoderOutputParams.nativeEncoderIds.length);
        int i = 0;
        while (i < nativeSimulcastEncoderOutputParams.nativeEncoderIds.length) {
            EncoderConfigurationOutputParams encoderConfigurationOutputParams = new EncoderConfigurationOutputParams();
            if (this.n.getEncoderConfig(nativeSimulcastEncoderOutputParams.nativeEncoderIds[i], encoderConfigurationOutputParams)) {
                Object obj3;
                if (!(obj2 == null || this.c || this.o != 1)) {
                    iuc iuc = new iuc(encoderConfigurationOutputParams.width, encoderConfigurationOutputParams.height);
                    if (encoderConfigurationOutputParams.targetBitRate <= HttpStatusCodes.STATUS_CODE_MULTIPLE_CHOICES) {
                        iuc = iuc.a(iuc, 76800);
                    } else if (encoderConfigurationOutputParams.targetBitRate <= 1500) {
                        iuc = iuc.a(iuc, 307200);
                    }
                    encoderConfigurationOutputParams.width = iuc.a;
                    encoderConfigurationOutputParams.height = iuc.b;
                }
                if (encoderConfigurationOutputParams.width >= encoderConfigurationOutputParams.height) {
                    obj3 = 1;
                } else {
                    obj3 = null;
                }
                if (obj != obj3) {
                    int i2 = encoderConfigurationOutputParams.width;
                    encoderConfigurationOutputParams.width = encoderConfigurationOutputParams.height;
                    encoderConfigurationOutputParams.height = i2;
                }
                arrayList.add(encoderConfigurationOutputParams);
                i++;
            } else {
                itx.a(5, "vclib", "Native encoder reset in the middle of a fetch operation.");
                return null;
            }
        }
        Collections.sort(arrayList, new ims(this));
        return arrayList;
    }

    public void f() {
        this.g.removeCallbacks(this.w);
        this.g.removeCallbacks(this.l);
        List arrayList = new ArrayList();
        synchronized (this.q) {
            arrayList.addAll(this.a);
            this.a.clear();
        }
        a(arrayList);
    }

    public void g() {
        this.e = true;
        f();
        List e = e();
        if (e == null) {
            this.d = false;
            this.g.postDelayed(this.w, 200);
            return;
        }
        ArrayList arrayList = new ArrayList();
        int i = -1;
        int i2 = 0;
        while (i2 < e.size()) {
            int i3;
            imj imk;
            EncoderConfigurationOutputParams encoderConfigurationOutputParams = (EncoderConfigurationOutputParams) e.get(i2);
            int i4 = encoderConfigurationOutputParams.width;
            int i5 = encoderConfigurationOutputParams.height;
            if (i != -1) {
                i3 = i;
            } else if (encoderConfigurationOutputParams.codecType == 1) {
                i3 = 16;
            } else {
                i3 = 2;
            }
            if (i3 > 0) {
                i4 &= (i3 - 1) ^ -1;
                i5 &= (i3 - 1) ^ -1;
                i3 <<= 1;
            }
            if (VERSION.SDK_INT < 21) {
                imk = new imk(this.m, this.b.b(), encoderConfigurationOutputParams.nativeEncoderId, encoderConfigurationOutputParams.codecType, encoderConfigurationOutputParams.width, encoderConfigurationOutputParams.height, i4, i5, this.p, this.g);
            } else {
                ikz ikz = null;
                if (this.v) {
                    iuc iuc = new iuc(i4, i5);
                    ikz ikz2 = (ikz) this.i.remove(iuc);
                    if (ikz2 == null) {
                        itx.a("vclib", "Creating persistent input surface for size: %s x %s.", Integer.valueOf(iuc.a), Integer.valueOf(iuc.b));
                        ikz2 = new ikz(this.b.b(), MediaCodec.createPersistentInputSurface());
                    }
                    this.j.put(iuc, ikz2);
                    iil.b("Expected non-null", (Object) ikz2);
                    ikz = ikz2;
                }
                imk = new imm(this.m, this.b.b(), encoderConfigurationOutputParams.nativeEncoderId, encoderConfigurationOutputParams.codecType, encoderConfigurationOutputParams.width, encoderConfigurationOutputParams.height, i4, i5, this.p, ikz, encoderConfigurationOutputParams.temporalLayerCount);
            }
            if (imk.b(encoderConfigurationOutputParams.targetBitRate)) {
                arrayList.add(imk);
                i2++;
                i = i3;
            } else {
                arrayList.add(imk);
                a((List) arrayList);
                a(encoderConfigurationOutputParams.nativeEncoderId);
                return;
            }
        }
        synchronized (this.q) {
            this.a.addAll(arrayList);
            this.d = true;
        }
        this.g.postDelayed(this.l, 200);
    }

    public void c() {
        this.g.postAtFrontOfQueue(new imt(this));
        this.u.quitSafely();
    }

    private void a(List<imj> list) {
        if (!list.isEmpty()) {
            List arrayList = new ArrayList();
            for (imj imj : list) {
                if (imj != null) {
                    ikz o = imj.o();
                    if (o != null) {
                        iuc iuc = new iuc(imj.j(), imj.k());
                        ikz ikz = (ikz) this.j.remove(iuc);
                        if (ikz != null) {
                            itx.a("vclib", "Moving surface of size: %s x %s to be available for reuse.", Integer.valueOf(iuc.a), Integer.valueOf(iuc.b));
                            this.i.put(iuc, ikz);
                        } else {
                            itx.a("vclib", "Releasing surface of size: %s x %s.", Integer.valueOf(iuc.a), Integer.valueOf(iuc.b));
                            arrayList.add(o);
                        }
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                this.b.a(new imu(this, arrayList));
            }
        }
    }
}
