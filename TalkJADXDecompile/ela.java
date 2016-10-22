import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import com.google.android.apps.hangouts.phone.DebugActivity;

public final class ela implements OnCheckedChangeListener {
    final /* synthetic */ DebugActivity a;

    ela(DebugActivity debugActivity) {
        this.a = debugActivity;
    }

    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        bkq.b(this.a.getApplicationContext(), this.a.g.g(), "DEBUG_RTCS", z ? 1 : 0);
        this.a.h = z;
    }
}
