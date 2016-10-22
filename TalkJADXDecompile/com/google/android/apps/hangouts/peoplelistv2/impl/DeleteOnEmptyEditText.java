package com.google.android.apps.hangouts.peoplelistv2.impl;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import efr;
import efs;

public class DeleteOnEmptyEditText extends EditText {
    private efs a;

    public DeleteOnEmptyEditText(Context context) {
        super(context);
    }

    public DeleteOnEmptyEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public DeleteOnEmptyEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void a(efs efs) {
        this.a = efs;
    }

    public boolean onCheckIsTextEditor() {
        return true;
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return new efr(this, super.onCreateInputConnection(editorInfo));
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 67) {
            a();
        }
        return super.onKeyDown(i, keyEvent);
    }

    public void a() {
        if (getText().length() == 0 && this.a != null) {
            this.a.a();
        }
    }
}
