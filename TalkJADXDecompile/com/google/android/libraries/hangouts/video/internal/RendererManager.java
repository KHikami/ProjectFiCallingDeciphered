package com.google.android.libraries.hangouts.video.internal;

import com.google.android.apps.common.proguard.UsedByNative;
import iil;
import ijn;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@UsedByNative
public final class RendererManager {
    private static final Object b;
    private static Map<Integer, Renderer> c;
    private final DecoderManager a;
    @UsedByNative
    private long mNativeContext;

    private final native void nativeInit();

    private final native void nativeRelease();

    final native int getIntParam(int i, String str);

    final native boolean initializeGLContext(int i);

    final native int nativeInstantiateRenderer(int i);

    public final native void notifyFrameRendered(int i);

    public final native void releaseRenderer(int i);

    final native void renderFrame(int i, Object obj, Object obj2);

    final native void setIntParam(int i, String str, int i2);

    static {
        Libjingle.a();
        b = new Object();
    }

    public RendererManager(ijn ijn) {
        nativeInit();
        this.a = ijn.i();
        synchronized (b) {
            c = new HashMap();
        }
    }

    public void a() {
        nativeRelease();
        this.a.a();
        synchronized (b) {
            c = null;
        }
    }

    public long b() {
        return this.mNativeContext;
    }

    public static void a(PrintWriter printWriter) {
        synchronized (b) {
            if (c != null) {
                Iterator it = c.values().iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
        }
    }

    public static void a(Renderer renderer) {
        synchronized (b) {
            if (c != null) {
                c.put(Integer.valueOf(renderer.mRendererID), renderer);
            }
        }
    }

    public static void b(Renderer renderer) {
        synchronized (b) {
            if (c != null) {
                c.remove(Integer.valueOf(renderer.mRendererID));
            }
        }
    }

    public int a(int i) {
        iil.a(i, 0, 3);
        return nativeInstantiateRenderer(i);
    }

    @UsedByNative
    static void notifyFrameReceived(int i) {
        synchronized (b) {
            if (c == null) {
                return;
            }
            Renderer renderer = (Renderer) c.get(Integer.valueOf(i));
            if (renderer != null) {
                renderer.h();
            }
        }
    }
}
