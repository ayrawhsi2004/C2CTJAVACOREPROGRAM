package com.tnsif.day5.multilevelinheritance.texteditor;

public class Word extends WordPad {
private boolean spellCheckEnabled;
public Word() {
super();
this.spellCheckEnabled=true;
}
public void spellCheck() {
	if (spellCheckEnabled)
	{
		System.out.println("Running spell check..spell..");
	}
	else {
		
		System.out.println("Spell Check is disabled.");
		
	}
		
		
	}

public void enableSpellCheck(boolean enable) {
	spellCheckEnabled = enable;

}}











