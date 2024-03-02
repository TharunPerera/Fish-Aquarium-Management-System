package new_project;

public class FishLinkedList {

    private FishNode head;

    public FishLinkedList() {
        this.head = null;
    }

    public void addFish(Fish fish) {
        FishNode newNode = new FishNode(fish);
        if (head == null) head = newNode;
        else {
            FishNode current = head;
            while (current.next != null) current = current.next;
            current.next = newNode;
        }
    }

    public void deleteFish(int index) {
        if (index == 0) head = head.next;
        else {
            FishNode current = head, previous = null;
            for (int count = 0; count < index; count++) {
                previous = current;
                current = current.next;
            }
            previous.next = current.next;
        }
    }

    public void modifyFish(int index, Fish fish) {
        FishNode current = head;
        for (int count = 0; count < index; count++) current = current.next;
        current.data = fish;
    }

    private FishNode getMiddle(FishNode head) {
        FishNode slowPointer = head, fastPointer = head.next;
        while (fastPointer != null && (fastPointer = fastPointer.next) != null) {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next;
        }
        return slowPointer;
    }

    public FishNode getHead() {
        return head;
    }

    public void sortLinkedListBySpecies(boolean reverse) {
        head = reverse ? mergeSortBySpeciesReverseAlphabetically(head) : mergeSortBySpeciesAlphabetically(head);
    }

    private FishNode mergeSortBySpeciesAlphabetically(FishNode head) {
        if (head == null || head.next == null) return head;
        FishNode middle = getMiddle(head), nextToMiddle = middle.next;
        middle.next = null;
        FishNode left = mergeSortBySpeciesAlphabetically(head), right = mergeSortBySpeciesAlphabetically(nextToMiddle);
        return mergeBySpeciesAlphabetically(left, right);
    }

    private FishNode mergeBySpeciesAlphabetically(FishNode left, FishNode right) {
        if (left == null) return right;
        if (right == null) return left;
        FishNode result = left.data.getSpecies().compareTo(right.data.getSpecies()) <= 0 ? left : right;
        result.next = mergeBySpeciesAlphabetically(result.next, result == left ? right : left);
        return result;
    }

    public void sortLinkedListBySpeciesReverseAlphabetically() {
        head = mergeSortBySpeciesReverseAlphabetically(head);
    }

    private FishNode mergeSortBySpeciesReverseAlphabetically(FishNode head) {
        if (head == null || head.next == null) return head;
        FishNode middle = getMiddle(head), nextToMiddle = middle.next;
        middle.next = null;
        FishNode left = mergeSortBySpeciesReverseAlphabetically(head), right = mergeSortBySpeciesReverseAlphabetically(nextToMiddle);
        return mergeBySpeciesReverseAlphabetically(left, right);
    }

    private FishNode mergeBySpeciesReverseAlphabetically(FishNode left, FishNode right) {
        if (left == null) return right;
        if (right == null) return left;
        FishNode result = left.data.getSpecies().compareTo(right.data.getSpecies()) >= 0 ? left : right;
        result.next = mergeBySpeciesReverseAlphabetically(result.next, result == left ? right : left);
        return result;
    }

    public void sortLinkedListBySize(boolean minToMax) {
        head = minToMax ? mergeSortBySize(head) : mergeSortBySizeReverse(head);
    }

    private FishNode mergeSortBySize(FishNode head) {
        if (head == null || head.next == null) return head;
        FishNode middle = getMiddle(head), nextToMiddle = middle.next;
        middle.next = null;
        FishNode left = mergeSortBySize(head), right = mergeSortBySize(nextToMiddle);
        return mergeBySize(left, right);
    }

    private FishNode mergeBySize(FishNode left, FishNode right) {
        if (left == null) return right;
        if (right == null) return left;
        FishNode result = left.data.getSize() <= right.data.getSize() ? left : right;
        result.next = mergeBySize(result.next, result == left ? right : left);
        return result;
    }

    private FishNode mergeSortBySizeReverse(FishNode head) {
        if (head == null || head.next == null) return head;
        FishNode middle = getMiddle(head), nextToMiddle = middle.next;
        middle.next = null;
        FishNode left = mergeSortBySizeReverse(head), right = mergeSortBySizeReverse(nextToMiddle);
        return mergeBySizeReverse(left, right);
    }

    private FishNode mergeBySizeReverse(FishNode left, FishNode right) {
        if (left == null) return right;
        if (right == null) return left;
        FishNode result = left.data.getSize() >= right.data.getSize() ? left : right;
        result.next = mergeBySizeReverse(result.next, result == left ? right : left);
        return result;
    }

    public void sortLinkedListByPrice(boolean minToMax) {
        head = minToMax ? mergeSortByPrice(head) : mergeSortByPriceReverse(head);
    }

    private FishNode mergeSortByPrice(FishNode head) {
        if (head == null || head.next == null) return head;
        FishNode middle = getMiddle(head), nextToMiddle = middle.next;
        middle.next = null;
        FishNode left = mergeSortByPrice(head), right = mergeSortByPrice(nextToMiddle);
        return mergeByPrice(left, right);
    }

    private FishNode mergeByPrice(FishNode left, FishNode right) {
        if (left == null) return right;
        if (right == null) return left;
        FishNode result = left.data.getPrice() <= right.data.getPrice() ? left : right;
        result.next = mergeByPrice(result.next, result == left ? right : left);
        return result;
    }

    private FishNode mergeSortByPriceReverse(FishNode head) {
        if (head == null || head.next == null) return head;
        FishNode middle = getMiddle(head), nextToMiddle = middle.next;
        middle.next = null;
        FishNode left = mergeSortByPriceReverse(head), right = mergeSortByPriceReverse(nextToMiddle);
        return mergeByPriceReverse(left, right);
    }

    private FishNode mergeByPriceReverse(FishNode left, FishNode right) {
        if (left == null) return right;
        if (right == null) return left;
        FishNode result = left.data.getPrice() >= right.data.getPrice() ? left : right;
        result.next = mergeByPriceReverse(result.next, result == left ? right : left);
        return result;
    }

    public void displayInventory() {
        for (FishNode current = head; current != null; current = current.next) System.out.println(current.data);
    }
}
