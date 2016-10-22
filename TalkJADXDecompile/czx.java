import android.view.View;
import android.view.View.OnLongClickListener;
import com.google.android.apps.hangouts.fragments.CallContactPickerFragment;

public final class czx implements OnLongClickListener {
    final /* synthetic */ CallContactPickerFragment a;

    public czx(CallContactPickerFragment callContactPickerFragment) {
        this.a = callContactPickerFragment;
    }

    public boolean onLongClick(View view) {
        this.a.b.b();
        return true;
    }
}
