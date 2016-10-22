import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;

final class adf implements OnItemSelectedListener {
    final /* synthetic */ add a;

    adf(add add) {
        this.a = add;
    }

    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        if (i != -1) {
            acj acj = this.a.d;
            if (acj != null) {
                acj.a(false);
            }
        }
    }

    public void onNothingSelected(AdapterView<?> adapterView) {
    }
}
