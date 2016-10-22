import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.os.Bundle;

public final class bqw extends da {
    Dialog W;
    OnCancelListener X;

    public bqw() {
        this.W = null;
        this.X = null;
    }

    public final void a(dl dlVar, String str) {
        super.a(dlVar, str);
    }

    public final Dialog c(Bundle bundle) {
        if (this.W == null) {
            this.a = false;
        }
        return this.W;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        if (this.X != null) {
            this.X.onCancel(dialogInterface);
        }
    }
}
