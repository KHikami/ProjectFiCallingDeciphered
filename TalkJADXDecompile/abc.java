import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

final class abc implements OnItemClickListener {
    final /* synthetic */ aay a;
    final /* synthetic */ abb b;

    abc(abb abb, aay aay) {
        this.b = abb;
        this.a = aay;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.b.c.setSelection(i);
        if (this.b.c.getOnItemClickListener() != null) {
            this.b.c.performItemClick(view, i, this.b.a.getItemId(i));
        }
        this.b.c();
    }
}
