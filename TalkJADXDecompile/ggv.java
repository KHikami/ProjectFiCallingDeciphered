import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

final class ggv implements OnItemClickListener {
    final /* synthetic */ ggu a;

    ggv(ggu ggu) {
        this.a = ggu;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.a.a(this.a.getView());
    }
}
