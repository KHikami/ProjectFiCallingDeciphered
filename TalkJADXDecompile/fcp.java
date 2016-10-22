import android.app.Dialog;
import android.view.View;
import android.view.View.OnClickListener;

final class fcp implements OnClickListener {
    final /* synthetic */ Dialog a;

    fcp(Dialog dialog) {
        this.a = dialog;
    }

    public void onClick(View view) {
        this.a.cancel();
    }
}
