import android.view.Surface;
import com.google.android.libraries.hangouts.video.internal.MediaCodecDecoder;
import com.google.android.libraries.hangouts.video.internal.Renderer;
import com.google.android.libraries.hangouts.video.internal.RendererManager;

public final class imo extends Renderer {
    private final MediaCodecDecoder a;
    private final inj b;

    public imo(RendererManager rendererManager, MediaCodecDecoder mediaCodecDecoder, inj inj) {
        this.mRendererManager = rendererManager;
        this.mRendererID = this.mRendererManager.a(3);
        this.a = mediaCodecDecoder;
        this.b = inj;
        RendererManager.a((Renderer) this);
    }

    public void a(Surface surface, Runnable runnable) {
        this.a.a(surface, runnable);
    }

    public void a() {
        this.mRendererManager.notifyFrameRendered(this.mRendererID);
    }

    public void b() {
        Object[] objArr = new Object[]{this.b.f(), Integer.valueOf(this.mRendererID)};
        int i = this.mRendererID;
        RendererManager.b(this);
        this.mRendererID = -1;
        this.mRendererManager.releaseRenderer(i);
    }
}
