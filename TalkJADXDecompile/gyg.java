import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;

public final class gyg implements OnClickListener {
    final /* synthetic */ Context a;
    final /* synthetic */ int b;

    public gyg(Context context, int i) {
        this.a = context;
        this.b = i;
    }

    public void onClick(View view) {
        this.a.startActivity(gtt.a(this.b));
    }
}
