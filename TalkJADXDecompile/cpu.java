import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

final class cpu implements OnClickListener {
    final /* synthetic */ TextView a;

    cpu(TextView textView) {
        this.a = textView;
    }

    public void onClick(View view) {
        this.a.setTextSize(0, Math.min(this.a.getTextSize() + 10.0f, 200.0f));
    }
}
