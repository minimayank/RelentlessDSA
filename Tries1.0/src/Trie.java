public class Trie {
    TrieNode root;
    public Trie(){
        this.root=new TrieNode('\0');
    }
    private void add(TrieNode root,String word){
        if(word.length()==0){
            root.isWord=true;
            return;
        }
        int childIndex=word.charAt(0)-'a';
        TrieNode child=root.children[childIndex];
        if(child==null){
            child=new TrieNode(word.charAt(0));
            root.children[childIndex]=child;
        }
        add(child,word.substring(1));
    }
    public void add(String word){
        add(root,word);
    }
    public static void main(String[] args) {
        
    }
}
