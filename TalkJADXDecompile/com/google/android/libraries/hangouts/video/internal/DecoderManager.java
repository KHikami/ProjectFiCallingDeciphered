package com.google.android.libraries.hangouts.video.internal;

import android.content.Context;
import android.os.Build.VERSION;
import com.google.android.apps.common.proguard.UsedByNative;
import icb;
import ime;
import imf;
import imh;
import imx;
import java.nio.ByteBuffer;

@UsedByNative
public final class DecoderManager {
    private final Context a;
    private int b;
    @UsedByNative
    private long nativeContext;

    private final native void nativeInit();

    private final native void nativeRelease();

    private final native boolean setSupportedCodecs(int i);

    native boolean consumeNextEncodedFrame(int i, long j, ByteBuffer byteBuffer);

    native boolean frameDecoded(int i, long j, int i2, int i3);

    native int getCodecType(int i);

    native boolean getNextEncodedFrameMetadata(int i, boolean z, Object obj);

    native boolean notifyHardwareFailed(int i);

    native boolean notifyResolutionNotSupported(int i, int i2, int i3);

    public DecoderManager(Context context) {
        this.b = -1;
        this.a = context;
        nativeInit();
        setSupportedCodecs(d());
    }

    public void a() {
        nativeRelease();
    }

    public long b() {
        return this.nativeContext;
    }

    public void a(int i) {
        this.b = -3;
        setSupportedCodecs(d());
    }

    private int d() {
        int a = imx.a(this.a, false);
        if (this.b != -1) {
            return a & this.b;
        }
        return a;
    }

    public boolean c() {
        return icb.a(this.a.getContentResolver(), "babel_hangout_hardware_decode_supports_dynamic_resolution_changes", VERSION.SDK_INT >= 21);
    }

    public MediaCodecDecoder a(ime ime) {
        if (imx.a(this.a, false) == 0) {
            return null;
        }
        if (VERSION.SDK_INT < 21) {
            return new imf(this, ime);
        }
        return new imh(this, ime);
    }
}
