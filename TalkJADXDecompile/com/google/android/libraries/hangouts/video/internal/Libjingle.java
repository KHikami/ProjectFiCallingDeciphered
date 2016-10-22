package com.google.android.libraries.hangouts.video.internal;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.google.android.apps.common.proguard.UsedByNative;
import gwb;
import iil;
import iks;
import iln;
import itf;
import itx;
import iud;
import java.lang.ref.WeakReference;
import java.util.Locale;
import wi;

@UsedByNative
public class Libjingle {
    private final Context a;
    private final Handler b;
    private boolean c;
    private boolean d;
    private iln e;
    @UsedByNative
    private long mNativeContext;

    public static native void nativeAbort(String str);

    private static final native void nativeAddLogComment(String str);

    private final native void nativeBlockMedia(String str);

    private final native void nativeCallHangout(String str, int i, byte[] bArr, String str2);

    private final native void nativeEndCall();

    private final native void nativeEndCallAndSignOut();

    private final native void nativeFinalize();

    private static native void nativeInit();

    private final native void nativeInvitePstn(String str, String str2, boolean z, boolean z2, boolean z3, byte[] bArr);

    private final native void nativeInviteUsers(boolean z, String[] strArr, int i, boolean z2, boolean z3, String str);

    private final native void nativePlayoutMute(boolean z);

    private final native void nativePublishAudioMuteState(boolean z);

    private final native void nativePublishVideoMuteState(boolean z);

    private final native void nativeRelease();

    private final native void nativeRemoteMute(String str);

    private final native void nativeRequestVideoViews(VideoViewRequest[] videoViewRequestArr);

    private final native void nativeSendDtmf(char c, int i, String str);

    private final native void nativeSetGServicesOverride(String str, String str2);

    private final native void nativeSetHangoutCookie(byte[] bArr);

    private static final native void nativeSetLoggingLevel(int i);

    private final native void nativeSetRtcClient(byte[] bArr);

    private final native void nativeSetVideoCallOptions(byte[] bArr);

    private final native void nativeSetup(Object obj, Object obj2, String str, String str2, String str3, int i, int i2, boolean z);

    private final native void nativeSignIn(String str, String str2, String str3, String str4, String str5, String str6, long j, long j2);

    public final native void handleApiaryResponse(long j, byte[] bArr);

    public final native void handlePushNotification(byte[] bArr);

    static {
        int i = 5;
        try {
            System.loadLibrary("videochat_jni");
        } catch (Throwable e) {
            itx.a(5, "vclib", "Unable to load videochat_jni.so with error", e);
            System.loadLibrary("videochat_jni_symbolized");
        }
        nativeInit();
        int i2 = itx.b;
        if (i2 != 4) {
            i = i2;
        }
        nativeSetLoggingLevel(i);
    }

    public static void a() {
    }

    public Libjingle(Context context, Handler handler, iln iln) {
        this.a = context;
        this.b = handler;
        this.e = iln;
    }

    private static int d(String str) {
        if (Log.isLoggable(str, 2)) {
            return 1;
        }
        if (Log.isLoggable(str, 3)) {
            return 2;
        }
        if (Log.isLoggable(str, 4)) {
            return 3;
        }
        return 4;
    }

    private static int b(int i) {
        switch (i) {
            case wi.j /*1*/:
            case wi.l /*2*/:
                return i - 1;
            default:
                return i;
        }
    }

    public void a(String str, String[][] strArr, String str2) {
        if (this.c) {
            itx.a(3, "vclib", "init: already initialized");
            return;
        }
        this.c = true;
        for (String[] strArr2 : strArr) {
            String str3 = strArr2[0];
            String str4 = strArr2[1];
            if ("USE_DEFAULT_NETWORKS_ONLY".equals(str4)) {
                int a = this.e.a(str3, 1);
                if ((a == 1 && !gwb.as()) || a == 2) {
                    nativeSetGServicesOverride("USE_DEFAULT_NETWORKS_ONLY", "true");
                }
            } else {
                str3 = this.e.a(str3);
                if (str3 != null) {
                    nativeSetGServicesOverride(str4, str3);
                }
            }
        }
        iud a2 = iks.a(0);
        nativeSetGServicesOverride("VIDEO_DECODE_MAX_WIDTH", Integer.toString(a2.a().a));
        nativeSetGServicesOverride("VIDEO_DECODE_MAX_HEIGHT", Integer.toString(a2.a().b));
        nativeSetGServicesOverride("VIDEO_DECODE_MAX_FRAMERATE", Integer.toString(a2.c()));
        itx.a(3, "vclib", "init: call nativeSetup");
        int b = b(d("vclib:videoLogging"));
        int b2 = b(d("vclib:audioLogging"));
        String language = Locale.getDefault().getLanguage();
        if (language == null) {
            language = "en";
        }
        String str5 = "Product: ";
        String valueOf = String.valueOf(Build.PRODUCT);
        if (valueOf.length() != 0) {
            valueOf = str5.concat(valueOf);
        } else {
            valueOf = new String(str5);
        }
        itx.a(3, "vclib", valueOf);
        nativeSetup(this.a, new WeakReference(this), str, language, str2, b, b2, gwb.at());
        itx.a(3, "vclib", "init: nativeSetup returned");
        if (this.d) {
            e(true);
            this.d = false;
        }
    }

