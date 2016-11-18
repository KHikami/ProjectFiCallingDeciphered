package defpackage;

import android.content.Context;
import android.media.MediaCodecInfo;
import android.media.MediaCodecInfo.CodecCapabilities;
import android.media.MediaCodecInfo.VideoCapabilities;
import android.media.MediaCodecList;
import android.os.Build.VERSION;

public final class imx {
    static ilo a = new ilo();
    private static final String[] b = new String[]{"OMX.google.", "OMX.SEC.", "OMX.Intel.VideoEncoder.VP8"};

    public static int a(Context context, boolean z) {
        int i = 0;
        if (imx.a(context, "video/x-vnd.on2.vp8", z)) {
            i = 1;
        }
        if (imx.a(context, "video/avc", z)) {
            return i | 2;
        }
        return i;
    }

    public static boolean a(Context context, String str, boolean z) {
        if (VERSION.SDK_INT < 18) {
            return false;
        }
        String str2;
        boolean z2;
        if (z) {
            if (VERSION.SDK_INT < 19) {
                return false;
            }
            if ("video/x-vnd.on2.vp8".equals(str) && VERSION.SDK_INT < 21) {
                return false;
            }
        }
        iln a = a.a(context.getContentResolver());
        if (z) {
            str2 = "babel_hangout_hardware_encode";
        } else {
            str2 = "babel_hangout_hardware_decode";
        }
        if (a.a(str2, true)) {
            if ("video/x-vnd.on2.vp8".equals(str)) {
                if (z) {
                    str2 = "babel_hangout_vp8_hardware_encode";
                } else {
                    str2 = "babel_hangout_vp8_hardware_decode";
                }
                if (!a.a(str2, true)) {
                    z2 = true;
                }
            } else if ("video/avc".equals(str)) {
                if (z) {
                    str2 = "babel_hangout_h264_hardware_encode2";
                } else {
                    str2 = "babel_hangout_h264_hardware_decode2";
                }
                if (!a.a(str2, true)) {
                    z2 = true;
                }
            }
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            return false;
        }
        return imx.a(a, str, z) != null;
    }

    private static MediaCodecInfo a(iln iln, String str, boolean z) {
        try {
            int codecCount = MediaCodecList.getCodecCount();
            for (int i = 0; i < codecCount; i++) {
                int i2;
                Object obj;
                MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i);
                String[] supportedTypes = codecInfoAt.getSupportedTypes();
                for (String equalsIgnoreCase : supportedTypes) {
                    if (equalsIgnoreCase.equalsIgnoreCase(str)) {
                        obj = 1;
                        break;
                    }
                }
                obj = null;
                if (obj != null && codecInfoAt.isEncoder() == z) {
                    String[] strArr = new String[0];
                    if (iln.a("babel_hangout_allow_software_media_codec", false)) {
                        supportedTypes = strArr;
                    } else {
                        supportedTypes = b;
                    }
                    for (String startsWith : r4) {
                        if (codecInfoAt.getName().startsWith(startsWith)) {
                            obj = null;
                            break;
                        }
                    }
                    if (VERSION.SDK_INT >= 21) {
                        CodecCapabilities capabilitiesForType = codecInfoAt.getCapabilitiesForType(str);
                        if (capabilitiesForType == null) {
                            obj = null;
                        } else {
                            VideoCapabilities videoCapabilities = capabilitiesForType.getVideoCapabilities();
                            if (videoCapabilities == null || !videoCapabilities.areSizeAndRateSupported(1280, 720, 30.0d)) {
                                obj = null;
                            } else {
                                i2 = 1;
                            }
                        }
                        if (obj == null) {
                            obj = null;
                            if (obj != null) {
                                return codecInfoAt;
                            }
                        }
                    }
                    i2 = 1;
                    if (obj != null) {
                        return codecInfoAt;
                    }
                }
            }
        } catch (Throwable e) {
            itx.a("vclib", "Failed to query MediaCodecList:", e);
        }
        return null;
    }
}
