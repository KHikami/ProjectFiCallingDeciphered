import android.database.Cursor;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ListView;
import com.google.android.apps.hangouts.phone.DebugActivity;

public final class ekn implements OnClickListener {
    final /* synthetic */ String a;
    final /* synthetic */ View b;
    final /* synthetic */ View c;
    final /* synthetic */ View d;
    final /* synthetic */ DebugActivity e;

    ekn(DebugActivity debugActivity, String str, View view, View view2, View view3) {
        this.e = debugActivity;
        this.a = str;
        this.b = view;
        this.c = view2;
        this.d = view3;
    }

    public void onClick(View view) {
        Cursor a = this.e.c.e().a("conversation_participants_view", null, "conversation_id=?", new String[]{this.a}, null, null, null);
        View inflate = this.e.getLayoutInflater().inflate(gwb.gn, null);
        this.e.a(inflate, a, new eko(this));
        this.b.setVisibility(8);
        this.c.setVisibility(8);
        this.d.setVisibility(8);
        ListView listView = (ListView) inflate.findViewById(16908298);
        listView.setAdapter(this.e.a(a, new int[]{a.getColumnIndex("full_name")}));
        listView.setOnItemClickListener(new ekq(this.e, a));
    }
}
