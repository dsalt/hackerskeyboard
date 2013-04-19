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

public class ComposeSequence extends ComposeBase {
    public ComposeSequence(ComposeSequencing user) {
            init(user);
    }
    
    static {
            put("++", "#");
            put("' ", "'");
            put(" '", "'");
            put("AT", "@");
            put("((", "[");
            put("//", "\\");
            put("/<", "\\");
            put("</", "\\");
            put("))", "]");
            put("^ ", "^");
            put(" ^", "^");
            put("> ", "^");
            put(" >", "^");
            put("` ", "`");
            put(" `", "`");
            put(", ", "¸");
            put(" ,", "¸");
            put("(-", "{");
            put("-(", "{");
            put("/^", "|");
            put("^/", "|");
            put("VL", "|");
            put("LV", "|");
            put("vl", "|");
            put("lv", "|");
            put(")-", "}");
            put("-)", "}");
            put("~ ", "~");
            put(" ~", "~");
            put("- ", "~");
            put(" -", "~");
            put("  ", " ");
            put(" .", " ");
            puti("oc", "©");
            put("oC", "©");
            put("Oc", "©");
            puti("or", "®");
            put("oR", "®");
            put("Or", "®");
            put(".>", "›");
            put(".<", "‹");
            put("..", "…");
            put(".-", "·");
            put(".=", "•");
            put("!^", "¦");
            put("!!", "¡");
            puti("p!", "¶");
            put("+-", "±");
            put("??", "¿");
            put("-d", "đ");
            put("-D", "Đ");
            put("ss", "ß");
            put("SS", "ẞ");
            put("oe", "œ");
            put("OE", "Œ");
            put("ae", "æ");
            put("AE", "Æ");
            put("oo", "°");
            put("\"\\", "〝");
            put("\"/", "〞");
            put("<<", "«");
            put(">>", "»");
            put("<'", "‘");
            put("'<", "‘");
            put(">'", "’");
            put("'>", "’");
            put(",'", "‚");
            put("',", "‚");
            put("<\"", "“");
            put("\"<", "“");
            put(">\"", "”");
            put("\">", "”");
            put(",\"", "„");
            put("\",", "„");
            put("%o", "‰");
            put("CE", "₠");
            put("C/", "₡");
            put("/C", "₡");
            put("Cr", "₢");
            put("Fr", "₣");
            put("L=", "₤");
            put("=L", "₤");
            put("m/", "₥");
            put("/m", "₥");
            put("N=", "₦");
            put("=N", "₦");
            put("Pt", "₧");
            put("Rs", "₨");
            put("W=", "₩");
            put("=W", "₩");
            put("d-", "₫");
            puti("c=", "€");
            puti("=c", "€");
            puti("e=", "€");
            puti("=e", "€");
            put("|c", "¢");
            put("c|", "¢");
            put("c/", "¢");
            put("/c", "¢");
            put("L-", "£");
            put("-L", "£");
            put("Y=", "¥");
            put("=Y", "¥");
            put("fs", "ſ");
            put("fS", "ſ");
            put("--.", "–");
            put("---", "—");
            put("#b", "♭");
            put("#f", "♮");
            put("##", "♯");
            put("so", "§");
            put("os", "§");
            put("ox", "¤");
            put("xo", "¤");
            put("PP", "¶");
            put("No", "№");
            put("NO", "№");
            put("?!", "⸘");
            put("!?", "‽");
            put("CCCP", "☭");
            put("OA", "Ⓐ");
            put("<3", "♥");
            put(":)", "☺");
            put(":(", "☹");
            put(",-", "¬");
            put("-,", "¬");
            put("^_a", "ª");
            put("^2", "²");
            put("^3", "³");
            put("mu", "µ");
            put("^1", "¹");
            put("^_o", "º");
            put("14", "¼");
            put("12", "½");
            put("34", "¾");
            put("`A", "À");
            put("'A", "Á");
            put("^A", "Â");
            put("~A", "Ã");
            put("\"A", "Ä");
            put("oA", "Å");
            put(",C", "Ç");
            put("`E", "È");
            put("'E", "É");
            put("^E", "Ê");
            put("\"E", "Ë");
            put("`I", "Ì");
            put("'I", "Í");
            put("^I", "Î");
            put("\"I", "Ï");
            put("DH", "Ð");
            put("~N", "Ñ");
            put("`O", "Ò");
            put("'O", "Ó");
            put("^O", "Ô");
            put("~O", "Õ");
            put("\"O", "Ö");
            put("xx", "×");
            put("/O", "Ø");
            put("`U", "Ù");
            put("'U", "Ú");
            put("^U", "Û");
            put("\"U", "Ü");
            put("'Y", "Ý");
            put("TH", "Þ");
            put("`a", "à");
            put("'a", "á");
            put("^a", "â");
            put("~a", "ã");
            put("\"a", "ä");
            put("oa", "å");
            put(",c", "ç");
            put("`e", "è");
            put("'e", "é");
            put("^e", "ê");
            put("\"e", "ë");
            put("`i", "ì");
            put("'i", "í");
            put("^i", "î");
            put("\"i", "ï");
            put("dh", "ð");
            put("~n", "ñ");
            put("`o", "ò");
            put("'o", "ó");
            put("^o", "ô");
            put("~o", "õ");
            put("\"o", "ö");
            put(":-", "÷");
            put("-:", "÷");
            put("/o", "ø");
            put("`u", "ù");
            put("'u", "ú");
            put("^u", "û");
            put("\"u", "ü");
            put("'y", "ý");
            put("th", "þ");
            put("\"y", "ÿ");
            put("_A", "Ā");
            put("_a", "ā");
            put("UA", "Ă");
            put("bA", "Ă");
            put("Ua", "ă");
            put("ba", "ă");
            put(";A", "Ą");
            put(",A", "Ą");
            put(";a", "ą");
            put(",a", "ą");
            put("'C", "Ć");
            put("'c", "ć");
            put("^C", "Ĉ");
            put("^c", "ĉ");
            put(".C", "Ċ");
            put(".c", "ċ");
            put("cC", "Č");
            put("cc", "č");
            put("cD", "Ď");
            put("cd", "ď");
            put("/D", "Đ");
            put("/d", "đ");
            put("_E", "Ē");
            put("_e", "ē");
            put("UE", "Ĕ");
            put("bE", "Ĕ");
            put("Ue", "ĕ");
            put("be", "ĕ");
            put(".E", "Ė");
            put(".e", "ė");
            put(";E", "Ę");
            put(",E", "Ę");
            put(";e", "ę");
            put(",e", "ę");
            put("cE", "Ě");
            put("ce", "ě");
            //put("ff", "ﬀ"); // Not usable, interferes with ffi/ffl prefix
            put("+f", "ﬀ");
            put("f+", "ﬀ");
            put("fi", "ﬁ");
            put("fl", "ﬂ");
            put("ffi", "ﬃ");
            put("ffl", "ﬄ");
            put("^G", "Ĝ");
            put("^g", "ĝ");
            put("UG", "Ğ");
            put("bG", "Ğ");
            put("Ug", "ğ");
            put("bg", "ğ");
            put(".G", "Ġ");
            put(".g", "ġ");
            put(",G", "Ģ");
            put(",g", "ģ");
            put("^H", "Ĥ");
            put("^h", "ĥ");
            put("/H", "Ħ");
            put("/h", "ħ");
            put("~I", "Ĩ");
            put("~i", "ĩ");
            put("_I", "Ī");
            put("_i", "ī");
            put("UI", "Ĭ");
            put("bI", "Ĭ");
            put("Ui", "ĭ");
            put("bi", "ĭ");
            put(";I", "Į");
            put(",I", "Į");
            put(";i", "į");
            put(",i", "į");
            put(".I", "İ");
            put("i.", "ı");
            put("^J", "Ĵ");
            put("^j", "ĵ");
            put(",K", "Ķ");
            put(",k", "ķ");
            put("kk", "ĸ");
            put("'L", "Ĺ");
            put("'l", "ĺ");
            put(",L", "Ļ");
            put(",l", "ļ");
            put("cL", "Ľ");
            put("cl", "ľ");
            put("/L", "Ł");
            put("/l", "ł");
            put("'N", "Ń");
            put("'n", "ń");
            put(",N", "Ņ");
            put(",n", "ņ");
            put("cN", "Ň");
            put("cn", "ň");
            put("NG", "Ŋ");
            put("ng", "ŋ");
            put("_O", "Ō");
            put("_o", "ō");
            put("UO", "Ŏ");
            put("bO", "Ŏ");
            put("Uo", "ŏ");
            put("bo", "ŏ");
            put("=O", "Ő");
            put("=o", "ő");
            put("'R", "Ŕ");
            put("'r", "ŕ");
            put(",R", "Ŗ");
            put(",r", "ŗ");
            put("cR", "Ř");
            put("cr", "ř");
            put("'S", "Ś");
            put("'s", "ś");
            put("^S", "Ŝ");
            put("^s", "ŝ");
            put(",S", "Ş");
            put(",s", "ş");
            put("cS", "Š");
            put("cs", "š");
            put(",T", "Ţ");
            put(",t", "ţ");
            put("cT", "Ť");
            put("ct", "ť");
            put("/T", "Ŧ");
            put("/t", "ŧ");
            put("~U", "Ũ");
            put("~u", "ũ");
            put("_U", "Ū");
            put("_u", "ū");
            put("UU", "Ŭ");
            put("bU", "Ŭ");
            put("Uu", "ŭ");
            put("uu", "ŭ");
            put("bu", "ŭ");
            put("oU", "Ů");
            put("ou", "ů");
            put("=U", "Ű");
            put("=u", "ű");
            put(";U", "Ų");
            put(",U", "Ų");
            put(";u", "ų");
            put(",u", "ų");
            put("^W", "Ŵ");
            put("^w", "ŵ");
            put("^Y", "Ŷ");
            put("^y", "ŷ");
            put("\"Y", "Ÿ");
            put("'Z", "Ź");
            put("'z", "ź");
            put(".Z", "Ż");
            put(".z", "ż");
            put("cZ", "Ž");
            put("cz", "ž");
            put("/b", "ƀ");
            put("/I", "Ɨ");
            put("+O", "Ơ");
            put("+o", "ơ");
            put("+U", "Ư");
            put("+u", "ư");
            put("/Z", "Ƶ");
            put("/z", "ƶ");
            put("cA", "Ǎ");
            put("ca", "ǎ");
            put("cI", "Ǐ");
            put("ci", "ǐ");
            put("cO", "Ǒ");
            put("co", "ǒ");
            put("cU", "Ǔ");
            put("cu", "ǔ");
            put("_Ü", "Ǖ");
            put("_\"U", "Ǖ");
            put("_ü", "ǖ");
            put("_\"u", "ǖ");
            put("'Ü", "Ǘ");
            put("'\"U", "Ǘ");
            put("'ü", "ǘ");
            put("'\"u", "ǘ");
            put("cÜ", "Ǚ");
            put("c\"U", "Ǚ");
            put("cü", "ǚ");
            put("c\"u", "ǚ");
            put("`Ü", "Ǜ");
            put("`\"U", "Ǜ");
            put("`ü", "ǜ");
            put("`\"u", "ǜ");
            put("_Ä", "Ǟ");
            put("_\"A", "Ǟ");
            put("_ä", "ǟ");
            put("_\"a", "ǟ");
            put("_.A", "Ǡ");
            put("_.a", "ǡ");
            put("_Æ", "Ǣ");
            put("_æ", "ǣ");
            put("/G", "Ǥ");
            put("/g", "ǥ");
            put("cG", "Ǧ");
            put("cg", "ǧ");
            put("cK", "Ǩ");
            put("ck", "ǩ");
            put(";O", "Ǫ");
            put(";o", "ǫ");
            put("_;O", "Ǭ");
            put("_;o", "ǭ");
            put("cj", "ǰ");
            put("'G", "Ǵ");
            put("'g", "ǵ");
            put("`N", "Ǹ");
            put("`n", "ǹ");
            put("'Å", "Ǻ");
            put("o'A", "Ǻ");
            put("'å", "ǻ");
            put("o'a", "ǻ");
            put("'Æ", "Ǽ");
            put("'æ", "ǽ");
            put("'Ø", "Ǿ");
            put("'/O", "Ǿ");
            put("'ø", "ǿ");
            put("'/o", "ǿ");
            put("cH", "Ȟ");
            put("ch", "ȟ");
            put(".A", "Ȧ");
            put(".a", "ȧ");
            put("_Ö", "Ȫ");
            put("_\"O", "Ȫ");
            put("_ö", "ȫ");
            put("_\"o", "ȫ");
            put("_Õ", "Ȭ");
            put("_~O", "Ȭ");
            put("_õ", "ȭ");
            put("_~o", "ȭ");
            put(".O", "Ȯ");
            put(".o", "ȯ");
            put("_.O", "Ȱ");
            put("_.o", "ȱ");
            put("_Y", "Ȳ");
            put("_y", "ȳ");
            put("ee", "ə");
            put("/i", "ɨ");
            put("^_h", "ʰ");
            put("^_j", "ʲ");
            put("^_r", "ʳ");
            put("^_w", "ʷ");
            put("^_y", "ʸ");
            put("^_l", "ˡ");
            put("^_s", "ˢ");
            put("^_x", "ˣ");
            put("\"'", "̈́");
            put(".B", "Ḃ");
            put(".b", "ḃ");
            put("!B", "Ḅ");
            put("!b", "ḅ");
            put("'Ç", "Ḉ");
            put("'ç", "ḉ");
            put(".D", "Ḋ");
            put(".d", "ḋ");
            put("!D", "Ḍ");
            put("!d", "ḍ");
            put(",D", "Ḑ");
            put(",d", "ḑ");
            put("`Ē", "Ḕ");
            put("`_E", "Ḕ");
            put("`ē", "ḕ");
            put("`_e", "ḕ");
            put("'Ē", "Ḗ");
            put("'_E", "Ḗ");
            put("'ē", "ḗ");
            put("'_e", "ḗ");
            put("U,E", "Ḝ");
            put("b,E", "Ḝ");
            put("U,e", "ḝ");
            put("b,e", "ḝ");
            put(".F", "Ḟ");
            put(".f", "ḟ");
            put("_G", "Ḡ");
            put("_g", "ḡ");
            put(".H", "Ḣ");
            put(".h", "ḣ");
            put("!H", "Ḥ");
            put("!h", "ḥ");
            put("\"H", "Ḧ");
            put("\"h", "ḧ");
            put(",H", "Ḩ");
            put(",h", "ḩ");
            put("'Ï", "Ḯ");
            put("'\"I", "Ḯ");
            put("'ï", "ḯ");
            put("'\"i", "ḯ");
            put("'K", "Ḱ");
            put("'k", "ḱ");
            put("!K", "Ḳ");
            put("!k", "ḳ");
            put("!L", "Ḷ");
            put("!l", "ḷ");
            put("_!L", "Ḹ");
            put("_!l", "ḹ");
            put("'M", "Ḿ");
            put("'m", "ḿ");
            put(".M", "Ṁ");
            put(".m", "ṁ");
            put("!M", "Ṃ");
            put("!m", "ṃ");
            put(".N", "Ṅ");
            put(".n", "ṅ");
            put("!N", "Ṇ");
            put("!n", "ṇ");
            put("'Õ", "Ṍ");
            put("'~O", "Ṍ");
            put("'õ", "ṍ");
            put("'~o", "ṍ");
            put("\"Õ", "Ṏ");
            put("\"~O", "Ṏ");
            put("\"õ", "ṏ");
            put("\"~o", "ṏ");
            put("`Ō", "Ṑ");
            put("`_O", "Ṑ");
            put("`ō", "ṑ");
            put("`_o", "ṑ");
            put("'Ō", "Ṓ");
            put("'_O", "Ṓ");
            put("'ō", "ṓ");
            put("'_o", "ṓ");
            put("'P", "Ṕ");
            put("'p", "ṕ");
            put(".P", "Ṗ");
            put(".p", "ṗ");
            put(".R", "Ṙ");
            put(".r", "ṙ");
            put("!R", "Ṛ");
            put("!r", "ṛ");
            put("_!R", "Ṝ");
            put("_!r", "ṝ");
            put(".S", "Ṡ");
            put(".s", "ṡ");
            put("!S", "Ṣ");
            put("!s", "ṣ");
            put(".Ś", "Ṥ");
            put(".'S", "Ṥ");
            put(".ś", "ṥ");
            put(".'s", "ṥ");
            put(".Š", "Ṧ");
            put(".š", "ṧ");
            put(".!S", "Ṩ");
            put(".!s", "ṩ");
            put(".T", "Ṫ");
            put(".t", "ṫ");
            put("!T", "Ṭ");
            put("!t", "ṭ");
            put("'Ũ", "Ṹ");
            put("'~U", "Ṹ");
            put("'ũ", "ṹ");
            put("'~u", "ṹ");
            put("\"Ū", "Ṻ");
            put("\"_U", "Ṻ");
            put("\"ū", "ṻ");
            put("\"_u", "ṻ");
            put("~V", "Ṽ");
            put("~v", "ṽ");
            put("!V", "Ṿ");
            put("!v", "ṿ");
            put("`W", "Ẁ");
            put("`w", "ẁ");
            put("'W", "Ẃ");
            put("'w", "ẃ");
            put("\"W", "Ẅ");
            put("\"w", "ẅ");
            put(".W", "Ẇ");
            put(".w", "ẇ");
            put("!W", "Ẉ");
            put("!w", "ẉ");
            put(".X", "Ẋ");
            put(".x", "ẋ");
            put("\"X", "Ẍ");
            put("\"x", "ẍ");
            put(".Y", "Ẏ");
            put(".y", "ẏ");
            put("^Z", "Ẑ");
            put("^z", "ẑ");
            put("!Z", "Ẓ");
            put("!z", "ẓ");
            put("\"t", "ẗ");
            put("ow", "ẘ");
            put("oy", "ẙ");
            put("!A", "Ạ");
            put("!a", "ạ");
            put("?A", "Ả");
            put("?a", "ả");
            put("'Â", "Ấ");
            put("'^A", "Ấ");
            put("'â", "ấ");
            put("'^a", "ấ");
            put("`Â", "Ầ");
            put("`^A", "Ầ");
            put("`â", "ầ");
            put("`^a", "ầ");
            put("?Â", "Ẩ");
            put("?^A", "Ẩ");
            put("?â", "ẩ");
            put("?^a", "ẩ");
            put("~Â", "Ẫ");
            put("~^A", "Ẫ");
            put("~â", "ẫ");
            put("~^a", "ẫ");
            put("^!A", "Ậ");
            put("^!a", "ậ");
            put("'Ă", "Ắ");
            put("'bA", "Ắ");
            put("'ă", "ắ");
            put("'ba", "ắ");
            put("`Ă", "Ằ");
            put("`bA", "Ằ");
            put("`ă", "ằ");
            put("`ba", "ằ");
            put("?Ă", "Ẳ");
            put("?bA", "Ẳ");
            put("?ă", "ẳ");
            put("?ba", "ẳ");
            put("~Ă", "Ẵ");
            put("~bA", "Ẵ");
            put("~ă", "ẵ");
            put("~ba", "ẵ");
            put("U!A", "Ặ");
            put("b!A", "Ặ");
            put("U!a", "ặ");
            put("b!a", "ặ");
            put("!E", "Ẹ");
            put("!e", "ẹ");
            put("?E", "Ẻ");
            put("?e", "ẻ");
            put("~E", "Ẽ");
            put("~e", "ẽ");
            put("'Ê", "Ế");
            put("'^E", "Ế");
            put("'ê", "ế");
            put("'^e", "ế");
            put("`Ê", "Ề");
            put("`^E", "Ề");
            put("`ê", "ề");
            put("`^e", "ề");
            put("?Ê", "Ể");
            put("?^E", "Ể");
            put("?ê", "ể");
            put("?^e", "ể");
            put("~Ê", "Ễ");
            put("~^E", "Ễ");
            put("~ê", "ễ");
            put("~^e", "ễ");
            put("^!E", "Ệ");
            put("^!e", "ệ");
            put("?I", "Ỉ");
            put("?i", "ỉ");
            put("!I", "Ị");
            put("!i", "ị");
            put("!O", "Ọ");
            put("!o", "ọ");
            put("?O", "Ỏ");
            put("?o", "ỏ");
            put("'Ô", "Ố");
            put("'^O", "Ố");
            put("'ô", "ố");
            put("'^o", "ố");
            put("`Ô", "Ồ");
            put("`^O", "Ồ");
            put("`ô", "ồ");
            put("`^o", "ồ");
            put("?Ô", "Ổ");
            put("?^O", "Ổ");
            put("?ô", "ổ");
            put("?^o", "ổ");
            put("~Ô", "Ỗ");
            put("~^O", "Ỗ");
            put("~ô", "ỗ");
            put("~^o", "ỗ");
            put("^!O", "Ộ");
            put("^!o", "ộ");
            put("'Ơ", "Ớ");
            put("'+O", "Ớ");
            put("'ơ", "ớ");
            put("'+o", "ớ");
            put("`Ơ", "Ờ");
            put("`+O", "Ờ");
            put("`ơ", "ờ");
            put("`+o", "ờ");
            put("?Ơ", "Ở");
            put("?+O", "Ở");
            put("?ơ", "ở");
            put("?+o", "ở");
            put("~Ơ", "Ỡ");
            put("~+O", "Ỡ");
            put("~ơ", "ỡ");
            put("~+o", "ỡ");
            put("!Ơ", "Ợ");
            put("!+O", "Ợ");
            put("!ơ", "ợ");
            put("!+o", "ợ");
            put("!U", "Ụ");
            put("!u", "ụ");
            put("?U", "Ủ");
            put("?u", "ủ");
            put("'Ư", "Ứ");
            put("'+U", "Ứ");
            put("'ư", "ứ");
            put("'+u", "ứ");
            put("`Ư", "Ừ");
            put("`+U", "Ừ");
            put("`ư", "ừ");
            put("`+u", "ừ");
            put("?Ư", "Ử");
            put("?+U", "Ử");
            put("?ư", "ử");
            put("?+u", "ử");
            put("~Ư", "Ữ");
            put("~+U", "Ữ");
            put("~ư", "ữ");
            put("~+u", "ữ");
            put("!Ư", "Ự");
            put("!+U", "Ự");
            put("!ư", "ự");
            put("!+u", "ự");
            put("`Y", "Ỳ");
            put("`y", "ỳ");
            put("!Y", "Ỵ");
            put("!y", "ỵ");
            put("?Y", "Ỷ");
            put("?y", "ỷ");
            put("~Y", "Ỹ");
            put("~y", "ỹ");
            put("^0", "⁰");
            put("^_i", "ⁱ");
            put("^4", "⁴");
            put("^5", "⁵");
            put("^6", "⁶");
            put("^7", "⁷");
            put("^8", "⁸");
            put("^9", "⁹");
            put("^+", "⁺");
            put("^=", "⁼");
            put("^(", "⁽");
            put("^)", "⁾");
            put("^_n", "ⁿ");
            put("_0", "₀");
            put("_1", "₁");
            put("_2", "₂");
            put("_3", "₃");
            put("_4", "₄");
            put("_5", "₅");
            put("_6", "₆");
            put("_7", "₇");
            put("_8", "₈");
            put("_9", "₉");
            put("_+", "₊");
            put("_=", "₌");
            put("_(", "₍");
            put("_)", "₎");
            puti("sm", "℠");
            put("sM", "℠");
            put("Sm", "℠");
            puti("tm", "™");
            put("tM", "™");
            put("Tm", "™");
            put("13", "⅓");
            put("23", "⅔");
            put("15", "⅕");
            put("25", "⅖");
            put("35", "⅗");
            put("45", "⅘");
            put("16", "⅙");
            put("56", "⅚");
            put("18", "⅛");
            put("38", "⅜");
            put("58", "⅝");
            put("78", "⅞");
            put("/←", "↚");
            put("/→", "↛");
            put("/" + LEFT, "↚");
            put("/" + RIGHT, "↛");
            put("<-", "←");
            put("->", "→");
            put("/=", "≠");
            put("=/", "≠");
            put("<=", "≤");
            put(">=", "≥");
            put("(1)", "①");
            put("(2)", "②");
            put("(3)", "③");
            put("(4)", "④");
            put("(5)", "⑤");
            put("(6)", "⑥");
            put("(7)", "⑦");
            put("(8)", "⑧");
            put("(9)", "⑨");
            put("(10)", "⑩");
            put("(11)", "⑪");
            put("(12)", "⑫");
            put("(13)", "⑬");
            put("(14)", "⑭");
            put("(15)", "⑮");
            put("(16)", "⑯");
            put("(17)", "⑰");
            put("(18)", "⑱");
            put("(19)", "⑲");
            put("(20)", "⑳");
            put("(A)", "Ⓐ");
            put("(B)", "Ⓑ");
            put("(C)", "Ⓒ");
            put("(D)", "Ⓓ");
            put("(E)", "Ⓔ");
            put("(F)", "Ⓕ");
            put("(G)", "Ⓖ");
            put("(H)", "Ⓗ");
            put("(I)", "Ⓘ");
            put("(J)", "Ⓙ");
            put("(K)", "Ⓚ");
            put("(L)", "Ⓛ");
            put("(M)", "Ⓜ");
            put("(N)", "Ⓝ");
            put("(O)", "Ⓞ");
            put("(P)", "Ⓟ");
            put("(Q)", "Ⓠ");
            put("(R)", "Ⓡ");
            put("(S)", "Ⓢ");
            put("(T)", "Ⓣ");
            put("(U)", "Ⓤ");
            put("(V)", "Ⓥ");
            put("(W)", "Ⓦ");
            put("(X)", "Ⓧ");
            put("(Y)", "Ⓨ");
            put("(Z)", "Ⓩ");
            put("(a)", "ⓐ");
            put("(b)", "ⓑ");
            put("(c)", "ⓒ");
            put("(d)", "ⓓ");
            put("(e)", "ⓔ");
            put("(f)", "ⓕ");
            put("(g)", "ⓖ");
            put("(h)", "ⓗ");
            put("(i)", "ⓘ");
            put("(j)", "ⓙ");
            put("(k)", "ⓚ");
            put("(l)", "ⓛ");
            put("(m)", "ⓜ");
            put("(n)", "ⓝ");
            put("(o)", "ⓞ");
            put("(p)", "ⓟ");
            put("(q)", "ⓠ");
            put("(r)", "ⓡ");
            put("(s)", "ⓢ");
            put("(t)", "ⓣ");
            put("(u)", "ⓤ");
            put("(v)", "ⓥ");
            put("(w)", "ⓦ");
            put("(x)", "ⓧ");
            put("(y)", "ⓨ");
            put("(z)", "ⓩ");
            put("(0)", "⓪");
            put("(21)", "㉑");
            put("(22)", "㉒");
            put("(23)", "㉓");
            put("(24)", "㉔");
            put("(25)", "㉕");
            put("(26)", "㉖");
            put("(27)", "㉗");
            put("(28)", "㉘");
            put("(29)", "㉙");
            put("(30)", "㉚");
            put("(31)", "㉛");
            put("(32)", "㉜");
            put("(33)", "㉝");
            put("(34)", "㉞");
            put("(35)", "㉟");
            put("(36)", "㊱");
            put("(37)", "㊲");
            put("(38)", "㊳");
            put("(39)", "㊴");
            put("(40)", "㊵");
            put("(41)", "㊶");
            put("(42)", "㊷");
            put("(43)", "㊸");
            put("(44)", "㊹");
            put("(45)", "㊺");
            put("(46)", "㊻");
            put("(47)", "㊼");
            put("(48)", "㊽");
            put("(49)", "㊾");
            put("(50)", "㊿");
            put("\\o/", "🙌");

            // Some arrows
            put(" " + LEFT, "←");
            put(" " + RIGHT, "→");
            put(" " + UP, "↑");
            put(" " + DOWN, "↓");
            put("" + LEFT + RIGHT, "↔");
            put("" + UP + DOWN, "↕");
            put("" + LEFT + UP, "↖");
            put("" + RIGHT + UP, "↗");
            put("" + RIGHT + DOWN, "↘");
            put("" + LEFT + DOWN, "↙");
            put("" + LEFT + LEFT, "⇐");
            put("" + UP + UP, "⇑");
            put("" + RIGHT + RIGHT, "⇒");
            put("" + DOWN + DOWN, "⇓");
            put("=" + LEFT + RIGHT, "⇔");
            put("=" + UP + DOWN, "⇕");
            put("=" + LEFT + UP, "⇖");
            put("=" + RIGHT + UP, "⇗");
            put("=" + RIGHT + DOWN, "⇘");
            put("=" + LEFT + DOWN, "⇙");

            put("←→", "↔");
            put("↑↓", "↕");
            put("←↑", "↖");
            put("→↑", "↗");
            put("→↓", "↘");
            put("←↓", "↙");
            put("←←", "⇐");
            put("↑↑", "⇑");
            put("→→", "⇒");
            put("↓↓", "⇓");
            put("=←→", "⇔");
            put("=↑↓", "⇕");
            put("=←↑", "⇖");
            put("=→↑", "⇗");
            put("=→↓", "⇘");
            put("=←↓", "⇙");
            put("=-", "☞");
            put("-=", "☜");

            // Cursor keys
            put("()", "○");
            put("^-", "△");
            put("|>", "▻");
            put("-v", "▽");
            put("<|", "◁");

            // Stars
            put("**", "★");
            put("*0", "☆");
            put("*3", "⁂");
            put("*4", "✢");
            put("*!", "✱");

            // Symbols
            put("°c", "℃");
            put("°C", "℃");
            put("°f", "℉");
            put("°F", "℉");
            put("ox", "☠");
            put("OX", "☠");
            put("c[]", "☕");
            put("C[]", "☕");
            puti(COMPOSE + "tea", "☕");
            put("/!\\", "⚠");
            puti(COMPOSE + "zap", "⚡");
            puti(COMPOSE + "rad", "☢");
            puti(COMPOSE + "bh", "☣");
            puti(COMPOSE + "aaaaa", "⛤");
            put("8!", "❢");
            put("2!", "‼");
            puti(COMPOSE + "tel", "☎");
            put("@/", "✓");
            put("@@/", "✔");
            put("@x", "✗");
            put("@X", "✗");
            put("@@x", "✘");
            put("@@X", "✘");

            // Emoji
            puti(COMPOSE + "penguin", "🐧");
            puti(COMPOSE + "cat", "🐱");
            puti(COMPOSE + "eyes", "👀");
            puti(COMPOSE + "index" + UP, "👆");
            puti(COMPOSE + "index" + DOWN, "👇");
            puti(COMPOSE + "index" + LEFT, "👈");
            puti(COMPOSE + "index" + RIGHT, "👉");
            puti(COMPOSE + "thumbs" + UP, "👌");
            puti(COMPOSE + "thumbs" + DOWN, "👍");
            puti(COMPOSE + "glasses", "👓");
            puti(COMPOSE + "bust", "👤");
            puti(COMPOSE + "handbag", "👜");
            puti(COMPOSE + "alien", "👽");
            puti(COMPOSE + "skull", "💀");
            puti(COMPOSE + "light", "💡");
            puti(COMPOSE + "bomb", "💣");
            puti(COMPOSE + "zzz", "💤");
            puti(COMPOSE + "boom", "💥");
            puti(COMPOSE + "poo", "💩");
            puti(COMPOSE + "$$$", "💰");
            puti(COMPOSE + "$card", "💳");
            puti(COMPOSE + "$bye", "💸");
            puti(COMPOSE + "chair", "💺");
            puti(COMPOSE + "computer", "💻");
            puti(COMPOSE + "briefcase", "💼");
            puti(COMPOSE + "minidisc", "💽");
            puti(COMPOSE + "floppy", "💾");
            puti(COMPOSE + "cd", "💿");
            puti(COMPOSE + "dvd", "📀");
            puti(COMPOSE + "folder", "📁");
            puti(COMPOSE + "openfolder", "📂");
            puti(COMPOSE + "calendar", "📅");
            puti(COMPOSE + "clipboard", "📋");
            puti(COMPOSE + "paperclip", "📎");
            puti(COMPOSE + "ruler", "📏");
            puti(COMPOSE + "setsquare", "📐");
            puti(COMPOSE + "notebook", "📓");
            puti(COMPOSE + "book", "📕");
            puti(COMPOSE + "openbook", "📖");
            puti(COMPOSE + COMPOSE + "book", "📚");
            puti(COMPOSE + "notes", "📝");
            puti(COMPOSE + "phone", "📞");
            puti(COMPOSE + "email", "📧");
            puti(COMPOSE + "newspaper", "📰");
            puti(COMPOSE + "mobile", "📱");
            puti(COMPOSE + "tomobile", "📲");
            puti(COMPOSE + "silentmobile", "📳");
            puti(COMPOSE + "offmobile", "📴");
            puti(COMPOSE + "reception", "📶");
            puti(COMPOSE + "camera", "📷");
            puti(COMPOSE + "videocam", "📹");
            puti(COMPOSE + "tv", "📺");
            puti(COMPOSE + "radio", "📻");
            puti(COMPOSE + "videotape", "📼");

            // Some set notation
            puti("in", "∈");	// Element of
            puti("-in", "∉");	// Not element of
            puti("ni", "∋");	// Contains
            puti("-ni", "∌");	// Does not contain
            put("0/", "∅");	// Empty set
            put("/0", "∅");
            puti("{u", "∪");	// Union
            put("{^", "∩");	// Intersection
            put("{(", "⊂");	// Subset of
            put("{=(", "⊆");	// Subset of or equal to
            put("!{(", "⊄");	// Not a subset of
            put("/{(", "⊄");
            put("{)", "⊃");	// Superset of
            put("{=)", "⊇");	// Superset of or equal to

            // Maths
            put("-+", "∓");	// -+
            puti("sq", "√");	// Square root
            puti("3r", "∛");	// Cube root
            puti("4r", "∜");	// 4th root
            put("88", "∞");	// Infinity

            put("17", "⅐");
            put("19", "⅑");
            put("110", "⅒");
            put("03", "↉");

            // Logic
            put("/\\", "∧");	// AND
            put("\\/", "∨");	// OR
            put("\\_/", "⊻");	// XOR
            put(".\"", "∴");	// Therefore
            put("\".", "∵");	// Because
            puti(COMPOSE + "because", "∵");

            // Cards & dice
            put("33", "♣");
            put("<>", "♢");
            put("3-", "♠");
            puti("e>", "♡");
            put("[1]", "⚀");
            put("[2]", "⚁");
            put("[3]", "⚂");
            put("[4]", "⚃");
            put("[5]", "⚄");
            put("[6]", "⚅");

            puti("as", "🂡");
            puti("2s", "🂢");
            puti("3s", "🂣");
            puti("4s", "🂤");
            puti("5s", "🂥");
            puti("6s", "🂦");
            puti("7s", "🂧");
            puti("8s", "🂨");
            puti("9s", "🂩");
            puti("ts", "🂪");
            puti("js", "🂫");
            puti("ns", "🂬");
            puti("qs", "🂭");
            puti("ks", "🂮");

            puti("ah", "🂱");
            puti("2h", "🂲");
            puti("3h", "🂳");
            puti("4h", "🂴");
            puti("5h", "🂵");
            puti("6h", "🂶");
            puti("7h", "🂷");
            puti("8h", "🂸");
            puti("9h", "🂹");
            puti("th", "🂺");
            puti("jh", "🂻");
            puti("nh", "🂼");
            puti("qh", "🂽");
            puti("kh", "🂾");

            puti("ad", "🃁");
            puti("2d", "🃂");
            puti("3d", "🃃");
            puti("4d", "🃄");
            puti("5d", "🃅");
            puti("6d", "🃆");
            puti("7d", "🃇");
            puti("8d", "🃈");
            puti("9d", "🃉");
            puti("td", "🃊");
            puti("jd", "🃋");
            puti("nd", "🃌");
            puti("qd", "🃍");
            puti("kd", "🃎");

            puti("ac", "🃑");
            puti("2c", "🃒");
            puti("3c", "🃓");
            puti("4c", "🃔");
            puti("5c", "🃕");
            puti("6c", "🃖");
            puti("7c", "🃗");
            puti("8c", "🃘");
            puti("9c", "🃙");
            puti("tc", "🃚");
            puti("jc", "🃛");
            puti("nc", "🃜");
            puti("qc", "🃝");
            puti("kc", "🃞");

            puti("cb", "🂠");
            puti("bj", "🃏");
            puti("wj", "🃟");

            // Musical notes
            put("# ", "♩");	// Quarter
            put("#'", "♪");	// Eighth
            put("#-#", "♫");	// Beamed eighths
            put("#=#", "♬");	// Beames sixteenths

            // Smileys
            put("{]", "😁");	// 😁  GRINNING FACE WITH SMILING EYES
            put(":']", "😂");	// 😂  FACE WITH TEARS OF JOY
            put(":D", "😃");	// 😃  SMILING FACE WITH OPEN MOUTH
            put("{D", "😄");	// 😄  SMILING FACE WITH OPEN MOUTH AND SMILING EYES
            put("<:D", "😅");	// 😅  SMILING FACE WITH OPEN MOUTH AND COLD SWEAT
            put("xD", "😆");	// 😆  SMILING FACE WITH OPEN MOUTH AND TIGHTLY-CLOSED EYES
            put("XD", "😆");
            puti("o:)", "😇");	// 😇  SMILING FACE WITH HALO
            put("]:)", "😈");	// 😈  SMILING FACE WITH HORNS
            put(";)", "😉");	// 😉  WINKING FACE
            put("})", "😊");	// 😊  SMILING FACE WITH SMILING EYES
            puti("}p", "😋");	// 😋  FACE SAVOURING DELICIOUS FOOD
            put("3)", "😌");	// 😌  RELIEVED FACE
            puti("h)", "😍");	// 😍  SMILING FACE WITH HEART-SHAPED EYES
            puti("b)", "😎");	// 😎  SMILING FACE WITH SUNGLASSES
            put(":\\", "😏");	// 😏  SMIRKING FACE
            put(":|", "😐");	// 😐  NEUTRAL FACE
            put("|\\", "😒");	// 😒  UNAMUSED FACE
            put("<:|", "😓");	// 😓  FACE WITH COLD SWEAT
            put("3|", "😔");	// 😔  PENSIVE FACE
            put(":3", "😖");	// 😖  CONFOUNDED FACE
            put(";<3", "😘");	// 😘  FACE THROWING A KISS
            put("3<3", "😚");	// 😚  KISSING FACE WITH CLOSED EYES
            puti(";p", "😜");	// 😜  FACE WITH STUCK-OUT TONGUE AND WINKING EYE
            puti("xp", "😝");	// 😝  FACE WITH STUCK-OUT TONGUE AND TIGHTLY-CLOSED EYES
            put("<:(", "😞");	// 😞  DISAPPOINTED FACE
            put(">:(", "😠");	// 😠  ANGRY FACE
            puti(">:c", "😡");	// 😡  POUTING FACE
            put("3'(", "😢");	// 😢  CRYING FACE
            puti("x(", "😣");	// 😣  PERSEVERING FACE
            puti(":v", "😤");	// 😤  FACE WITH LOOK OF TRIUMPH
            put(":'(", "😥");	// 😥  DISAPPOINTED BUT RELIEVED FACE
            put("8(", "😨");	// 😨  FEARFUL FACE
            puti(":z", "😩");	// 😩  WEARY FACE
            puti("3z", "😪");	// 😪  SLEEPY FACE
            puti("xz", "😫");	// 😫  TIRED FACE
            puti("x'(", "😭");	// 😭  LOUDLY CRYING FACE
            puti("<:o", "😰");	// 😰  FACE WITH OPEN MOUTH AND COLD SWEAT
            puti("<8o", "😱");	// 😱  FACE SCREAMING IN FEAR
            puti("8o", "😲");	// 😲  ASTONISHED FACE
            put("<:.", "😳");	// 😳  FLUSHED FACE
            puti("xo", "😵");	// 😵  DIZZY FACE
            put(": ", "😶");	// 😶  FACE WITHOUT MOUTH
            put(":[]", "😷");	// 😷  FACE WITH MEDICAL MASK

            // Roman numerals
            put("%1", "Ⅰ");
            put("%2", "Ⅱ");
            put("%3", "Ⅲ");
            put("%4", "Ⅳ");
            put("%5", "Ⅴ");
            put("%6", "Ⅵ");
            put("%7", "Ⅶ");
            put("%8", "Ⅷ");
            put("%9", "Ⅸ");
            put("%x", "Ⅹ");
            put("%X", "Ⅹ");
            put("%_1", "Ⅺ");
            put("%_2", "Ⅻ");
            put("%l", "Ⅼ");
            put("%L", "Ⅼ");
            put("%c", "Ⅽ");
            put("%C", "Ⅽ");
            put("%d", "Ⅾ");
            put("%D", "Ⅾ");
            put("%m", "Ⅿ");
            put("%M", "Ⅿ");
            put("%vm", "ↁ");
            put("%VM", "ↁ");
            put("%tm", "ↂ");
            put("%TM", "ↂ");
            //put("%vtm", "ↇ");
            //put("%VTM", "ↇ");
            //put("%hm", "ↈ");
            //put("%HM", "ↈ");

            puti("zwn", "‌");
            puti("zwj", "‍");

            put("|-|", "Hackers' Keyboard");
   }
}
