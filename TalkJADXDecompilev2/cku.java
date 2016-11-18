package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.apps.hangouts.conversation.v2.livecamerapicker.impl.CameraPickerFragment;

public final class cku implements OnClickListener {
    final /* synthetic */ CameraPickerFragment a;

    public cku(CameraPickerFragment cameraPickerFragment) {
        this.a = cameraPickerFragment;
    }

    public void onClick(View view) {
        CameraPickerFragment cameraPickerFragment = this.a;
        cameraPickerFragment.a();
        cameraPickerFragment.g.setVisibility(8);
        cameraPickerFragment.a.takePicture(null, null, new clc(cameraPickerFragment));
    }
}
