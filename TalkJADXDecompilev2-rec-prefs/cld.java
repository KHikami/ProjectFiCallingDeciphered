package p000;

import android.graphics.SurfaceTexture;
import android.view.TextureView.SurfaceTextureListener;
import com.google.android.apps.hangouts.conversation.v2.livecamerapicker.impl.CameraPickerFragment;

public final class cld implements SurfaceTextureListener {
    final /* synthetic */ CameraPickerFragment f5542a;

    public cld(CameraPickerFragment cameraPickerFragment) {
        this.f5542a = cameraPickerFragment;
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        this.f5542a.f6104d = i;
        this.f5542a.f6105e = i2;
        this.f5542a.f6106f = true;
        this.f5542a.f6103c = surfaceTexture;
        this.f5542a.m8363e();
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        this.f5542a.f6104d = i;
        this.f5542a.f6105e = i2;
        this.f5542a.f6106f = true;
        this.f5542a.m8362d();
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.f5542a.f6101a.stopPreview();
        this.f5542a.f6101a.release();
        this.f5542a.f6101a = null;
        this.f5542a.f6106f = false;
        this.f5542a.f6103c = null;
        return true;
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
