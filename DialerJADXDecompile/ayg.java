import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.EditText;

/* compiled from: PG */
final class ayg implements OnClickListener {
    private /* synthetic */ EditText a;
    private /* synthetic */ ayc b;

    ayg(ayc ayc, EditText editText) {
        this.b = ayc;
        this.a = editText;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        String trim = this.a.getText().toString().trim();
        this.b.c();
        ((ayj) this.b.e).a(trim);
    }
}
