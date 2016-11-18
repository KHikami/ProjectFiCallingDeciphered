package p000;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.apps.hangouts.conversation.v2.livecamerapicker.impl.CameraPickerFragment;

public final class cla implements OnClickListener {
    final /* synthetic */ CameraPickerFragment f5539a;

    public cla(CameraPickerFragment cameraPickerFragment) {
        this.f5539a = cameraPickerFragment;
    }

    public void onClick(View view) {
        this.f5539a.aj.setVisibility(8);
        this.f5539a.ak.setVisibility(0);
        this.f5539a.f6108h.setVisibility(0);
        this.f5539a.f6107g.setVisibility(8);
    }
}
