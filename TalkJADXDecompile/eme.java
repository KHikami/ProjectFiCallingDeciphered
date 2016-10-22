import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.ArrayAdapter;

final class eme implements OnClickListener {
    final /* synthetic */ ArrayAdapter a;
    final /* synthetic */ elk b;

    eme(elk elk, ArrayAdapter arrayAdapter) {
        this.b = elk;
        this.a = arrayAdapter;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        ((emv) this.a.getItem(i)).a();
    }
}
