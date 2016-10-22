import android.hardware.Camera;
import android.hardware.Camera.PictureCallback;
import com.google.android.apps.hangouts.conversation.v2.livecamerapicker.impl.CameraPickerFragment;

public final class clc implements PictureCallback {
    final /* synthetic */ CameraPickerFragment a;

    clc(CameraPickerFragment cameraPickerFragment) {
        this.a = cameraPickerFragment;
    }

    public void onPictureTaken(byte[] bArr, Camera camera) {
        this.a.al = bArr;
        this.a.i.setVisibility(0);
    }
}
