package com.google.android.libraries.hangouts.video.internal;

import android.content.Context;
import com.google.android.apps.common.proguard.UsedByNative;
import icb;
import ijn;
import ikt;
import ila;
import ilb;
import imx;
import java.nio.ByteBuffer;
import wi;

public final class EncoderManager {
    private final Context a;
    private int b;
    @UsedByNative
    private long nativeContext;

    private final native void nativeInit();

    private final native void nativeRelease();

    private final native boolean setSupportedCodecs(int i);

    native boolean getEncoderConfig(long j, Object obj);

    native boolean getNativeSimulcastEncoderIds(Object obj);

    native boolean notifyHardwareFailed(long j);

    public native int sendEncodedFrame(long j, long j2, ByteBuffer byteBuffer, int i, int i2, int i3, int i4, int i5, boolean z);

    public EncoderManager(Context context) {
        this.b = -1;
        this.a = context;
        nativeInit();
        setSupportedCodecs(c());
    }

    public ila a(ijn ijn, ilb ilb) {
        boolean z;
        if (c() != 0) {
            z = true;
        } else {
            z = false;
        }
        return new ikt(ijn, z, ilb, icb.a(this.a.getContentResolver(), "babel_hangout_encoder_quality_scaling_mode", 0), icb.a(this.a.getContentResolver(), "babel_hangout_max_outstanding_encoder_frames", 0));
    }

    public void a(int i) {
        this.b = -3;
        setSupportedCodecs(c());
    }

    private int c() {
        int a = imx.a(this.a, true);
        if (this.b != -1) {
            return a & this.b;
        }
        return a;
    }

    public void a() {
        nativeRelease();
    }

    public long b() {
        return this.nativeContext;
    }

    public static boolean a(Context context, int i) {
        int a = imx.a(context, true);
        switch (i) {
            case wi.w /*0*/:
                if ((a & 1) == 0) {
                    return false;
                }
                return true;
            case wi.j /*1*/:
                if ((a & 2) == 0) {
                    return false;
                }
                return true;
            default:
                return false;
        }
    }
}
