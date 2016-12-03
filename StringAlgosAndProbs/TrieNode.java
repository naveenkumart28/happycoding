package StringMatchingAlgos;

import java.util.Map;

public class TrieNode {

	Map<Character,TrieNode> map = null;
	boolean eow = false;
	
	
	public TrieNode(Map<Character,TrieNode> map,boolean eow) {
		this.map = map;
		this.eow = eow;
	}


	public Map<Character, TrieNode> getMap() {
		return map;
	}


	public void setMap(Map<Character, TrieNode> map) {
		this.map = map;
	}


	public boolean isEow() {
		return eow;
	}


	public void setEow(boolean eow) {
		this.eow = eow;
	}

}
