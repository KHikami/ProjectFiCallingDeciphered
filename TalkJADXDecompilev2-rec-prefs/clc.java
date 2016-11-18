package p000;

import android.hardware.Camera;
import android.hardware.Camera.PictureCallback;
import com.google.android.apps.hangouts.conversation.v2.livecamerapicker.impl.CameraPickerFragment;

public final class clc implements PictureCallback {
    final /* synthetic */ CameraPickerFragment f5541a;

    clc(CameraPickerFragment cameraPickerFragment) {
        this.f5541a = cameraPickerFragment;
    }

    public void onPictureTaken(byte[] bArr, Camera camera) {
        this.f5541a.al = bArr;
        this.f5541a.f6109i.setVisibility(0);
    }
}
