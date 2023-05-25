package day10;

public class WordFrequencyLinkedList {

    class Node {
        String word;
        int frequency;
        Node next;

        Node(String word) {
            this.word = word;
            this.frequency = 1;
            this.next = null;
        }
    }

    private Node insertWord(Node head, String word) {
        if (head == null) {
            return new Node(word);
        }

        Node current = head;
        while (current.next != null) {
            if (current.word.equals(word)) {
                current.frequency++;
                return head;
            }
            current = current.next;
        }

        if (current.word.equals(word)) {
            current.frequency++;
        } else {
            current.next = new Node(word);
        }

        return head;
    }

    private void printWordFrequency(Node head) {
        Node current = head;
        while (current != null) {
            System.out.println("Word: " + current.word + ", Frequency: " + current.frequency);
            current = current.next;
        }
    }

    public void calculateWordFrequency(String sentence) {
        String[] words = sentence.split(" ");
        Node head = null;

        for (String word : words) {
            head = insertWord(head, word);
        }

        printWordFrequency(head);
    }

    public static void main(String[] args) {
        WordFrequencyLinkedList wordFreqList = new WordFrequencyLinkedList();
        String sentence = "To be or not to be";
        wordFreqList.calculateWordFrequency(sentence);
    }
}
