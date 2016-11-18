package p000;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.Toast;
import com.google.android.apps.hangouts.phone.DebugActivity;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public final class eks implements OnItemClickListener {
    final /* synthetic */ DebugActivity f11777a;

    eks(DebugActivity debugActivity) {
        this.f11777a = debugActivity;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        Object obj = ((elf) adapterView.getItemAtPosition(i)).f11800b;
        if (obj != null && !obj.getClass().isPrimitive() && !(obj instanceof CharSequence)) {
            View inflate = this.f11777a.getLayoutInflater().inflate(gwb.gn, null);
            ListView listView = (ListView) inflate.findViewById(16908298);
            List arrayList = new ArrayList();
            List arrayList2 = new ArrayList();
            int i2;
            if (obj instanceof List) {
                List list = (List) obj;
                for (i2 = 0; i2 < list.size(); i2++) {
                    arrayList.add(String.valueOf(i2));
                    arrayList2.add(list.get(i2));
                }
            } else {
                for (Field field : obj.getClass().getFields()) {
                    arrayList.add(field.getName());
                    try {
                        arrayList2.add(field.get(obj));
                    } catch (Exception e) {
                        arrayList2.add("???");
                    }
                }
            }
            listView.setAdapter(this.f11777a.m8917a(arrayList, arrayList2));
            listView.setOnItemClickListener(new eks(this.f11777a));
            listView.setOnItemLongClickListener(new ekt(this.f11777a));
            this.f11777a.m8919a(inflate, null, null);
        } else if (obj != null) {
            Toast.makeText(this.f11777a, obj.toString(), 0).show();
        }
    }
}
