package p000;

import android.view.Surface;
import com.google.android.libraries.hangouts.video.internal.MediaCodecDecoder;
import com.google.android.libraries.hangouts.video.internal.Renderer;
import com.google.android.libraries.hangouts.video.internal.RendererManager;

public final class imo extends Renderer {
    private final MediaCodecDecoder f18076a;
    private final inj f18077b;

    public imo(RendererManager rendererManager, MediaCodecDecoder mediaCodecDecoder, inj inj) {
        this.mRendererManager = rendererManager;
        this.mRendererID = this.mRendererManager.m10404a(3);
        this.f18076a = mediaCodecDecoder;
        this.f18077b = inj;
        RendererManager.m10401a((Renderer) this);
    }

    public void m22313a(Surface surface, Runnable runnable) {
        this.f18076a.m10373a(surface, runnable);
    }

    public void m22312a() {
        this.mRendererManager.notifyFrameRendered(this.mRendererID);
    }

    public void m22314b() {
        Object[] objArr = new Object[]{this.f18077b.mo3277f(), Integer.valueOf(this.mRendererID)};
        int i = this.mRendererID;
        RendererManager.m10403b(this);
        this.mRendererID = -1;
        this.mRendererManager.releaseRenderer(i);
    }
}
