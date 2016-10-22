import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.apps.hangouts.fragments.CallContactPickerFragment;

public final class czv implements OnClickListener {
    final /* synthetic */ CallContactPickerFragment a;

    public czv(CallContactPickerFragment callContactPickerFragment) {
        this.a = callContactPickerFragment;
    }

    public void onClick(View view) {
        this.a.a(1, true);
    }
}
