import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

public final class bey implements OnClickListener {
    final /* synthetic */ Context a;
    final /* synthetic */ int b;

    public bey(Context context, int i) {
        this.a = context;
        this.b = i;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        eqa eqa = (eqa) jyn.b(this.a, eqa.class);
        if (eqa != null) {
            this.a.startActivity(eqa.a(this.a, this.b, epw.SETTINGS));
        }
    }
}
