package p000;

import android.content.res.Resources;
import android.view.accessibility.AccessibilityManager;
import com.google.android.apps.hangouts.elane.StatusOverlay;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class cug {
    final /* synthetic */ StatusOverlay f9098a;

    public void m11027a(Collection<lym> collection) {
        StatusOverlay statusOverlay = this.f9098a;
        int size = collection.size();
        List arrayList = new ArrayList();
        List arrayList2 = new ArrayList();
        for (lym lym : collection) {
            arrayList.add(!lym.f26916k.isEmpty() ? lym.f26916k : lym.f26909d);
            arrayList2.add(gwb.m1603a(lym));
        }
        Resources resources = statusOverlay.f6188d.getResources();
        switch (size) {
            case 0:
                statusOverlay.f6186b.setText(resources.getString(ba.kt));
                break;
            case 1:
                statusOverlay.f6186b.setText(resources.getString(ba.kp, new Object[]{arrayList.get(0)}));
                break;
            case 2:
                statusOverlay.f6186b.setText(resources.getString(ba.kq, new Object[]{arrayList.get(0), arrayList.get(1)}));
                break;
            case 3:
                statusOverlay.f6186b.setText(resources.getString(ba.kr, new Object[]{arrayList.get(0), arrayList.get(1), arrayList.get(2)}));
                break;
            case 4:
                statusOverlay.f6186b.setText(resources.getString(ba.ks, new Object[]{arrayList.get(0), arrayList.get(1), arrayList.get(2), arrayList.get(3)}));
                break;
            default:
                statusOverlay.f6186b.setText(resources.getString(ba.ku, new Object[]{arrayList.get(0), arrayList.get(1), arrayList.get(2), Integer.valueOf(size - 3)}));
                break;
        }
        statusOverlay.m8424a(arrayList2);
        statusOverlay.f6186b.setVisibility(0);
        statusOverlay.f6185a.setVisibility(0);
        statusOverlay.f6187c.setVisibility(0);
        gld.m17933a(statusOverlay.f6187c, (AccessibilityManager) statusOverlay.f6188d.getSystemService("accessibility"), statusOverlay.f6188d.getString(ba.ki));
    }

    public cug(StatusOverlay statusOverlay) {
        this.f9098a = statusOverlay;
    }
}
