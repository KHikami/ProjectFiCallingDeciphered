package p000;

import android.database.Cursor;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.ListView;
import com.google.android.apps.hangouts.phone.DebugActivity;

public final class ekr implements OnItemClickListener {
    final /* synthetic */ Cursor f11775a;
    final /* synthetic */ DebugActivity f11776b;

    public ekr(DebugActivity debugActivity, Cursor cursor) {
        this.f11776b = debugActivity;
        this.f11775a = cursor;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f11775a.moveToPosition(i);
        String string = this.f11775a.getString(this.f11775a.getColumnIndex("conversation_id"));
        DebugActivity debugActivity = this.f11776b;
        String str = "conversations";
        Cursor a = debugActivity.f6666c.m6044e().m6200a(str, null, "conversation_id=?", new String[]{string}, null, null, "sort_timestamp DESC");
        View inflate = debugActivity.getLayoutInflater().inflate(gwb.gn, null);
        Button button = (Button) inflate.findViewById(ba.fg);
        Button button2 = (Button) inflate.findViewById(ba.fi);
        Button button3 = (Button) inflate.findViewById(ba.fh);
        if ("conversations_view".equals(str)) {
            button.setText("switch to conversation view");
            button.setVisibility(0);
            button.setOnClickListener(new ekm(debugActivity, string));
        }
        button2.setText("show participants");
        button2.setVisibility(0);
        button2.setOnClickListener(new ekn(debugActivity, string, button3, button2, button));
        button3.setText("show messages");
        button3.setVisibility(0);
        button3.setOnClickListener(new ekk(debugActivity, string, button3, button2, button));
        ((ListView) inflate.findViewById(16908298)).setAdapter(debugActivity.m8915a(a));
        debugActivity.m8919a(inflate, a, null);
    }
}
