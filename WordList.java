import java.util.*;

public class WordList {
    
    

    public static String getRandomWord() {
        String word = words[(int) (Math.random() * words.length)];
        return word;
        
    }

    public static String[] words = {
    "hello", 
    "world", 
    "java", 
    "computer", 
    "science", 
    "programming", 
    "language", 
    "object", 
    "oriented", 
    "class", 
    "method", 
    "instance", 
    "variable", 
    "array", 
    "list", 
    "string", 
    "integer", 
    "double", 
    "float", 
    "boolean", 
    "char", 
    "byte", 
    "short", 
    "long", 
    "abstract", 
    "final", 
    "static", 
    "public", 
    "private", 
    "protected", 
    "interface", 
    "extends", 
    "implements", 
    "package", 
    "import", 
    "native", 
    "synchronized", 
    "transient", 
    "volatile", 
    "strictfp", 
    "super"
    };
}
