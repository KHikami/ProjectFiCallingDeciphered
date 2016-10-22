package defpackage;

import android.os.AsyncTask;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.apps.hangouts.conversation.v2.livecamerapicker.impl.CameraPickerFragment;

/* renamed from: ckx */
public final class ckx implements OnClickListener {
    final /* synthetic */ CameraPickerFragment a;

    public ckx(CameraPickerFragment cameraPickerFragment) {
        this.a = cameraPickerFragment;
    }

    public void onClick(View view) {
        new cle(this.a).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }
}
