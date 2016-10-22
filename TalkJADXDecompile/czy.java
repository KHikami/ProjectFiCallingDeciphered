import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.apps.hangouts.fragments.CallContactPickerFragment;

public final class czy implements OnClickListener {
    final /* synthetic */ CallContactPickerFragment a;

    public czy(CallContactPickerFragment callContactPickerFragment) {
        this.a = callContactPickerFragment;
    }

    public void onClick(View view) {
        if (this.a.getActivity() != null) {
            this.a.a(1, true);
        }
    }
}
