package org.nyanya.android.traditionalt9;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import android.util.Log;

public class CharMap {
    protected static final AbstractList<Map<Character, Integer>> CHARTABLE = new ArrayList<Map<Character, Integer>>(2);
    static {
        Map<Character, Integer> enMap = new HashMap<Character, Integer>();
        enMap.put('.', 1); enMap.put(',', 1); enMap.put('!', 1); enMap.put('?', 1);
        enMap.put('-', 1); enMap.put('"', 1); enMap.put('\'', 1); enMap.put('@', 1);
        enMap.put('#', 1); enMap.put('$', 1); enMap.put('%', 1); enMap.put('&', 1);
        enMap.put('*', 1); enMap.put('(', 1); enMap.put(')', 1); enMap.put('1', 1);
        enMap.put(':', 1); enMap.put(';', 1); enMap.put('/', 1); enMap.put('\\', 1);
        enMap.put('+', 1); enMap.put('=', 1); enMap.put('<', 1); enMap.put('>', 1);
        enMap.put('[', 1); enMap.put(']', 1); enMap.put('{', 1); enMap.put('}', 1);
        enMap.put('^', 1); enMap.put('|', 1); enMap.put('_', 1); enMap.put('~', 1);
        enMap.put('`', 1);
        enMap.put('a', 2);      enMap.put('\u00e1', 2); enMap.put('\u00e4', 2);
        enMap.put('\u00e2', 2); enMap.put('\u00e0', 2); enMap.put('\u00e5', 2);
        enMap.put('b', 2);      enMap.put('c', 2);      enMap.put('\u00e7', 2);
        enMap.put('2', 2);      enMap.put('d', 3);      enMap.put('e', 3);
        enMap.put('\u00e9', 3); enMap.put('\u00eb', 3); enMap.put('\u00e8', 3);
        enMap.put('\u00ea', 3); enMap.put('f', 3);      enMap.put('3', 3);
        enMap.put('g', 4);      enMap.put('h', 4);      enMap.put('i', 4);
        enMap.put('\u00ed', 4); enMap.put('\u00ef', 4); enMap.put('4', 4);
        enMap.put('j', 5);      enMap.put('k', 5);      enMap.put('l', 5);
        enMap.put('5', 5);      enMap.put('m', 6);      enMap.put('n', 6);
        enMap.put('\u00f1', 6); enMap.put('o', 6);      enMap.put('\u00f3', 6);
        enMap.put('\u00f6', 6); enMap.put('\u00f4', 6); enMap.put('\u00fb', 6);
        enMap.put('6', 6);      enMap.put('p', 7);      enMap.put('q', 7);
        enMap.put('r', 7);      enMap.put('s', 7);      enMap.put('7', 7);
        enMap.put('t', 8);      enMap.put('u', 8);      enMap.put('\u00fc', 8);
        enMap.put('v', 8);      enMap.put('8', 8);      enMap.put('w', 9);
        enMap.put('x', 9);      enMap.put('y', 9);      enMap.put('z', 9);
        enMap.put('9', 9);
        enMap.put(' ', 0); enMap.put('0', 0); enMap.put('+', 0); enMap.put('\n', 0);
        CHARTABLE.add(0, Collections.unmodifiableMap(enMap));

        Map<Character, Integer> ruMap = new HashMap<Character, Integer>();
        ruMap.put('.', 1); ruMap.put(',', 1); ruMap.put('!', 1); ruMap.put('?', 1);
        ruMap.put('-', 1); ruMap.put('"', 1); ruMap.put('\'', 1); ruMap.put('@', 1);
        ruMap.put('#', 1); ruMap.put('$', 1); ruMap.put('%', 1); ruMap.put('&', 1);
        ruMap.put('*', 1); ruMap.put('(', 1); ruMap.put(')', 1); ruMap.put('1', 1);
        ruMap.put(':', 1); ruMap.put(';', 1); ruMap.put('/', 1); ruMap.put('\\', 1);
        ruMap.put('+', 1); ruMap.put('=', 1); ruMap.put('<', 1); ruMap.put('>', 1);
        ruMap.put('[', 1); ruMap.put(']', 1); ruMap.put('{', 1); ruMap.put('}', 1);
        ruMap.put('^', 1); ruMap.put('|', 1); ruMap.put('_', 1); ruMap.put('~', 1);
        ruMap.put('`', 1); ruMap.put('1', 1);
        ruMap.put('à', 2); ruMap.put('á', 2); ruMap.put('â', 2); ruMap.put('ã', 2);
        ruMap.put('2', 2);
        ruMap.put('ä', 3); ruMap.put('å', 3); ruMap.put('¸', 3); ruMap.put('æ', 3);
        ruMap.put('ç', 3); ruMap.put('3', 3);
        ruMap.put('è', 4); ruMap.put('é', 4); ruMap.put('ê', 4); ruMap.put('ë', 4);
        ruMap.put('4', 4);
        ruMap.put('ì', 5); ruMap.put('í', 5); ruMap.put('î', 5); ruMap.put('ï', 5);
        ruMap.put('5', 5);
        ruMap.put('ğ', 6); ruMap.put('ñ', 6); ruMap.put('ò', 6); ruMap.put('ó', 6);
        ruMap.put('6', 6);
        ruMap.put('ô', 7); ruMap.put('õ', 7); ruMap.put('ö', 7); ruMap.put('÷', 7);
        ruMap.put('7', 7);
        ruMap.put('ø', 8); ruMap.put('ù', 8); ruMap.put('ú', 8); ruMap.put('û', 8);
        ruMap.put('8', 8);
        ruMap.put('ü', 9); ruMap.put('ı', 9); ruMap.put('ş', 9); ruMap.put('ÿ', 9);
        ruMap.put('9', 9);
        ruMap.put(' ', 0); ruMap.put('0', 0); ruMap.put('+', 0); ruMap.put('\n', 0);
        CHARTABLE.add(1, Collections.unmodifiableMap(ruMap));
    }

