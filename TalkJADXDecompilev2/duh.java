package defpackage;

import com.google.android.apps.hangouts.fragments.ConversationListFragment;

public class duh {
    public final /* synthetic */ ConversationListFragment a;

    public void a(dug dug) {
        this.a.aj = dug;
        this.a.i.a(true);
    }

    public void b(dug dug) {
        if (this.a.aj == dug) {
            this.a.aj = null;
            this.a.i.a(false);
        }
    }

    public duh(ConversationListFragment conversationListFragment) {
        this.a = conversationListFragment;
    }
}
