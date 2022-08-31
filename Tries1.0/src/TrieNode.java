
public class TrieNode {
    Character data;
    boolean isWord;
    TrieNode[] children;
    TrieNode(Character data){
        this.data=data;
        isWord=false;
        children=new TrieNode[26];
    }
}
