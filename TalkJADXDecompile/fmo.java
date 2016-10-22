import android.content.Context;
import android.widget.TextView;

final class fmo extends TextView {
    final /* synthetic */ fmn a;

    fmo(fmn fmn, Context context) {
        this.a = fmn;
        super(context);
        setText("Map from wakelock id to how long that wakelock has been held. Click a row to see the details of the intent holding the wakelock.");
        setPadding(20, 20, 20, 20);
    }
}
