import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.apps.hangouts.conversation.v2.livecamerapicker.impl.CameraPickerFragment;

public final class cla implements OnClickListener {
    final /* synthetic */ CameraPickerFragment a;

    public cla(CameraPickerFragment cameraPickerFragment) {
        this.a = cameraPickerFragment;
    }

    public void onClick(View view) {
        this.a.aj.setVisibility(8);
        this.a.ak.setVisibility(0);
        this.a.h.setVisibility(0);
        this.a.g.setVisibility(8);
    }
}
