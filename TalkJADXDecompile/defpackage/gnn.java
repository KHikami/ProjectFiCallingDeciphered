package defpackage;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import com.google.android.apps.hangouts.fragments.ConversationListFragment;
import com.google.android.apps.hangouts.views.ConversationListItemView;
import com.google.android.apps.hangouts.views.ConversationListItemWrapper;
import java.util.LinkedHashMap;
import ql;
import qm;

/* renamed from: gnn */
public final class gnn extends lt {
    private static LinkedHashMap<Integer, qm> c;
    ConversationListFragment a;

    public gnn(ConversationListFragment conversationListFragment, ConversationListItemWrapper conversationListItemWrapper) {
        this.a = conversationListFragment;
        if (c == null) {
            c = new LinkedHashMap();
            Resources resources = conversationListItemWrapper.getResources();
            c.put(Integer.valueOf(ba.ey), new qm(ba.ey, resources.getText(bc.iX)));
            c.put(Integer.valueOf(ba.eC), new qm(ba.eC, resources.getText(bc.ja)));
            c.put(Integer.valueOf(ba.et), new qm(ba.et, resources.getText(bc.iK)));
            c.put(Integer.valueOf(ba.eB), new qm(ba.eB, resources.getText(bc.iZ)));
            c.put(Integer.valueOf(ba.ex), new qm(ba.ex, resources.getText(bc.iV)));
            c.put(Integer.valueOf(ba.eu), new qm(ba.eu, resources.getText(bc.iL)));
        }
    }

    public void a(View view, ql qlVar) {
        super.a(view, qlVar);
        ba.a(this.a);
        qlVar.a(qm.e);
        qlVar.a(qm.f);
        for (qm qmVar : c.values()) {
            if (this.a.a(view, qmVar.a())) {
                qlVar.a(qmVar);
            }
        }
    }

    public boolean a(View view, int i, Bundle bundle) {
        ba.a(this.a);
        if (view instanceof ConversationListItemWrapper) {
            ConversationListItemWrapper conversationListItemWrapper = (ConversationListItemWrapper) view;
            if (c.containsKey(Integer.valueOf(i))) {
                this.a.a(i, ((ConversationListItemView) conversationListItemWrapper.e()).r());
                return true;
            }
        }
        return super.a(view, i, bundle);
    }
}
