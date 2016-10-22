package defpackage;

import android.text.Editable;
import android.text.method.DialerKeyListener;
import android.view.KeyEvent;
import android.view.View;
import com.android.incallui.DialpadFragment;

/* compiled from: PG */
/* renamed from: bbn */
public final class bbn extends DialerKeyListener {
    private char[] a;
    private /* synthetic */ DialpadFragment b;

    public bbn(DialpadFragment dialpadFragment) {
        this.b = dialpadFragment;
        this.a = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '#', '*'};
    }

    protected final char[] getAcceptedChars() {
        return this.a;
    }

    public final boolean backspace(View view, Editable editable, int i, KeyEvent keyEvent) {
        return false;
    }

    public final boolean onKeyDown(View view, Editable editable, int i, KeyEvent keyEvent) {
        char lookup = (char) lookup(keyEvent, editable);
        if (keyEvent.getRepeatCount() != 0 || !super.onKeyDown(view, editable, i, keyEvent)) {
            return false;
        }
        if (bbn.ok(getAcceptedChars(), lookup)) {
            bdf.a((Object) this, "DTMFKeyListener reading '" + lookup + "' from input.");
            ((bbo) this.b.e).a(lookup);
        } else {
            bdf.a((Object) this, "DTMFKeyListener rejecting '" + lookup + "' from input.");
        }
        return true;
    }

    public final boolean onKeyUp(View view, Editable editable, int i, KeyEvent keyEvent) {
        super.onKeyUp(view, editable, i, keyEvent);
        char lookup = (char) lookup(keyEvent, editable);
        if (!bbn.ok(getAcceptedChars(), lookup)) {
            return false;
        }
        bdf.a((Object) this, "Stopping the tone for '" + lookup + "'");
        ((bbo) this.b.e).a();
        return true;
    }

    public final boolean a(KeyEvent keyEvent) {
        char c = c(keyEvent);
        bdf.a((Object) this, "DTMFKeyListener.onKeyDown: event '" + c + "'");
        if (keyEvent.getRepeatCount() == 0 && c != '\u0000') {
            if (bbn.ok(getAcceptedChars(), c)) {
                bdf.a((Object) this, "DTMFKeyListener reading '" + c + "' from input.");
                ((bbo) this.b.e).a(c);
                return true;
            }
            bdf.a((Object) this, "DTMFKeyListener rejecting '" + c + "' from input.");
        }
        return false;
    }

    public final boolean b(KeyEvent keyEvent) {
        if (keyEvent == null) {
            return true;
        }
        char c = c(keyEvent);
        bdf.a((Object) this, "DTMFKeyListener.onKeyUp: event '" + c + "'");
        if (!bbn.ok(getAcceptedChars(), c)) {
            return false;
        }
        bdf.a((Object) this, "Stopping the tone for '" + c + "'");
        ((bbo) this.b.e).a();
        return true;
    }

    private final char c(KeyEvent keyEvent) {
        int i;
        int metaState = keyEvent.getMetaState();
        char number = keyEvent.getNumber();
        if ((metaState & 3) != 0 || number == '\u0000') {
            char match = keyEvent.getMatch(getAcceptedChars(), metaState);
            if (match == '\u0000') {
                match = number;
            }
            i = match;
        }
        return (char) i;
    }
}