    protected static final char[][] ENT9TABLE = { { ' ', '0', '+', '\n' },
            { '.', ',', '?', '!', '"', '\'', '-', '@', '$', '%', '&', '*', '(', ')', '_', '1' },
            { 'a', 'b', 'c', 'A', 'B', 'C', '2' }, { 'd', 'e', 'f', 'D', 'E', 'F', '3' },
            { 'g', 'h', 'i', 'G', 'H', 'I', '4' }, { 'j', 'k', 'l', 'J', 'K', 'L', '5' },
            { 'm', 'n', 'o', 'M', 'N', 'O', '6' }, { 'p', 'q', 'r', 's', 'P', 'Q', 'R', 'S', '7' },
            { 't', 'u', 'v', 'T', 'U', 'V', '8' }, { 'w', 'x', 'y', 'z', 'W', 'X', 'Y', 'Z', '9' },
            { ' ', '\n' } };
    protected static final char[][] RUT9TABLE = { { ' ', '0', '+', '\n' },
            { '.', ',', '?', '!', '"', '\'', '-', '@', '$', '%', '&', '*', '(', ')', '_', '1' },
            { 'à', 'á', 'â', 'ã', 'À', 'Á', 'Â', 'Ã', '2' }, { 'ä', 'å', '¸', 'æ', 'ç', 'Ä', 'Å', '¨', 'Æ', 'Ç', '3' },
            { 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', '4' }, { 'ì', 'í', 'î', 'ï', 'Ì', 'Í', 'Î', 'Ï', '5' },
            { 'ğ', 'ñ', 'ò', 'ó', 'Ğ', 'Ñ', 'Ò', 'Ó', '6' }, { 'ô', 'õ', 'ö', '÷', 'Ô', 'Õ', 'Ö', '×', '7' },
            { 'ø', 'ù', 'ú', 'û', 'Ø', 'Ù', 'Ú', 'Û', '8' }, { 'ü', 'ı', 'ş', 'ÿ', 'Ü', 'İ', 'Ş', 'ß', '9' },
            { ' ', '\n' } };
  protected static final char[][][] T9TABLE = {ENT9TABLE, RUT9TABLE};

    protected static final int[] ENT9CAPSTART = { 0, 0, 3, 3, 3, 3, 3, 4, 3, 4, 0 };
    protected static final int [] RUT9CAPSTART = {0, 0, 4, 5, 4, 4, 4, 4, 4, 4, 0};
    protected static final int[][] T9CAPSTART = {ENT9CAPSTART, RUT9CAPSTART};

    protected static String getStringSequence(String word, int lang) {
        StringBuilder seq = new StringBuilder();
        String tword = word.toLowerCase(LangHelper.LOCALES[lang]);
        for (int i = 0; i < word.length(); i++) {
            char c = tword.charAt(i);
            Integer z = CharMap.CHARTABLE.get(lang).get(c);
            if (z == null) {
                Log.e("getStringSequence",
                        "ERROR: " + (int) c + " NOT FOUND FOR [" + lang + "] (" + Integer.toHexString((int) c) + ") Index: " + i);
                throw new NullPointerException();
            }
            seq.append(z.toString());
        }
        return seq.toString();
    }
}