    public void b() {
        if (this.c) {
            this.c = false;
            itx.a(3, "vclib", "Release: call nativeRelease");
            nativeRelease();
            return;
        }
        itx.a(5, "vclib", "release: not initialized");
    }

    public boolean c() {
        return this.c;
    }

    protected void finalize() {
        nativeFinalize();
    }

    public void a(byte[] bArr) {
        nativeSetVideoCallOptions(bArr);
    }

    public void b(byte[] bArr) {
        nativeSetRtcClient(bArr);
    }

    public void a(boolean z) {
        nativeSetGServicesOverride("ENABLE_NOISE_SUPPRESSION", z ? "true" : "false");
    }

    public void b(boolean z) {
        nativeSetGServicesOverride("ENABLE_ECHO_CANCELLATION", z ? "true" : "false");
    }

    public void c(boolean z) {
        nativeSetGServicesOverride("ENABLE_AUTO_GAIN_CONTROL", z ? "true" : "false");
    }

    public void a(int i) {
        nativeSetGServicesOverride("AUDIO_RECORDING_DEVICE", Integer.toString(7));
    }

    public void a(itf itf, String str) {
        int i;
        int i2 = 0;
        int i3 = (itf.t() ? 1 : 0) | 0;
        if (itf.v()) {
            i = 2;
        } else {
            i = 0;
        }
        i |= i3;
        if (itf.w()) {
            i2 = 4;
        }
        i |= i2;
        iil.a("Expected condition to be true", this.c);
        nativeCallHangout(str, i, itf.x(), itf.g());
    }

    public void a(VideoViewRequest[] videoViewRequestArr) {
        if (this.c) {
            nativeRequestVideoViews(videoViewRequestArr);
        } else {
            itx.a(5, "vclib", "requestVideoViews: not initialized");
        }
    }

    public void d(boolean z) {
        if (this.c) {
            nativePublishAudioMuteState(z);
        } else {
            itx.a(5, "vclib", "publishAudioMuteState: not initialized");
        }
    }

    public void a(String str) {
        if (this.c) {
            nativeRemoteMute(str);
        } else {
            itx.a(5, "vclib", "remoteMute: not initialized");
        }
    }

    public void e(boolean z) {
        if (this.c) {
            nativePlayoutMute(z);
            return;
        }
        itx.a(5, "vclib", "setAudioPlayoutMute: not initialized, will apply on initialization");
        this.d = z;
    }

    public void f(boolean z) {
        if (this.c) {
            nativePublishVideoMuteState(z);
        } else {
            itx.a(5, "vclib", "publishVideoMuteState: not initialized");
        }
    }

    public void b(String str) {
        if (this.c) {
            nativeBlockMedia(str);
        } else {
            itx.a(5, "vclib", "blockMedia: not initialized");
        }
    }

    public void a(itf itf, long j, long j2) {
        if (this.c) {
            nativeSignIn(itf.a(), itf.r(), itf.f(), itf.q(), itf.p(), itf.b(), j, j2);
        } else {
            itx.a(5, "vclib", "signIn: not initialized");
        }
    }

    public void d() {
        if (this.c) {
            nativeEndCallAndSignOut();
        } else {
            itx.a(5, "vclib", "endCallAndSignOut: not initialized");
        }
    }

    public void e() {
        if (this.c) {
            nativeEndCall();
        } else {
            itx.a(5, "vclib", "terminateCall: not initialized");
        }
    }

    public void a(boolean z, String[] strArr, int i, boolean z2, boolean z3, String str) {
        boolean z4 = true;
        if (!(i == 0 || i == 1)) {
            z4 = false;
        }
        iil.a("Expected condition to be true", z4);
        if (this.c) {
            nativeInviteUsers(z, strArr, i, z2, z3, str);
        } else {
            itx.a(5, "vclib", "inviteUsers: not initialized");
        }
    }

    public void a(String str, String str2, boolean z, boolean z2, boolean z3, byte[] bArr) {
        if (this.c) {
            nativeInvitePstn(str, str2, z, z2, z3, bArr);
        } else {
            itx.a(5, "vclib", "invitePstn: not initialized");
        }
    }

    public void a(char c, int i, String str) {
        if (this.c) {
            nativeSendDtmf(c, i, str);
        } else {
            itx.a(5, "vclib", "sendDtmf: not initialized");
        }
    }

    public void c(String str) {
        nativeAddLogComment(str);
    }

    @UsedByNative
    private static void dispatchNativeEvent(Object obj, int i, int i2, int i3, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        Libjingle libjingle = (Libjingle) ((WeakReference) obj).get();
        if (libjingle == null || libjingle.mNativeContext == 0) {
            itx.b("vclib", "Dropping libjingle native message (id=%d) because the native client is being released.", Integer.valueOf(i));
            return;
        }
        Message obtainMessage = libjingle.b.obtainMessage(i, i2, i3, obj7);
        Bundle bundle = new Bundle(2);
        bundle.putString("str1", (String) obj2);
        bundle.putString("str2", (String) obj3);
        bundle.putString("str3", (String) obj4);
        bundle.putString("str4", (String) obj5);
        bundle.putString("str5", (String) obj6);
        obtainMessage.setData(bundle);
        libjingle.b.sendMessage(obtainMessage);
    }
}
