import android.app.Dialog;
import android.view.View;
import android.view.View.OnClickListener;

final class fcq implements OnClickListener {
    final /* synthetic */ Dialog a;

    fcq(Dialog dialog) {
        this.a = dialog;
    }

    public void onClick(View view) {
        this.a.cancel();
    }
}
