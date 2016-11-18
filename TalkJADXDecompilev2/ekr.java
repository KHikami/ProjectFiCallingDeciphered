package defpackage;

import android.database.Cursor;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.ListView;
import com.google.android.apps.hangouts.phone.DebugActivity;

public final class ekr implements OnItemClickListener {
    final /* synthetic */ Cursor a;
    final /* synthetic */ DebugActivity b;

    public ekr(DebugActivity debugActivity, Cursor cursor) {
        this.b = debugActivity;
        this.a = cursor;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.a.moveToPosition(i);
        String string = this.a.getString(this.a.getColumnIndex("conversation_id"));
        DebugActivity debugActivity = this.b;
        String str = "conversations";
        Cursor a = debugActivity.c.e().a(str, null, "conversation_id=?", new String[]{string}, null, null, "sort_timestamp DESC");
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
        ((ListView) inflate.findViewById(16908298)).setAdapter(debugActivity.a(a));
        debugActivity.a(inflate, a, null);
    }
}
