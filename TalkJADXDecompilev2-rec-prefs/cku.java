package p000;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.apps.hangouts.conversation.v2.livecamerapicker.impl.CameraPickerFragment;

public final class cku implements OnClickListener {
    final /* synthetic */ CameraPickerFragment f5531a;

    public cku(CameraPickerFragment cameraPickerFragment) {
        this.f5531a = cameraPickerFragment;
    }

    public void onClick(View view) {
        CameraPickerFragment cameraPickerFragment = this.f5531a;
        cameraPickerFragment.mo495a();
        cameraPickerFragment.f6107g.setVisibility(8);
        cameraPickerFragment.f6101a.takePicture(null, null, new clc(cameraPickerFragment));
    }
}
