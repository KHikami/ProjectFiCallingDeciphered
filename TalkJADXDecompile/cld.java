import android.graphics.SurfaceTexture;
import android.view.TextureView.SurfaceTextureListener;
import com.google.android.apps.hangouts.conversation.v2.livecamerapicker.impl.CameraPickerFragment;

public final class cld implements SurfaceTextureListener {
    final /* synthetic */ CameraPickerFragment a;

    public cld(CameraPickerFragment cameraPickerFragment) {
        this.a = cameraPickerFragment;
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        this.a.d = i;
        this.a.e = i2;
        this.a.f = true;
        this.a.c = surfaceTexture;
        this.a.e();
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        this.a.d = i;
        this.a.e = i2;
        this.a.f = true;
        this.a.d();
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.a.a.stopPreview();
        this.a.a.release();
        this.a.a = null;
        this.a.f = false;
        this.a.c = null;
        return true;
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
