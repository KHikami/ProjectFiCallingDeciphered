import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

final class jwc implements OnClickListener {
    final /* synthetic */ jwb a;

    jwc(jwb jwb) {
        this.a = jwb;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.a = i;
        this.a.onClick(dialogInterface, -1);
        dialogInterface.dismiss();
    }
}
