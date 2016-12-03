package StringMatchingAlgos;

import java.util.HashMap;

public class TrieNodeOperations {

	public static void main(String[] args) {
		String[] s = {"abcd","abc","com","commu","commute","dog"};
		TrieNode tr = new TrieNode(null,false);
		TrieNode headTr = tr;
		for(String s1 : s) {
			tr = headTr;
			char[] ch = s1.toCharArray();
			for(int i = 0; i< ch.length; i++) {
				tr = insertInToTrie(ch[i],tr);
			}
			tr.setEow(true);
			boolean b = findString(s1,headTr);
			System.out.println("String    " + s1  + "         Exists is  "+ b);
		}	
		
		
		}
	

	private static boolean findString(String s1, TrieNode headTr) {
		char[] ch = s1.toCharArray();
		boolean isFind = false;
		for(int i = 0; i< ch.length; i++) {
			headTr = headTr.getMap().get(ch[i]);
		}
		if(headTr.isEow()) isFind = true;
		return isFind;
	}


	private static TrieNode insertInToTrie(char ch, TrieNode tr) {
		if(tr.getMap() == null) {
			tr.setMap(new HashMap<Character,TrieNode>());
		}
		if(tr.getMap() != null && tr.getMap().get(ch) == null) {
			TrieNode tr1 = new TrieNode(null,false);
			tr.getMap().put(ch, tr1);
			return tr1;
		} else {
			return  tr.getMap().get(ch);
		}
		
	}
		
	}

