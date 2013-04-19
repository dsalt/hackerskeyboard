/*
 * Copyright (C) 2011 Darren Salt
 *
 * Licensed under the Apache License, Version 2.0 (the "Licence"); you may
 * not use this file except in compliance with the Licence. You may obtain
 * a copy of the Licence at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the Licence is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * Licence for the specific language governing permissions and limitations
 * under the Licence.
 */

package org.pocketworkstation.pckeyboard;

import android.inputmethodservice.InputMethodService;
import android.util.Log;
import android.view.inputmethod.EditorInfo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

interface ComposeSequencing {
    public void onText(CharSequence text);
    public void updateShiftKeyState(EditorInfo attr);
    public EditorInfo getCurrentInputEditorInfo();
}

public abstract class ComposeBase {
    private static final String TAG = "HK/ComposeBase";
    
    protected static final Map<String, String> mMap =
    	new HashMap<String, String>();

    protected static final Set<String> mPrefixes =
    	new HashSet<String>();

    protected static String get(String key) {
        if (key == null || key.length() == 0) {
            return null;
        }
        //Log.i(TAG, "ComposeBase get, key=" + showString(key) + " result=" + mMap.get(key));
        return mMap.get(key);
    }

    private static String showString(String in) {
        // TODO Auto-generated method stub
        StringBuilder out = new StringBuilder(in);
        out.append("{");
        for (int i = 0; i < in.length(); ++i) {
            if (i > 0) out.append(",");
            out.append((int) in.charAt(i));
        }
        out.append("}");
        return out.toString();
    }

    private static boolean isValid(String partialKey) {
        if (partialKey == null || partialKey.length() == 0) {
            return false;
        }
        return mPrefixes.contains(partialKey);
    }

    protected static void put(String key, String value) {
    	mMap.put(key, value);
    	for (int i = 1; i < key.length(); ++i) {
    		mPrefixes.add(key.substring(0, i));
    	}
    }

    protected static void puti(String key, String value) {
    	put(key.toLowerCase(), value);
    	put(key.toUpperCase(), value);
    }

    protected StringBuilder composeBuffer = new StringBuilder(10);
    protected ComposeSequencing composeUser;

    protected void init(ComposeSequencing user) {
        clear();
        composeUser = user;
    }

    public void clear() {
        composeBuffer.setLength(0);
    }

    public void bufferKey(char code) {
    	composeBuffer.append(code);
    	//Log.i(TAG, "bufferKey code=" + (int) code + " => " + showString(composeBuffer.toString()));
    }

    // returns true if the compose sequence is valid but incomplete
    public String executeToString(int code) {
        KeyboardSwitcher ks = KeyboardSwitcher.getInstance();
        if (ks.getInputView().isShiftCaps()
                && ks.isAlphabetMode()
                && Character.isLowerCase(code)) {
            code = Character.toUpperCase(code);
        }
        bufferKey((char) code);
        composeUser.updateShiftKeyState(composeUser.getCurrentInputEditorInfo());

        String composed = get(composeBuffer.toString());
        if (composed != null) {
            // If we get here, we have a complete compose sequence
            return composed;
        } else if (!isValid(composeBuffer.toString())) {
            // If we get here, then the sequence typed isn't recognised
            return "";
        }
        return null;
    }

    public boolean execute(int code) {
        String composed = executeToString(code);
        if (composed != null) {
            clear();
            composeUser.onText(composed);
            return false;
        }
        return true;
    }

    public boolean execute(CharSequence sequence) {
        int i, len = sequence.length();
        boolean result = true;
        for (i = 0; i < len; ++i) {
            result = execute(sequence.charAt(i));
        }
        return result; // only last one matters
    }

    // Some convenience aliases for use in compose strings
    protected static final char UP          = (char)LatinKeyboardView.KEYCODE_DPAD_UP;
    protected static final char DOWN        = (char)LatinKeyboardView.KEYCODE_DPAD_DOWN;
    protected static final char LEFT        = (char)LatinKeyboardView.KEYCODE_DPAD_LEFT;
    protected static final char RIGHT       = (char)LatinKeyboardView.KEYCODE_DPAD_RIGHT;
    protected static final char COMPOSE     = (char)LatinKeyboardView.KEYCODE_DPAD_CENTER;
    protected static final char PAGE_UP     = (char)LatinKeyboardView.KEYCODE_PAGE_UP;
    protected static final char PAGE_DOWN   = (char)LatinKeyboardView.KEYCODE_PAGE_DOWN;
    protected static final char ESCAPE      = (char)LatinKeyboardView.KEYCODE_ESCAPE;
    protected static final char DELETE      = (char)LatinKeyboardView.KEYCODE_FORWARD_DEL;
    protected static final char CAPS_LOCK   = (char)LatinKeyboardView.KEYCODE_CAPS_LOCK;
    protected static final char SCROLL_LOCK = (char)LatinKeyboardView.KEYCODE_SCROLL_LOCK;
    protected static final char SYSRQ       = (char)LatinKeyboardView.KEYCODE_SYSRQ;
    protected static final char BREAK       = (char)LatinKeyboardView.KEYCODE_BREAK;
    protected static final char HOME        = (char)LatinKeyboardView.KEYCODE_HOME;
    protected static final char END         = (char)LatinKeyboardView.KEYCODE_END;
    protected static final char INSERT      = (char)LatinKeyboardView.KEYCODE_INSERT;
    protected static final char F1          = (char)LatinKeyboardView.KEYCODE_FKEY_F1;
    protected static final char F2          = (char)LatinKeyboardView.KEYCODE_FKEY_F2;
    protected static final char F3          = (char)LatinKeyboardView.KEYCODE_FKEY_F3;
    protected static final char F4          = (char)LatinKeyboardView.KEYCODE_FKEY_F4;
    protected static final char F5          = (char)LatinKeyboardView.KEYCODE_FKEY_F5;
    protected static final char F6          = (char)LatinKeyboardView.KEYCODE_FKEY_F6;
    protected static final char F7          = (char)LatinKeyboardView.KEYCODE_FKEY_F7;
    protected static final char F8          = (char)LatinKeyboardView.KEYCODE_FKEY_F8;
    protected static final char F9          = (char)LatinKeyboardView.KEYCODE_FKEY_F9;
    protected static final char F10         = (char)LatinKeyboardView.KEYCODE_FKEY_F10;
    protected static final char F11         = (char)LatinKeyboardView.KEYCODE_FKEY_F11;
    protected static final char F12         = (char)LatinKeyboardView.KEYCODE_FKEY_F12;
    protected static final char NUM_LOCK    = (char)LatinKeyboardView.KEYCODE_NUM_LOCK;
    protected static char COMPOSE = (char)LatinKeyboardView.KEYCODE_DPAD_CENTER;
}
